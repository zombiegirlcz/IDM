package hha;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k PARTNER_SALARY_ACTIVE;
    public static final k PARTNER_SALARY_GRACE;
    public static final k SALARY_ACTIVE;
    public static final k SALARY_HUB_ACTIVE;
    public static final k SALARY_HUB_GRACE;
    public static final k SALARY_OPT_IN;

    static {
        k kVar = new k("SALARY_OPT_IN", 0);
        SALARY_OPT_IN = kVar;
        k kVar2 = new k("SALARY_ACTIVE", 1);
        SALARY_ACTIVE = kVar2;
        k kVar3 = new k("PARTNER_SALARY_ACTIVE", 2);
        PARTNER_SALARY_ACTIVE = kVar3;
        k kVar4 = new k("PARTNER_SALARY_GRACE", 3);
        PARTNER_SALARY_GRACE = kVar4;
        k kVar5 = new k("SALARY_HUB_ACTIVE", 4);
        SALARY_HUB_ACTIVE = kVar5;
        k kVar6 = new k("SALARY_HUB_GRACE", 5);
        SALARY_HUB_GRACE = kVar6;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
