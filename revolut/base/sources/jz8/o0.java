package jz8;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class o0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o0[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final n0 Companion;
    public static final o0 IMAGE;
    public static final o0 VIDEO;

    @NotNull
    private final String value;

    static {
        o0 o0Var = new o0("VIDEO", 0, "VIDEO");
        VIDEO = o0Var;
        o0 o0Var2 = new o0("IMAGE", 1, "IMAGE");
        IMAGE = o0Var2;
        o0[] o0VarArr = {o0Var, o0Var2};
        $VALUES = o0VarArr;
        $ENTRIES = vc.s.n(o0VarArr);
        Companion = new n0();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new jxi.a(22));
    }

    public o0(String str, int i, String str2) {
        this.value = str2;
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) $VALUES.clone();
    }
}
