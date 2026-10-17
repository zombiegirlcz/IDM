package jz;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f179559a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.VERIFY_IDENTITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.MOVE_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o.MOVE_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o.MOVE_DOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[o.MOVE_UP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[o.MOVE_CLOSER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[o.MOVE_FURTHER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[o.LOOK_STRAIGHT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[o.TOO_BRIGHT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[o.TOO_DARK.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[o.TOO_BLURRY.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[o.SUCCESS_VALIDATION.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        f179559a = iArr;
    }
}
