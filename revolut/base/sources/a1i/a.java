package a1i;

import wd6.j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f635a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f635a = iArr;
    }
}
