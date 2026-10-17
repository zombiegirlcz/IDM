package nj4;

import au3.m;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f216362a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.SUBSCRIBED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.UNSUBSCRIBED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f216362a = iArr;
    }
}
