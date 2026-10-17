package b37;

import ds6.j;
import ds6.o;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f12012b;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.INCOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.SOCIAL_SECURITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.VAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f12011a = iArr;
        int[] iArr2 = new int[o.values().length];
        try {
            iArr2[o.EXPORT_TRANSACTIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[o.GO_TO_TAX_AUTHORITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[o.MAKE_PAYMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f12012b = iArr2;
    }
}
