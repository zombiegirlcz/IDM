package c2l;

import i2l.p;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20832a;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.LINK_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.VALIDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f20832a = iArr;
    }
}
