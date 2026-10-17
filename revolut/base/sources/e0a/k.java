package e0a;

import mx0.b4;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121505a;

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
        f121505a = iArr;
    }
}
