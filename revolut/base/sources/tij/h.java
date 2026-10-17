package tij;

import dej.y2;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f271552a;

    static {
        int[] iArr = new int[y2.values().length];
        try {
            iArr[y2.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y2.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y2.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f271552a = iArr;
    }
}
