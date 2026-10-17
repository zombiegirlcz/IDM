package yfe;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a Cash;
    public static final a Credit;
    public static final a Crypto;
    public static final a Invest;
    public static final a Joint;
    public static final a Linked;
    public static final a Pro;
    public static final a Savings;
    public static final a Youth;

    static {
        a aVar = new a("Cash", 0);
        Cash = aVar;
        a aVar2 = new a("Savings", 1);
        Savings = aVar2;
        a aVar3 = new a("Crypto", 2);
        Crypto = aVar3;
        a aVar4 = new a("Invest", 3);
        Invest = aVar4;
        a aVar5 = new a("Joint", 4);
        Joint = aVar5;
        a aVar6 = new a("Credit", 5);
        Credit = aVar6;
        a aVar7 = new a("Pro", 6);
        Pro = aVar7;
        a aVar8 = new a("Youth", 7);
        Youth = aVar8;
        a aVar9 = new a("Linked", 8);
        Linked = aVar9;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
