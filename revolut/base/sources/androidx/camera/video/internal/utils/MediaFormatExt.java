package androidx.camera.video.internal.utils;

import android.media.MediaFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/video/internal/utils/MediaFormatExt;", "", "<init>", "()V", "Landroid/media/MediaFormat;", "", "isVideo", "(Landroid/media/MediaFormat;)Z", "camera-video"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaFormatExt {

    @NotNull
    public static final MediaFormatExt INSTANCE = new MediaFormatExt();

    private MediaFormatExt() {
    }

    public final boolean isVideo(@NotNull MediaFormat mediaFormat) {
        Intrinsics.checkNotNullParameter(mediaFormat, "<this>");
        String string = mediaFormat.getString("mime");
        if (string != null) {
            return a0.H(string, "video/", false);
        }
        return false;
    }
}
