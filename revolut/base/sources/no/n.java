package no;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n Business;
    public static final n Junior;
    public static final n Retail;
    public static final n RevolutX;
    public static final n Terminal;

    static {
        n nVar = new n("Business", 0);
        Business = nVar;
        n nVar2 = new n("Junior", 1);
        Junior = nVar2;
        n nVar3 = new n("Retail", 2);
        Retail = nVar3;
        n nVar4 = new n("RevolutX", 3);
        RevolutX = nVar4;
        n nVar5 = new n("Terminal", 4);
        Terminal = nVar5;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5};
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
