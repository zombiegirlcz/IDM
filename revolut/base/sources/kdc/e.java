package kdc;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.g;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f182868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f182869b;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.FLAGSTONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.CLEARBANK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.REVOLUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f182868a = iArr;
        int[] iArr2 = new int[n6c.a.values().length];
        try {
            iArr2[n6c.a.REVOLUT_LTD.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[n6c.a.REVOLUT_BANK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[n6c.a.EEA_BUAB.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[n6c.a.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f182869b = iArr2;
    }
}
