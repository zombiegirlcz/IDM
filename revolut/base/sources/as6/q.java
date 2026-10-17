package as6;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;

    @NotNull
    public static final p Companion;
    public static final q INLINE;

    @NotNull
    private final String paramName = "inline";

    static {
        q qVar = new q();
        INLINE = qVar;
        q[] qVarArr = {qVar};
        $VALUES = qVarArr;
        $ENTRIES = s.n(qVarArr);
        Companion = new p();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    public final String b() {
        return this.paramName;
    }
}
