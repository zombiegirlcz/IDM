package sdl;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final q BUY_SELL;
    public static final q CLOSE_POSITION_ONLY;

    @NotNull
    public static final p Companion;
    public static final q NONE;
    public static final q SELL_ONLY;

    static {
        q qVar = new q("BUY_SELL", 0);
        BUY_SELL = qVar;
        q qVar2 = new q("SELL_ONLY", 1);
        SELL_ONLY = qVar2;
        q qVar3 = new q("CLOSE_POSITION_ONLY", 2);
        CLOSE_POSITION_ONLY = qVar3;
        q qVar4 = new q("NONE", 3);
        NONE = qVar4;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4};
        $VALUES = qVarArr;
        $ENTRIES = vc.s.n(qVarArr);
        Companion = new p();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new s8f.h(17));
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
