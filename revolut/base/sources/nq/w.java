package nq;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w ACTIVE_SELFIE_VIDEO;
    public static final w DEVICE_FINGERPRINT;
    public static final w DOCUMENT_BACK;
    public static final w DOCUMENT_BACK_TILT_VIDEO;
    public static final w DOCUMENT_BACK_VIDEO;
    public static final w DOCUMENT_FRONT;
    public static final w DOCUMENT_FRONT_TILT_VIDEO;
    public static final w DOCUMENT_FRONT_VIDEO;
    public static final w FACE_CROP;
    public static final w IMU_DATA;
    public static final w REV_VISION_TELEMETRY;
    public static final w SELFIE;
    public static final w SELFIE_EMBEDDING;
    public static final w SELFIE_VIDEO;
    public static final w VALIDITY_CHECK;
    public static final w YUV_DATA;

    @NotNull
    private final String value;

    static {
        w wVar = new w("SELFIE", 0, "SELFIE");
        SELFIE = wVar;
        w wVar2 = new w("SELFIE_VIDEO", 1, "SELFIE_VIDEO");
        SELFIE_VIDEO = wVar2;
        w wVar3 = new w("DOCUMENT_FRONT", 2, "DOCUMENT_FRONT");
        DOCUMENT_FRONT = wVar3;
        w wVar4 = new w("DOCUMENT_FRONT_VIDEO", 3, "DOCUMENT_FRONT_VIDEO");
        DOCUMENT_FRONT_VIDEO = wVar4;
        w wVar5 = new w("DOCUMENT_BACK", 4, "DOCUMENT_BACK");
        DOCUMENT_BACK = wVar5;
        w wVar6 = new w("DOCUMENT_BACK_VIDEO", 5, "DOCUMENT_BACK_VIDEO");
        DOCUMENT_BACK_VIDEO = wVar6;
        w wVar7 = new w("DOCUMENT_FRONT_TILT_VIDEO", 6, "DOCUMENT_FRONT_TILT_VIDEO");
        DOCUMENT_FRONT_TILT_VIDEO = wVar7;
        w wVar8 = new w("DOCUMENT_BACK_TILT_VIDEO", 7, "DOCUMENT_BACK_TILT_VIDEO");
        DOCUMENT_BACK_TILT_VIDEO = wVar8;
        w wVar9 = new w("ACTIVE_SELFIE_VIDEO", 8, "ACTIVE_SELFIE_VIDEO");
        ACTIVE_SELFIE_VIDEO = wVar9;
        w wVar10 = new w("SELFIE_EMBEDDING", 9, "SELFIE_EMBEDDING");
        SELFIE_EMBEDDING = wVar10;
        w wVar11 = new w("VALIDITY_CHECK", 10, "VALIDITY_CHECK");
        VALIDITY_CHECK = wVar11;
        w wVar12 = new w("FACE_CROP", 11, "FACE_CROP");
        FACE_CROP = wVar12;
        w wVar13 = new w("DEVICE_FINGERPRINT", 12, "DEVICE_FINGERPRINT");
        DEVICE_FINGERPRINT = wVar13;
        w wVar14 = new w("IMU_DATA", 13, "IMU_DATA");
        IMU_DATA = wVar14;
        w wVar15 = new w("REV_VISION_TELEMETRY", 14, "REV_VISION_TELEMETRY");
        REV_VISION_TELEMETRY = wVar15;
        w wVar16 = new w("YUV_DATA", 15, "YUV_DATA");
        YUV_DATA = wVar16;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9, wVar10, wVar11, wVar12, wVar13, wVar14, wVar15, wVar16};
        $VALUES = wVarArr;
        $ENTRIES = vc.s.n(wVarArr);
    }

    public w(String str, int i, String str2) {
        this.value = str2;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
