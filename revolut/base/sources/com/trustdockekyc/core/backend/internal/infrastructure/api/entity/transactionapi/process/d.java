package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process;

import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.ProcessResult;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107406a;

    static {
        int[] iArr = new int[ProcessResult.ProcessType.values().length];
        try {
            iArr[ProcessResult.ProcessType.JPKI_CT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProcessResult.ProcessType.IC_CHIP_READER_JAPAN_CT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProcessResult.ProcessType.FACE_MATCHING_JAPAN_TD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f107406a = iArr;
    }
}
