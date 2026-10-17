package ta;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e EDITABLE;
    public static final e IN_REVIEW;
    public static final e MISSING_INFO;
    public static final e NOT_EDITABLE;

    static {
        e eVar = new e("EDITABLE", 0);
        EDITABLE = eVar;
        e eVar2 = new e("IN_REVIEW", 1);
        IN_REVIEW = eVar2;
        e eVar3 = new e("MISSING_INFO", 2);
        MISSING_INFO = eVar3;
        e eVar4 = new e("NOT_EDITABLE", 3);
        NOT_EDITABLE = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
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
