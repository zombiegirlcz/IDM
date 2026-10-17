package f08;

import zw7.n;
import zw7.o;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f131010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f131011b;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.IPID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.POLICY_WORDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.STATEMENT_OF_INSURANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n.TERMS_CONDITIONS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[n.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f131010a = iArr;
        int[] iArr2 = new int[o.values().length];
        try {
            iArr2[o.RELATIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[o.ABSOLUTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[o.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f131011b = iArr2;
    }
}
