package hq7;

import kl7.f1;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f154624a;

    static {
        int[] iArr = new int[f1.values().length];
        try {
            iArr[f1.MONTHLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f1.ANNUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f154624a = iArr;
    }
}
