package xq2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CALENDAR_EVENT;
    public static final g CONTACT_INFO;
    public static final g DRIVER_LICENSE;
    public static final g EMAIL;
    public static final g GEO;
    public static final g ISBN;
    public static final g PHONE;
    public static final g PRODUCT;
    public static final g SMS;
    public static final g TEXT;
    public static final g UNKNOWN;
    public static final g URL;
    public static final g WIFI;

    static {
        g gVar = new g("UNKNOWN", 0);
        UNKNOWN = gVar;
        g gVar2 = new g("CONTACT_INFO", 1);
        CONTACT_INFO = gVar2;
        g gVar3 = new g("EMAIL", 2);
        EMAIL = gVar3;
        g gVar4 = new g("ISBN", 3);
        ISBN = gVar4;
        g gVar5 = new g("PHONE", 4);
        PHONE = gVar5;
        g gVar6 = new g("PRODUCT", 5);
        PRODUCT = gVar6;
        g gVar7 = new g("SMS", 6);
        SMS = gVar7;
        g gVar8 = new g("TEXT", 7);
        TEXT = gVar8;
        g gVar9 = new g("URL", 8);
        URL = gVar9;
        g gVar10 = new g("WIFI", 9);
        WIFI = gVar10;
        g gVar11 = new g("GEO", 10);
        GEO = gVar11;
        g gVar12 = new g("CALENDAR_EVENT", 11);
        CALENDAR_EVENT = gVar12;
        g gVar13 = new g("DRIVER_LICENSE", 12);
        DRIVER_LICENSE = gVar13;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
