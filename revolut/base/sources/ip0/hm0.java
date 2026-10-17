package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class hm0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ hm0[] $VALUES;
    public static final hm0 Thick;
    public static final hm0 Thin;

    static {
        hm0 hm0Var = new hm0("Thin", 0);
        Thin = hm0Var;
        hm0 hm0Var2 = new hm0("Thick", 1);
        Thick = hm0Var2;
        hm0[] hm0VarArr = {hm0Var, hm0Var2};
        $VALUES = hm0VarArr;
        $ENTRIES = vc.s.n(hm0VarArr);
    }

    public static hm0 valueOf(String str) {
        return (hm0) Enum.valueOf(hm0.class, str);
    }

    public static hm0[] values() {
        return (hm0[]) $VALUES.clone();
    }
}
