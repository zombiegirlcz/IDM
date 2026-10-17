package hl4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CANCELLATION;
    public static final e NOT_AVAILABLE;
    public static final e WITHDRAWAL;

    static {
        e eVar = new e("WITHDRAWAL", 0);
        WITHDRAWAL = eVar;
        e eVar2 = new e("CANCELLATION", 1);
        CANCELLATION = eVar2;
        e eVar3 = new e("NOT_AVAILABLE", 2);
        NOT_AVAILABLE = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
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
