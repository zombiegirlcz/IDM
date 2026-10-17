package mb5;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j ACTIVE;
    public static final j CANCELED;
    public static final j DISABLED;
    public static final j FAILED;
    public static final j PENDING;

    static {
        j jVar = new j("ACTIVE", 0);
        ACTIVE = jVar;
        j jVar2 = new j("PENDING", 1);
        PENDING = jVar2;
        j jVar3 = new j("FAILED", 2);
        FAILED = jVar3;
        j jVar4 = new j("CANCELED", 3);
        CANCELED = jVar4;
        j jVar5 = new j("DISABLED", 4);
        DISABLED = jVar5;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5};
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
