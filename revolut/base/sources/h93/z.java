package h93;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z COPYRIGHT;
    public static final z HARMING;
    public static final z NOT_LATIN;
    public static final z OFFENSIVE;
    public static final z POLITICAL;
    public static final z PROFANITY;
    public static final z TRADEMARK;

    static {
        z zVar = new z("PROFANITY", 0);
        PROFANITY = zVar;
        z zVar2 = new z("OFFENSIVE", 1);
        OFFENSIVE = zVar2;
        z zVar3 = new z("POLITICAL", 2);
        POLITICAL = zVar3;
        z zVar4 = new z("TRADEMARK", 3);
        TRADEMARK = zVar4;
        z zVar5 = new z("COPYRIGHT", 4);
        COPYRIGHT = zVar5;
        z zVar6 = new z("NOT_LATIN", 5);
        NOT_LATIN = zVar6;
        z zVar7 = new z("HARMING", 6);
        HARMING = zVar7;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7};
        $VALUES = zVarArr;
        $ENTRIES = vc.s.n(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
