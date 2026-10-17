package lag;

import cgi.d;
import cgi.e;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f193387a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.WALLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[e.values().length];
        try {
            iArr2[e.PAY_NOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[e.PAY_LATER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f193387a = iArr2;
        int[] iArr3 = new int[fgi.a.values().length];
        try {
            iArr3[fgi.a.VRBO.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[fgi.a.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[fgi.a.EXPEDIA.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[fgi.a.NUITEE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
