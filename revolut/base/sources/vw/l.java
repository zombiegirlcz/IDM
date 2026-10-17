package vw;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l CAMERA_SENSOR_REALTIME;
    public static final l CAMERA_SENSOR_UNKNOWN_WITH_CALLBACK_ELAPSED_REALTIME;

    static {
        l lVar = new l("CAMERA_SENSOR_REALTIME", 0);
        CAMERA_SENSOR_REALTIME = lVar;
        l lVar2 = new l("CAMERA_SENSOR_UNKNOWN_WITH_CALLBACK_ELAPSED_REALTIME", 1);
        CAMERA_SENSOR_UNKNOWN_WITH_CALLBACK_ELAPSED_REALTIME = lVar2;
        l[] lVarArr = {lVar, lVar2};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
