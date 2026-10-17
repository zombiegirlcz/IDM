package z0d;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final q ACCEPTED;

    @NotNull
    public static final p Companion;
    public static final q PENDING;

    static {
        q qVar = new q("PENDING", 0);
        PENDING = qVar;
        q qVar2 = new q("ACCEPTED", 1);
        ACCEPTED = qVar2;
        q[] qVarArr = {qVar, qVar2};
        $VALUES = qVarArr;
        $ENTRIES = vc.s.n(qVarArr);
        Companion = new p();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new yui.d(19));
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
