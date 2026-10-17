package y8l;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Ly8l/b;", "", "INTERNAL", "MASAV_IL_R2P", "AANI", "BIZUM", "MBWAY", "QVIK", "UPI", "WERO", "feature_shared_payments_money_request_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @lg.b("AANI")
    public static final b AANI;

    @lg.b("BIZUM")
    public static final b BIZUM;

    @lg.b("INTERNAL")
    public static final b INTERNAL;

    @lg.b("MASAV_IL_R2P")
    public static final b MASAV_IL_R2P;

    @lg.b("MBWAY")
    public static final b MBWAY;

    @lg.b("GIRO_QVIK")
    public static final b QVIK;

    @lg.b("UPI")
    public static final b UPI;

    @lg.b("WERO")
    public static final b WERO;

    static {
        b bVar = new b("INTERNAL", 0);
        INTERNAL = bVar;
        b bVar2 = new b("MASAV_IL_R2P", 1);
        MASAV_IL_R2P = bVar2;
        b bVar3 = new b("AANI", 2);
        AANI = bVar3;
        b bVar4 = new b("BIZUM", 3);
        BIZUM = bVar4;
        b bVar5 = new b("MBWAY", 4);
        MBWAY = bVar5;
        b bVar6 = new b("QVIK", 5);
        QVIK = bVar6;
        b bVar7 = new b("UPI", 6);
        UPI = bVar7;
        b bVar8 = new b("WERO", 7);
        WERO = bVar8;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
