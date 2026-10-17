package j2l;

import a2l.p;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f170915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f170916b;

    static {
        int[] iArr = new int[i2l.a.values().length];
        try {
            iArr[i2l.a.HORIZONTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i2l.a.VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f170915a = iArr;
        int[] iArr2 = new int[p.values().length];
        try {
            iArr2[p.CONFIRM.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[p.DISMISS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[p.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f170916b = iArr2;
    }
}
