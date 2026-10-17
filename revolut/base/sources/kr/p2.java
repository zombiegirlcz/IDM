package kr;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class p2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p2[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final p2 COMPLETED;

    @NotNull
    public static final o2 Companion;
    public static final p2 PARTIAL;
    public static final p2 UNAVAILABLE;

    static {
        p2 p2Var = new p2("COMPLETED", 0);
        COMPLETED = p2Var;
        p2 p2Var2 = new p2("PARTIAL", 1);
        PARTIAL = p2Var2;
        p2 p2Var3 = new p2("UNAVAILABLE", 2);
        UNAVAILABLE = p2Var3;
        p2[] p2VarArr = {p2Var, p2Var2, p2Var3};
        $VALUES = p2VarArr;
        $ENTRIES = vc.s.n(p2VarArr);
        Companion = new o2();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new h2(1));
    }

    public static p2 valueOf(String str) {
        return (p2) Enum.valueOf(p2.class, str);
    }

    public static p2[] values() {
        return (p2[]) $VALUES.clone();
    }
}
