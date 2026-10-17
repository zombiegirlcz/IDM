package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AUTHENTICATION_CHALLENGE;
    public static final a AUTHENTICATION_VERIFIED;
    public static final a AUTHORISATION_PASSED;
    public static final a AUTHORISATION_STARTED;
    public static final a AUTHORISED;
    public static final a CANCELLATION_STARTED;
    public static final a CANCELLED;
    public static final a CANCELLING;
    public static final a CAPTURED;
    public static final a CAPTURE_STARTED;
    public static final a COMPLETED;
    public static final a COMPLETING;
    public static final a DECLINED;
    public static final a DECLINING;
    public static final a FAILED;
    public static final a FAILING;
    public static final a PENDING;
    public static final a REFUND_STARTED;
    public static final a REFUND_VALIDATED;
    public static final a SOFT_DECLINED;

    static {
        a aVar = new a("AUTHENTICATION_CHALLENGE", 0);
        AUTHENTICATION_CHALLENGE = aVar;
        a aVar2 = new a("AUTHENTICATION_VERIFIED", 1);
        AUTHENTICATION_VERIFIED = aVar2;
        a aVar3 = new a("AUTHORISATION_PASSED", 2);
        AUTHORISATION_PASSED = aVar3;
        a aVar4 = new a("AUTHORISATION_STARTED", 3);
        AUTHORISATION_STARTED = aVar4;
        a aVar5 = new a("AUTHORISED", 4);
        AUTHORISED = aVar5;
        a aVar6 = new a("CANCELLATION_STARTED", 5);
        CANCELLATION_STARTED = aVar6;
        a aVar7 = new a("CANCELLED", 6);
        CANCELLED = aVar7;
        a aVar8 = new a("CANCELLING", 7);
        CANCELLING = aVar8;
        a aVar9 = new a("CAPTURED", 8);
        CAPTURED = aVar9;
        a aVar10 = new a("CAPTURE_STARTED", 9);
        CAPTURE_STARTED = aVar10;
        a aVar11 = new a("COMPLETED", 10);
        COMPLETED = aVar11;
        a aVar12 = new a("COMPLETING", 11);
        COMPLETING = aVar12;
        a aVar13 = new a("DECLINED", 12);
        DECLINED = aVar13;
        a aVar14 = new a("DECLINING", 13);
        DECLINING = aVar14;
        a aVar15 = new a("FAILED", 14);
        FAILED = aVar15;
        a aVar16 = new a("FAILING", 15);
        FAILING = aVar16;
        a aVar17 = new a("PENDING", 16);
        PENDING = aVar17;
        a aVar18 = new a("REFUND_STARTED", 17);
        REFUND_STARTED = aVar18;
        a aVar19 = new a("REFUND_VALIDATED", 18);
        REFUND_VALIDATED = aVar19;
        a aVar20 = new a("SOFT_DECLINED", 19);
        SOFT_DECLINED = aVar20;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
