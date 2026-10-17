package u80;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e SIGNED;
    public static final e SIGNED_ONLY_NEGATIVE;
    public static final e UNSIGNED;

    static {
        e eVar = new e("UNSIGNED", 0);
        UNSIGNED = eVar;
        e eVar2 = new e("SIGNED", 1);
        SIGNED = eVar2;
        e eVar3 = new e("SIGNED_ONLY_NEGATIVE", 2);
        SIGNED_ONLY_NEGATIVE = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
