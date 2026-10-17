package xl2;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e SUCCESS;
    public static final e UPLOADING;
    public static final e UPLOAD_ERROR;
    public static final e VALIDATING;
    public static final e VALIDATION_FAILED;

    static {
        e eVar = new e("UPLOADING", 0);
        UPLOADING = eVar;
        e eVar2 = new e("UPLOAD_ERROR", 1);
        UPLOAD_ERROR = eVar2;
        e eVar3 = new e("VALIDATING", 2);
        VALIDATING = eVar3;
        e eVar4 = new e("VALIDATION_FAILED", 3);
        VALIDATION_FAILED = eVar4;
        e eVar5 = new e("SUCCESS", 4);
        SUCCESS = eVar5;
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
