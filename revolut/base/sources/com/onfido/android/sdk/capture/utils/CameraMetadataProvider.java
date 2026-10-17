package com.onfido.android.sdk.capture.utils;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import com.onfido.android.sdk.capture.common.di.qualifier.ApplicationContext;
import com.onfido.api.client.data.CameraMetadata;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.a0;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0011\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J'\u0010\u0007\u001a\u0004\u0018\u0001H\b\"\u0004\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0012¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/utils/CameraMetadataProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "provideCameraMetadata", "Lcom/onfido/api/client/data/CameraMetadata;", "getOrNull", "T", "Landroid/hardware/camera2/CameraCharacteristics;", "key", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "(Landroid/hardware/camera2/CameraCharacteristics;Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;", "toCameraInfo", "Lcom/onfido/api/client/data/CameraMetadata$CameraInfo;", "cameraId", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class CameraMetadataProvider {

    @NotNull
    private final Context context;

    public CameraMetadataProvider(@ApplicationContext @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private <T> T getOrNull(CameraCharacteristics cameraCharacteristics, CameraCharacteristics.Key<T> key) {
        T t2;
        try {
            m.Companion companion = m.INSTANCE;
            t2 = (T) cameraCharacteristics.get(key);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            t2 = (T) o.a(th10);
        }
        if (t2 instanceof n) {
            return null;
        }
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CameraMetadata.CameraInfo toCameraInfo(CameraCharacteristics cameraCharacteristics, String str) {
        Integer num;
        ArrayList arrayList;
        CameraCharacteristics.Key INFO_SUPPORTED_HARDWARE_LEVEL = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        Intrinsics.checkNotNullExpressionValue(INFO_SUPPORTED_HARDWARE_LEVEL, "INFO_SUPPORTED_HARDWARE_LEVEL");
        Integer num2 = (Integer) getOrNull(cameraCharacteristics, INFO_SUPPORTED_HARDWARE_LEVEL);
        CameraCharacteristics.Key REQUEST_AVAILABLE_CAPABILITIES = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        Intrinsics.checkNotNullExpressionValue(REQUEST_AVAILABLE_CAPABILITIES, "REQUEST_AVAILABLE_CAPABILITIES");
        int[] iArr = (int[]) getOrNull(cameraCharacteristics, REQUEST_AVAILABLE_CAPABILITIES);
        List listT0 = iArr != null ? d.t0(iArr) : null;
        Intrinsics.checkNotNullExpressionValue(REQUEST_AVAILABLE_CAPABILITIES, "REQUEST_AVAILABLE_CAPABILITIES");
        int[] iArr2 = (int[]) getOrNull(cameraCharacteristics, REQUEST_AVAILABLE_CAPABILITIES);
        Boolean boolValueOf = iArr2 != null ? Boolean.valueOf(d.G(iArr2, 0)) : null;
        CameraCharacteristics.Key LENS_FACING = CameraCharacteristics.LENS_FACING;
        Intrinsics.checkNotNullExpressionValue(LENS_FACING, "LENS_FACING");
        Integer num3 = (Integer) getOrNull(cameraCharacteristics, LENS_FACING);
        CameraCharacteristics.Key LENS_INFO_AVAILABLE_FOCAL_LENGTHS = CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS;
        Intrinsics.checkNotNullExpressionValue(LENS_INFO_AVAILABLE_FOCAL_LENGTHS, "LENS_INFO_AVAILABLE_FOCAL_LENGTHS");
        float[] fArr = (float[]) getOrNull(cameraCharacteristics, LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        List listS0 = fArr != null ? d.s0(fArr) : null;
        CameraCharacteristics.Key LENS_INFO_MINIMUM_FOCUS_DISTANCE = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
        Intrinsics.checkNotNullExpressionValue(LENS_INFO_MINIMUM_FOCUS_DISTANCE, "LENS_INFO_MINIMUM_FOCUS_DISTANCE");
        Float f = (Float) getOrNull(cameraCharacteristics, LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        CameraCharacteristics.Key LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION = CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION;
        Intrinsics.checkNotNullExpressionValue(LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION, "LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION");
        int[] iArr3 = (int[]) getOrNull(cameraCharacteristics, LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        List listT02 = iArr3 != null ? d.t0(iArr3) : null;
        CameraCharacteristics.Key SENSOR_INFO_PHYSICAL_SIZE = CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE;
        Intrinsics.checkNotNullExpressionValue(SENSOR_INFO_PHYSICAL_SIZE, "SENSOR_INFO_PHYSICAL_SIZE");
        SizeF sizeF = (SizeF) getOrNull(cameraCharacteristics, SENSOR_INFO_PHYSICAL_SIZE);
        Float fValueOf = sizeF != null ? Float.valueOf(sizeF.getWidth()) : null;
        Intrinsics.checkNotNullExpressionValue(SENSOR_INFO_PHYSICAL_SIZE, "SENSOR_INFO_PHYSICAL_SIZE");
        SizeF sizeF2 = (SizeF) getOrNull(cameraCharacteristics, SENSOR_INFO_PHYSICAL_SIZE);
        Float fValueOf2 = sizeF2 != null ? Float.valueOf(sizeF2.getHeight()) : null;
        CameraCharacteristics.Key SENSOR_INFO_PIXEL_ARRAY_SIZE = CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE;
        Intrinsics.checkNotNullExpressionValue(SENSOR_INFO_PIXEL_ARRAY_SIZE, "SENSOR_INFO_PIXEL_ARRAY_SIZE");
        Size size = (Size) getOrNull(cameraCharacteristics, SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Integer numValueOf = size != null ? Integer.valueOf(size.getWidth()) : null;
        Intrinsics.checkNotNullExpressionValue(SENSOR_INFO_PIXEL_ARRAY_SIZE, "SENSOR_INFO_PIXEL_ARRAY_SIZE");
        Size size2 = (Size) getOrNull(cameraCharacteristics, SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Integer numValueOf2 = size2 != null ? Integer.valueOf(size2.getHeight()) : null;
        CameraCharacteristics.Key SENSOR_ORIENTATION = CameraCharacteristics.SENSOR_ORIENTATION;
        Intrinsics.checkNotNullExpressionValue(SENSOR_ORIENTATION, "SENSOR_ORIENTATION");
        Integer num4 = (Integer) getOrNull(cameraCharacteristics, SENSOR_ORIENTATION);
        CameraCharacteristics.Key SENSOR_MAX_ANALOG_SENSITIVITY = CameraCharacteristics.SENSOR_MAX_ANALOG_SENSITIVITY;
        Intrinsics.checkNotNullExpressionValue(SENSOR_MAX_ANALOG_SENSITIVITY, "SENSOR_MAX_ANALOG_SENSITIVITY");
        Integer num5 = (Integer) getOrNull(cameraCharacteristics, SENSOR_MAX_ANALOG_SENSITIVITY);
        CameraCharacteristics.Key CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES = CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES;
        Intrinsics.checkNotNullExpressionValue(CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES, "CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES");
        Range[] rangeArr = (Range[]) getOrNull(cameraCharacteristics, CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            arrayList = new ArrayList();
            num = num4;
            int i = 0;
            for (int length = rangeArr.length; i < length; length = length) {
                Range range = rangeArr[i];
                a0.x(v.k(range.getLower(), range.getUpper()), arrayList);
                i++;
            }
        } else {
            num = num4;
            arrayList = null;
        }
        CameraCharacteristics.Key NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES = CameraCharacteristics.NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES;
        Intrinsics.checkNotNullExpressionValue(NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES, "NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES");
        int[] iArr4 = (int[]) getOrNull(cameraCharacteristics, NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES);
        List listT03 = iArr4 != null ? d.t0(iArr4) : null;
        CameraCharacteristics.Key FLASH_INFO_AVAILABLE = CameraCharacteristics.FLASH_INFO_AVAILABLE;
        List list = listT03;
        Intrinsics.checkNotNullExpressionValue(FLASH_INFO_AVAILABLE, "FLASH_INFO_AVAILABLE");
        Boolean bool = (Boolean) getOrNull(cameraCharacteristics, FLASH_INFO_AVAILABLE);
        CameraCharacteristics.Key LENS_FACING2 = CameraCharacteristics.LENS_FACING;
        Intrinsics.checkNotNullExpressionValue(LENS_FACING2, "LENS_FACING");
        Integer num6 = (Integer) getOrNull(cameraCharacteristics, LENS_FACING2);
        return new CameraMetadata.CameraInfo(str, num2, listT0, boolValueOf, num3, listS0, f, listT02, fValueOf, fValueOf2, numValueOf, numValueOf2, num, num5, arrayList, list, bool, Boolean.valueOf(num6 != null && num6.intValue() == 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f0  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.onfido.api.client.data.CameraMetadata provideCameraMetadata() {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.utils.CameraMetadataProvider.provideCameraMetadata():com.onfido.api.client.data.CameraMetadata");
    }
}
