package u7d;

import wf0.k0;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f277739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f277740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f277741c;

    static {
        int[] iArr = new int[gj0.c.values().length];
        try {
            iArr[gj0.c.CONTENT_REF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gj0.c.BRANCH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gj0.c.DEEPLINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f277739a = iArr;
        int[] iArr2 = new int[k7d.a.values().length];
        try {
            iArr2[k7d.a.Legacy.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k7d.a.AiV2.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[k7d.a.AiV3.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f277740b = iArr2;
        int[] iArr3 = new int[k0.values().length];
        try {
            iArr3[k0.Pigeon.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[k0.Lightened.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f277741c = iArr3;
    }
}
