package q35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v Completed;
    public static final v Failed;
    public static final v Fallback;
    public static final v Pending;

    static {
        v vVar = new v("Pending", 0);
        Pending = vVar;
        v vVar2 = new v("Completed", 1);
        Completed = vVar2;
        v vVar3 = new v("Fallback", 2);
        Fallback = vVar3;
        v vVar4 = new v("Failed", 3);
        Failed = vVar4;
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
