package com.trustdockekyc.core.backend.internal.infrastructure.api.entity.transactionapi;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107400a;

    static {
        int[] iArr = new int[x2m.d.values().length];
        try {
            iArr[x2m.d.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x2m.d.ABORTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x2m.d.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f107400a = iArr;
    }
}
