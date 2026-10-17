package lz0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e COMPLETED;
    public static final e IDLE;
    public static final e LOADING;
    public static final e PLAYING;
    public static final e STARTING;

    static {
        e eVar = new e("IDLE", 0);
        IDLE = eVar;
        e eVar2 = new e("STARTING", 1);
        STARTING = eVar2;
        e eVar3 = new e("LOADING", 2);
        LOADING = eVar3;
        e eVar4 = new e("PLAYING", 3);
        PLAYING = eVar4;
        e eVar5 = new e("COMPLETED", 4);
        COMPLETED = eVar5;
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
