package hma;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j CONFIRMATION;
    public static final j FAQ;
    public static final j JOINT;
    public static final j UNSUPPORTED;

    static {
        j jVar = new j("FAQ", 0);
        FAQ = jVar;
        j jVar2 = new j("CONFIRMATION", 1);
        CONFIRMATION = jVar2;
        j jVar3 = new j("UNSUPPORTED", 2);
        UNSUPPORTED = jVar3;
        j jVar4 = new j("JOINT", 3);
        JOINT = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
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
