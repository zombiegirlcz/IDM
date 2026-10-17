package cn0;

import wl0.o;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f25336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f25337b;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.FACE_UNLOCK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.FINGERPRINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f25336a = iArr;
        int[] iArr2 = new int[rl0.d.values().length];
        try {
            iArr2[rl0.d.PASSCODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[rl0.d.PASSKEY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f25337b = iArr2;
    }
}
