package x4e;

import jel.c2;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f302875a;

    static {
        int[] iArr = new int[c2.values().length];
        try {
            iArr[c2.LOSS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c2.PROTECTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c2.PROFIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f302875a = iArr;
    }
}
