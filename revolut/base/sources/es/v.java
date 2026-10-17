package es;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v COMPLETED;
    public static final v FAILED;
    public static final v TIMED_OUT;

    static {
        v vVar = new v("COMPLETED", 0);
        COMPLETED = vVar;
        v vVar2 = new v("TIMED_OUT", 1);
        TIMED_OUT = vVar2;
        v vVar3 = new v("FAILED", 2);
        FAILED = vVar3;
        v[] vVarArr = {vVar, vVar2, vVar3};
        $VALUES = vVarArr;
        $ENTRIES = vc.s.n(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
