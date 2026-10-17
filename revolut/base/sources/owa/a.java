package owa;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CARD;
    public static final a CRYPTOCURRENCIES;
    public static final a CRYPTO_ACTIONS;
    public static final a CRYPTO_LEARN;
    public static final a CRYPTO_NEWS;
    public static final a CRYPTO_SECURITY;
    public static final a MUCH_MORE;
    public static final a SAVE_MONEY;
    public static final a SAVINGS;
    public static final a SEND_MONEY;
    public static final a SPLIT_BILLS;

    static {
        a aVar = new a("SEND_MONEY", 0);
        SEND_MONEY = aVar;
        a aVar2 = new a("SPLIT_BILLS", 1);
        SPLIT_BILLS = aVar2;
        a aVar3 = new a("SAVE_MONEY", 2);
        SAVE_MONEY = aVar3;
        a aVar4 = new a("MUCH_MORE", 3);
        MUCH_MORE = aVar4;
        a aVar5 = new a("CRYPTOCURRENCIES", 4);
        CRYPTOCURRENCIES = aVar5;
        a aVar6 = new a("CRYPTO_ACTIONS", 5);
        CRYPTO_ACTIONS = aVar6;
        a aVar7 = new a("CRYPTO_SECURITY", 6);
        CRYPTO_SECURITY = aVar7;
        a aVar8 = new a("CRYPTO_NEWS", 7);
        CRYPTO_NEWS = aVar8;
        a aVar9 = new a("CRYPTO_LEARN", 8);
        CRYPTO_LEARN = aVar9;
        a aVar10 = new a("CARD", 9);
        CARD = aVar10;
        a aVar11 = new a("SAVINGS", 10);
        SAVINGS = aVar11;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11};
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
