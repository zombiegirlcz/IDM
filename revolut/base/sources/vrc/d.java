package vrc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d RDAEL;
    public static final d REVOLUT_LTD;
    public static final d REVOLUT_TRADING_LTD;
    public static final d RSEUAB;
    public static final d UNKNOWN;

    static {
        d dVar = new d("RDAEL", 0);
        RDAEL = dVar;
        d dVar2 = new d("RSEUAB", 1);
        RSEUAB = dVar2;
        d dVar3 = new d("REVOLUT_LTD", 2);
        REVOLUT_LTD = dVar3;
        d dVar4 = new d("REVOLUT_TRADING_LTD", 3);
        REVOLUT_TRADING_LTD = dVar4;
        d dVar5 = new d("UNKNOWN", 4);
        UNKNOWN = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
