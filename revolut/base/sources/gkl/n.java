package gkl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n BANK_ID;
    public static final n BIO_PUBLIC_KEY;
    public static final n DAP;
    public static final n GOOGLE;
    public static final n PUBLIC_KEY;
    public static final n UAE_PASS;
    public static final n UNKNOWN;
    public static final n WEBAUTHN;

    static {
        n nVar = new n("BANK_ID", 0);
        BANK_ID = nVar;
        n nVar2 = new n("BIO_PUBLIC_KEY", 1);
        BIO_PUBLIC_KEY = nVar2;
        n nVar3 = new n("PUBLIC_KEY", 2);
        PUBLIC_KEY = nVar3;
        n nVar4 = new n("DAP", 3);
        DAP = nVar4;
        n nVar5 = new n("GOOGLE", 4);
        GOOGLE = nVar5;
        n nVar6 = new n("UAE_PASS", 5);
        UAE_PASS = nVar6;
        n nVar7 = new n("WEBAUTHN", 6);
        WEBAUTHN = nVar7;
        n nVar8 = new n("UNKNOWN", 7);
        UNKNOWN = nVar8;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8};
        $VALUES = nVarArr;
        $ENTRIES = vc.s.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
