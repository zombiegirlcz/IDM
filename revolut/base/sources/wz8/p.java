package wz8;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import wyc.u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final o Companion;
    public static final p MULTIPLE;
    public static final p SINGLE;

    static {
        p pVar = new p("SINGLE", 0);
        SINGLE = pVar;
        p pVar2 = new p("MULTIPLE", 1);
        MULTIPLE = pVar2;
        p[] pVarArr = {pVar, pVar2};
        $VALUES = pVarArr;
        $ENTRIES = s.n(pVarArr);
        Companion = new o();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new u(12));
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
