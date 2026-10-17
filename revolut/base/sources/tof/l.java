package tof;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l AANI;
    public static final l BIZUM;
    public static final l BLIK_P2P;
    public static final l BREB_ALIAS;
    public static final l GIRO_ALIAS;
    public static final l IRIS;
    public static final l MBWAY;
    public static final l PIX;
    public static final l SPIN;
    public static final l UNKNOWN;
    public static final l UPI;
    public static final l WERO;

    @NotNull
    private final String value;

    static {
        l lVar = new l("UNKNOWN", 0, "");
        UNKNOWN = lVar;
        l lVar2 = new l("AANI", 1, "AANI");
        AANI = lVar2;
        l lVar3 = new l("BIZUM", 2, "BIZUM");
        BIZUM = lVar3;
        l lVar4 = new l("BLIK_P2P", 3, "BLIK_P2P");
        BLIK_P2P = lVar4;
        l lVar5 = new l("BREB_ALIAS", 4, "BREB_ALIAS");
        BREB_ALIAS = lVar5;
        l lVar6 = new l("GIRO_ALIAS", 5, "GIRO_ALIAS");
        GIRO_ALIAS = lVar6;
        l lVar7 = new l("IRIS", 6, "IRIS");
        IRIS = lVar7;
        l lVar8 = new l("MBWAY", 7, "MBWAY");
        MBWAY = lVar8;
        l lVar9 = new l("PIX", 8, "PIX");
        PIX = lVar9;
        l lVar10 = new l("SPIN", 9, "SPIN");
        SPIN = lVar10;
        l lVar11 = new l("UPI", 10, "UPI");
        UPI = lVar11;
        l lVar12 = new l("WERO", 11, "WERO");
        WERO = lVar12;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
    }

    public l(String str, int i, String str2) {
        this.value = str2;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
