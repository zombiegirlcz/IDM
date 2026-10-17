package dqi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j DRAGGING;
    public static final j IDLE;
    public static final j PROGRAMMATICALLY_STARTED;
    public static final j SETTLING;

    static {
        j jVar = new j("IDLE", 0);
        IDLE = jVar;
        j jVar2 = new j("DRAGGING", 1);
        DRAGGING = jVar2;
        j jVar3 = new j("SETTLING", 2);
        SETTLING = jVar3;
        j jVar4 = new j("PROGRAMMATICALLY_STARTED", 3);
        PROGRAMMATICALLY_STARTED = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
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
