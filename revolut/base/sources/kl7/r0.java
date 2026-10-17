package kl7;

import kkf.z5;
import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r0[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    @NotNull
    public static final q0 Companion;
    public static final r0 IMAGE;
    public static final r0 OTHER;
    public static final r0 PDF;

    static {
        r0 r0Var = new r0("IMAGE", 0);
        IMAGE = r0Var;
        r0 r0Var2 = new r0("PDF", 1);
        PDF = r0Var2;
        r0 r0Var3 = new r0("OTHER", 2);
        OTHER = r0Var3;
        r0[] r0VarArr = {r0Var, r0Var2, r0Var3};
        $VALUES = r0VarArr;
        $ENTRIES = vc.s.n(r0VarArr);
        Companion = new q0();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new z5(27));
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) $VALUES.clone();
    }
}
