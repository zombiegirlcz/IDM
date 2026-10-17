package ar2;

import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcodeType;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f8509b;

    static {
        int[] iArr = new int[xq2.e.values().length];
        try {
            iArr[xq2.e.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xq2.e.ALL_FORMATS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xq2.e.CODE_128.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[xq2.e.CODE_39.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[xq2.e.CODE_93.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[xq2.e.CODABAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[xq2.e.DATA_MATRIX.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[xq2.e.EAN_13.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[xq2.e.EAN_8.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[xq2.e.ITF.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[xq2.e.QR_CODE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[xq2.e.UPC_A.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[xq2.e.UPC_E.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[xq2.e.PDF417.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[xq2.e.AZTEC.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        f8508a = iArr;
        int[] iArr2 = new int[MsBarcodeType.values().length];
        try {
            iArr2[MsBarcodeType.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[MsBarcodeType.CONTACT_INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[MsBarcodeType.EMAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[MsBarcodeType.ISBN.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[MsBarcodeType.PHONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[MsBarcodeType.PRODUCT.ordinal()] = 6;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[MsBarcodeType.SMS.ordinal()] = 7;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[MsBarcodeType.TEXT.ordinal()] = 8;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[MsBarcodeType.URL.ordinal()] = 9;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[MsBarcodeType.WIFI.ordinal()] = 10;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[MsBarcodeType.GEO.ordinal()] = 11;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[MsBarcodeType.CALENDAR_EVENT.ordinal()] = 12;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[MsBarcodeType.DRIVER_LICENSE.ordinal()] = 13;
        } catch (NoSuchFieldError unused28) {
        }
        f8509b = iArr2;
    }
}
