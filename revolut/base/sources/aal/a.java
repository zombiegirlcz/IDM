package aal;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AWAITING_GREY;
    public static final a AWAITING_ORANGE;
    public static final a CANCELLED;
    public static final a CHECK_BLUE;
    public static final a CHECK_GREEN;
    public static final a EDIT;
    public static final a ERROR;
    public static final a EXPIRED;
    public static final a INCOME;
    public static final a INFO;
    public static final a LOCKED;
    public static final a OUTGOING;
    public static final a PENDING_BLUE;
    public static final a PENDING_GREY;
    public static final a RECURRING;
    public static final a REVERT;
    public static final a SUSPICIOUS_ORANGE;
    public static final a SUSPICIOUS_RED;
    public static final a TOPUP;

    static {
        a aVar = new a("AWAITING_GREY", 0);
        AWAITING_GREY = aVar;
        a aVar2 = new a("AWAITING_ORANGE", 1);
        AWAITING_ORANGE = aVar2;
        a aVar3 = new a("CANCELLED", 2);
        CANCELLED = aVar3;
        a aVar4 = new a("CHECK_BLUE", 3);
        CHECK_BLUE = aVar4;
        a aVar5 = new a("CHECK_GREEN", 4);
        CHECK_GREEN = aVar5;
        a aVar6 = new a("EDIT", 5);
        EDIT = aVar6;
        a aVar7 = new a("ERROR", 6);
        ERROR = aVar7;
        a aVar8 = new a("EXPIRED", 7);
        EXPIRED = aVar8;
        a aVar9 = new a("INCOME", 8);
        INCOME = aVar9;
        a aVar10 = new a("INFO", 9);
        INFO = aVar10;
        a aVar11 = new a("LOCKED", 10);
        LOCKED = aVar11;
        a aVar12 = new a("OUTGOING", 11);
        OUTGOING = aVar12;
        a aVar13 = new a("PENDING_BLUE", 12);
        PENDING_BLUE = aVar13;
        a aVar14 = new a("PENDING_GREY", 13);
        PENDING_GREY = aVar14;
        a aVar15 = new a("RECURRING", 14);
        RECURRING = aVar15;
        a aVar16 = new a("REVERT", 15);
        REVERT = aVar16;
        a aVar17 = new a("SUSPICIOUS_ORANGE", 16);
        SUSPICIOUS_ORANGE = aVar17;
        a aVar18 = new a("SUSPICIOUS_RED", 17);
        SUSPICIOUS_RED = aVar18;
        a aVar19 = new a("TOPUP", 18);
        TOPUP = aVar19;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19};
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
