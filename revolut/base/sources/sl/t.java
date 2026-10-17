package sl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t CUSTOM;
    public static final t DEFAULT;
    public static final t EXPIRED_DOCUMENT;
    public static final t GENERIC_DOCUMENT;
    public static final t GENERIC_PROOF_OF_ADDRESS_ISSUE;
    public static final t GENERIC_SELFIE;
    public static final t UNACCEPTED_DOCUMENT;

    static {
        t tVar = new t("EXPIRED_DOCUMENT", 0);
        EXPIRED_DOCUMENT = tVar;
        t tVar2 = new t("UNACCEPTED_DOCUMENT", 1);
        UNACCEPTED_DOCUMENT = tVar2;
        t tVar3 = new t("GENERIC_DOCUMENT", 2);
        GENERIC_DOCUMENT = tVar3;
        t tVar4 = new t("GENERIC_SELFIE", 3);
        GENERIC_SELFIE = tVar4;
        t tVar5 = new t("GENERIC_PROOF_OF_ADDRESS_ISSUE", 4);
        GENERIC_PROOF_OF_ADDRESS_ISSUE = tVar5;
        t tVar6 = new t("CUSTOM", 5);
        CUSTOM = tVar6;
        t tVar7 = new t("DEFAULT", 6);
        DEFAULT = tVar7;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
