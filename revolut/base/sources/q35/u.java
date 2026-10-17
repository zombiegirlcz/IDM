package q35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u Cpo;
    public static final u Internal;
    public static final u Npo;
    public static final u NpoCash;

    static {
        u uVar = new u("Npo", 0);
        Npo = uVar;
        u uVar2 = new u("NpoCash", 1);
        NpoCash = uVar2;
        u uVar3 = new u("Cpo", 2);
        Cpo = uVar3;
        u uVar4 = new u("Internal", 3);
        Internal = uVar4;
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
