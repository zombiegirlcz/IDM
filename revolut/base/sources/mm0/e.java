package mm0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e FACE_ID;
    public static final e FINGER_PRINT;
    public static final e PASSCODE;
    public static final e UNKNOWN;

    static {
        e eVar = new e("PASSCODE", 0);
        PASSCODE = eVar;
        e eVar2 = new e("FACE_ID", 1);
        FACE_ID = eVar2;
        e eVar3 = new e("FINGER_PRINT", 2);
        FINGER_PRINT = eVar3;
        e eVar4 = new e("UNKNOWN", 3);
        UNKNOWN = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
