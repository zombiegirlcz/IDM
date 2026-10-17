package rnf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d OpenHelpCentreMain;
    public static final d OpenTroubleshooting;
    public static final d ShowThisTransactionPopUp;

    static {
        d dVar = new d("ShowThisTransactionPopUp", 0);
        ShowThisTransactionPopUp = dVar;
        d dVar2 = new d("OpenHelpCentreMain", 1);
        OpenHelpCentreMain = dVar2;
        d dVar3 = new d("OpenTroubleshooting", 2);
        OpenTroubleshooting = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
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
