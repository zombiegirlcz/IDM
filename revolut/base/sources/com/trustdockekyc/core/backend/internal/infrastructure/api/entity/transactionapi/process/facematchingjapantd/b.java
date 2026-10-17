package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd;

import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.FaceMatchingJapanTDResult;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107418a;

    static {
        int[] iArr = new int[FaceMatchingJapanTDResult.Result.values().length];
        try {
            iArr[FaceMatchingJapanTDResult.Result.SUCCEEDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FaceMatchingJapanTDResult.Result.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f107418a = iArr;
    }
}
