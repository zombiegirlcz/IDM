package tg7;

import kf7.e;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f271102a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.CLAIM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.REJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.SHARE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.GO_TO_ACCOUNT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f271102a = iArr;
    }
}
