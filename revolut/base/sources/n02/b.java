package n02;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class b implements c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b AANI;
    public static final b BIZUM;
    public static final b BLIK;
    public static final b BREB;
    public static final b IRIS;
    public static final b MBWAY;
    public static final b PIX;
    public static final b QVIK;
    public static final b SPIN;
    public static final b WERO;

    @NotNull
    private final String discoveryProvider;

    static {
        b bVar = new b("AANI", 0, "AANI");
        AANI = bVar;
        b bVar2 = new b("BIZUM", 1, "BIZUM");
        BIZUM = bVar2;
        b bVar3 = new b("BREB", 2, "BREB");
        BREB = bVar3;
        b bVar4 = new b("BLIK", 3, "BLIK");
        BLIK = bVar4;
        b bVar5 = new b("IRIS", 4, "IRIS");
        IRIS = bVar5;
        b bVar6 = new b("MBWAY", 5, "MBWAY");
        MBWAY = bVar6;
        b bVar7 = new b("PIX", 6, "PIX");
        PIX = bVar7;
        b bVar8 = new b("QVIK", 7, "GIRO_ALIAS");
        QVIK = bVar8;
        b bVar9 = new b("SPIN", 8, "SPIN");
        SPIN = bVar9;
        b bVar10 = new b("WERO", 9, "WERO");
        WERO = bVar10;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, String str2) {
        this.discoveryProvider = str2;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String a() {
        return this.discoveryProvider;
    }
}
