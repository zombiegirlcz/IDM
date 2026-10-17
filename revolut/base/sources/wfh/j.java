package wfh;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j ASSETS;
    public static final j REGION;
    public static final j SECTOR;
    public static final j STRATEGY;

    static {
        j jVar = new j("ASSETS", 0);
        ASSETS = jVar;
        j jVar2 = new j("STRATEGY", 1);
        STRATEGY = jVar2;
        j jVar3 = new j("SECTOR", 2);
        SECTOR = jVar3;
        j jVar4 = new j("REGION", 3);
        REGION = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
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
}
