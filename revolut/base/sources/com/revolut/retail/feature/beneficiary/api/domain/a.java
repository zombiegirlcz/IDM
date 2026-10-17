package com.revolut.retail.feature.beneficiary.api.domain;

import com.revolut.feature.shared.beneficiary.api.domain.PaymentCodeType;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f99618a;

    static {
        int[] iArr = new int[PaymentCodeType.values().length];
        try {
            iArr[PaymentCodeType.EUROPEAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaymentCodeType.SWISS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f99618a = iArr;
    }
}
