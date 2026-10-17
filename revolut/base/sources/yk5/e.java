package yk5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e AVAILABLE_FOR_RETURN;
    public static final e COMPLETED;
    public static final e FAILED;
    public static final e FROZEN;
    public static final e INVESTIGATION;
    public static final e PENDING;
    public static final e RETURNED;
    public static final e RETURNING;
    public static final e SCREENING;
    public static final e UNKNOWN;
    public static final e VERIFICATION;

    static {
        e eVar = new e("PENDING", 0);
        PENDING = eVar;
        e eVar2 = new e("AVAILABLE_FOR_RETURN", 1);
        AVAILABLE_FOR_RETURN = eVar2;
        e eVar3 = new e("RETURNING", 2);
        RETURNING = eVar3;
        e eVar4 = new e("INVESTIGATION", 3);
        INVESTIGATION = eVar4;
        e eVar5 = new e("SCREENING", 4);
        SCREENING = eVar5;
        e eVar6 = new e("FROZEN", 5);
        FROZEN = eVar6;
        e eVar7 = new e("RETURNED", 6);
        RETURNED = eVar7;
        e eVar8 = new e("COMPLETED", 7);
        COMPLETED = eVar8;
        e eVar9 = new e("FAILED", 8);
        FAILED = eVar9;
        e eVar10 = new e("VERIFICATION", 9);
        VERIFICATION = eVar10;
        e eVar11 = new e("UNKNOWN", 10);
        UNKNOWN = eVar11;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11};
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
