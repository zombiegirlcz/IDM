package no;

import java.util.List;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class w2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w2[] $VALUES;
    public static final w2 BLUETOOTH;
    public static final w2 CALENDAR_ACCESS;
    public static final w2 CAMERA;
    public static final w2 CONTACT_ACCESS;
    public static final w2 FACE_RECOGNITION;
    public static final w2 FINGERPRINT_RECOGNITION;
    public static final w2 LOCATION;
    public static final w2 MICROPHONE;
    public static final w2 PUSH_NOTIFICATIONS;

    @NotNull
    private final List<String> relatedPermissions;

    static {
        w2 w2Var = new w2(0, "PUSH_NOTIFICATIONS", zhm.u.c("android.permission.POST_NOTIFICATIONS"));
        PUSH_NOTIFICATIONS = w2Var;
        w2 w2Var2 = new w2(1, "CONTACT_ACCESS", zhm.v.k("android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"));
        CONTACT_ACCESS = w2Var2;
        zhm.f0 f0Var = zhm.f0.f322471a;
        w2 w2Var3 = new w2(2, "FACE_RECOGNITION", f0Var);
        FACE_RECOGNITION = w2Var3;
        w2 w2Var4 = new w2(3, "FINGERPRINT_RECOGNITION", f0Var);
        FINGERPRINT_RECOGNITION = w2Var4;
        w2 w2Var5 = new w2(4, "MICROPHONE", zhm.u.c("android.permission.RECORD_AUDIO"));
        MICROPHONE = w2Var5;
        w2 w2Var6 = new w2(5, "CAMERA", zhm.u.c("android.permission.CAMERA"));
        CAMERA = w2Var6;
        w2 w2Var7 = new w2(6, "BLUETOOTH", zhm.v.k("android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH"));
        BLUETOOTH = w2Var7;
        w2 w2Var8 = new w2(7, "CALENDAR_ACCESS", zhm.v.k("android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"));
        CALENDAR_ACCESS = w2Var8;
        w2 w2Var9 = new w2(8, "LOCATION", zhm.v.k("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"));
        LOCATION = w2Var9;
        w2[] w2VarArr = {w2Var, w2Var2, w2Var3, w2Var4, w2Var5, w2Var6, w2Var7, w2Var8, w2Var9};
        $VALUES = w2VarArr;
        $ENTRIES = vc.s.n(w2VarArr);
    }

    public w2(int i, String str, List list) {
        this.relatedPermissions = list;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static w2 valueOf(String str) {
        return (w2) Enum.valueOf(w2.class, str);
    }

    public static w2[] values() {
        return (w2[]) $VALUES.clone();
    }

    public final List b() {
        return this.relatedPermissions;
    }
}
