package xl7;

import kl7.l1;
import kl7.m1;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f306952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f306953b;

    static {
        int[] iArr = new int[m1.values().length];
        try {
            iArr[m1.CANCELLING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f306952a = iArr;
        int[] iArr2 = new int[l1.values().length];
        try {
            iArr2[l1.POLICY_DOCUMENTS_REJECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[l1.POLICY_DOCUMENTS_NOT_PROVIDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[l1.INSUFFICIENT_BALANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[l1.TELEMATICS_DEVICE_NOT_INSTALLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[l1.TELEMATICS_DEVICE_UNPLUGGED.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[l1.NONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        f306953b = iArr2;
    }
}
