package d2e;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DISCOVER_MORE;
    public static final d HERO_CAROUSEL;
    public static final d LOGOS_GRID;
    public static final d REGULAR_CAROUSEL;
    public static final d REWARDS_NEARBY;

    static {
        d dVar = new d("HERO_CAROUSEL", 0);
        HERO_CAROUSEL = dVar;
        d dVar2 = new d("LOGOS_GRID", 1);
        LOGOS_GRID = dVar2;
        d dVar3 = new d("REGULAR_CAROUSEL", 2);
        REGULAR_CAROUSEL = dVar3;
        d dVar4 = new d("DISCOVER_MORE", 3);
        DISCOVER_MORE = dVar4;
        d dVar5 = new d("REWARDS_NEARBY", 4);
        REWARDS_NEARBY = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
