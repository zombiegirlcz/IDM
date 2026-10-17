package g8a;

import com.revolut.feature.pix.api.model.PixQrCodeImplementation;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f141310a;

    static {
        int[] iArr = new int[PixQrCodeImplementation.values().length];
        try {
            iArr[PixQrCodeImplementation.PIX_RECURRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PixQrCodeImplementation.PIX_INSTANT_RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f141310a = iArr;
    }
}
