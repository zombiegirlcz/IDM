package qr6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b AUTHENTICATION_CHALLENGE;
    public static final b AUTHENTICATION_FAILED;
    public static final b AUTHENTICATION_VERIFIED;
    public static final b AUTHORISATION_PASSED;
    public static final b AUTHORISED;
    public static final b CANCELLED;
    public static final b CAPTURED;
    public static final b CREATED;
    public static final b DECLINED;
    public static final b FAILED;
    public static final b FINISHED;
    public static final b REFUNDED;
    public static final b REFUNDED_AMOUNT_CHANGED;
    public static final b REFUND_STARTED;

    static {
        b bVar = new b("FAILED", 0);
        FAILED = bVar;
        b bVar2 = new b("CREATED", 1);
        CREATED = bVar2;
        b bVar3 = new b("AUTHORISED", 2);
        AUTHORISED = bVar3;
        b bVar4 = new b("CAPTURED", 3);
        CAPTURED = bVar4;
        b bVar5 = new b("DECLINED", 4);
        DECLINED = bVar5;
        b bVar6 = new b("CANCELLED", 5);
        CANCELLED = bVar6;
        b bVar7 = new b("FINISHED", 6);
        FINISHED = bVar7;
        b bVar8 = new b("REFUNDED_AMOUNT_CHANGED", 7);
        REFUNDED_AMOUNT_CHANGED = bVar8;
        b bVar9 = new b("REFUND_STARTED", 8);
        REFUND_STARTED = bVar9;
        b bVar10 = new b("REFUNDED", 9);
        REFUNDED = bVar10;
        b bVar11 = new b("AUTHENTICATION_VERIFIED", 10);
        AUTHENTICATION_VERIFIED = bVar11;
        b bVar12 = new b("AUTHENTICATION_FAILED", 11);
        AUTHENTICATION_FAILED = bVar12;
        b bVar13 = new b("AUTHENTICATION_CHALLENGE", 12);
        AUTHENTICATION_CHALLENGE = bVar13;
        b bVar14 = new b("AUTHORISATION_PASSED", 13);
        AUTHORISATION_PASSED = bVar14;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
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
