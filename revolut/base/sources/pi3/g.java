package pi3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g PAYMENT_REQUIRED;
    public static final g VERIFICATION_IN_PROGRESS;
    public static final g VERIFICATION_REQUIRED;
    public static final g WAITING_FOR_PROCESSING;

    static {
        g gVar = new g("PAYMENT_REQUIRED", 0);
        PAYMENT_REQUIRED = gVar;
        g gVar2 = new g("VERIFICATION_REQUIRED", 1);
        VERIFICATION_REQUIRED = gVar2;
        g gVar3 = new g("VERIFICATION_IN_PROGRESS", 2);
        VERIFICATION_IN_PROGRESS = gVar3;
        g gVar4 = new g("WAITING_FOR_PROCESSING", 3);
        WAITING_FOR_PROCESSING = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
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
