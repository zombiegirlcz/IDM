package taj;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e UNKNOWN;
    public static final e WEBSITE;
    public static final e WHITE_PAPER;
    public static final e X;

    static {
        e eVar = new e("WEBSITE", 0);
        WEBSITE = eVar;
        e eVar2 = new e("WHITE_PAPER", 1);
        WHITE_PAPER = eVar2;
        e eVar3 = new e("X", 2);
        X = eVar3;
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
