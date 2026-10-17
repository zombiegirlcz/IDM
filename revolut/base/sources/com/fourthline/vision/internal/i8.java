package com.fourthline.vision.internal;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Size;
import android.view.Surface;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.vision.internal.ra;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class i8 implements d2 {
    private static final d f = new d(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f36361g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final df f36362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j8 f36363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f36364c;
    private final fe d;
    private final String e;

    public static final class a extends Throwable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec f36365a;

        public a(@NotNull MediaCodec mediaCodec) {
            Intrinsics.checkNotNullParameter(mediaCodec, "mediaCodec");
            this.f36365a = mediaCodec;
        }

        @NotNull
        public final MediaCodec getMediaCodec() {
            return this.f36365a;
        }
    }

    public static final class b extends Throwable {
    }

    public static final class c extends Throwable {
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public static final class e extends Throwable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec f36366a;

        public e(@NotNull MediaCodec mediaCodec) {
            Intrinsics.checkNotNullParameter(mediaCodec, "mediaCodec");
            this.f36366a = mediaCodec;
        }

        @NotNull
        public final MediaCodec getMediaCodec() {
            return this.f36366a;
        }
    }

    public i8(@NotNull df visionInfoProvider, @NotNull j8 sizeCalculator, @NotNull p bitrateCalculator, @NotNull fe videoCodec) {
        String name;
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        Intrinsics.checkNotNullParameter(sizeCalculator, "sizeCalculator");
        Intrinsics.checkNotNullParameter(bitrateCalculator, "bitrateCalculator");
        Intrinsics.checkNotNullParameter(videoCodec, "videoCodec");
        this.f36362a = visionInfoProvider;
        this.f36363b = sizeCalculator;
        this.f36364c = bitrateCalculator;
        this.d = videoCodec;
        if (i8.class.isAnonymousClass()) {
            name = i8.class.getName();
            if (name.length() > 23) {
                name = name.substring(name.length() - 23, name.length());
                Intrinsics.checkNotNullExpressionValue(name, "substring(...)");
            }
        } else {
            name = "i8";
        }
        this.e = name;
    }

    private final Size adjustForRotation(Size size) {
        int orientationHint = this.f36362a.getOrientationHint();
        return (orientationHint == 90 || orientationHint == 270) ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    private final Try<Pair<MediaCodec, Surface>> configureAndCreateSurface(Try<MediaCodec> r3, Size size) {
        return TryKt.handleSuccessWith(r3, new xg(this, size, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try configureAndCreateSurface$lambda$0(i8 i8Var, Size size, MediaCodec it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return i8Var.configureAndCreateSurface(it8, size, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try configureAndCreateSurface$lambda$1$1(i8 i8Var, Size size, MediaCodec mediaCodec, Throwable it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        String str = i8Var.e;
        Objects.toString(size);
        return Try.INSTANCE.raiseError(new a(mediaCodec));
    }

    private final MediaFormat createFormat(Size size) {
        ib.b bVarB;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.d.getMimeType(), size.getWidth(), size.getHeight());
        int iCalculateBitrate = this.f36364c.calculateBitrate(size.getWidth(), size.getHeight(), 30);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", iCalculateBitrate);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", 30);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
        ib.h hVar = hb.a.f150532a;
        if (hVar != null && (bVarB = hVar.b(ib.b.Scanner)) != null) {
            oe.setVideoRecordingAttributes(bVarB, size, iCalculateBitrate, this.d.getMimeType());
        }
        Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "apply(...)");
        return mediaFormatCreateVideoFormat;
    }

    private final Try<MediaCodec> createMediaCodec() {
        Try failure;
        Try.Companion companion = Try.INSTANCE;
        try {
            this.d.getMimeType();
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(this.d.getMimeType());
            this.d.getMimeType();
            failure = new Try.Success(mediaCodecCreateEncoderByType);
        } catch (Throwable th10) {
            if ((th10 instanceof VirtualMachineError) || (th10 instanceof ThreadDeath) || (th10 instanceof InterruptedException) || (th10 instanceof LinkageError)) {
                throw th10;
            }
            failure = new Try.Failure(th10);
        }
        return TryKt.handleErrorWith(failure, new yg(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try createMediaCodec$lambda$1(i8 i8Var, Throwable it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        String str = i8Var.e;
        i8Var.d.getMimeType();
        return Try.INSTANCE.raiseError(new b());
    }

    private static /* synthetic */ void getCLASS_TAG$annotations() {
    }

    private final Size getMaxAvailableSize(MediaCodec mediaCodec) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodec.getCodecInfo().getCapabilitiesForType(this.d.getMimeType()).getVideoCapabilities();
        Object upper = videoCapabilities.getSupportedWidths().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
        int iIntValue = ((Number) upper).intValue();
        Object upper2 = videoCapabilities.getSupportedHeights().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper2, "getUpper(...)");
        Size sizeAdjustForRotation = adjustForRotation(new Size(iIntValue, ((Number) upper2).intValue()));
        Objects.toString(sizeAdjustForRotation);
        return sizeAdjustForRotation;
    }

    private final Try<Pair<MediaCodec, Surface>> handleReset(Try<MediaCodec> r3, Size size) {
        if (r3 instanceof Try.Failure) {
            Throwable exception = ((Try.Failure) r3).getException();
            return exception instanceof c ? TryKt.handleSuccessWith(createMediaCodec(), new xg(this, size, 2)) : Try.INSTANCE.raiseError(exception);
        }
        if (r3 instanceof Try.Success) {
            return tryCalculateSizeAndConfigureAndCreateSurface((MediaCodec) ((Try.Success) r3).getValue(), size);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try handleReset$lambda$0$0(i8 i8Var, Size size, MediaCodec codec) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        return i8Var.tryCalculateSizeAndConfigureAndCreateSurface(codec, size);
    }

    private final boolean isFormatSupported(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        return mediaCodec.getCodecInfo().getCapabilitiesForType(this.d.getMimeType()).isFormatSupported(mediaFormat);
    }

    private final Try<Pair<MediaCodec, Surface>> reconfigureIfError(Try<? extends Pair<MediaCodec, ? extends Surface>> r3, Size size) {
        return TryKt.handleErrorWith(r3, new xg(this, size, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try reconfigureIfError$lambda$0(i8 i8Var, Size size, Throwable it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8 instanceof e ? i8Var.tryCalculateSizeAndConfigureAndCreateSurface(((e) it8).getMediaCodec(), size) : it8 instanceof a ? i8Var.handleReset(i8Var.tryReset(((a) it8).getMediaCodec()), size) : Try.INSTANCE.raiseError(it8);
    }

    private final Try<Pair<MediaCodec, Surface>> tryCalculateSizeAndConfigureAndCreateSurface(MediaCodec mediaCodec, Size size) {
        return configureAndCreateSurface(mediaCodec, this.f36363b.calculateSize(size, getMaxAvailableSize(mediaCodec)), false);
    }

    private final Try<MediaCodec> tryReset(MediaCodec mediaCodec) {
        Try failure;
        Try.Companion companion = Try.INSTANCE;
        try {
            mediaCodec.reset();
            failure = new Try.Success(mediaCodec);
        } catch (Throwable th10) {
            if ((th10 instanceof VirtualMachineError) || (th10 instanceof ThreadDeath) || (th10 instanceof InterruptedException) || (th10 instanceof LinkageError)) {
                throw th10;
            }
            failure = new Try.Failure(th10);
        }
        return TryKt.handleErrorWith(failure, new yg(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Try tryReset$lambda$1(i8 i8Var, Throwable it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        String str = i8Var.e;
        return Try.INSTANCE.raiseError(new c());
    }

    @Override // com.fourthline.vision.internal.d2
    public /* bridge */ void subscribe(Function2<? super Pair<MediaCodec, ? extends Surface>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        super.subscribe(function2);
    }

    private final Try<Pair<MediaCodec, Surface>> configureAndCreateSurface(MediaCodec mediaCodec, Size size, boolean z) {
        Try failure;
        MediaFormat mediaFormatCreateFormat = createFormat(size);
        if (z && !isFormatSupported(mediaCodec, mediaFormatCreateFormat)) {
            Objects.toString(size);
            return Try.INSTANCE.raiseError(new e(mediaCodec));
        }
        Try.Companion companion = Try.INSTANCE;
        try {
            Objects.toString(size);
            mediaCodec.configure(mediaFormatCreateFormat, (Surface) null, (MediaCrypto) null, 1);
            Objects.toString(mediaFormatCreateFormat);
            Surface surfaceCreateInputSurface = mediaCodec.createInputSurface();
            Intrinsics.checkNotNullExpressionValue(surfaceCreateInputSurface, "createInputSurface(...)");
            mediaCodec.start();
            failure = new Try.Success(new Pair(mediaCodec, surfaceCreateInputSurface));
        } catch (Throwable th10) {
            if ((th10 instanceof VirtualMachineError) || (th10 instanceof ThreadDeath) || (th10 instanceof InterruptedException) || (th10 instanceof LinkageError)) {
                throw th10;
            }
            failure = new Try.Failure(th10);
        }
        return TryKt.handleErrorWith(failure, new com.fourthline.core.location.internal.b(this, 11, size, mediaCodec));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fourthline.vision.internal.d2
    @NotNull
    public Pair<MediaCodec, Surface> get() throws ra.a {
        this.f36362a.getOrientationHint();
        Size sizeAdjustForRotation = adjustForRotation(this.f36362a.getPreviewSize());
        Try<Pair<MediaCodec, Surface>> tryReconfigureIfError = reconfigureIfError(configureAndCreateSurface(createMediaCodec(), sizeAdjustForRotation), sizeAdjustForRotation);
        if (tryReconfigureIfError instanceof Try.Failure) {
            Objects.toString(((Try.Failure) tryReconfigureIfError).getException());
            throw new ra.a(pa.i, null, 2, 0 == true ? 1 : 0);
        }
        if (tryReconfigureIfError instanceof Try.Success) {
            return (Pair) ((Try.Success) tryReconfigureIfError).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }
}
