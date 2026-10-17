package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\r*\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006%"}, d2 = {"Landroidx/camera/camera2/pipe/compat/ExtensionRequestFailure;", "Landroidx/camera/camera2/pipe/RequestFailure;", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "", "wasImageCaptured", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "", "reason", "<init>", "(Landroidx/camera/camera2/pipe/RequestMetadata;ZJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/camera/camera2/pipe/RequestMetadata;", "getRequestMetadata", "()Landroidx/camera/camera2/pipe/RequestMetadata;", "Z", "getWasImageCaptured", "()Z", "J", "getFrameNumber-Ugla2oM", "()J", "I", "getReason", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ExtensionRequestFailure implements RequestFailure {
    private final long frameNumber;
    private final int reason;

    @NotNull
    private final RequestMetadata requestMetadata;
    private final boolean wasImageCaptured;

    public /* synthetic */ ExtensionRequestFailure(RequestMetadata requestMetadata, boolean z, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(requestMetadata, z, j2, i);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtensionRequestFailure)) {
            return false;
        }
        ExtensionRequestFailure extensionRequestFailure = (ExtensionRequestFailure) other;
        return Intrinsics.f(this.requestMetadata, extensionRequestFailure.requestMetadata) && this.wasImageCaptured == extensionRequestFailure.wasImageCaptured && FrameNumber.m224equalsimpl0(this.frameNumber, extensionRequestFailure.frameNumber) && this.reason == extensionRequestFailure.reason;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public int getReason() {
        return this.reason;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public boolean getWasImageCaptured() {
        return this.wasImageCaptured;
    }

    public int hashCode() {
        return Integer.hashCode(this.reason) + ((FrameNumber.m225hashCodeimpl(this.frameNumber) + j6.a.c(this.requestMetadata.hashCode() * 31, 31, this.wasImageCaptured)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("ExtensionRequestFailure(requestMetadata=");
        sb6.append(this.requestMetadata);
        sb6.append(", wasImageCaptured=");
        sb6.append(this.wasImageCaptured);
        sb6.append(", frameNumber=");
        sb6.append((Object) FrameNumber.m226toStringimpl(this.frameNumber));
        sb6.append(", reason=");
        return j6.a.t(sb6, this.reason, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public <T> T unwrapAs(@NotNull KClass type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return null;
    }

    private ExtensionRequestFailure(RequestMetadata requestMetadata, boolean z, long j2, int i) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        this.requestMetadata = requestMetadata;
        this.wasImageCaptured = z;
        this.frameNumber = j2;
        this.reason = i;
    }
}
