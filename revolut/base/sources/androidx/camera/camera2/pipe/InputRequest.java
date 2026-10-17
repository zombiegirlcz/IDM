package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.media.ImageWrapper;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/camera/camera2/pipe/InputRequest;", "", "Landroidx/camera/camera2/pipe/media/ImageWrapper;", "image", "Landroidx/camera/camera2/pipe/FrameInfo;", "frameInfo", "<init>", "(Landroidx/camera/camera2/pipe/media/ImageWrapper;Landroidx/camera/camera2/pipe/FrameInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/camera/camera2/pipe/media/ImageWrapper;", "getImage", "()Landroidx/camera/camera2/pipe/media/ImageWrapper;", "Landroidx/camera/camera2/pipe/FrameInfo;", "getFrameInfo", "()Landroidx/camera/camera2/pipe/FrameInfo;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InputRequest {

    @NotNull
    private final FrameInfo frameInfo;

    @NotNull
    private final ImageWrapper image;

    public InputRequest(@NotNull ImageWrapper image, @NotNull FrameInfo frameInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(frameInfo, "frameInfo");
        this.image = image;
        this.frameInfo = frameInfo;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputRequest)) {
            return false;
        }
        InputRequest inputRequest = (InputRequest) other;
        return Intrinsics.f(this.image, inputRequest.image) && Intrinsics.f(this.frameInfo, inputRequest.frameInfo);
    }

    @NotNull
    public final FrameInfo getFrameInfo() {
        return this.frameInfo;
    }

    @NotNull
    public final ImageWrapper getImage() {
        return this.image;
    }

    public int hashCode() {
        return this.frameInfo.hashCode() + (this.image.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "InputRequest(image=" + this.image + ", frameInfo=" + this.frameInfo + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
