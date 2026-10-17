package zyc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ACTION_REQUIRED;
    public static final e IN_REVIEW;
    public static final e SUBMITTED;
    public static final e UNKNOWN;
    public static final e VERIFIED;

    static {
        e eVar = new e("SUBMITTED", 0);
        SUBMITTED = eVar;
        e eVar2 = new e("IN_REVIEW", 1);
        IN_REVIEW = eVar2;
        e eVar3 = new e("VERIFIED", 2);
        VERIFIED = eVar3;
        e eVar4 = new e("ACTION_REQUIRED", 3);
        ACTION_REQUIRED = eVar4;
        e eVar5 = new e("UNKNOWN", 4);
        UNKNOWN = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
