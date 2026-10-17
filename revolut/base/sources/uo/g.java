package uo;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f281474a;

    static {
        int[] iArr = new int[no.n.values().length];
        try {
            iArr[no.n.Business.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[no.n.Retail.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[no.n.Junior.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[no.n.RevolutX.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[no.n.Terminal.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f281474a = iArr;
    }
}
