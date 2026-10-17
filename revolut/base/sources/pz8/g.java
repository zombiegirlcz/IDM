package pz8;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.j;
import yhm.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final g APP_TIPS;
    public static final g CRYPTO;

    @NotNull
    public static final f Companion;
    public static final g FRAUD;
    public static final g PRO;
    public static final g TRADING;
    public static final g YOUTH_TRADING;

    static {
        g gVar = new g("CRYPTO", 0);
        CRYPTO = gVar;
        g gVar2 = new g("TRADING", 1);
        TRADING = gVar2;
        g gVar3 = new g("FRAUD", 2);
        FRAUD = gVar3;
        g gVar4 = new g("APP_TIPS", 3);
        APP_TIPS = gVar4;
        g gVar5 = new g("PRO", 4);
        PRO = gVar5;
        g gVar6 = new g("YOUTH_TRADING", 5);
        YOUTH_TRADING = gVar6;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
        Companion = new f();
        $cachedSerializer$delegate = j.c(k.PUBLICATION, new pni.a(19));
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
