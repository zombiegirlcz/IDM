package androidx.camera.camera2.adapter;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.impl.TagsKt;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.core.impl.CameraCaptureMetaData$AeMode;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfMode;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbMode;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J)\u00102\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010/*\u00020.2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00105R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Landroidx/camera/camera2/adapter/CaptureResultAdapter;", "Landroidx/camera/core/impl/CameraCaptureResult;", "Landroidx/camera/camera2/pipe/UnsafeWrapper;", "Landroidx/camera/camera2/pipe/RequestMetadata;", "requestMetadata", "Landroidx/camera/camera2/pipe/FrameNumber;", "frameNumber", "Landroidx/camera/camera2/pipe/FrameInfo;", "result", "<init>", "(Landroidx/camera/camera2/pipe/RequestMetadata;JLandroidx/camera/camera2/pipe/FrameInfo;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/camera/core/impl/CameraCaptureMetaData$AfMode;", "getAfMode", "()Landroidx/camera/core/impl/CameraCaptureMetaData$AfMode;", "Landroidx/camera/core/impl/CameraCaptureMetaData$AfState;", "getAfState", "()Landroidx/camera/core/impl/CameraCaptureMetaData$AfState;", "Landroidx/camera/core/impl/CameraCaptureMetaData$AeMode;", "getAeMode", "()Landroidx/camera/core/impl/CameraCaptureMetaData$AeMode;", "Landroidx/camera/core/impl/CameraCaptureMetaData$AeState;", "getAeState", "()Landroidx/camera/core/impl/CameraCaptureMetaData$AeState;", "Landroidx/camera/core/impl/CameraCaptureMetaData$AwbMode;", "getAwbMode", "()Landroidx/camera/core/impl/CameraCaptureMetaData$AwbMode;", "Landroidx/camera/core/impl/CameraCaptureMetaData$AwbState;", "getAwbState", "()Landroidx/camera/core/impl/CameraCaptureMetaData$AwbState;", "Landroidx/camera/core/impl/CameraCaptureMetaData$FlashState;", "getFlashState", "()Landroidx/camera/core/impl/CameraCaptureMetaData$FlashState;", "", "getTimestamp", "()J", "Landroidx/camera/core/impl/TagBundle;", "getTagBundle", "()Landroidx/camera/core/impl/TagBundle;", "Landroidx/camera/core/impl/utils/ExifData$Builder;", "exifBuilder", "", "populateExifData", "(Landroidx/camera/core/impl/utils/ExifData$Builder;)V", "Landroid/hardware/camera2/CaptureResult;", "getCaptureResult", "()Landroid/hardware/camera2/CaptureResult;", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Landroidx/camera/camera2/pipe/RequestMetadata;", "J", "Landroidx/camera/camera2/pipe/FrameInfo;", "getResult$camera_camera2", "()Landroidx/camera/camera2/pipe/FrameInfo;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CaptureResultAdapter implements CameraCaptureResult, UnsafeWrapper {
    private final long frameNumber;

    @NotNull
    private final RequestMetadata requestMetadata;

    @NotNull
    private final FrameInfo result;

    public /* synthetic */ CaptureResultAdapter(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo, DefaultConstructorMarker defaultConstructorMarker) {
        this(requestMetadata, j2, frameInfo);
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NotNull
    public CameraCaptureMetaData$AeMode getAeMode() {
        return CaptureResultAdapterKt.getAeMode(this.result.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NotNull
    public CameraCaptureMetaData$AeState getAeState() {
        return CaptureResultAdapterKt.getAeState(this.result.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NotNull
    public CameraCaptureMetaData$AfMode getAfMode() {
        return CaptureResultAdapterKt.getAfMode(this.result.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NotNull
    public CameraCaptureMetaData$AfState getAfState() {
        return CaptureResultAdapterKt.getAfState(this.result.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NotNull
    public CameraCaptureMetaData$AwbMode getAwbMode() {
        return CaptureResultAdapterKt.getAwbMode(this.result.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NotNull
    public CameraCaptureMetaData$AwbState getAwbState() {
        return CaptureResultAdapterKt.getAwbState(this.result.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NotNull
    public CaptureResult getCaptureResult() {
        Object objUnwrapAs = unwrapAs(o0.f186429a.b(TotalCaptureResult.class));
        if (objUnwrapAs != null) {
            return (CaptureResult) objUnwrapAs;
        }
        throw new IllegalStateException(("Failed to unwrap " + this + " as TotalCaptureResult").toString());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NotNull
    public CameraCaptureMetaData$FlashState getFlashState() {
        return CaptureResultAdapterKt.getFlashState(this.result.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    @NotNull
    public TagBundle getTagBundle() {
        return (TagBundle) this.requestMetadata.getOrDefault(TagsKt.getCAMERAX_TAG_BUNDLE(), TagBundle.emptyBundle());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        return CaptureResultAdapterKt.getTimestamp(this.result.getMetadata());
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public void populateExifData(@NotNull ExifData.Builder exifBuilder) {
        Intrinsics.checkNotNullParameter(exifBuilder, "exifBuilder");
        super.populateExifData(exifBuilder);
        CaptureResultAdapterKt.populateExifData(this.result.getMetadata(), exifBuilder);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public <T> T unwrapAs(@NotNull KClass type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Intrinsics.f(type, o0.f186429a.b(FrameInfo.class))) {
            return (T) this.result.unwrapAs(type);
        }
        T t2 = (T) this.result;
        Intrinsics.i(t2, "null cannot be cast to non-null type T of androidx.camera.camera2.adapter.CaptureResultAdapter.unwrapAs");
        return t2;
    }

    private CaptureResultAdapter(RequestMetadata requestMetadata, long j2, FrameInfo result) {
        Intrinsics.checkNotNullParameter(requestMetadata, "requestMetadata");
        Intrinsics.checkNotNullParameter(result, "result");
        this.requestMetadata = requestMetadata;
        this.frameNumber = j2;
        this.result = result;
    }
}
