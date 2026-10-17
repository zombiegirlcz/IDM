package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd;

import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.PostFaceMatchingJapanTdProcessesFaceMatchingsResponse;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107419a;

    static {
        int[] iArr = new int[PostFaceMatchingJapanTdProcessesFaceMatchingsResponse.Result.values().length];
        try {
            iArr[PostFaceMatchingJapanTdProcessesFaceMatchingsResponse.Result.SUCCEEDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PostFaceMatchingJapanTdProcessesFaceMatchingsResponse.Result.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f107419a = iArr;
    }
}
