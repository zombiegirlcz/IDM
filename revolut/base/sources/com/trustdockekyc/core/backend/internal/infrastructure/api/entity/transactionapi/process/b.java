package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process;

import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.ProcessResult;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107405a;

    static {
        int[] iArr = new int[ProcessResult.ProcessResultStatus.values().length];
        try {
            iArr[ProcessResult.ProcessResultStatus.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProcessResult.ProcessResultStatus.ABORTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProcessResult.ProcessResultStatus.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f107405a = iArr;
    }
}
