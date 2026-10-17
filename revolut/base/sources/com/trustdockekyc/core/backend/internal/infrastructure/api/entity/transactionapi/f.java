package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi;

import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.PostVerificationResultResponse;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107401a;

    static {
        int[] iArr = new int[PostVerificationResultResponse.VerificationResultStatus.values().length];
        try {
            iArr[PostVerificationResultResponse.VerificationResultStatus.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultStatus.ABORTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PostVerificationResultResponse.VerificationResultStatus.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f107401a = iArr;
    }
}
