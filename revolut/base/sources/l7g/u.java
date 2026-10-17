package l7g;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;

    @NotNull
    public static final t Companion;
    public static final u ONE_WAY_COMBINATION;
    public static final u SELF_TRANSFER;
    public static final u UNKNOWN;

    static {
        u uVar = new u("ONE_WAY_COMBINATION", 0);
        ONE_WAY_COMBINATION = uVar;
        u uVar2 = new u("SELF_TRANSFER", 1);
        SELF_TRANSFER = uVar2;
        u uVar3 = new u("UNKNOWN", 2);
        UNKNOWN = uVar3;
        u[] uVarArr = {uVar, uVar2, uVar3};
        $VALUES = uVarArr;
        $ENTRIES = vc.s.n(uVarArr);
        Companion = new t();
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }
}
