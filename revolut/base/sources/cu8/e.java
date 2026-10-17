package cu8;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e FAILED;
    public static final e FAILED_ADDRESS;
    public static final e NOT_VERIFIED;
    public static final e PENDING;

    static {
        e eVar = new e("FAILED", 0);
        FAILED = eVar;
        e eVar2 = new e("PENDING", 1);
        PENDING = eVar2;
        e eVar3 = new e("FAILED_ADDRESS", 2);
        FAILED_ADDRESS = eVar3;
        e eVar4 = new e("NOT_VERIFIED", 3);
        NOT_VERIFIED = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
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
