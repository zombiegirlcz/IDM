package com.revolut.feature.transactions.api.navigation;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ANALYTICS;
    public static final a CRYPTO;
    public static final a DETAILS_TO_SPARE_CHANGE;
    public static final a OTHER;
    public static final a PAYMENTS_CHAT;
    public static final a PAYMENT_GROUP_DETAILS;
    public static final a PAYMENT_GROUP_WIDGET;
    public static final a PUSH;
    public static final a SPARE_CHANGE_TO_DETAILS;
    public static final a VAULT_DETAILS;

    static {
        a aVar = new a("VAULT_DETAILS", 0);
        VAULT_DETAILS = aVar;
        a aVar2 = new a("PAYMENT_GROUP_WIDGET", 1);
        PAYMENT_GROUP_WIDGET = aVar2;
        a aVar3 = new a("PAYMENT_GROUP_DETAILS", 2);
        PAYMENT_GROUP_DETAILS = aVar3;
        a aVar4 = new a("PUSH", 3);
        PUSH = aVar4;
        a aVar5 = new a("ANALYTICS", 4);
        ANALYTICS = aVar5;
        a aVar6 = new a("DETAILS_TO_SPARE_CHANGE", 5);
        DETAILS_TO_SPARE_CHANGE = aVar6;
        a aVar7 = new a("SPARE_CHANGE_TO_DETAILS", 6);
        SPARE_CHANGE_TO_DETAILS = aVar7;
        a aVar8 = new a("OTHER", 7);
        OTHER = aVar8;
        a aVar9 = new a("CRYPTO", 8);
        CRYPTO = aVar9;
        a aVar10 = new a("PAYMENTS_CHAT", 9);
        PAYMENTS_CHAT = aVar10;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
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
