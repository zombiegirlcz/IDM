package d9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class m {
    private static final /* synthetic */ m[] $VALUES;
    public static final m ACCEPT_CASE_INSENSITIVE_PROPERTIES;
    public static final m ACCEPT_CASE_INSENSITIVE_VALUES;
    public static final m ACCEPT_SINGLE_VALUE_AS_ARRAY;
    public static final m ADJUST_DATES_TO_CONTEXT_TIME_ZONE;
    public static final m WRITE_DATES_WITH_ZONE_ID;
    public static final m WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS;
    public static final m WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED;
    public static final m WRITE_SORTED_MAP_ENTRIES;

    static {
        m mVar = new m("ACCEPT_SINGLE_VALUE_AS_ARRAY", 0);
        ACCEPT_SINGLE_VALUE_AS_ARRAY = mVar;
        m mVar2 = new m("ACCEPT_CASE_INSENSITIVE_PROPERTIES", 1);
        ACCEPT_CASE_INSENSITIVE_PROPERTIES = mVar2;
        m mVar3 = new m("ACCEPT_CASE_INSENSITIVE_VALUES", 2);
        ACCEPT_CASE_INSENSITIVE_VALUES = mVar3;
        m mVar4 = new m("WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS", 3);
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS = mVar4;
        m mVar5 = new m("WRITE_DATES_WITH_ZONE_ID", 4);
        WRITE_DATES_WITH_ZONE_ID = mVar5;
        m mVar6 = new m("WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED", 5);
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED = mVar6;
        m mVar7 = new m("WRITE_SORTED_MAP_ENTRIES", 6);
        WRITE_SORTED_MAP_ENTRIES = mVar7;
        m mVar8 = new m("ADJUST_DATES_TO_CONTEXT_TIME_ZONE", 7);
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE = mVar8;
        $VALUES = new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
