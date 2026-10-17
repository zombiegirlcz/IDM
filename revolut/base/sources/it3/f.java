package it3;

import java.io.Serializable;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class f implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f AGREEMENT_SIGNED;
    public static final f ANSWERS_RECEIVED;
    public static final f APPLICATION_REJECTED;
    public static final f EXPIRED;
    public static final f FORBEARANCE_ACTIVATED;
    public static final f INCOME_CHECK_FAILED;
    public static final f INCOME_CHECK_PASSED;
    public static final f INCOME_CHECK_SKIPPED;
    public static final f INCOME_FETCH_BLOCKED;
    public static final f INCOME_FETCH_FAILED;
    public static final f INCOME_FETCH_FINISHED;
    public static final f INCOME_FETCH_READY;
    public static final f INCOME_FETCH_STARTED;
    public static final f LOAN_CREATED;
    public static final f NOT_AVAILABLE;
    public static final f PASSED_TO_SUPPORT;
    public static final f READY_TO_SIGN_AGREEMENT;
    public static final f RISK_B_PASSED;
    public static final f STARTED;
    public static final f UNKNOWN;
    public static final f VALIDATION_PASSED;

    static {
        f fVar = new f("ANSWERS_RECEIVED", 0);
        ANSWERS_RECEIVED = fVar;
        f fVar2 = new f("INCOME_FETCH_READY", 1);
        INCOME_FETCH_READY = fVar2;
        f fVar3 = new f("INCOME_FETCH_STARTED", 2);
        INCOME_FETCH_STARTED = fVar3;
        f fVar4 = new f("INCOME_FETCH_FINISHED", 3);
        INCOME_FETCH_FINISHED = fVar4;
        f fVar5 = new f("INCOME_FETCH_FAILED", 4);
        INCOME_FETCH_FAILED = fVar5;
        f fVar6 = new f("INCOME_FETCH_BLOCKED", 5);
        INCOME_FETCH_BLOCKED = fVar6;
        f fVar7 = new f("INCOME_CHECK_PASSED", 6);
        INCOME_CHECK_PASSED = fVar7;
        f fVar8 = new f("INCOME_CHECK_FAILED", 7);
        INCOME_CHECK_FAILED = fVar8;
        f fVar9 = new f("INCOME_CHECK_SKIPPED", 8);
        INCOME_CHECK_SKIPPED = fVar9;
        f fVar10 = new f("RISK_B_PASSED", 9);
        RISK_B_PASSED = fVar10;
        f fVar11 = new f("NOT_AVAILABLE", 10);
        NOT_AVAILABLE = fVar11;
        f fVar12 = new f("AGREEMENT_SIGNED", 11);
        AGREEMENT_SIGNED = fVar12;
        f fVar13 = new f("APPLICATION_REJECTED", 12);
        APPLICATION_REJECTED = fVar13;
        f fVar14 = new f("EXPIRED", 13);
        EXPIRED = fVar14;
        f fVar15 = new f("FORBEARANCE_ACTIVATED", 14);
        FORBEARANCE_ACTIVATED = fVar15;
        f fVar16 = new f("STARTED", 15);
        STARTED = fVar16;
        f fVar17 = new f("READY_TO_SIGN_AGREEMENT", 16);
        READY_TO_SIGN_AGREEMENT = fVar17;
        f fVar18 = new f("LOAN_CREATED", 17);
        LOAN_CREATED = fVar18;
        f fVar19 = new f("VALIDATION_PASSED", 18);
        VALIDATION_PASSED = fVar19;
        f fVar20 = new f("PASSED_TO_SUPPORT", 19);
        PASSED_TO_SUPPORT = fVar20;
        f fVar21 = new f("UNKNOWN", 20);
        UNKNOWN = fVar21;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16, fVar17, fVar18, fVar19, fVar20, fVar21};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
