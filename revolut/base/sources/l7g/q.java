package l7g;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q CANCELLED;
    public static final q CONFIRMED;

    @NotNull
    public static final p Companion;
    public static final q FAILED;
    public static final q PENDING;
    public static final q UNKNOWN;

    static {
        q qVar = new q("PENDING", 0);
        PENDING = qVar;
        q qVar2 = new q("CONFIRMED", 1);
        CONFIRMED = qVar2;
        q qVar3 = new q("FAILED", 2);
        FAILED = qVar3;
        q qVar4 = new q("CANCELLED", 3);
        CANCELLED = qVar4;
        q qVar5 = new q("UNKNOWN", 4);
        UNKNOWN = qVar5;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5};
        $VALUES = qVarArr;
        $ENTRIES = vc.s.n(qVarArr);
        Companion = new p();
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
