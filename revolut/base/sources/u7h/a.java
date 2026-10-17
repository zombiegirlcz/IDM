package u7h;

import t7h.f;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f277755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f277756b;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.KILLSWITCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.NON_MARGINABLE_INSTRUMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f277755a = iArr;
        int[] iArr2 = new int[udh.a.values().length];
        try {
            iArr2[udh.a.KILLSWITCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[udh.a.NON_MARGINABLE_INSTRUMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f277756b = iArr2;
    }
}
