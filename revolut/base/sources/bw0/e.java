package bw0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e Calculator;

    @yhm.d
    public static final e None;
    public static final e SuggestionsElseCalculator;
    public static final e SuggestionsWhenTextEmptyElseCalculator;

    static {
        e eVar = new e("Calculator", 0);
        Calculator = eVar;
        e eVar2 = new e("SuggestionsElseCalculator", 1);
        SuggestionsElseCalculator = eVar2;
        e eVar3 = new e("SuggestionsWhenTextEmptyElseCalculator", 2);
        SuggestionsWhenTextEmptyElseCalculator = eVar3;
        e eVar4 = new e("None", 3);
        None = eVar4;
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
