package k89;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b COMPLETED;
    public static final b FAILED;
    public static final b INVALID_OTP;
    public static final b PENDING_OTP;
    public static final b VALIDATING_SIGNATURE;
    public static final b WAITING_FOR_CODE;

    static {
        b bVar = new b("COMPLETED", 0);
        COMPLETED = bVar;
        b bVar2 = new b("INVALID_OTP", 1);
        INVALID_OTP = bVar2;
        b bVar3 = new b("FAILED", 2);
        FAILED = bVar3;
        b bVar4 = new b("PENDING_OTP", 3);
        PENDING_OTP = bVar4;
        b bVar5 = new b("VALIDATING_SIGNATURE", 4);
        VALIDATING_SIGNATURE = bVar5;
        b bVar6 = new b("WAITING_FOR_CODE", 5);
        WAITING_FOR_CODE = bVar6;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
