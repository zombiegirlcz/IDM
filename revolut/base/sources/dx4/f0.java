package dx4;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class f0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f0[] $VALUES;

    @NotNull
    public static final d0 Companion;
    public static final f0 REVOLUT;

    static {
        f0 f0Var = new f0("REVOLUT", 0);
        REVOLUT = f0Var;
        f0[] f0VarArr = {f0Var};
        $VALUES = f0VarArr;
        $ENTRIES = vc.s.n(f0VarArr);
        Companion = new d0();
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) $VALUES.clone();
    }
}
