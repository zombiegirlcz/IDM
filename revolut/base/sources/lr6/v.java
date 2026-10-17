package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v ACTIVE;
    public static final v DELETED;
    public static final v INACTIVE;
    public static final v LOCKED;

    static {
        v vVar = new v("ACTIVE", 0);
        ACTIVE = vVar;
        v vVar2 = new v("INACTIVE", 1);
        INACTIVE = vVar2;
        v vVar3 = new v("LOCKED", 2);
        LOCKED = vVar3;
        v vVar4 = new v("DELETED", 3);
        DELETED = vVar4;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4};
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
