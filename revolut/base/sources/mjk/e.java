package mjk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e IMAGE;
    public static final e SMALL_VIDEO;
    public static final e TEXT;
    public static final e UNKNOWN;
    public static final e VIDEO;

    static {
        e eVar = new e("TEXT", 0);
        TEXT = eVar;
        e eVar2 = new e("IMAGE", 1);
        IMAGE = eVar2;
        e eVar3 = new e("VIDEO", 2);
        VIDEO = eVar3;
        e eVar4 = new e("SMALL_VIDEO", 3);
        SMALL_VIDEO = eVar4;
        e eVar5 = new e("UNKNOWN", 4);
        UNKNOWN = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
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
