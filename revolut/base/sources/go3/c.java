package go3;

import io3.j;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f145081a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.SHARED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f145081a = iArr;
    }
}
