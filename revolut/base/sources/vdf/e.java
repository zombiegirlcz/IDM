package vdf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ALWAYS;
    public static final e NEVER;
    public static final e ONLY_NEGATIVE;

    static {
        e eVar = new e("ALWAYS", 0);
        ALWAYS = eVar;
        e eVar2 = new e("ONLY_NEGATIVE", 1);
        ONLY_NEGATIVE = eVar2;
        e eVar3 = new e("NEVER", 2);
        NEVER = eVar3;
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
