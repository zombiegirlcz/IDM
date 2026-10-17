package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class jc {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ jc[] $VALUES;
    public static final jc LEFT;
    public static final jc RIGHT;

    static {
        jc jcVar = new jc("LEFT", 0);
        LEFT = jcVar;
        jc jcVar2 = new jc("RIGHT", 1);
        RIGHT = jcVar2;
        jc[] jcVarArr = {jcVar, jcVar2};
        $VALUES = jcVarArr;
        $ENTRIES = vc.s.n(jcVarArr);
    }

    public static jc valueOf(String str) {
        return (jc) Enum.valueOf(jc.class, str);
    }

    public static jc[] values() {
        return (jc[]) $VALUES.clone();
    }
}
