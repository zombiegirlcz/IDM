package h93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class u {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u PHYSICAL;
    public static final u VIRTUAL;

    @NotNull
    private final String value;

    static {
        u uVar = new u("PHYSICAL", 0, "physical");
        PHYSICAL = uVar;
        u uVar2 = new u("VIRTUAL", 1, "virtual");
        VIRTUAL = uVar2;
        u[] uVarArr = {uVar, uVar2};
        $VALUES = uVarArr;
        $ENTRIES = vc.s.n(uVarArr);
    }

    public u(String str, int i, String str2) {
        this.value = str2;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
