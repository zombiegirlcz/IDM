package qh0;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final g CROSS_PLATFORM;

    @NotNull
    public static final f Companion;
    public static final g PLATFORM;

    static {
        g gVar = new g("PLATFORM", 0);
        PLATFORM = gVar;
        g gVar2 = new g("CROSS_PLATFORM", 1);
        CROSS_PLATFORM = gVar2;
        g[] gVarArr = {gVar, gVar2};
        $VALUES = gVarArr;
        $ENTRIES = vc.s.n(gVarArr);
        Companion = new f();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new d(3));
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
