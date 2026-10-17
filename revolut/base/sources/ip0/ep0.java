package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class ep0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ep0[] $VALUES;
    public static final ep0 FRIDAY;
    public static final ep0 MONDAY;
    public static final ep0 SATURDAY;
    public static final ep0 SUNDAY;
    public static final ep0 THURSDAY;
    public static final ep0 TUESDAY;
    public static final ep0 WEDNESDAY;

    static {
        ep0 ep0Var = new ep0("MONDAY", 0);
        MONDAY = ep0Var;
        ep0 ep0Var2 = new ep0("TUESDAY", 1);
        TUESDAY = ep0Var2;
        ep0 ep0Var3 = new ep0("WEDNESDAY", 2);
        WEDNESDAY = ep0Var3;
        ep0 ep0Var4 = new ep0("THURSDAY", 3);
        THURSDAY = ep0Var4;
        ep0 ep0Var5 = new ep0("FRIDAY", 4);
        FRIDAY = ep0Var5;
        ep0 ep0Var6 = new ep0("SATURDAY", 5);
        SATURDAY = ep0Var6;
        ep0 ep0Var7 = new ep0("SUNDAY", 6);
        SUNDAY = ep0Var7;
        ep0[] ep0VarArr = {ep0Var, ep0Var2, ep0Var3, ep0Var4, ep0Var5, ep0Var6, ep0Var7};
        $VALUES = ep0VarArr;
        $ENTRIES = vc.s.n(ep0VarArr);
    }

    public static ep0 valueOf(String str) {
        return (ep0) Enum.valueOf(ep0.class, str);
    }

    public static ep0[] values() {
        return (ep0[]) $VALUES.clone();
    }
}
