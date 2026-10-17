package nx9;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d APM_CONTACT;
    public static final d BANK;
    public static final d CARD;
    public static final d CHARITY;
    public static final d CONTACT_CODE;
    public static final d CONTACT_EMAIL;
    public static final d CONTACT_PHONE;
    public static final d CRYPTO;
    public static final d GROUP;
    public static final d PAYMENT_COUNTERPARTY;

    @NotNull
    private final String value;

    static {
        d dVar = new d("BANK", 0, "BANK");
        BANK = dVar;
        d dVar2 = new d("CARD", 1, "CARD");
        CARD = dVar2;
        d dVar3 = new d("CRYPTO", 2, "CRYPTO");
        CRYPTO = dVar3;
        d dVar4 = new d("CONTACT_CODE", 3, "CONTACT_CODE");
        CONTACT_CODE = dVar4;
        d dVar5 = new d("CONTACT_PHONE", 4, "CONTACT_PHONE");
        CONTACT_PHONE = dVar5;
        d dVar6 = new d("CONTACT_EMAIL", 5, "CONTACT_EMAIL");
        CONTACT_EMAIL = dVar6;
        d dVar7 = new d("GROUP", 6, "GROUP");
        GROUP = dVar7;
        d dVar8 = new d("CHARITY", 7, "CHARITY");
        CHARITY = dVar8;
        d dVar9 = new d("APM_CONTACT", 8, "APM_CONTACT");
        APM_CONTACT = dVar9;
        d dVar10 = new d("PAYMENT_COUNTERPARTY", 9, "PAYMENT_COUNTERPARTY");
        PAYMENT_COUNTERPARTY = dVar10;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, String str2) {
        this.value = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
