package com.fourthline.vision.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class t implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f36923a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final String aeModeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "unknown" : "on_external_flash" : "on_auto_flash_redeye" : "on_always_flash" : "on_auto_flash" : "on" : "off";
    }

    private final String afModeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "unknown" : "edof" : "continuous_picture" : "continuous_video" : "macro" : "auto" : "off";
    }

    private final String awbModeToString(int i) {
        switch (i) {
            case 0:
                return "off";
            case 1:
                return "auto";
            case 2:
                return "incandescent";
            case 3:
                return "fluorescent";
            case 4:
                return "warm_fluorescent";
            case 5:
                return "daylight";
            case 6:
                return "cloudy_daylight";
            case 7:
                return "twilight";
            case 8:
                return "shade";
            default:
                return "unknown";
        }
    }

    private final Map<String, Object> buildAndroidExtras(CameraCharacteristics cameraCharacteristics) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            linkedHashMap.put("hardware_level", hardwareLevelToString(num.intValue()));
        }
        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        if (num2 != null) {
            linkedHashMap.put("sensor_orientation", Integer.valueOf(num2.intValue()));
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
            linkedHashMap.put("ois_available", Boolean.valueOf(!(iArr.length == 0)));
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable collect$lambda$1(Size size) {
        return Integer.valueOf(size.getWidth() * size.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable collect$lambda$2(Size size) {
        return Integer.valueOf(size.getWidth());
    }

    private final String hardwareLevelToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "external" : "level3" : "legacy" : "full" : "limited";
    }

    @Override // com.fourthline.vision.internal.k0
    @NotNull
    public Map<String, Object> collect(@NotNull CameraManager manager, @NotNull l0 input) {
        Integer num;
        Object next;
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(input, "input");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("camera_device_id", input.getCameraId());
        linkedHashMap.put("camera_count", Integer.valueOf(manager.getCameraIdList().length));
        Integer frameRate = input.getFrameRate();
        if (frameRate != null) {
            linkedHashMap.put("camera_frame_rate", Integer.valueOf(frameRate.intValue()));
        }
        try {
            CameraCharacteristics cameraCharacteristics = manager.getCameraCharacteristics(input.getCameraId());
            Intrinsics.h(cameraCharacteristics);
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            String str = null;
            if (streamConfigurationMap != null && StreamConfigurationMap.isOutputSupportedFor(ImageReader.class)) {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(ImageReader.class);
                if (outputSizes != null && outputSizes.length != 0) {
                    List listN0 = kotlin.collections.d.n0(cim.b.a(new aem.d(27), new aem.d(28)), outputSizes);
                    Size size = (Size) zhm.d0.m0(listN0);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listN0) {
                        if (((Size) obj2).getHeight() >= 1080) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it8 = arrayList.iterator();
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (it8.hasNext()) {
                            int height = ((Size) next).getHeight();
                            do {
                                Object next2 = it8.next();
                                int height2 = ((Size) next2).getHeight();
                                if (height > height2) {
                                    next = next2;
                                    height = height2;
                                }
                            } while (it8.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    Size size2 = (Size) next;
                    if (size2 == null) {
                        size2 = size;
                    }
                    linkedHashMap.put("camera_capture_width", Integer.valueOf(size2.getWidth()));
                    linkedHashMap.put("camera_capture_height", Integer.valueOf(size2.getHeight()));
                    linkedHashMap.put("camera_max_width", Integer.valueOf(size.getWidth()));
                    linkedHashMap.put("camera_max_height", Integer.valueOf(size.getHeight()));
                }
                Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr != null && rangeArr.length != 0) {
                    if (rangeArr.length == 0) {
                        num = null;
                    } else {
                        num = (Integer) rangeArr[0].getUpper();
                        Intrinsics.checkNotNullParameter(rangeArr, "<this>");
                        int length = rangeArr.length - 1;
                        if (1 <= length) {
                            int i = 1;
                            while (true) {
                                Integer num2 = (Integer) rangeArr[i].getUpper();
                                if (num.compareTo(num2) < 0) {
                                    num = num2;
                                }
                                if (i == length) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                    if (num == null) {
                        if (rangeArr.length == 0) {
                            num = null;
                        } else {
                            num = (Integer) rangeArr[0].getLower();
                            Intrinsics.checkNotNullParameter(rangeArr, "<this>");
                            int length2 = rangeArr.length - 1;
                            if (1 <= length2) {
                                int i2 = 1;
                                while (true) {
                                    Integer num3 = (Integer) rangeArr[i2].getLower();
                                    if (num.compareTo(num3) < 0) {
                                        num = num3;
                                    }
                                    if (i2 == length2) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                    if (num != null) {
                        linkedHashMap.put("camera_max_frame_rate", Integer.valueOf(num.intValue()));
                    }
                }
            }
            Integer num4 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num4 != null && num4.intValue() == 0) {
                str = "front";
            } else if (num4 != null && num4.intValue() == 1) {
                str = "back";
            }
            linkedHashMap.put("camera_facing_mode", str);
            linkedHashMap.put("camera_torch", Boolean.valueOf(Intrinsics.f((Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE), Boolean.TRUE)));
            int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr != null && iArr.length != 0) {
                ArrayList arrayList2 = new ArrayList(iArr.length);
                for (int i3 : iArr) {
                    arrayList2.add(afModeToString(i3));
                }
                linkedHashMap.put("camera_focus_mode", zhm.d0.k0(arrayList2, ",", null, null, 0, null, 62));
            }
            int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            if (iArr2 != null && iArr2.length != 0) {
                ArrayList arrayList3 = new ArrayList(iArr2.length);
                for (int i5 : iArr2) {
                    arrayList3.add(aeModeToString(i5));
                }
                linkedHashMap.put("camera_exposure_mode", zhm.d0.k0(arrayList3, ",", null, null, 0, null, 62));
            }
            int[] iArr3 = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
            if (iArr3 != null && iArr3.length != 0) {
                ArrayList arrayList4 = new ArrayList(iArr3.length);
                for (int i6 : iArr3) {
                    arrayList4.add(awbModeToString(i6));
                }
                linkedHashMap.put("camera_white_balance_mode", zhm.d0.k0(arrayList4, ",", null, null, 0, null, 62));
            }
            Map<String, Object> mapBuildAndroidExtras = buildAndroidExtras(cameraCharacteristics);
            if (!mapBuildAndroidExtras.isEmpty()) {
                linkedHashMap.put("camera_android_extras", mapBuildAndroidExtras);
            }
        } catch (Exception unused) {
        }
        return linkedHashMap;
    }
}
