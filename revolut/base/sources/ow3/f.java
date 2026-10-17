package ow3;

import it3.k;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f230302a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.INVITATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.CC_SECURED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.CC_RETAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k.CC_SECURED_RETAIL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k.CC_CLI_USER_INITIATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[k.CC_BUILDER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f230302a = iArr;
    }
}
