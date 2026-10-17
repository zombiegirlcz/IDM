package t89;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    public static final f Companion;
    public static final g REVOLUT_BANK_UK_LTD;

    @NotNull
    private final String prodCompanyId = "baa0f127-43c9-472d-93b5-1cfc1953103b";

    @NotNull
    private final String devCompanyId = "530670d5-18e2-49e6-8a80-3d55a1ee2fa1";

    static {
        g gVar = new g();
        REVOLUT_BANK_UK_LTD = gVar;
        g[] gVarArr = {gVar};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
        Companion = new f();
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final String a() {
        return this.devCompanyId;
    }

    public final String c() {
        return this.prodCompanyId;
    }
}
