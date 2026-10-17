package e6b;

import r5b.i;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f122962a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.KEEP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.SUBSCRIBE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[i.SUBSCRIBE_WITH_BENEFITS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[i.DOWNGRADE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f122962a = iArr;
    }
}
