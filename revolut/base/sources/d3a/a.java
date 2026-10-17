package d3a;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACCOUNTS;
    public static final a APM_AANI;
    public static final a APM_BIZUM;
    public static final a APM_BLIK;
    public static final a APM_BREB;
    public static final a APM_IRIS;
    public static final a APM_MULTIBANCO;
    public static final a APM_PAYID;
    public static final a APM_PIX;
    public static final a APM_QVIK;
    public static final a APM_SPIN;
    public static final a APM_UPI;
    public static final a APM_WERO;
    public static final a BILLERS;
    public static final a CARDS;
    public static final a CHARITIES;
    public static final a CHECKS;
    public static final a CRYPTO_WALLET;
    public static final a DEVICE;
    public static final a GROUPS;
    public static final a MOBILE_WALLET;
    public static final a REVOLUT;
    public static final a REVTAG;
    public static final a VIRTUAL_CONTACTS;

    static {
        a aVar = new a("REVOLUT", 0);
        REVOLUT = aVar;
        a aVar2 = new a("ACCOUNTS", 1);
        ACCOUNTS = aVar2;
        a aVar3 = new a("GROUPS", 2);
        GROUPS = aVar3;
        a aVar4 = new a("CARDS", 3);
        CARDS = aVar4;
        a aVar5 = new a("REVTAG", 4);
        REVTAG = aVar5;
        a aVar6 = new a("VIRTUAL_CONTACTS", 5);
        VIRTUAL_CONTACTS = aVar6;
        a aVar7 = new a("DEVICE", 6);
        DEVICE = aVar7;
        a aVar8 = new a("CRYPTO_WALLET", 7);
        CRYPTO_WALLET = aVar8;
        a aVar9 = new a("CHARITIES", 8);
        CHARITIES = aVar9;
        a aVar10 = new a("CHECKS", 9);
        CHECKS = aVar10;
        a aVar11 = new a("APM_AANI", 10);
        APM_AANI = aVar11;
        a aVar12 = new a("APM_BIZUM", 11);
        APM_BIZUM = aVar12;
        a aVar13 = new a("APM_BLIK", 12);
        APM_BLIK = aVar13;
        a aVar14 = new a("APM_BREB", 13);
        APM_BREB = aVar14;
        a aVar15 = new a("APM_IRIS", 14);
        APM_IRIS = aVar15;
        a aVar16 = new a("APM_MULTIBANCO", 15);
        APM_MULTIBANCO = aVar16;
        a aVar17 = new a("APM_PAYID", 16);
        APM_PAYID = aVar17;
        a aVar18 = new a("APM_PIX", 17);
        APM_PIX = aVar18;
        a aVar19 = new a("APM_QVIK", 18);
        APM_QVIK = aVar19;
        a aVar20 = new a("APM_SPIN", 19);
        APM_SPIN = aVar20;
        a aVar21 = new a("APM_UPI", 20);
        APM_UPI = aVar21;
        a aVar22 = new a("APM_WERO", 21);
        APM_WERO = aVar22;
        a aVar23 = new a("BILLERS", 22);
        BILLERS = aVar23;
        a aVar24 = new a("MOBILE_WALLET", 23);
        MOBILE_WALLET = aVar24;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24};
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
