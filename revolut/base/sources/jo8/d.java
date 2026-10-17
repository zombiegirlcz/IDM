package jo8;

import vd8.e;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f176891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f176892b;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f176891a = iArr;
        int[] iArr2 = new int[vd8.d.values().length];
        try {
            iArr2[vd8.d.GUARDIAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[vd8.d.CO_GUARDIAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f176892b = iArr2;
    }
}
