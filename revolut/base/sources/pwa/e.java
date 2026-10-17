package pwa;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e DONE;
    public static final e EXPIRED;
    public static final e INELIGIBLE;
    public static final e IN_PROGRESS;
    public static final e NOT_STARTED;

    static {
        e eVar = new e("NOT_STARTED", 0);
        NOT_STARTED = eVar;
        e eVar2 = new e("IN_PROGRESS", 1);
        IN_PROGRESS = eVar2;
        e eVar3 = new e("DONE", 2);
        DONE = eVar3;
        e eVar4 = new e("EXPIRED", 3);
        EXPIRED = eVar4;
        e eVar5 = new e("INELIGIBLE", 4);
        INELIGIBLE = eVar5;
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
