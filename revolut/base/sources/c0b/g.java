package c0b;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20202a;

    static {
        int[] iArr = new int[vza.a.values().length];
        try {
            iArr[vza.a.ROOTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vza.a.CUSTOM_FIRMWARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vza.a.CUSTOM_KEYS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vza.a.CUSTOM_OS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[vza.a.KA_REVOKED_CERT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[vza.a.UNLOCKED_BOOTLOADER.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f20202a = iArr;
    }
}
