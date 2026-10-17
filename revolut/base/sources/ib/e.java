package ib;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CRITICAL;
    public static final e DEBUG;
    public static final e ERROR;
    public static final e INFO;
    public static final e WARN;

    static {
        e eVar = new e("DEBUG", 0);
        DEBUG = eVar;
        e eVar2 = new e("INFO", 1);
        INFO = eVar2;
        e eVar3 = new e("WARN", 2);
        WARN = eVar3;
        e eVar4 = new e("CRITICAL", 3);
        CRITICAL = eVar4;
        e eVar5 = new e("ERROR", 4);
        ERROR = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
