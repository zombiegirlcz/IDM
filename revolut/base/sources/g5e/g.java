package g5e;

import jel.e2;
import jel.s1;
import jel.u1;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f140775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f140776c;

    static {
        int[] iArr = new int[s1.values().length];
        try {
            iArr[s1.MEMORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s1.GUARANTEED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s1.SNOWBALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f140774a = iArr;
        int[] iArr2 = new int[e2.values().length];
        try {
            iArr2[e2.AVERAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[e2.WORST_PERFORMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[e2.SINGLE_ASSET.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f140775b = iArr2;
        int[] iArr3 = new int[u1.values().length];
        try {
            iArr3[u1.MONTHLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[u1.QUARTERLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[u1.ANNUALLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f140776c = iArr3;
    }
}
