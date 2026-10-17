package o3b;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u AMOUNT;
    public static final u DISTANCE;
    public static final u PRICE;

    static {
        u uVar = new u("PRICE", 0);
        PRICE = uVar;
        u uVar2 = new u("AMOUNT", 1);
        AMOUNT = uVar2;
        u uVar3 = new u("DISTANCE", 2);
        DISTANCE = uVar3;
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
