package il9;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class x {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ x[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final x COMPLETED;

    @NotNull
    public static final w Companion;
    public static final x FAILED;
    public static final x IN_PROGRESS;

    static {
        x xVar = new x("IN_PROGRESS", 0);
        IN_PROGRESS = xVar;
        x xVar2 = new x("COMPLETED", 1);
        COMPLETED = xVar2;
        x xVar3 = new x("FAILED", 2);
        FAILED = xVar3;
        x[] xVarArr = {xVar, xVar2, xVar3};
        $VALUES = xVarArr;
        $ENTRIES = vc.s.n(xVarArr);
        Companion = new w();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new p(2));
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) $VALUES.clone();
    }
}
