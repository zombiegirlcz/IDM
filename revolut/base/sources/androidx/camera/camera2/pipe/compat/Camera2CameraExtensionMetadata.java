package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.Size;
import androidx.camera.camera2.pipe.CameraExtensionMetadata;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0018\u0010\r\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0010*\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR&\u0010\r\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR,\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR0\u0010%\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030$\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001eR,\u0010&\u001a\u001a\u0012\u0004\u0012\u00020\"\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!0 0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001eR$\u0010(\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030'0!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R$\u0010+\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030*0!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)R\u0014\u0010.\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0019¨\u0006/"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2CameraExtensionMetadata;", "Landroidx/camera/camera2/pipe/CameraExtensionMetadata;", "Landroidx/camera/camera2/pipe/CameraId;", "camera", "", "isRedacted", "", "cameraExtension", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "extensionCharacteristics", "", "Landroidx/camera/camera2/pipe/Metadata$Key;", "", "metadata", "<init>", "(Ljava/lang/String;ZILandroid/hardware/camera2/CameraExtensionCharacteristics;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Ljava/lang/String;", "getCamera-Dz_R5H8", "()Ljava/lang/String;", "Z", "()Z", "I", "getCameraExtension", "()I", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "Ljava/util/Map;", "", "Lkotlin/Lazy;", "", "Landroid/util/Size;", "supportedExtensionSizesByFormat", "Ljava/lang/Class;", "supportedExtensionSizesByClass", "supportedPostviewSizes", "Landroid/hardware/camera2/CaptureRequest$Key;", "_requestKeys", "Lkotlin/Lazy;", "Landroid/hardware/camera2/CaptureResult$Key;", "_resultKeys", "_isPostviewSupported", "_isCaptureProgressSupported", "isPostviewSupported", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraExtensionMetadata implements CameraExtensionMetadata {

    @NotNull
    private final Lazy _isCaptureProgressSupported;

    @NotNull
    private final Lazy _isPostviewSupported;

    @NotNull
    private final Lazy _requestKeys;

    @NotNull
    private final Lazy _resultKeys;

    @NotNull
    private final String camera;
    private final int cameraExtension;

    @NotNull
    private final CameraExtensionCharacteristics extensionCharacteristics;
    private final boolean isRedacted;

    @NotNull
    private final Map<Metadata.Key<?>, Object> metadata;

    @NotNull
    private final Map<Class<?>, Lazy> supportedExtensionSizesByClass;

    @NotNull
    private final Map<Integer, Lazy> supportedExtensionSizesByFormat;

    @NotNull
    private final Map<Size, Lazy> supportedPostviewSizes;

    public /* synthetic */ Camera2CameraExtensionMetadata(String str, boolean z, int i, CameraExtensionCharacteristics cameraExtensionCharacteristics, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, i, cameraExtensionCharacteristics, map);
    }

    @NotNull
    /* JADX INFO: renamed from: getCamera-Dz_R5H8, reason: not valid java name and from getter */
    public String getCamera() {
        return this.camera;
    }

    public int getCameraExtension() {
        return this.cameraExtension;
    }

    @Override // androidx.camera.camera2.pipe.CameraExtensionMetadata
    public boolean isPostviewSupported() {
        return ((Boolean) this._isPostviewSupported.getValue()).booleanValue();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public <T> T unwrapAs(@NotNull KClass type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Intrinsics.f(type, o0.f186429a.b(u3.a.j()))) {
            return null;
        }
        T t2 = (T) this.extensionCharacteristics;
        Intrinsics.i(t2, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.Camera2CameraExtensionMetadata.unwrapAs");
        return t2;
    }

    private Camera2CameraExtensionMetadata(String camera, boolean z, int i, CameraExtensionCharacteristics extensionCharacteristics, Map<Metadata.Key<?>, ? extends Object> metadata) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(extensionCharacteristics, "extensionCharacteristics");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.camera = camera;
        this.isRedacted = z;
        this.cameraExtension = i;
        this.extensionCharacteristics = extensionCharacteristics;
        this.metadata = metadata;
        this.supportedExtensionSizesByFormat = new LinkedHashMap();
        this.supportedExtensionSizesByClass = new LinkedHashMap();
        this.supportedPostviewSizes = new LinkedHashMap();
        k kVar = k.PUBLICATION;
        this._requestKeys = j.c(kVar, new Function0<Set<? extends CaptureRequest.Key<Object>>>(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraExtensionMetadata$special$$inlined$lazyOrEmptySet$1
            @Override // kotlin.jvm.functions.Function0
            public final Set<CaptureRequest.Key<Object>> invoke() {
                String str = ((Object) CameraId.m186toStringimpl(this.this$0.getCamera())) + "#availableCaptureRequestKeys";
                try {
                    Debug debug = Debug.INSTANCE;
                    try {
                        Trace.beginSection(str);
                        Set<CaptureRequest.Key<Object>> setI1 = Build.VERSION.SDK_INT >= 33 ? d0.i1(Api33Compat.getAvailableCaptureRequestKeys(this.this$0.extensionCharacteristics, this.this$0.getCameraExtension())) : h0.f322473a;
                        if (setI1 == null) {
                            setI1 = h0.f322473a;
                        }
                        Trace.endSection();
                        return setI1;
                    } catch (Throwable th10) {
                        Trace.endSection();
                        throw th10;
                    }
                } catch (Throwable th11) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        String str2 = "Failed to get " + str + "! Caching {} and ignoring exception.";
                    }
                    return h0.f322473a;
                }
            }
        });
        this._resultKeys = j.c(kVar, new Function0<Set<? extends CaptureResult.Key<Object>>>(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraExtensionMetadata$special$$inlined$lazyOrEmptySet$2
            @Override // kotlin.jvm.functions.Function0
            public final Set<CaptureResult.Key<Object>> invoke() {
                String str = ((Object) CameraId.m186toStringimpl(this.this$0.getCamera())) + "#availableCaptureResultKeys";
                try {
                    Debug debug = Debug.INSTANCE;
                    try {
                        Trace.beginSection(str);
                        Set<CaptureResult.Key<Object>> setI1 = Build.VERSION.SDK_INT >= 33 ? d0.i1(Api33Compat.getAvailableCaptureResultKeys(this.this$0.extensionCharacteristics, this.this$0.getCameraExtension())) : h0.f322473a;
                        if (setI1 == null) {
                            setI1 = h0.f322473a;
                        }
                        Trace.endSection();
                        return setI1;
                    } catch (Throwable th10) {
                        Trace.endSection();
                        throw th10;
                    }
                } catch (Throwable th11) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        String str2 = "Failed to get " + str + "! Caching {} and ignoring exception.";
                    }
                    return h0.f322473a;
                }
            }
        });
        this._isPostviewSupported = j.c(kVar, new Function0<Boolean>(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraExtensionMetadata$special$$inlined$lazyOrFalse$1
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                String str = ((Object) CameraId.m186toStringimpl(this.this$0.getCamera())) + "#isPostviewSupported";
                boolean z3 = false;
                try {
                    Debug debug = Debug.INSTANCE;
                    try {
                        Trace.beginSection(str);
                        boolean zIsPostviewAvailable = Build.VERSION.SDK_INT >= 34 ? Api34Compat.isPostviewAvailable(this.this$0.extensionCharacteristics, this.this$0.getCameraExtension()) : false;
                        Trace.endSection();
                        z3 = zIsPostviewAvailable;
                    } catch (Throwable th10) {
                        Trace.endSection();
                        throw th10;
                    }
                } catch (Throwable th11) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        String str2 = "Failed to get " + str + "! Caching false and ignoring exception.";
                    }
                }
                return Boolean.valueOf(z3);
            }
        });
        this._isCaptureProgressSupported = j.c(kVar, new Function0<Boolean>(this) { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraExtensionMetadata$special$$inlined$lazyOrFalse$2
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                String str = ((Object) CameraId.m186toStringimpl(this.this$0.getCamera())) + "#isCaptureProgressSupported";
                boolean z3 = false;
                try {
                    Debug debug = Debug.INSTANCE;
                    try {
                        Trace.beginSection(str);
                        boolean zIsCaptureProcessProgressAvailable = Build.VERSION.SDK_INT >= 34 ? Api34Compat.isCaptureProcessProgressAvailable(this.this$0.extensionCharacteristics, this.this$0.getCameraExtension()) : false;
                        Trace.endSection();
                        z3 = zIsCaptureProcessProgressAvailable;
                    } catch (Throwable th10) {
                        Trace.endSection();
                        throw th10;
                    }
                } catch (Throwable th11) {
                    if (Log.INSTANCE.getWARN_LOGGABLE()) {
                        String str2 = "Failed to get " + str + "! Caching false and ignoring exception.";
                    }
                }
                return Boolean.valueOf(z3);
            }
        });
    }
}
