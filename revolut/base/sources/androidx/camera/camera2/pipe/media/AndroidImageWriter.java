package androidx.camera.camera2.pipe.media;

import android.content.res.TypedArray;
import android.media.Image;
import android.media.ImageWriter;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.pipe.InputStreamId;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.compat.Api29Compat;
import androidx.camera.camera2.pipe.core.Log;
import ch.qos.logback.core.CoreConstants;
import hx7.b;
import j6.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import rkm.h;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"Landroidx/camera/camera2/pipe/media/AndroidImageWriter;", "Landroidx/camera/camera2/pipe/media/ImageWriterWrapper;", "Landroid/media/ImageWriter$OnImageReleasedListener;", "Landroid/media/ImageWriter;", "imageWriter", "Landroidx/camera/camera2/pipe/InputStreamId;", "inputStreamId", "<init>", "(Landroid/media/ImageWriter;I)V", "Landroidx/camera/camera2/pipe/media/ImageWrapper;", "image", "", "queueInputImage", "(Landroidx/camera/camera2/pipe/media/ImageWrapper;)Z", "writer", "", "onImageReleased", "(Landroid/media/ImageWriter;)V", "close", "()V", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Landroid/media/ImageWriter;", "I", "Lrkm/h;", "onImageReleasedListener", "Lrkm/h;", "", "maxImages", "getMaxImages", "()I", "format", "getFormat", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidImageWriter implements ImageWriterWrapper, ImageWriter.OnImageReleasedListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int format;

    @NotNull
    private final ImageWriter imageWriter;
    private final int inputStreamId;
    private final int maxImages;

    @NotNull
    private final h onImageReleasedListener;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/camera/camera2/pipe/media/AndroidImageWriter$Companion;", "", "<init>", "()V", "create", "Landroidx/camera/camera2/pipe/media/ImageWriterWrapper;", "surface", "Landroid/view/Surface;", "inputStreamId", "Landroidx/camera/camera2/pipe/InputStreamId;", "maxImages", "", "format", "Landroidx/camera/camera2/pipe/StreamFormat;", "handler", "Landroid/os/Handler;", "create-U86x6Zg", "(Landroid/view/Surface;IILandroidx/camera/camera2/pipe/StreamFormat;Landroid/os/Handler;)Landroidx/camera/camera2/pipe/media/ImageWriterWrapper;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: create-U86x6Zg, reason: not valid java name */
        public final ImageWriterWrapper m513createU86x6Zg(@NotNull Surface surface, int inputStreamId, int maxImages, StreamFormat format, @NotNull Handler handler) {
            ImageWriter imageWriterNewInstance;
            Intrinsics.checkNotNullParameter(surface, "surface");
            Intrinsics.checkNotNullParameter(handler, "handler");
            if (maxImages <= 0) {
                throw new IllegalArgumentException(a.l(maxImages, "Max images (", ") must be > 0").toString());
            }
            if (maxImages > 54) {
                throw new IllegalArgumentException("Max images for ImageWriters is restricted to 54 to prevent overloading downstream consumer components.");
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 29 || format == null) {
                if (format != null && Log.INSTANCE.getWARN_LOGGABLE()) {
                    String str = "Ignoring format (" + ((Object) StreamFormat.m349toStringimpl(format.getValue())) + ") for " + ((Object) InputStreamId.m233toStringimpl(inputStreamId)) + ". Android " + i + " does not support creating ImageWriters with formats. This may lead to unexpected behaviors.";
                }
                imageWriterNewInstance = ImageWriter.newInstance(surface, maxImages);
                Intrinsics.h(imageWriterNewInstance);
            } else {
                imageWriterNewInstance = Api29Compat.imageWriterNewInstance(surface, maxImages, format.getValue());
            }
            AndroidImageWriter androidImageWriter = new AndroidImageWriter(imageWriterNewInstance, inputStreamId, null);
            imageWriterNewInstance.setOnImageReleasedListener(androidImageWriter, handler);
            return androidImageWriter;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AndroidImageWriter(ImageWriter imageWriter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageWriter, i);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.imageWriter.close();
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public void onImageReleased(ImageWriter writer) {
        if (this.onImageReleasedListener.f254900a != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.camera2.pipe.media.ImageWriterWrapper
    public boolean queueInputImage(@NotNull ImageWrapper image) throws Exception {
        boolean zIsTerminated;
        Image image2;
        Intrinsics.checkNotNullParameter(image, "image");
        try {
            image2 = (Image) image.unwrapAs(o0.f186429a.b(Image.class));
        } catch (Throwable th10) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str = "Failed to queue image to " + this + " due to error " + th10.getMessage() + ". Ignoring failure and closing " + image;
            }
            if (image instanceof AutoCloseable) {
                image.close();
            } else if (image instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) image;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (image instanceof TypedArray) {
                ((TypedArray) image).recycle();
            } else {
                if (!(image instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) image).release();
            }
        }
        if (image2 != null) {
            this.imageWriter.queueInputImage(image2);
            return true;
        }
        if (Log.INSTANCE.getWARN_LOGGABLE()) {
            String str2 = "Failed to unwrap image wrapper " + image;
            return false;
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "ImageWriter-" + StreamFormat.m347getNameimpl(StreamFormat.m344constructorimpl(this.imageWriter.getFormat())) + CoreConstants.DASH_CHAR + ((Object) InputStreamId.m233toStringimpl(this.inputStreamId));
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public <T> T unwrapAs(@NotNull KClass type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.f(type, o0.f186429a.b(ImageWriter.class))) {
            return (T) this.imageWriter;
        }
        return null;
    }

    private AndroidImageWriter(ImageWriter imageWriter, int i) {
        this.imageWriter = imageWriter;
        this.inputStreamId = i;
        this.onImageReleasedListener = b.j(null);
        this.maxImages = imageWriter.getMaxImages();
        this.format = imageWriter.getFormat();
    }
}
