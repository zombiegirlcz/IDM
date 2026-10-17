package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi;

import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.PostVerificationResultResponse;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107399a;

    static {
        int[] iArr = new int[PostVerificationResultResponse.VerificationResultReason.values().length];
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.MYNUMBER_CARD_LOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.MISMATCHED_MYNUMBER_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.API_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.IN_MAINTENANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.NETWORK_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.AUTHENTICATION_FAILURE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.NFC_NOT_AVAILABLE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.INVALID_PARAMS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.INVALID_PROJECT_ID.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.INVALID_PACKAGE_ID.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.INVALID_TBS_RAW_DATA.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.INVALID_TBS_DATA_TEMPLATE.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.INVALID_BASE_URL.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.CERTIFICATE_EXPIRED.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.SIGNATURE_INVALID.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.CERTIFICATE_INVALID.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.CERTIFICATE_REVOKED.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.UNKNOWN_ERROR.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.CAMERA_ERROR.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.CAMERA_NOT_AUTHORIZED.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.DRIVERS_LICENSE_LOCKED.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.NO_CERTIFICATE.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.NO_VIDEO_DEVICE.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultReason.UNDER_16YEARS.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        f107399a = iArr;
    }
}
