package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd;

import com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi.process.facematchingjapantd.PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107420a;

    static {
        int[] iArr = new int[PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse.Action.values().length];
        try {
            iArr[PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse.Action.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse.Action.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PostFaceMatchingJapanTdProcessesRandomShootingPatternResponse.Action.FRONT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f107420a = iArr;
    }
}
