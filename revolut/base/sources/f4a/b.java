package f4a;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b APM_CONTACT;
    public static final b BANK_ACCOUNT;
    public static final b CARD;
    public static final b CHARITY;
    public static final b CONTACT;
    public static final b COUNTERPARTY;
    public static final b CRYPTO_WALLET;
    public static final b GROUP;
    public static final b REVOLUT_CONTACT;

    static {
        b bVar = new b("CONTACT", 0);
        CONTACT = bVar;
        b bVar2 = new b("REVOLUT_CONTACT", 1);
        REVOLUT_CONTACT = bVar2;
        b bVar3 = new b("BANK_ACCOUNT", 2);
        BANK_ACCOUNT = bVar3;
        b bVar4 = new b("GROUP", 3);
        GROUP = bVar4;
        b bVar5 = new b("CRYPTO_WALLET", 4);
        CRYPTO_WALLET = bVar5;
        b bVar6 = new b("CHARITY", 5);
        CHARITY = bVar6;
        b bVar7 = new b("CARD", 6);
        CARD = bVar7;
        b bVar8 = new b("APM_CONTACT", 7);
        APM_CONTACT = bVar8;
        b bVar9 = new b("COUNTERPARTY", 8);
        COUNTERPARTY = bVar9;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
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
