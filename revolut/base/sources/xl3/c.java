package xl3;

import zm3.k;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f306931a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.INDIVIDUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.JUNIOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.BUSINESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f306931a = iArr;
    }
}
