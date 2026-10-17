package q6c;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n AUTHENTICATION_CHALLENGE;
    public static final n AUTHENTICATION_VERIFIED;
    public static final n AUTHORISATION_PASSED;
    public static final n AUTHORISATION_STARTED;
    public static final n AUTHORISED;
    public static final n CANCELLATION_STARTED;
    public static final n CANCELLED;
    public static final n CANCELLING;
    public static final n CAPTURED;
    public static final n CAPTURE_STARTED;
    public static final n COMPLETED;
    public static final n COMPLETING;
    public static final n DECLINED;
    public static final n DECLINING;
    public static final n FAILED;
    public static final n FAILING;
    public static final n PENDING;
    public static final n REFUND_STARTED;
    public static final n REFUND_VALIDATED;
    public static final n SOFT_DECLINED;
    public static final n UNKNOWN;

    static {
        n nVar = new n("PENDING", 0);
        PENDING = nVar;
        n nVar2 = new n("AUTHENTICATION_CHALLENGE", 1);
        AUTHENTICATION_CHALLENGE = nVar2;
        n nVar3 = new n("AUTHENTICATION_VERIFIED", 2);
        AUTHENTICATION_VERIFIED = nVar3;
        n nVar4 = new n("SOFT_DECLINED", 3);
        SOFT_DECLINED = nVar4;
        n nVar5 = new n("AUTHORISATION_STARTED", 4);
        AUTHORISATION_STARTED = nVar5;
        n nVar6 = new n("AUTHORISATION_PASSED", 5);
        AUTHORISATION_PASSED = nVar6;
        n nVar7 = new n("AUTHORISED", 6);
        AUTHORISED = nVar7;
        n nVar8 = new n("CAPTURE_STARTED", 7);
        CAPTURE_STARTED = nVar8;
        n nVar9 = new n("CAPTURED", 8);
        CAPTURED = nVar9;
        n nVar10 = new n("REFUND_VALIDATED", 9);
        REFUND_VALIDATED = nVar10;
        n nVar11 = new n("REFUND_STARTED", 10);
        REFUND_STARTED = nVar11;
        n nVar12 = new n("CANCELLATION_STARTED", 11);
        CANCELLATION_STARTED = nVar12;
        n nVar13 = new n("DECLINING", 12);
        DECLINING = nVar13;
        n nVar14 = new n("COMPLETING", 13);
        COMPLETING = nVar14;
        n nVar15 = new n("CANCELLING", 14);
        CANCELLING = nVar15;
        n nVar16 = new n("FAILING", 15);
        FAILING = nVar16;
        n nVar17 = new n("COMPLETED", 16);
        COMPLETED = nVar17;
        n nVar18 = new n("DECLINED", 17);
        DECLINED = nVar18;
        n nVar19 = new n("CANCELLED", 18);
        CANCELLED = nVar19;
        n nVar20 = new n("FAILED", 19);
        FAILED = nVar20;
        n nVar21 = new n("UNKNOWN", 20);
        UNKNOWN = nVar21;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12, nVar13, nVar14, nVar15, nVar16, nVar17, nVar18, nVar19, nVar20, nVar21};
        $VALUES = nVarArr;
        $ENTRIES = s.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
