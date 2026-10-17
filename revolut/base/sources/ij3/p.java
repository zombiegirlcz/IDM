package ij3;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final o Companion;
    public static final p FIN_CRIME;
    public static final p MARKETING;

    static {
        p pVar = new p("MARKETING", 0);
        MARKETING = pVar;
        p pVar2 = new p("FIN_CRIME", 1);
        FIN_CRIME = pVar2;
        p[] pVarArr = {pVar, pVar2};
        $VALUES = pVarArr;
        $ENTRIES = vc.s.n(pVarArr);
        Companion = new o();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new igb.j(8));
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
