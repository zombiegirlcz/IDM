package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import androidx.camera.camera2.pipe.CameraExtensionMetadata;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Log;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0018\u0010\r\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n\u0012\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0013*\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J)\u0010'\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0013*\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0002¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R&\u0010\r\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00101R&\u00103\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\f028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020$028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00104R \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R$\u00109\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R$\u0010;\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u000e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108R$\u0010=\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030<0\u000e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00108R \u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00108R$\u0010?\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u000e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00108R$\u0010@\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00108R$\u0010A\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u000e068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00108R\u001e\u0010D\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010CR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\"0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010C¨\u0006I"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Camera2CameraMetadata;", "Landroidx/camera/camera2/pipe/CameraMetadata;", "Landroidx/camera/camera2/pipe/CameraId;", "camera", "", "isRedacted", "Landroid/hardware/camera2/CameraCharacteristics;", "characteristics", "Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;", "metadataProvider", "", "Landroidx/camera/camera2/pipe/Metadata$Key;", "", "metadata", "", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "cacheBlocklist", "<init>", "(Ljava/lang/String;ZLandroid/hardware/camera2/CameraCharacteristics;Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;Ljava/util/Map;Ljava/util/Set;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "T", "key", "get", "(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;", "default", "getOrDefault", "(Landroid/hardware/camera2/CameraCharacteristics$Key;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "cameraId", "awaitPhysicalMetadata-EfqyGwQ", "(Ljava/lang/String;)Landroidx/camera/camera2/pipe/CameraMetadata;", "awaitPhysicalMetadata", "", "extension", "Landroidx/camera/camera2/pipe/CameraExtensionMetadata;", "awaitExtensionMetadata", "(I)Landroidx/camera/camera2/pipe/CameraExtensionMetadata;", "getOrThrow", "(Landroid/hardware/camera2/CameraCharacteristics;Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;", "Ljava/lang/String;", "getCamera-Dz_R5H8", "()Ljava/lang/String;", "Z", "()Z", "Landroid/hardware/camera2/CameraCharacteristics;", "Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;", "Ljava/util/Map;", "Ljava/util/Set;", "Landroid/util/ArrayMap;", "values", "Landroid/util/ArrayMap;", "extensionCache", "Lkotlin/Lazy;", "_supportedExtensions", "Lkotlin/Lazy;", "_keys", "Landroid/hardware/camera2/CaptureRequest$Key;", "_requestKeys", "Landroid/hardware/camera2/CaptureResult$Key;", "_resultKeys", "_physicalCameraIds", "_physicalRequestKeys", "_sessionCharacteristicsKeys", "_sessionKeys", "getSessionKeys", "()Ljava/util/Set;", "sessionKeys", "getPhysicalCameraIds", "physicalCameraIds", "getSupportedExtensions", "supportedExtensions", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraMetadata implements CameraMetadata {

    @NotNull
    private final Lazy _keys;

    @NotNull
    private final Lazy _physicalCameraIds;

    @NotNull
    private final Lazy _physicalRequestKeys;

    @NotNull
    private final Lazy _requestKeys;

    @NotNull
    private final Lazy _resultKeys;

    @NotNull
    private final Lazy _sessionCharacteristicsKeys;

    @NotNull
    private final Lazy _sessionKeys;

    @NotNull
    private final Lazy _supportedExtensions;

    @NotNull
    private final Set<CameraCharacteristics.Key<?>> cacheBlocklist;

    @NotNull
    private final String camera;

    @NotNull
    private final CameraCharacteristics characteristics;

    @NotNull
    private final ArrayMap<Integer, CameraExtensionMetadata> extensionCache;
    private final boolean isRedacted;

    @NotNull
    private final Map<Metadata.Key<?>, Object> metadata;

    @NotNull
    private final Camera2MetadataProvider metadataProvider;

    @NotNull
    private final ArrayMap<CameraCharacteristics.Key<?>, Object> values;

    public /* synthetic */ Camera2CameraMetadata(String str, boolean z, CameraCharacteristics cameraCharacteristics, Camera2MetadataProvider camera2MetadataProvider, Map map, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, cameraCharacteristics, camera2MetadataProvider, map, set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set _keys$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        try {
            Debug debug = Debug.INSTANCE;
            try {
                Trace.beginSection(((Object) CameraId.m186toStringimpl(camera2CameraMetadata.getCamera())) + "#keys");
                List<CameraCharacteristics.Key<?>> keys = camera2CameraMetadata.characteristics.getKeys();
                if (keys == null) {
                    keys = f0.f322471a;
                }
                Set setI1 = d0.i1(keys);
                Trace.endSection();
                return setI1;
            } catch (Throwable th10) {
                Trace.endSection();
                throw th10;
            }
        } catch (AssertionError e) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str = "Failed to getKeys from " + ((Object) CameraId.m186toStringimpl(camera2CameraMetadata.getCamera())) + CoreConstants.CURLY_RIGHT;
            }
            return h0.f322473a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set _physicalCameraIds$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        try {
            Debug debug = Debug.INSTANCE;
            try {
                Trace.beginSection(((Object) CameraId.m186toStringimpl(camera2CameraMetadata.getCamera())) + "#physicalCameraIds");
                Iterable physicalCameraIds = Api28Compat.getPhysicalCameraIds(camera2CameraMetadata.characteristics);
                if (Log.INSTANCE.getINFO_LOGGABLE()) {
                    String str = "Loaded physicalCameraIds from " + ((Object) CameraId.m186toStringimpl(camera2CameraMetadata.getCamera())) + ": " + physicalCameraIds;
                }
                if (physicalCameraIds == null) {
                    physicalCameraIds = h0.f322473a;
                }
                Iterable iterable = physicalCameraIds;
                ArrayList arrayList = new ArrayList(w.t(iterable, 10));
                Iterator it8 = iterable.iterator();
                while (it8.hasNext()) {
                    arrayList.add(CameraId.m181boximpl(CameraId.m182constructorimpl((String) it8.next())));
                }
                Set setI1 = d0.i1(arrayList);
                Trace.endSection();
                return setI1;
            } catch (Throwable th10) {
                Trace.endSection();
                throw th10;
            }
        } catch (AssertionError e) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str2 = "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m186toStringimpl(camera2CameraMetadata.getCamera()));
            }
            return h0.f322473a;
        } catch (NullPointerException e2) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str3 = "Failed to getPhysicalCameraIds from " + ((Object) CameraId.m186toStringimpl(camera2CameraMetadata.getCamera()));
            }
            return h0.f322473a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set _physicalRequestKeys$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        try {
            Debug debug = Debug.INSTANCE;
            try {
                Trace.beginSection("Camera-" + camera2CameraMetadata.getCamera() + "#availablePhysicalCameraRequestKeys");
                Iterable availablePhysicalCameraRequestKeys = Api28Compat.getAvailablePhysicalCameraRequestKeys(camera2CameraMetadata.characteristics);
                if (availablePhysicalCameraRequestKeys == null) {
                    availablePhysicalCameraRequestKeys = f0.f322471a;
                }
                Set setI1 = d0.i1(availablePhysicalCameraRequestKeys);
                Trace.endSection();
                return setI1;
            } catch (Throwable th10) {
                Trace.endSection();
                throw th10;
            }
        } catch (AssertionError e) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str = "Failed to getAvailablePhysicalCameraRequestKeys from Camera-" + camera2CameraMetadata.getCamera();
            }
            return h0.f322473a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set _requestKeys$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        try {
            Debug debug = Debug.INSTANCE;
            try {
                Trace.beginSection(((Object) CameraId.m186toStringimpl(camera2CameraMetadata.getCamera())) + "#availableCaptureRequestKeys");
                List<CaptureRequest.Key<?>> availableCaptureRequestKeys = camera2CameraMetadata.characteristics.getAvailableCaptureRequestKeys();
                if (availableCaptureRequestKeys == null) {
                    availableCaptureRequestKeys = f0.f322471a;
                }
                Set setI1 = d0.i1(availableCaptureRequestKeys);
                Trace.endSection();
                return setI1;
            } catch (Throwable th10) {
                Trace.endSection();
                throw th10;
            }
        } catch (AssertionError e) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str = "Failed to getAvailableCaptureRequestKeys from " + ((Object) CameraId.m186toStringimpl(camera2CameraMetadata.getCamera()));
            }
            return h0.f322473a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set _resultKeys$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        try {
            Debug debug = Debug.INSTANCE;
            try {
                Trace.beginSection(((Object) CameraId.m186toStringimpl(camera2CameraMetadata.getCamera())) + "#availableCaptureResultKeys");
                List<CaptureResult.Key<?>> availableCaptureResultKeys = camera2CameraMetadata.characteristics.getAvailableCaptureResultKeys();
                if (availableCaptureResultKeys == null) {
                    availableCaptureResultKeys = f0.f322471a;
                }
                Set setI1 = d0.i1(availableCaptureResultKeys);
                Trace.endSection();
                return setI1;
            } catch (Throwable th10) {
                Trace.endSection();
                throw th10;
            }
        } catch (AssertionError e) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str = "Failed to getAvailableCaptureResultKeys from " + ((Object) CameraId.m186toStringimpl(camera2CameraMetadata.getCamera()));
            }
            return h0.f322473a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set _sessionCharacteristicsKeys$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        if (Build.VERSION.SDK_INT < 35) {
            return h0.f322473a;
        }
        try {
            Debug debug = Debug.INSTANCE;
            try {
                Trace.beginSection("Camera-" + camera2CameraMetadata.getCamera() + "#getAvailableSessionCharacteristicsKeys");
                Iterable availableSessionCharacteristicsKeys = Api35Compat.getAvailableSessionCharacteristicsKeys(camera2CameraMetadata.characteristics);
                if (availableSessionCharacteristicsKeys == null) {
                    availableSessionCharacteristicsKeys = f0.f322471a;
                }
                Set setI1 = d0.i1(availableSessionCharacteristicsKeys);
                Trace.endSection();
                return setI1;
            } catch (Throwable th10) {
                Trace.endSection();
                throw th10;
            }
        } catch (AssertionError e) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str = "Failed to getAvailableSessionCharacteristicsKeys from Camera-" + camera2CameraMetadata.getCamera();
            }
            return h0.f322473a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set _sessionKeys$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        try {
            Debug debug = Debug.INSTANCE;
            try {
                Trace.beginSection("Camera-" + camera2CameraMetadata.getCamera() + "#availableSessionKeys");
                Iterable availableSessionKeys = Api28Compat.getAvailableSessionKeys(camera2CameraMetadata.characteristics);
                if (availableSessionKeys == null) {
                    availableSessionKeys = f0.f322471a;
                }
                Set setI1 = d0.i1(availableSessionKeys);
                Trace.endSection();
                return setI1;
            } catch (Throwable th10) {
                Trace.endSection();
                throw th10;
            }
        } catch (AssertionError e) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str = "Failed to getAvailableSessionKeys from Camera-" + camera2CameraMetadata.getCamera();
            }
            return h0.f322473a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set _supportedExtensions$lambda$0(Camera2CameraMetadata camera2CameraMetadata) {
        try {
            Debug debug = Debug.INSTANCE;
            try {
                Trace.beginSection("Camera-" + ((Object) CameraId.m186toStringimpl(camera2CameraMetadata.getCamera())) + "#supportedExtensions");
                return camera2CameraMetadata.metadataProvider.mo407getSupportedCameraExtensionsEfqyGwQ(camera2CameraMetadata.getCamera());
            } finally {
                Trace.endSection();
            }
        } catch (AssertionError e) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                String str = "Failed to getSupportedExtensions from Camera-" + ((Object) CameraId.m186toStringimpl(camera2CameraMetadata.getCamera()));
            }
            return h0.f322473a;
        }
    }

    private final <T> T getOrThrow(CameraCharacteristics cameraCharacteristics, CameraCharacteristics.Key<T> key) {
        try {
            return (T) cameraCharacteristics.get(key);
        } catch (AssertionError unused) {
            throw new IllegalStateException("Failed to get characteristic for " + key + ": Framework throw an AssertionError");
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    @NotNull
    public CameraExtensionMetadata awaitExtensionMetadata(int extension) {
        CameraExtensionMetadata cameraExtensionMetadata;
        synchronized (this.extensionCache) {
            cameraExtensionMetadata = this.extensionCache.get(Integer.valueOf(extension));
        }
        if (cameraExtensionMetadata != null) {
            return cameraExtensionMetadata;
        }
        CameraExtensionMetadata cameraExtensionMetadataMo404awaitCameraExtensionMetadata0r8Bogc = this.metadataProvider.mo404awaitCameraExtensionMetadata0r8Bogc(getCamera(), extension);
        synchronized (this.extensionCache) {
            this.extensionCache.put(Integer.valueOf(extension), cameraExtensionMetadataMo404awaitCameraExtensionMetadata0r8Bogc);
            Unit unit = Unit.f186387a;
        }
        return cameraExtensionMetadataMo404awaitCameraExtensionMetadata0r8Bogc;
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    @NotNull
    /* JADX INFO: renamed from: awaitPhysicalMetadata-EfqyGwQ */
    public CameraMetadata mo190awaitPhysicalMetadataEfqyGwQ(@NotNull String cameraId) {
        Intrinsics.checkNotNullParameter(cameraId, "cameraId");
        if (getPhysicalCameraIds().contains(CameraId.m181boximpl(cameraId))) {
            return this.metadataProvider.mo405awaitCameraMetadataEfqyGwQ(cameraId);
        }
        throw new IllegalStateException((((Object) CameraId.m186toStringimpl(cameraId)) + " is not a valid physical camera on " + this).toString());
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    public <T> T get(@NotNull CameraCharacteristics.Key<T> key) {
        T t2;
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.cacheBlocklist.contains(key)) {
            return (T) getOrThrow(this.characteristics, key);
        }
        synchronized (this.values) {
            t2 = (T) this.values.get(key);
        }
        if (t2 != null) {
            return t2;
        }
        T t3 = (T) getOrThrow(this.characteristics, key);
        if (t3 == null) {
            return t3;
        }
        synchronized (this.values) {
            this.values.put((CameraCharacteristics.Key<?>) key, t3);
            Unit unit = Unit.f186387a;
        }
        return t3;
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    @NotNull
    /* JADX INFO: renamed from: getCamera-Dz_R5H8, reason: from getter */
    public String getCamera() {
        return this.camera;
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    public <T> T getOrDefault(@NotNull CameraCharacteristics.Key<T> key, T t2) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t3 = (T) get(key);
        return t3 == null ? t2 : t3;
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    @NotNull
    public Set<CameraId> getPhysicalCameraIds() {
        return (Set) this._physicalCameraIds.getValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    @NotNull
    public Set<CaptureRequest.Key<?>> getSessionKeys() {
        return (Set) this._sessionKeys.getValue();
    }

    @Override // androidx.camera.camera2.pipe.CameraMetadata
    @NotNull
    public Set<Integer> getSupportedExtensions() {
        return (Set) this._supportedExtensions.getValue();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public <T> T unwrapAs(@NotNull KClass type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Intrinsics.f(type, o0.f186429a.b(CameraCharacteristics.class))) {
            return null;
        }
        T t2 = (T) this.characteristics;
        Intrinsics.i(t2, "null cannot be cast to non-null type T of androidx.camera.camera2.pipe.compat.Camera2CameraMetadata.unwrapAs");
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Camera2CameraMetadata(String camera, boolean z, CameraCharacteristics characteristics, Camera2MetadataProvider metadataProvider, Map<Metadata.Key<?>, ? extends Object> metadata, Set<? extends CameraCharacteristics.Key<?>> cacheBlocklist) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        Intrinsics.checkNotNullParameter(characteristics, "characteristics");
        Intrinsics.checkNotNullParameter(metadataProvider, "metadataProvider");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(cacheBlocklist, "cacheBlocklist");
        this.camera = camera;
        this.isRedacted = z;
        this.characteristics = characteristics;
        this.metadataProvider = metadataProvider;
        this.metadata = metadata;
        this.cacheBlocklist = cacheBlocklist;
        this.values = new ArrayMap<>();
        this.extensionCache = new ArrayMap<>();
        k kVar = k.PUBLICATION;
        final int i = 0;
        this._supportedExtensions = j.c(kVar, new Function0(this) { // from class: w.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Camera2CameraMetadata f293584b;

            {
                this.f293584b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Camera2CameraMetadata._supportedExtensions$lambda$0(this.f293584b);
                    case 1:
                        return Camera2CameraMetadata._keys$lambda$0(this.f293584b);
                    case 2:
                        return Camera2CameraMetadata._requestKeys$lambda$0(this.f293584b);
                    case 3:
                        return Camera2CameraMetadata._resultKeys$lambda$0(this.f293584b);
                    case 4:
                        return Camera2CameraMetadata._physicalCameraIds$lambda$0(this.f293584b);
                    case 5:
                        return Camera2CameraMetadata._physicalRequestKeys$lambda$0(this.f293584b);
                    case 6:
                        return Camera2CameraMetadata._sessionCharacteristicsKeys$lambda$0(this.f293584b);
                    default:
                        return Camera2CameraMetadata._sessionKeys$lambda$0(this.f293584b);
                }
            }
        });
        final int i2 = 1;
        this._keys = j.c(kVar, new Function0(this) { // from class: w.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Camera2CameraMetadata f293584b;

            {
                this.f293584b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Camera2CameraMetadata._supportedExtensions$lambda$0(this.f293584b);
                    case 1:
                        return Camera2CameraMetadata._keys$lambda$0(this.f293584b);
                    case 2:
                        return Camera2CameraMetadata._requestKeys$lambda$0(this.f293584b);
                    case 3:
                        return Camera2CameraMetadata._resultKeys$lambda$0(this.f293584b);
                    case 4:
                        return Camera2CameraMetadata._physicalCameraIds$lambda$0(this.f293584b);
                    case 5:
                        return Camera2CameraMetadata._physicalRequestKeys$lambda$0(this.f293584b);
                    case 6:
                        return Camera2CameraMetadata._sessionCharacteristicsKeys$lambda$0(this.f293584b);
                    default:
                        return Camera2CameraMetadata._sessionKeys$lambda$0(this.f293584b);
                }
            }
        });
        final int i3 = 2;
        this._requestKeys = j.c(kVar, new Function0(this) { // from class: w.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Camera2CameraMetadata f293584b;

            {
                this.f293584b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return Camera2CameraMetadata._supportedExtensions$lambda$0(this.f293584b);
                    case 1:
                        return Camera2CameraMetadata._keys$lambda$0(this.f293584b);
                    case 2:
                        return Camera2CameraMetadata._requestKeys$lambda$0(this.f293584b);
                    case 3:
                        return Camera2CameraMetadata._resultKeys$lambda$0(this.f293584b);
                    case 4:
                        return Camera2CameraMetadata._physicalCameraIds$lambda$0(this.f293584b);
                    case 5:
                        return Camera2CameraMetadata._physicalRequestKeys$lambda$0(this.f293584b);
                    case 6:
                        return Camera2CameraMetadata._sessionCharacteristicsKeys$lambda$0(this.f293584b);
                    default:
                        return Camera2CameraMetadata._sessionKeys$lambda$0(this.f293584b);
                }
            }
        });
        final int i5 = 3;
        this._resultKeys = j.c(kVar, new Function0(this) { // from class: w.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Camera2CameraMetadata f293584b;

            {
                this.f293584b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return Camera2CameraMetadata._supportedExtensions$lambda$0(this.f293584b);
                    case 1:
                        return Camera2CameraMetadata._keys$lambda$0(this.f293584b);
                    case 2:
                        return Camera2CameraMetadata._requestKeys$lambda$0(this.f293584b);
                    case 3:
                        return Camera2CameraMetadata._resultKeys$lambda$0(this.f293584b);
                    case 4:
                        return Camera2CameraMetadata._physicalCameraIds$lambda$0(this.f293584b);
                    case 5:
                        return Camera2CameraMetadata._physicalRequestKeys$lambda$0(this.f293584b);
                    case 6:
                        return Camera2CameraMetadata._sessionCharacteristicsKeys$lambda$0(this.f293584b);
                    default:
                        return Camera2CameraMetadata._sessionKeys$lambda$0(this.f293584b);
                }
            }
        });
        final int i6 = 4;
        this._physicalCameraIds = j.c(kVar, new Function0(this) { // from class: w.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Camera2CameraMetadata f293584b;

            {
                this.f293584b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return Camera2CameraMetadata._supportedExtensions$lambda$0(this.f293584b);
                    case 1:
                        return Camera2CameraMetadata._keys$lambda$0(this.f293584b);
                    case 2:
                        return Camera2CameraMetadata._requestKeys$lambda$0(this.f293584b);
                    case 3:
                        return Camera2CameraMetadata._resultKeys$lambda$0(this.f293584b);
                    case 4:
                        return Camera2CameraMetadata._physicalCameraIds$lambda$0(this.f293584b);
                    case 5:
                        return Camera2CameraMetadata._physicalRequestKeys$lambda$0(this.f293584b);
                    case 6:
                        return Camera2CameraMetadata._sessionCharacteristicsKeys$lambda$0(this.f293584b);
                    default:
                        return Camera2CameraMetadata._sessionKeys$lambda$0(this.f293584b);
                }
            }
        });
        final int i21 = 5;
        this._physicalRequestKeys = j.c(kVar, new Function0(this) { // from class: w.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Camera2CameraMetadata f293584b;

            {
                this.f293584b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        return Camera2CameraMetadata._supportedExtensions$lambda$0(this.f293584b);
                    case 1:
                        return Camera2CameraMetadata._keys$lambda$0(this.f293584b);
                    case 2:
                        return Camera2CameraMetadata._requestKeys$lambda$0(this.f293584b);
                    case 3:
                        return Camera2CameraMetadata._resultKeys$lambda$0(this.f293584b);
                    case 4:
                        return Camera2CameraMetadata._physicalCameraIds$lambda$0(this.f293584b);
                    case 5:
                        return Camera2CameraMetadata._physicalRequestKeys$lambda$0(this.f293584b);
                    case 6:
                        return Camera2CameraMetadata._sessionCharacteristicsKeys$lambda$0(this.f293584b);
                    default:
                        return Camera2CameraMetadata._sessionKeys$lambda$0(this.f293584b);
                }
            }
        });
        final int i22 = 6;
        this._sessionCharacteristicsKeys = j.c(kVar, new Function0(this) { // from class: w.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Camera2CameraMetadata f293584b;

            {
                this.f293584b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        return Camera2CameraMetadata._supportedExtensions$lambda$0(this.f293584b);
                    case 1:
                        return Camera2CameraMetadata._keys$lambda$0(this.f293584b);
                    case 2:
                        return Camera2CameraMetadata._requestKeys$lambda$0(this.f293584b);
                    case 3:
                        return Camera2CameraMetadata._resultKeys$lambda$0(this.f293584b);
                    case 4:
                        return Camera2CameraMetadata._physicalCameraIds$lambda$0(this.f293584b);
                    case 5:
                        return Camera2CameraMetadata._physicalRequestKeys$lambda$0(this.f293584b);
                    case 6:
                        return Camera2CameraMetadata._sessionCharacteristicsKeys$lambda$0(this.f293584b);
                    default:
                        return Camera2CameraMetadata._sessionKeys$lambda$0(this.f293584b);
                }
            }
        });
        final int i32 = 7;
        this._sessionKeys = j.c(kVar, new Function0(this) { // from class: w.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Camera2CameraMetadata f293584b;

            {
                this.f293584b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i32) {
                    case 0:
                        return Camera2CameraMetadata._supportedExtensions$lambda$0(this.f293584b);
                    case 1:
                        return Camera2CameraMetadata._keys$lambda$0(this.f293584b);
                    case 2:
                        return Camera2CameraMetadata._requestKeys$lambda$0(this.f293584b);
                    case 3:
                        return Camera2CameraMetadata._resultKeys$lambda$0(this.f293584b);
                    case 4:
                        return Camera2CameraMetadata._physicalCameraIds$lambda$0(this.f293584b);
                    case 5:
                        return Camera2CameraMetadata._physicalRequestKeys$lambda$0(this.f293584b);
                    case 6:
                        return Camera2CameraMetadata._sessionCharacteristicsKeys$lambda$0(this.f293584b);
                    default:
                        return Camera2CameraMetadata._sessionKeys$lambda$0(this.f293584b);
                }
            }
        });
    }
}
