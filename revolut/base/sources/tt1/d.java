package tt1;

import hrf.f;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f274193a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.OUTGOING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.INCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f274193a = iArr;
    }
}
