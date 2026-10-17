package ms0;

import aw0.b9;
import aw0.d9;
import aw0.q9;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f208397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f208398c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[q3.values().length];
        try {
            iArr[q3.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q3.BIG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f208396a = iArr;
        int[] iArr2 = new int[b9.values().length];
        try {
            iArr2[b9.POSITIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[b9.NEGATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[b9.NEUTRAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f208397b = iArr2;
        int[] iArr3 = new int[q9.values().length];
        try {
            iArr3[q9.STATIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[q9.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f208398c = iArr3;
        int[] iArr4 = new int[d9.values().length];
        try {
            iArr4[d9.THREE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[d9.FIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        d = iArr4;
    }
}
