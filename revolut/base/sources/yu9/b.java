package yu9;

import dv9.n;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f316921a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.OUTGOING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.INCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f316921a = iArr;
    }
}
