package vye;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c AKAHU;
    public static final c BREB;
    public static final c CHECK;
    public static final c CHECKOUT_PREORDER;
    public static final c EASY_BANK_TRANSFER;
    public static final c GOOGLE_PAY;
    public static final c IDEAL;
    public static final c MCY_BANK_TRANSFER;
    public static final c MCY_NET_BANKING;
    public static final c MCY_UPI_APP;
    public static final c MOVE_MONEY;
    public static final c NET_BANKING;
    public static final c PAYNOW;
    public static final c PAY_TO;
    public static final c PIX;
    public static final c PIX_SMART_TRANSFER;
    public static final c PSE;
    public static final c REVOLUT_ACCOUNT;
    public static final c UPI_APP;

    static {
        c cVar = new c("CHECK", 0);
        CHECK = cVar;
        c cVar2 = new c("GOOGLE_PAY", 1);
        GOOGLE_PAY = cVar2;
        c cVar3 = new c("EASY_BANK_TRANSFER", 2);
        EASY_BANK_TRANSFER = cVar3;
        c cVar4 = new c("REVOLUT_ACCOUNT", 3);
        REVOLUT_ACCOUNT = cVar4;
        c cVar5 = new c("CHECKOUT_PREORDER", 4);
        CHECKOUT_PREORDER = cVar5;
        c cVar6 = new c("MOVE_MONEY", 5);
        MOVE_MONEY = cVar6;
        c cVar7 = new c("PIX", 6);
        PIX = cVar7;
        c cVar8 = new c("PIX_SMART_TRANSFER", 7);
        PIX_SMART_TRANSFER = cVar8;
        c cVar9 = new c("IDEAL", 8);
        IDEAL = cVar9;
        c cVar10 = new c("PAY_TO", 9);
        PAY_TO = cVar10;
        c cVar11 = new c("UPI_APP", 10);
        UPI_APP = cVar11;
        c cVar12 = new c("MCY_UPI_APP", 11);
        MCY_UPI_APP = cVar12;
        c cVar13 = new c("NET_BANKING", 12);
        NET_BANKING = cVar13;
        c cVar14 = new c("MCY_NET_BANKING", 13);
        MCY_NET_BANKING = cVar14;
        c cVar15 = new c("MCY_BANK_TRANSFER", 14);
        MCY_BANK_TRANSFER = cVar15;
        c cVar16 = new c("PSE", 15);
        PSE = cVar16;
        c cVar17 = new c("BREB", 16);
        BREB = cVar17;
        c cVar18 = new c("AKAHU", 17);
        AKAHU = cVar18;
        c cVar19 = new c("PAYNOW", 18);
        PAYNOW = cVar19;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
