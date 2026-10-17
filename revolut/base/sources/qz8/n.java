package qz8;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final n AVAILABLE;

    @NotNull
    public static final m Companion;
    public static final n LOCKED;
    public static final n PROGRESS;

    static {
        n nVar = new n("AVAILABLE", 0);
        AVAILABLE = nVar;
        n nVar2 = new n("PROGRESS", 1);
        PROGRESS = nVar2;
        n nVar3 = new n("LOCKED", 2);
        LOCKED = nVar3;
        n[] nVarArr = {nVar, nVar2, nVar3};
        $VALUES = nVarArr;
        $ENTRIES = vc.s.n(nVarArr);
        Companion = new m();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new f(6));
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
