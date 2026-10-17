package t48;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g None;
    public static final g ShowAcceptAndDeclineButtons;
    public static final g ShowConfirmButtonOnly;

    static {
        g gVar = new g("None", 0);
        None = gVar;
        g gVar2 = new g("ShowConfirmButtonOnly", 1);
        ShowConfirmButtonOnly = gVar2;
        g gVar3 = new g("ShowAcceptAndDeclineButtons", 2);
        ShowAcceptAndDeclineButtons = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
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
