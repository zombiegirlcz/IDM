package u2f;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k ACCOR_REWARD_POINTS;
    public static final k AVIOS;
    public static final k EUROSTAR_POINTS;
    public static final k HILTON_HONORS_POINTS;
    public static final k I_PREFER_POINTS;
    public static final k MILES;
    public static final k POINTS;
    public static final k UNKNOWN;

    static {
        k kVar = new k("MILES", 0);
        MILES = kVar;
        k kVar2 = new k("AVIOS", 1);
        AVIOS = kVar2;
        k kVar3 = new k("POINTS", 2);
        POINTS = kVar3;
        k kVar4 = new k("HILTON_HONORS_POINTS", 3);
        HILTON_HONORS_POINTS = kVar4;
        k kVar5 = new k("ACCOR_REWARD_POINTS", 4);
        ACCOR_REWARD_POINTS = kVar5;
        k kVar6 = new k("I_PREFER_POINTS", 5);
        I_PREFER_POINTS = kVar6;
        k kVar7 = new k("EUROSTAR_POINTS", 6);
        EUROSTAR_POINTS = kVar7;
        k kVar8 = new k("UNKNOWN", 7);
        UNKNOWN = kVar8;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8};
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
