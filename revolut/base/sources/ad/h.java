package ad;

import md.w2;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f3198b;

    static {
        int[] iArr = new int[i.values().length];
        f3198b = iArr;
        try {
            iArr[i.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3198b[i.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3198b[i.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f3198b[i.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[w2.values().length];
        f3197a = iArr2;
        try {
            iArr2[w2.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f3197a[w2.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f3197a[w2.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f3197a[w2.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
