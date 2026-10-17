package m75;

import q35.u;
import q35.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f203332b;

    static {
        int[] iArr = new int[w.values().length];
        try {
            iArr[w.PersonalLoan.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[w.SecuredLoan.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[w.ConsumerLoan.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[w.CreditLine.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[w.Leasing.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[w.Mortgage.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[w.RefurbishmentLoan.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[w.CarLoan.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[w.CreditCard.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[w.Overdraft.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f203331a = iArr;
        int[] iArr2 = new int[u.values().length];
        try {
            iArr2[u.Npo.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[u.NpoCash.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[u.Cpo.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[u.Internal.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        f203332b = iArr2;
    }
}
