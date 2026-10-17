package i89;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CAN_NOT_OPEN_ACCOUNT;
    public static final a CAN_NOT_OPEN_ACCOUNT_FOREIGN_APPLICANT;
    private final int errorCode;

    static {
        a aVar = new a("CAN_NOT_OPEN_ACCOUNT", 0, 9500);
        CAN_NOT_OPEN_ACCOUNT = aVar;
        a aVar2 = new a("CAN_NOT_OPEN_ACCOUNT_FOREIGN_APPLICANT", 1, 9506);
        CAN_NOT_OPEN_ACCOUNT_FOREIGN_APPLICANT = aVar2;
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
