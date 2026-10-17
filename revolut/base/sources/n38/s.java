package n38;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s ACCOUNTS_LIMIT_REACHED;
    public static final s COMPANIES_NOT_MATCH;
    public static final s ELIGIBLE;
    public static final s INELIGIBLE;
    public static final s INVITEE_INELIGIBLE_COUNTRY;
    public static final s INVITEE_MIGRATION_REQUIRED;
    public static final s MIGRATION_REQUIRED;

    static {
        s sVar = new s("MIGRATION_REQUIRED", 0);
        MIGRATION_REQUIRED = sVar;
        s sVar2 = new s("INELIGIBLE", 1);
        INELIGIBLE = sVar2;
        s sVar3 = new s("COMPANIES_NOT_MATCH", 2);
        COMPANIES_NOT_MATCH = sVar3;
        s sVar4 = new s("ACCOUNTS_LIMIT_REACHED", 3);
        ACCOUNTS_LIMIT_REACHED = sVar4;
        s sVar5 = new s("ELIGIBLE", 4);
        ELIGIBLE = sVar5;
        s sVar6 = new s("INVITEE_MIGRATION_REQUIRED", 5);
        INVITEE_MIGRATION_REQUIRED = sVar6;
        s sVar7 = new s("INVITEE_INELIGIBLE_COUNTRY", 6);
        INVITEE_INELIGIBLE_COUNTRY = sVar7;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7};
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
