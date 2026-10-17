package uc3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CREDIT;
    public static final d GIFTS;
    public static final d METAL;
    public static final d PLAN;
    public static final d PRO;
    public static final d REWARDS;
    public static final d SHOPPING;
    public static final d SHOPS;
    public static final d STAYS;
    public static final d TRAVEL;
    public static final d UNKNOWN;

    static {
        d dVar = new d("METAL", 0);
        METAL = dVar;
        d dVar2 = new d("PLAN", 1);
        PLAN = dVar2;
        d dVar3 = new d("REWARDS", 2);
        REWARDS = dVar3;
        d dVar4 = new d("STAYS", 3);
        STAYS = dVar4;
        d dVar5 = new d("CREDIT", 4);
        CREDIT = dVar5;
        d dVar6 = new d("PRO", 5);
        PRO = dVar6;
        d dVar7 = new d("GIFTS", 6);
        GIFTS = dVar7;
        d dVar8 = new d("SHOPS", 7);
        SHOPS = dVar8;
        d dVar9 = new d("SHOPPING", 8);
        SHOPPING = dVar9;
        d dVar10 = new d("TRAVEL", 9);
        TRAVEL = dVar10;
        d dVar11 = new d("UNKNOWN", 10);
        UNKNOWN = dVar11;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11};
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
