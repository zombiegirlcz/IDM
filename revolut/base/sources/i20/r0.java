package i20;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r0[] $VALUES;
    public static final r0 HORIZONTAL_BOX;
    public static final r0 VERTICAL_BOX;

    @NotNull
    private final String value;

    static {
        r0 r0Var = new r0("VERTICAL_BOX", 0, "vbox");
        VERTICAL_BOX = r0Var;
        r0 r0Var2 = new r0("HORIZONTAL_BOX", 1, "hbox");
        HORIZONTAL_BOX = r0Var2;
        r0[] r0VarArr = {r0Var, r0Var2};
        $VALUES = r0VarArr;
        $ENTRIES = vc.s.n(r0VarArr);
    }

    public r0(String str, int i, String str2) {
        this.value = str2;
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
