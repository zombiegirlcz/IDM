package h93;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q ACTIVE;
    public static final q BLOCKED;

    @NotNull
    public static final p Companion;

    @NotNull
    private final String value;

    static {
        q qVar = new q("ACTIVE", 0, "ACTIVE");
        ACTIVE = qVar;
        q qVar2 = new q("BLOCKED", 1, "BLOCKED");
        BLOCKED = qVar2;
        q[] qVarArr = {qVar, qVar2};
        $VALUES = qVarArr;
        $ENTRIES = vc.s.n(qVarArr);
        Companion = new p();
    }

    public q(String str, int i, String str2) {
        this.value = str2;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
