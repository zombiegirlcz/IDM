package d9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class y {
    private static final /* synthetic */ y[] $VALUES;
    public static final y ALWAYS;
    public static final y CUSTOM;
    public static final y NON_ABSENT;
    public static final y NON_DEFAULT;
    public static final y NON_EMPTY;
    public static final y NON_NULL;
    public static final y USE_DEFAULTS;

    static {
        y yVar = new y("ALWAYS", 0);
        ALWAYS = yVar;
        y yVar2 = new y("NON_NULL", 1);
        NON_NULL = yVar2;
        y yVar3 = new y("NON_ABSENT", 2);
        NON_ABSENT = yVar3;
        y yVar4 = new y("NON_EMPTY", 3);
        NON_EMPTY = yVar4;
        y yVar5 = new y("NON_DEFAULT", 4);
        NON_DEFAULT = yVar5;
        y yVar6 = new y("CUSTOM", 5);
        CUSTOM = yVar6;
        y yVar7 = new y("USE_DEFAULTS", 6);
        USE_DEFAULTS = yVar7;
        $VALUES = new y[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
