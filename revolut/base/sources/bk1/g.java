package bk1;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.j;
import yhm.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@mlm.g
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final g ACTIVE;

    @NotNull
    public static final f Companion;
    public static final g DEACTIVATED;
    public static final g UNKNOWN;

    static {
        g gVar = new g("ACTIVE", 0);
        ACTIVE = gVar;
        g gVar2 = new g("DEACTIVATED", 1);
        DEACTIVATED = gVar2;
        g gVar3 = new g("UNKNOWN", 2);
        UNKNOWN = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
        Companion = new f();
        $cachedSerializer$delegate = j.c(k.PUBLICATION, new bi2.g(20));
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
