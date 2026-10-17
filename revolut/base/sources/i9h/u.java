package i9h;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u MOST_BOUGHT;
    public static final u MOST_SOLD;
    public static final u MOST_TRADED;

    static {
        u uVar = new u("MOST_TRADED", 0);
        MOST_TRADED = uVar;
        u uVar2 = new u("MOST_BOUGHT", 1);
        MOST_BOUGHT = uVar2;
        u uVar3 = new u("MOST_SOLD", 2);
        MOST_SOLD = uVar3;
        u[] uVarArr = {uVar, uVar2, uVar3};
        $VALUES = uVarArr;
        $ENTRIES = vc.s.n(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
