package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.CameraIdentifier;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraValidator;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001a\u001b\u001cB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J$\u0010\u0010\u001a\u00020\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H\u0016J\u001e\u0010\u0016\u001a\u00020\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/camera/core/impl/CameraValidatorImpl;", "Landroidx/camera/core/impl/CameraValidator;", "context", "Landroid/content/Context;", "availableCamerasSelector", "Landroidx/camera/core/CameraSelector;", "<init>", "(Landroid/content/Context;Landroidx/camera/core/CameraSelector;)V", "isVirtualDevice", "", "validationCriteria", "Landroidx/camera/core/impl/CameraValidatorImpl$ValidationCriteria;", "validateOnFirstInit", "", "cameraRepository", "Landroidx/camera/core/impl/CameraRepository;", "isChangeInvalid", "currentCameras", "", "Landroidx/camera/core/impl/CameraInternal;", "removedCameras", "Landroidx/camera/core/CameraIdentifier;", "hasCamera", "cameras", "selector", "getValidationCriteria", "ValidationCriteria", "Api34Impl", "Companion", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CameraValidatorImpl implements CameraValidator {
    private final CameraSelector availableCamerasSelector;

    @NotNull
    private final Context context;
    private final boolean isVirtualDevice;

    @NotNull
    private final ValidationCriteria validationCriteria;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/core/impl/CameraValidatorImpl$Api34Impl;", "", "<init>", "()V", "getDeviceId", "", "context", "Landroid/content/Context;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Api34Impl {

        @NotNull
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public final int getDeviceId(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getDeviceId();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/camera/core/impl/CameraValidatorImpl$ValidationCriteria;", "", "", "checkBack", "checkFront", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getCheckBack", "()Z", "getCheckFront", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ValidationCriteria {
        private final boolean checkBack;
        private final boolean checkFront;

        public ValidationCriteria(boolean z, boolean z3) {
            this.checkBack = z;
            this.checkFront = z3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidationCriteria)) {
                return false;
            }
            ValidationCriteria validationCriteria = (ValidationCriteria) other;
            return this.checkBack == validationCriteria.checkBack && this.checkFront == validationCriteria.checkFront;
        }

        public final boolean getCheckBack() {
            return this.checkBack;
        }

        public final boolean getCheckFront() {
            return this.checkFront;
        }

        public int hashCode() {
            return Boolean.hashCode(this.checkFront) + (Boolean.hashCode(this.checkBack) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("ValidationCriteria(checkBack=");
            sb6.append(this.checkBack);
            sb6.append(", checkFront=");
            return j6.a.x(sb6, this.checkFront, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public CameraValidatorImpl(@NotNull Context context, CameraSelector cameraSelector) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.availableCamerasSelector = cameraSelector;
        this.isVirtualDevice = isVirtualDevice(context);
        this.validationCriteria = getValidationCriteria();
    }

    private final ValidationCriteria getValidationCriteria() {
        PackageManager packageManager = this.context.getPackageManager();
        CameraSelector cameraSelector = this.availableCamerasSelector;
        Integer lensFacing = cameraSelector != null ? cameraSelector.getLensFacing() : null;
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        boolean zHasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
        boolean z = false;
        boolean z3 = zHasSystemFeature && (lensFacing == null || lensFacing.intValue() == 1);
        if (zHasSystemFeature2 && (lensFacing == null || lensFacing.intValue() == 0)) {
            z = true;
        }
        return new ValidationCriteria(z3, z);
    }

    private final boolean hasCamera(Set<? extends CameraInternal> cameras, CameraSelector selector) {
        try {
            selector.select(new LinkedHashSet<>(cameras));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private final boolean isVirtualDevice(Context context) {
        return Build.VERSION.SDK_INT >= 34 && Api34Impl.INSTANCE.getDeviceId(context) != 0;
    }

    @Override // androidx.camera.core.impl.CameraValidator
    public boolean isChangeInvalid(@NotNull Set<? extends CameraInternal> currentCameras, @NotNull Set<CameraIdentifier> removedCameras) {
        Intrinsics.checkNotNullParameter(currentCameras, "currentCameras");
        Intrinsics.checkNotNullParameter(removedCameras, "removedCameras");
        if (this.isVirtualDevice || !(this.validationCriteria.getCheckBack() || this.validationCriteria.getCheckFront())) {
            return false;
        }
        CameraSelector DEFAULT_BACK_CAMERA = CameraSelector.DEFAULT_BACK_CAMERA;
        Intrinsics.checkNotNullExpressionValue(DEFAULT_BACK_CAMERA, "DEFAULT_BACK_CAMERA");
        boolean zHasCamera = hasCamera(currentCameras, DEFAULT_BACK_CAMERA);
        CameraSelector DEFAULT_FRONT_CAMERA = CameraSelector.DEFAULT_FRONT_CAMERA;
        Intrinsics.checkNotNullExpressionValue(DEFAULT_FRONT_CAMERA, "DEFAULT_FRONT_CAMERA");
        boolean zHasCamera2 = hasCamera(currentCameras, DEFAULT_FRONT_CAMERA);
        Set<CameraIdentifier> set = removedCameras;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator<T> it8 = set.iterator();
        while (it8.hasNext()) {
            arrayList.add(((CameraIdentifier) it8.next()).getInternalId());
        }
        Set setI1 = d0.i1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : currentCameras) {
            if (!setI1.contains(((CameraInternal) obj2).getCameraInfoInternal().getCameraId())) {
                arrayList2.add(obj2);
            }
        }
        Set<? extends CameraInternal> setI12 = d0.i1(arrayList2);
        CameraSelector DEFAULT_BACK_CAMERA2 = CameraSelector.DEFAULT_BACK_CAMERA;
        Intrinsics.checkNotNullExpressionValue(DEFAULT_BACK_CAMERA2, "DEFAULT_BACK_CAMERA");
        boolean zHasCamera3 = hasCamera(setI12, DEFAULT_BACK_CAMERA2);
        CameraSelector DEFAULT_FRONT_CAMERA2 = CameraSelector.DEFAULT_FRONT_CAMERA;
        Intrinsics.checkNotNullExpressionValue(DEFAULT_FRONT_CAMERA2, "DEFAULT_FRONT_CAMERA");
        return (this.validationCriteria.getCheckBack() && zHasCamera && !zHasCamera3) || (this.validationCriteria.getCheckFront() && zHasCamera2 && !hasCamera(setI12, DEFAULT_FRONT_CAMERA2));
    }

    @Override // androidx.camera.core.impl.CameraValidator
    public void validateOnFirstInit(@NotNull CameraRepository cameraRepository) throws CameraValidator.CameraIdListIncorrectException {
        Intrinsics.checkNotNullParameter(cameraRepository, "cameraRepository");
        if (this.isVirtualDevice) {
            Logger.d("CameraValidator", "Virtual device with " + cameraRepository.getCameras().size() + " cameras. Skipping validation.");
            return;
        }
        Logger.d("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE);
        if (this.validationCriteria.getCheckBack()) {
            try {
                Intrinsics.h(CameraSelector.DEFAULT_BACK_CAMERA.select(cameraRepository.getCameras()));
                e = null;
            } catch (RuntimeException e) {
                e = e;
                Logger.w("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
            }
        } else {
            e = null;
        }
        if (this.validationCriteria.getCheckFront()) {
            try {
                Intrinsics.h(CameraSelector.DEFAULT_FRONT_CAMERA.select(cameraRepository.getCameras()));
            } catch (RuntimeException e2) {
                Logger.w("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e2);
                if (e == null) {
                    e = e2;
                }
            }
        }
        if (e != null) {
            throw new CameraValidator.CameraIdListIncorrectException("Expected camera missing from device.", cameraRepository.getCameras().size(), e);
        }
    }
}
