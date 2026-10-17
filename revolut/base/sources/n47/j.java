package n47;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j ALL_TIME;
    public static final j CUSTOM;
    public static final j MONTH;
    public static final j TAX_YEAR;
    private final int priority;

    static {
        j jVar = new j("ALL_TIME", 0, 1);
        ALL_TIME = jVar;
        j jVar2 = new j("MONTH", 1, 2);
        MONTH = jVar2;
        j jVar3 = new j("TAX_YEAR", 2, 3);
        TAX_YEAR = jVar3;
        j jVar4 = new j("CUSTOM", 3, 4);
        CUSTOM = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
    }

    public j(String str, int i, int i2) {
        this.priority = i2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final int b() {
        return this.priority;
    }
}
