package rz3;

import ft3.j1;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f258505a;

    static {
        int[] iArr = new int[j1.values().length];
        try {
            iArr[j1.FTC_FORBEARANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j1.CC_FORBEARANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j1.FAMILY_CREDIT_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[j1.NON_EMBEDDED_CREDIT_INSURANCE_CC.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f258505a = iArr;
    }
}
