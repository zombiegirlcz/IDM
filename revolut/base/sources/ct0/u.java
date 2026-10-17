package ct0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u DOWN;
    public static final u LEFT;
    public static final u RIGHT;
    public static final u UP;

    static {
        u uVar = new u("UP", 0);
        UP = uVar;
        u uVar2 = new u("DOWN", 1);
        DOWN = uVar2;
        u uVar3 = new u("LEFT", 2);
        LEFT = uVar3;
        u uVar4 = new u("RIGHT", 3);
        RIGHT = uVar4;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4};
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
