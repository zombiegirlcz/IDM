package u2b;

import k4l.r0;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f276596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f276597b;

    static {
        int[] iArr = new int[e2b.a.values().length];
        try {
            iArr[e2b.a.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e2b.a.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e2b.a.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f276596a = iArr;
        int[] iArr2 = new int[r0.values().length];
        try {
            iArr2[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[r0.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[r0.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f276597b = iArr2;
    }
}
