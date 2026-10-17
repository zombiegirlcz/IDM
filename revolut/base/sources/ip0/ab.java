package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ab {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ab[] $VALUES;
    public static final ab DIGITS_4;
    public static final ab DIGITS_6;
    public static final ab DIGITS_6_NO_DIVIDER;
    public static final ab DIGITS_7;
    public static final ab DIGITS_8;
    public static final ab DIGITS_9;
    private final int digits;

    static {
        ab abVar = new ab("DIGITS_4", 0, 4);
        DIGITS_4 = abVar;
        ab abVar2 = new ab("DIGITS_6", 1, 6);
        DIGITS_6 = abVar2;
        ab abVar3 = new ab("DIGITS_6_NO_DIVIDER", 2, 6);
        DIGITS_6_NO_DIVIDER = abVar3;
        ab abVar4 = new ab("DIGITS_7", 3, 7);
        DIGITS_7 = abVar4;
        ab abVar5 = new ab("DIGITS_8", 4, 8);
        DIGITS_8 = abVar5;
        ab abVar6 = new ab("DIGITS_9", 5, 9);
        DIGITS_9 = abVar6;
        ab[] abVarArr = {abVar, abVar2, abVar3, abVar4, abVar5, abVar6};
        $VALUES = abVarArr;
        $ENTRIES = vc.s.n(abVarArr);
    }

    public ab(String str, int i, int i2) {
        this.digits = i2;
    }

    public static ab valueOf(String str) {
        return (ab) Enum.valueOf(ab.class, str);
    }

    public static ab[] values() {
        return (ab[]) $VALUES.clone();
    }

    public final int a() {
        return this.digits;
    }
}
