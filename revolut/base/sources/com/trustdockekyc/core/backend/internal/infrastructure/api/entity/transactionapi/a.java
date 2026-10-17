package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107398a;

    static {
        int[] iArr = new int[x2m.a.values().length];
        try {
            iArr[x2m.a.AUTHENTICATION_FAILURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x2m.a.MYNUMBER_CARD_LOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x2m.a.MISMATCHED_MYNUMBER_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[x2m.a.API_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[x2m.a.IN_MAINTENANCE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[x2m.a.NETWORK_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[x2m.a.NFC_NOT_AVAILABLE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[x2m.a.INVALID_PARAMS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[x2m.a.INVALID_PROJECT_ID.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[x2m.a.INVALID_PACKAGE_ID.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[x2m.a.INVALID_TBS_RAW_DATA.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[x2m.a.INVALID_TBS_DATA_TEMPLATE.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[x2m.a.INVALID_BASE_URL.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[x2m.a.CERTIFICATE_EXPIRED.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[x2m.a.SIGNATURE_INVALID.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[x2m.a.CERTIFICATE_INVALID.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[x2m.a.CERTIFICATE_REVOKED.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[x2m.a.UNKNOWN_ERROR.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[x2m.a.CAMERA_ERROR.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[x2m.a.CAMERA_NOT_AUTHORIZED.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[x2m.a.DRIVERS_LICENSE_LOCKED.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[x2m.a.NO_CERTIFICATE.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[x2m.a.NO_VIDEO_DEVICE.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[x2m.a.UNDER_16YEARS.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        f107398a = iArr;
    }
}
