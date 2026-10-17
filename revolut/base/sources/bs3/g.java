package bs3;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CREDOLAB;

    @NotNull
    public static final f Companion;
    public static final g INCOGNIA;
    public static final g SEON;

    static {
        g gVar = new g("SEON", 0);
        SEON = gVar;
        g gVar2 = new g("INCOGNIA", 1);
        INCOGNIA = gVar2;
        g gVar3 = new g("CREDOLAB", 2);
        CREDOLAB = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
        Companion = new f();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
