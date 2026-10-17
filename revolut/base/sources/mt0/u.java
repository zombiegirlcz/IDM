package mt0;

import mx0.r6;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f208732b;

    static {
        int[] iArr = new int[r6.values().length];
        try {
            iArr[r6.VISIBILITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r6.COMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r6.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f208731a = iArr;
        int[] iArr2 = new int[s.values().length];
        try {
            iArr2[s.FLOATING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[s.SOLID.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f208732b = iArr2;
    }
}
