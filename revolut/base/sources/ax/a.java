package ax;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10812a;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10812a = context;
    }

    public final Map a() throws CameraAccessException {
        String str;
        String str2;
        String str3;
        CameraManager cameraManager = (CameraManager) this.f10812a.getSystemService(CameraManager.class);
        if (cameraManager == null) {
            return a0.d.x("device_cameras", "Unable to get camera manager");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] cameraIdList = cameraManager.getCameraIdList();
        Intrinsics.checkNotNullExpressionValue(cameraIdList, "getCameraIdList(...)");
        String string = Arrays.toString(cameraIdList);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        linkedHashMap.put("device_cameras", string);
        for (String str4 : cameraIdList) {
            try {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str4);
                Intrinsics.h(cameraCharacteristics);
                String strP = p.a.p("camera_", str4, "_level");
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                if (num != null && num.intValue() == 2) {
                    str = "LEVEL_LEGACY";
                } else if (num != null && num.intValue() == 0) {
                    str = "LEVEL_LIMITED";
                } else if (num != null && num.intValue() == 1) {
                    str = "LEVEL_FULL";
                } else if (num != null && num.intValue() == 3) {
                    str = "LEVEL_3";
                } else if (num != null && num.intValue() == 4) {
                    str = "LEVEL_EXTERNAL";
                } else if (num == null) {
                    str = "NULL";
                } else {
                    str = "UNDEFINED_" + num;
                }
                linkedHashMap.put(strP, str);
                String str5 = "camera_" + str4 + "_lens";
                Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num2 != null && num2.intValue() == 0) {
                    str2 = "LENS_FRONT";
                } else if (num2 != null && num2.intValue() == 1) {
                    str2 = "LENS_BACK";
                } else if (num2 != null && num2.intValue() == 2) {
                    str2 = "LENS_EXTERNAL";
                } else if (num2 == null) {
                    str2 = "LENS_NULL";
                } else {
                    str2 = "LENS_UNKNOWN_" + num2;
                }
                linkedHashMap.put(str5, str2);
                String str6 = "camera_" + str4 + "_timestamp_source";
                Integer num3 = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
                if (num3 != null && num3.intValue() == 1) {
                    str3 = "TIMESTAMP_SOURCE_REALTIME";
                } else if (num3 != null && num3.intValue() == 0) {
                    str3 = "TIMESTAMP_SOURCE_UNKNOWN";
                } else if (num3 == null) {
                    str3 = "TIMESTAMP_SOURCE_NULL";
                } else {
                    str3 = "TIMESTAMP_SOURCE_UNDEFINED_" + num3;
                }
                linkedHashMap.put(str6, str3);
            } catch (Exception e) {
                String strQ = j6.a.q("camera_", str4);
                Object cause = e.getCause();
                if (cause == null) {
                    cause = "";
                }
                linkedHashMap.put(strQ, "error: " + e + " " + cause);
            }
        }
        return linkedHashMap;
    }
}
