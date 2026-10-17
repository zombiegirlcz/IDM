package v89;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a PASSCODE_CONTAINS_CURRENT_DATE_ERROR_CODE;
    public static final a PASSCODE_CONTAINS_INDIVIDUAL_CREATED_DATE_ERROR_CODE;
    public static final a PASSCODE_IS_NOT_STRONG_ERROR_CODE;
    private final int errorCode;

    static {
        a aVar = new a("PASSCODE_CONTAINS_CURRENT_DATE_ERROR_CODE", 0, 4004);
        PASSCODE_CONTAINS_CURRENT_DATE_ERROR_CODE = aVar;
        a aVar2 = new a("PASSCODE_CONTAINS_INDIVIDUAL_CREATED_DATE_ERROR_CODE", 1, 4005);
        PASSCODE_CONTAINS_INDIVIDUAL_CREATED_DATE_ERROR_CODE = aVar2;
        a aVar3 = new a("PASSCODE_IS_NOT_STRONG_ERROR_CODE", 2, 4006);
        PASSCODE_IS_NOT_STRONG_ERROR_CODE = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, int i2) {
        this.errorCode = i2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int a() {
        return this.errorCode;
    }
}
