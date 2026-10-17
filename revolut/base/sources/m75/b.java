package m75;

import q35.u;
import q35.v;
import q35.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f203318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f203319c;

    static {
        int[] iArr = new int[u.values().length];
        try {
            iArr[u.Npo.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u.NpoCash.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u.Cpo.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u.Internal.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f203317a = iArr;
        int[] iArr2 = new int[v.values().length];
        try {
            iArr2[v.Fallback.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[v.Pending.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[v.Completed.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[v.Failed.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f203318b = iArr2;
        int[] iArr3 = new int[w.values().length];
        try {
            iArr3[w.PersonalLoan.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[w.SecuredLoan.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[w.ConsumerLoan.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[w.Leasing.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[w.RefurbishmentLoan.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[w.CarLoan.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[w.Mortgage.ordinal()] = 7;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[w.CreditCard.ordinal()] = 8;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[w.CreditLine.ordinal()] = 9;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[w.Overdraft.ordinal()] = 10;
        } catch (NoSuchFieldError unused18) {
        }
        f203319c = iArr3;
    }
}
