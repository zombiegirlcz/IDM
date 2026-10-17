package v4e;

import jel.e2;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f286066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f286067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f286068c;

    static {
        int[] iArr = new int[e2.values().length];
        try {
            iArr[e2.AVERAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e2.WORST_PERFORMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e2.SINGLE_ASSET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f286066a = iArr;
        int[] iArr2 = new int[nel.d0.values().length];
        try {
            iArr2[nel.d0.AUTOCALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[nel.d0.CAPITAL_PROTECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[nel.d0.LEVERAGED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f286067b = iArr2;
        int[] iArr3 = new int[o.values().length];
        try {
            iArr3[o.AVERAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        f286068c = iArr3;
    }
}
