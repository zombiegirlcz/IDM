package o25;

import vu3.n;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f221490a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f221490a = iArr;
    }
}
