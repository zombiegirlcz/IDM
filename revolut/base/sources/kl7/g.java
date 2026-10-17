package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g ANNUAL_CERTIFICATE;
    public static final g TEMPORARY_CERTIFICATE;

    static {
        g gVar = new g("TEMPORARY_CERTIFICATE", 0);
        TEMPORARY_CERTIFICATE = gVar;
        g gVar2 = new g("ANNUAL_CERTIFICATE", 1);
        ANNUAL_CERTIFICATE = gVar2;
        g[] gVarArr = {gVar, gVar2};
        $VALUES = gVarArr;
        $ENTRIES = vc.s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
