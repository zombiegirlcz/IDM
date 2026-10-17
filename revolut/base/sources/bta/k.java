package bta;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k ACTIVE;
    public static final k DRAW_LOSER;
    public static final k DRAW_WINNER;
    public static final k IN_DRAW;
    public static final k MISSED_DRAW;
    public static final k NOT_AVAILABLE;
    public static final k REWARD_CLAIMED;
    public static final k SUBSCRIBED;
    public static final k UNKNOWN;
    public static final k UNREGISTERED;

    static {
        k kVar = new k("UNREGISTERED", 0);
        UNREGISTERED = kVar;
        k kVar2 = new k("ACTIVE", 1);
        ACTIVE = kVar2;
        k kVar3 = new k("IN_DRAW", 2);
        IN_DRAW = kVar3;
        k kVar4 = new k("MISSED_DRAW", 3);
        MISSED_DRAW = kVar4;
        k kVar5 = new k("DRAW_WINNER", 4);
        DRAW_WINNER = kVar5;
        k kVar6 = new k("DRAW_LOSER", 5);
        DRAW_LOSER = kVar6;
        k kVar7 = new k("SUBSCRIBED", 6);
        SUBSCRIBED = kVar7;
        k kVar8 = new k("REWARD_CLAIMED", 7);
        REWARD_CLAIMED = kVar8;
        k kVar9 = new k("NOT_AVAILABLE", 8);
        NOT_AVAILABLE = kVar9;
        k kVar10 = new k("UNKNOWN", 9);
        UNKNOWN = kVar10;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
