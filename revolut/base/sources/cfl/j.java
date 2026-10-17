package cfl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j PERSONAL;
    public static final j PERSONAL_JOINT;
    public static final j YOUTH;

    static {
        j jVar = new j("PERSONAL", 0);
        PERSONAL = jVar;
        j jVar2 = new j("PERSONAL_JOINT", 1);
        PERSONAL_JOINT = jVar2;
        j jVar3 = new j("YOUTH", 2);
        YOUTH = jVar3;
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
