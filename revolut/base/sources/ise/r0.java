package ise;

import com.revolut.domain.models.transactions.CardholderType;
import com.revolut.domain.models.transactions.DeclineReasonSeverity;
import com.revolut.domain.models.transactions.PaymentSystem;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f168235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f168236c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[PaymentSystem.values().length];
        try {
            iArr[PaymentSystem.MASTERCARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentSystem.VISA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f168234a = iArr;
        int[] iArr2 = new int[CardholderType.values().length];
        try {
            iArr2[CardholderType.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[CardholderType.JUNIOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f168235b = iArr2;
        int[] iArr3 = new int[DeclineReasonSeverity.values().length];
        try {
            iArr3[DeclineReasonSeverity.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[DeclineReasonSeverity.CRITICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f168236c = iArr3;
        int[] iArr4 = new int[k1j.a.values().length];
        try {
            iArr4[k1j.a.JOINT_VAULTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr4[k1j.a.JOINT_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[k1j.a.JOINT_SAVINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[k1j.a.PRO.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
    }
}
