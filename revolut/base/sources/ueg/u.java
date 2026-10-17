package ueg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u ANCHORED;
    public static final u COLLAPSED;
    public static final u EXPANDED;

    static {
        u uVar = new u("COLLAPSED", 0);
        COLLAPSED = uVar;
        u uVar2 = new u("ANCHORED", 1);
        ANCHORED = uVar2;
        u uVar3 = new u("EXPANDED", 2);
        EXPANDED = uVar3;
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
