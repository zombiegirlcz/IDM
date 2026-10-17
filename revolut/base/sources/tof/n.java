package tof;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n BIZUM;
    public static final n BLIK;
    public static final n BREB_ALIAS;
    public static final n GIRO_ALIAS;
    public static final n IDEAL;
    public static final n IRIS;
    public static final n MBWAY;
    public static final n SPIN;
    public static final n UNKNOWN;
    public static final n WERO;

    @NotNull
    private final String value;

    static {
        n nVar = new n("UNKNOWN", 0, "");
        UNKNOWN = nVar;
        n nVar2 = new n("BIZUM", 1, "BIZUM");
        BIZUM = nVar2;
        n nVar3 = new n("BLIK", 2, "BLIK");
        BLIK = nVar3;
        n nVar4 = new n("BREB_ALIAS", 3, "BREB_ALIAS");
        BREB_ALIAS = nVar4;
        n nVar5 = new n("GIRO_ALIAS", 4, "GIRO_ALIAS");
        GIRO_ALIAS = nVar5;
        n nVar6 = new n("IRIS", 5, "IRIS");
        IRIS = nVar6;
        n nVar7 = new n("IDEAL", 6, "IDEAL");
        IDEAL = nVar7;
        n nVar8 = new n("MBWAY", 7, "MBWAY");
        MBWAY = nVar8;
        n nVar9 = new n("SPIN", 8, "SPIN");
        SPIN = nVar9;
        n nVar10 = new n("WERO", 9, "WERO");
        WERO = nVar10;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10};
        $VALUES = nVarArr;
        $ENTRIES = vc.s.n(nVarArr);
    }

    public n(String str, int i, String str2) {
        this.value = str2;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
