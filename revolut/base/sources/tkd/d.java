package tkd;

import kotlin.Lazy;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;
    public static final d AIR_SUGGESTION;
    public static final d CHECKLIST;
    public static final d CROSS_SELL_TILES;

    @NotNull
    public static final c Companion;
    public static final d INCENTIVE_REWARD;
    public static final d PROMOS;
    public static final d PROMPTS;
    public static final d TODO_TILE;
    public static final d WIDE_SUGGESTED_TILE;

    static {
        d dVar = new d("TODO_TILE", 0);
        TODO_TILE = dVar;
        d dVar2 = new d("PROMPTS", 1);
        PROMPTS = dVar2;
        d dVar3 = new d("WIDE_SUGGESTED_TILE", 2);
        WIDE_SUGGESTED_TILE = dVar3;
        d dVar4 = new d("INCENTIVE_REWARD", 3);
        INCENTIVE_REWARD = dVar4;
        d dVar5 = new d("PROMOS", 4);
        PROMOS = dVar5;
        d dVar6 = new d("CHECKLIST", 5);
        CHECKLIST = dVar6;
        d dVar7 = new d("AIR_SUGGESTION", 6);
        AIR_SUGGESTION = dVar7;
        d dVar8 = new d("CROSS_SELL_TILES", 7);
        CROSS_SELL_TILES = dVar8;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
        Companion = new c();
        $cachedSerializer$delegate = yhm.j.c(yhm.k.PUBLICATION, new th9.k(16));
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
