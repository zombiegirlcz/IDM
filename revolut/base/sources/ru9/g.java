package ru9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f257473a;

    static {
        int[] iArr = new int[dv9.n.values().length];
        try {
            iArr[dv9.n.OUTGOING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dv9.n.INCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f257473a = iArr;
    }
}
