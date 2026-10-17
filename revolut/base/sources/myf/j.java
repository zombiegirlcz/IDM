package myf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j EQUIPMENT;
    public static final j FEES_AND_TAXES;
    public static final j FOOD_AND_DRINK;
    public static final j OTHER;
    public static final j SOUVENIRS;
    public static final j TRANSPORT_AMENITIES;

    static {
        j jVar = new j("EQUIPMENT", 0);
        EQUIPMENT = jVar;
        j jVar2 = new j("FOOD_AND_DRINK", 1);
        FOOD_AND_DRINK = jVar2;
        j jVar3 = new j("TRANSPORT_AMENITIES", 2);
        TRANSPORT_AMENITIES = jVar3;
        j jVar4 = new j("FEES_AND_TAXES", 3);
        FEES_AND_TAXES = jVar4;
        j jVar5 = new j("SOUVENIRS", 4);
        SOUVENIRS = jVar5;
        j jVar6 = new j("OTHER", 5);
        OTHER = jVar6;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
