package e7l;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e INSTAGRAM;
    public static final e OTHER;
    public static final e TWITTER;

    static {
        e eVar = new e("INSTAGRAM", 0);
        INSTAGRAM = eVar;
        e eVar2 = new e("TWITTER", 1);
        TWITTER = eVar2;
        e eVar3 = new e("OTHER", 2);
        OTHER = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
