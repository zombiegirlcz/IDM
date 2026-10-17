package yi1;

import com.revolut.feature.address.models.Address;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314217a;

    static {
        int[] iArr = new int[Address.Type.values().length];
        try {
            iArr[Address.Type.OFFICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Address.Type.COWORKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Address.Type.HOME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Address.Type.PRIVATE_MAILBOX.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Address.Type.OTHER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f314217a = iArr;
    }
}
