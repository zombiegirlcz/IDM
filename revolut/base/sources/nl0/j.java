package nl0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j LEGACY;
    public static final j STANDARD;
    public static final j STANDARD_V2;

    static {
        j jVar = new j("LEGACY", 0);
        LEGACY = jVar;
        j jVar2 = new j("STANDARD", 1);
        STANDARD = jVar2;
        j jVar3 = new j("STANDARD_V2", 2);
        STANDARD_V2 = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
