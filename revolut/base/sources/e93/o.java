package e93;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o DEFAULT;
    public static final o ONBOARDING;
    private final String flow;

    static {
        o oVar = new o("ONBOARDING", 0, "onboarding");
        ONBOARDING = oVar;
        o oVar2 = new o("DEFAULT", 1, null);
        DEFAULT = oVar2;
        o[] oVarArr = {oVar, oVar2};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
    }

    public o(String str, int i, String str2) {
        this.flow = str2;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final String a() {
        return this.flow;
    }
}
