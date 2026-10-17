package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict;

import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.jpkict.JPKICTIdentificationResult;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107531a;

    static {
        int[] iArr = new int[JPKICTIdentificationResult.Result.values().length];
        try {
            iArr[JPKICTIdentificationResult.Result.SUCCEEDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JPKICTIdentificationResult.Result.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f107531a = iArr;
    }
}
