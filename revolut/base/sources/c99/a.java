package c99;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a USER_UNDER_18_ELIGIBLE_FOR_SELF_SIGN_UP_ERROR_CODE;
    public static final a USER_UNDER_18_NOT_ELIGIBLE_FOR_SELF_SIGN_UP_ERROR_CODE;
    private final int errorCode;

    static {
        a aVar = new a("USER_UNDER_18_NOT_ELIGIBLE_FOR_SELF_SIGN_UP_ERROR_CODE", 0, 9503);
        USER_UNDER_18_NOT_ELIGIBLE_FOR_SELF_SIGN_UP_ERROR_CODE = aVar;
        a aVar2 = new a("USER_UNDER_18_ELIGIBLE_FOR_SELF_SIGN_UP_ERROR_CODE", 1, 9504);
        USER_UNDER_18_ELIGIBLE_FOR_SELF_SIGN_UP_ERROR_CODE = aVar2;
        a[] aVarArr = {aVar, aVar2};
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
