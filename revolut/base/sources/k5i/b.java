package k5i;

import f8l.e;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f181508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f181509b;

    static {
        int[] iArr = new int[f8l.b.values().length];
        try {
            iArr[f8l.b.FROM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f8l.b.TO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f181508a = iArr;
        int[] iArr2 = new int[e.values().length];
        try {
            iArr2[e.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[e.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[e.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[e.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f181509b = iArr2;
    }
}
