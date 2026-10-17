package dej;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v ERROR;
    public static final v INFO;
    public static final v NOTICE;
    public static final v UNKNOWN;
    public static final v WARNING;

    static {
        v vVar = new v("ERROR", 0);
        ERROR = vVar;
        v vVar2 = new v("WARNING", 1);
        WARNING = vVar2;
        v vVar3 = new v("INFO", 2);
        INFO = vVar3;
        v vVar4 = new v("NOTICE", 3);
        NOTICE = vVar4;
        v vVar5 = new v("UNKNOWN", 4);
        UNKNOWN = vVar5;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5};
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
