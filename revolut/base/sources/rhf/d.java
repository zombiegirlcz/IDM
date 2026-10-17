package rhf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ANALYTICS;
    public static final d CRYPTO;
    public static final d DETAILS_TO_SPARE_CHANGE;
    public static final d OTHER;
    public static final d PAYMENTS_CHAT;
    public static final d PAYMENT_GROUP_DETAILS;
    public static final d PAYMENT_GROUP_WIDGET;
    public static final d PUSH;
    public static final d SPARE_CHANGE_TO_DETAILS;
    public static final d VAULT_DETAILS;

    static {
        d dVar = new d("ANALYTICS", 0);
        ANALYTICS = dVar;
        d dVar2 = new d("CRYPTO", 1);
        CRYPTO = dVar2;
        d dVar3 = new d("DETAILS_TO_SPARE_CHANGE", 2);
        DETAILS_TO_SPARE_CHANGE = dVar3;
        d dVar4 = new d("PAYMENTS_CHAT", 3);
        PAYMENTS_CHAT = dVar4;
        d dVar5 = new d("PAYMENT_GROUP_DETAILS", 4);
        PAYMENT_GROUP_DETAILS = dVar5;
        d dVar6 = new d("PAYMENT_GROUP_WIDGET", 5);
        PAYMENT_GROUP_WIDGET = dVar6;
        d dVar7 = new d("PUSH", 6);
        PUSH = dVar7;
        d dVar8 = new d("SPARE_CHANGE_TO_DETAILS", 7);
        SPARE_CHANGE_TO_DETAILS = dVar8;
        d dVar9 = new d("VAULT_DETAILS", 8);
        VAULT_DETAILS = dVar9;
        d dVar10 = new d("OTHER", 9);
        OTHER = dVar10;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
