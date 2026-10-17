package gzc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v APPROVED;
    public static final v NONE;
    public static final v REQUESTED;
    public static final v REQUESTED_UNDER_REVIEW;
    public static final v REQUIRED;
    public static final v REQUIRED_UNDER_REVIEW;

    static {
        v vVar = new v("NONE", 0);
        NONE = vVar;
        v vVar2 = new v("APPROVED", 1);
        APPROVED = vVar2;
        v vVar3 = new v("REQUESTED", 2);
        REQUESTED = vVar3;
        v vVar4 = new v("REQUIRED", 3);
        REQUIRED = vVar4;
        v vVar5 = new v("REQUESTED_UNDER_REVIEW", 4);
        REQUESTED_UNDER_REVIEW = vVar5;
        v vVar6 = new v("REQUIRED_UNDER_REVIEW", 5);
        REQUIRED_UNDER_REVIEW = vVar6;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5, vVar6};
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
