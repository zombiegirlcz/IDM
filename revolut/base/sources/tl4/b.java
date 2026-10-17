package tl4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ADD_MONEY;
    public static final b CONFIRM_WITHDRAWAL;
    public static final b EXIT;
    public static final b QUIT;
    public static final b REPAY;
    public static final b STATEMENT_ACCRUED_INTERESTS;
    public static final b UNKNOWN;
    public static final b WITHDRAWAL_NOTICE;

    static {
        b bVar = new b("STATEMENT_ACCRUED_INTERESTS", 0);
        STATEMENT_ACCRUED_INTERESTS = bVar;
        b bVar2 = new b("WITHDRAWAL_NOTICE", 1);
        WITHDRAWAL_NOTICE = bVar2;
        b bVar3 = new b("CONFIRM_WITHDRAWAL", 2);
        CONFIRM_WITHDRAWAL = bVar3;
        b bVar4 = new b("ADD_MONEY", 3);
        ADD_MONEY = bVar4;
        b bVar5 = new b("REPAY", 4);
        REPAY = bVar5;
        b bVar6 = new b("QUIT", 5);
        QUIT = bVar6;
        b bVar7 = new b("EXIT", 6);
        EXIT = bVar7;
        b bVar8 = new b("UNKNOWN", 7);
        UNKNOWN = bVar8;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
