package o5l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g HDPI;
    public static final g MDPI;
    public static final g XHDPI;
    public static final g XXHDPI;
    public static final g XXXHDPI;

    static {
        g gVar = new g("MDPI", 0);
        MDPI = gVar;
        g gVar2 = new g("HDPI", 1);
        HDPI = gVar2;
        g gVar3 = new g("XHDPI", 2);
        XHDPI = gVar3;
        g gVar4 = new g("XXHDPI", 3);
        XXHDPI = gVar4;
        g gVar5 = new g("XXXHDPI", 4);
        XXXHDPI = gVar5;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
        $VALUES = gVarArr;
        $ENTRIES = vc.s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
