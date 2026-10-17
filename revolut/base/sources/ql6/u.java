package ql6;

import com.revolut.domain.models.openbanking.ConsentType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f247219a;

    static {
        int[] iArr = new int[ConsentType.values().length];
        try {
            iArr[ConsentType.ACCOUNTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ConsentType.AU_READ_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ConsentType.PAYMENTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ConsentType.FUND_CONFIRMATIONS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f247219a = iArr;
    }
}
