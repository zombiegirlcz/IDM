package ba6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j AVAILABLE;
    public static final j NOT_AVAILABLE;
    public static final j NOT_AVAILABLE_IN_USER_COUNTRY;

    static {
        j jVar = new j("AVAILABLE", 0);
        AVAILABLE = jVar;
        j jVar2 = new j("NOT_AVAILABLE", 1);
        NOT_AVAILABLE = jVar2;
        j jVar3 = new j("NOT_AVAILABLE_IN_USER_COUNTRY", 2);
        NOT_AVAILABLE_IN_USER_COUNTRY = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
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
