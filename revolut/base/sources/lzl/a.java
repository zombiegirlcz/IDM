package lzl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ONE_DIGIT_AFTER_DOT_WITHOUT_ROUNDING_ZERO_ABSENT;
    public static final a THREE_DIGITS_SEPARATED;
    public static final a TWO_DIGITS_AFTER_DOT_WITHOUT_ROUNDING;
    public static final a TWO_DIGITS_AFTER_DOT_WITHOUT_ROUNDING_SHOW_ZEROES;
    public static final a TWO_DIGITS_AFTER_DOT_WITHOUT_ROUNDING_ZEROES_ABSENT;

    static {
        a aVar = new a("THREE_DIGITS_SEPARATED", 0);
        THREE_DIGITS_SEPARATED = aVar;
        a aVar2 = new a("ONE_DIGIT_AFTER_DOT_WITHOUT_ROUNDING_ZERO_ABSENT", 1);
        ONE_DIGIT_AFTER_DOT_WITHOUT_ROUNDING_ZERO_ABSENT = aVar2;
        a aVar3 = new a("TWO_DIGITS_AFTER_DOT_WITHOUT_ROUNDING", 2);
        TWO_DIGITS_AFTER_DOT_WITHOUT_ROUNDING = aVar3;
        a aVar4 = new a("TWO_DIGITS_AFTER_DOT_WITHOUT_ROUNDING_ZEROES_ABSENT", 3);
        TWO_DIGITS_AFTER_DOT_WITHOUT_ROUNDING_ZEROES_ABSENT = aVar4;
        a aVar5 = new a("TWO_DIGITS_AFTER_DOT_WITHOUT_ROUNDING_SHOW_ZEROES", 4);
        TWO_DIGITS_AFTER_DOT_WITHOUT_ROUNDING_SHOW_ZEROES = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
