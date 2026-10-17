package caa;

import com.revolut.feature.pix.api.model.PixQrCodeImplementation;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22575a;

    static {
        int[] iArr = new int[PixQrCodeImplementation.values().length];
        try {
            iArr[PixQrCodeImplementation.PIX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PixQrCodeImplementation.PIX_RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PixQrCodeImplementation.PIX_INSTANT_RECURRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PixQrCodeImplementation.PIX_LATER_ACCEPTANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f22575a = iArr;
    }
}
