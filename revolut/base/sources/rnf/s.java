package rnf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s ANALYTICS;
    public static final s CRYPTO;
    public static final s DETAILS_TO_SPARE_CHANGE;
    public static final s OTHER;
    public static final s PAYMENTS_CHAT;
    public static final s PAYMENT_GROUP_DETAILS;
    public static final s PAYMENT_GROUP_WIDGET;
    public static final s PUSH;
    public static final s SPARE_CHANGE_TO_DETAILS;
    public static final s VAULT_DETAILS;

    static {
        s sVar = new s("VAULT_DETAILS", 0);
        VAULT_DETAILS = sVar;
        s sVar2 = new s("PAYMENT_GROUP_WIDGET", 1);
        PAYMENT_GROUP_WIDGET = sVar2;
        s sVar3 = new s("PAYMENT_GROUP_DETAILS", 2);
        PAYMENT_GROUP_DETAILS = sVar3;
        s sVar4 = new s("PUSH", 3);
        PUSH = sVar4;
        s sVar5 = new s("ANALYTICS", 4);
        ANALYTICS = sVar5;
        s sVar6 = new s("DETAILS_TO_SPARE_CHANGE", 5);
        DETAILS_TO_SPARE_CHANGE = sVar6;
        s sVar7 = new s("SPARE_CHANGE_TO_DETAILS", 6);
        SPARE_CHANGE_TO_DETAILS = sVar7;
        s sVar8 = new s("OTHER", 7);
        OTHER = sVar8;
        s sVar9 = new s("CRYPTO", 8);
        CRYPTO = sVar9;
        s sVar10 = new s("PAYMENTS_CHAT", 9);
        PAYMENTS_CHAT = sVar10;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
