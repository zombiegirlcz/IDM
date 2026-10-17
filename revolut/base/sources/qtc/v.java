package qtc;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;

    @NotNull
    public static final u Companion;
    public static final v DEFAULT;
    public static final v SPENDING_HABITS;

    static {
        v vVar = new v("SPENDING_HABITS", 0);
        SPENDING_HABITS = vVar;
        v vVar2 = new v("DEFAULT", 1);
        DEFAULT = vVar2;
        v[] vVarArr = {vVar, vVar2};
        $VALUES = vVarArr;
        $ENTRIES = vc.s.n(vVarArr);
        Companion = new u();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
