package gu7;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p5[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final o5 Companion;
    public static final p5 PDF;
    public static final p5 WEBPAGE;

    static {
        p5 p5Var = new p5("WEBPAGE", 0);
        WEBPAGE = p5Var;
        p5 p5Var2 = new p5("PDF", 1);
        PDF = p5Var2;
        p5[] p5VarArr = {p5Var, p5Var2};
        $VALUES = p5VarArr;
        $ENTRIES = vc.s.n(p5VarArr);
        Companion = new o5();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new v1(25));
    }

    public static p5 valueOf(String str) {
        return (p5) Enum.valueOf(p5.class, str);
    }

    public static p5[] values() {
        return (p5[]) $VALUES.clone();
    }
}
