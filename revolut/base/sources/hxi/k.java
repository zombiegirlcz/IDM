package hxi;

import svi.a1;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f156609a;

    static {
        int[] iArr = new int[a1.values().length];
        try {
            iArr[a1.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a1.DANGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f156609a = iArr;
    }
}
