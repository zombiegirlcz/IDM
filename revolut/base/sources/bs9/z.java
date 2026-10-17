package bs9;

import mx0.b4;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f18141b;

    static {
        int[] iArr = new int[b4.values().length];
        try {
            iArr[b4.SEND_MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b4.REACTIONS_KEYBOARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b4.SOFT_KEYBOARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f18140a = iArr;
        int[] iArr2 = new int[st9.a.values().length];
        try {
            iArr2[st9.a.TEXT_NOT_SUPPORTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[st9.a.UNSUPPORTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[st9.a.SUPPORTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f18141b = iArr2;
    }
}
