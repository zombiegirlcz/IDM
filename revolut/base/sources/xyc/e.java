package xyc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e UNDER_REVIEW;
    public static final e USER_ACTION_REQUIRED;
    public static final e VERIFICATION_COMPLETED;

    static {
        e eVar = new e("USER_ACTION_REQUIRED", 0);
        USER_ACTION_REQUIRED = eVar;
        e eVar2 = new e("UNDER_REVIEW", 1);
        UNDER_REVIEW = eVar2;
        e eVar3 = new e("VERIFICATION_COMPLETED", 2);
        VERIFICATION_COMPLETED = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
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
