package u3a;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d BENEFICIARIES;
    public static final d CARDS;
    public static final d CONTACTS;
    public static final d CRYPTO;
    public static final d GROUPS;
    public static final d SELF_BENEFICIARIES_PAY_ID;

    static {
        d dVar = new d("SELF_BENEFICIARIES_PAY_ID", 0);
        SELF_BENEFICIARIES_PAY_ID = dVar;
        d dVar2 = new d("BENEFICIARIES", 1);
        BENEFICIARIES = dVar2;
        d dVar3 = new d("CARDS", 2);
        CARDS = dVar3;
        d dVar4 = new d("GROUPS", 3);
        GROUPS = dVar4;
        d dVar5 = new d("CRYPTO", 4);
        CRYPTO = dVar5;
        d dVar6 = new d("CONTACTS", 5);
        CONTACTS = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
