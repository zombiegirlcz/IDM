package rob;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e JOINT_SAVINGS;
    public static final e PERSONAL_SAVINGS;
    public static final e TEEN_SAVINGS;
    public static final e TOTAL;

    static {
        e eVar = new e("PERSONAL_SAVINGS", 0);
        PERSONAL_SAVINGS = eVar;
        e eVar2 = new e("JOINT_SAVINGS", 1);
        JOINT_SAVINGS = eVar2;
        e eVar3 = new e("TEEN_SAVINGS", 2);
        TEEN_SAVINGS = eVar3;
        e eVar4 = new e("TOTAL", 3);
        TOTAL = eVar4;
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
