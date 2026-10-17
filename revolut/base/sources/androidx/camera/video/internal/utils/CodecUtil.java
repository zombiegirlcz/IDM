package androidx.camera.video.internal.utils;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import androidx.camera.video.internal.encoder.EncoderConfig;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/camera/video/internal/utils/CodecUtil;", "", "<init>", "()V", "Landroidx/camera/video/internal/encoder/EncoderConfig;", "encoderConfig", "Landroid/media/MediaCodec;", "createCodec", "(Landroidx/camera/video/internal/encoder/EncoderConfig;)Landroid/media/MediaCodec;", "", "mimeType", "Landroid/media/MediaCodecInfo;", "findCodecAndGetCodecInfo", "(Ljava/lang/String;)Landroid/media/MediaCodecInfo;", "(Ljava/lang/String;)Landroid/media/MediaCodec;", "Landroid/util/LruCache;", "codecInfoCache", "Landroid/util/LruCache;", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CodecUtil {

    @NotNull
    public static final CodecUtil INSTANCE = new CodecUtil();

    @NotNull
    private static final LruCache<String, MediaCodecInfo> codecInfoCache = new LruCache<>(10);

    private CodecUtil() {
    }

    @NotNull
    public static final MediaCodec createCodec(@NotNull EncoderConfig encoderConfig) throws InvalidConfigException {
        Intrinsics.checkNotNullParameter(encoderConfig, "encoderConfig");
        CodecUtil codecUtil = INSTANCE;
        String mimeType = encoderConfig.getMimeType();
        Intrinsics.checkNotNullExpressionValue(mimeType, "getMimeType(...)");
        return codecUtil.createCodec(mimeType);
    }

    @NotNull
    public static final MediaCodecInfo findCodecAndGetCodecInfo(@NotNull String mimeType) throws InvalidConfigException {
        MediaCodecInfo mediaCodecInfo;
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        LruCache<String, MediaCodecInfo> lruCache = codecInfoCache;
        synchronized (lruCache) {
            mediaCodecInfo = lruCache.get(mimeType);
            Unit unit = Unit.f186387a;
        }
        if (mediaCodecInfo != null) {
            return mediaCodecInfo;
        }
        MediaCodec mediaCodecCreateCodec = null;
        try {
            mediaCodecCreateCodec = INSTANCE.createCodec(mimeType);
            MediaCodecInfo codecInfo = mediaCodecCreateCodec.getCodecInfo();
            synchronized (lruCache) {
                lruCache.put(mimeType, codecInfo);
            }
            mediaCodecCreateCodec.release();
            return codecInfo;
        } catch (Throwable th10) {
            if (mediaCodecCreateCodec != null) {
                mediaCodecCreateCodec.release();
            }
            throw th10;
        }
    }

    private final MediaCodec createCodec(String mimeType) throws InvalidConfigException {
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(mimeType);
            Intrinsics.h(mediaCodecCreateEncoderByType);
            return mediaCodecCreateEncoderByType;
        } catch (IOException e) {
            throw new InvalidConfigException(e);
        } catch (IllegalArgumentException e2) {
            throw new InvalidConfigException(e2);
        }
    }
}
