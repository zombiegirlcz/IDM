package com.revolut.feature.alipay.impl.ui.qr.showcode.modal;

import com.revolut.feature.alipay.impl.ui.qr.showcode.modal.AlipayPlusExpandedCodeScreenContract$InputData;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f61087a;

    static {
        int[] iArr = new int[AlipayPlusExpandedCodeScreenContract$InputData.CodeType.values().length];
        try {
            iArr[AlipayPlusExpandedCodeScreenContract$InputData.CodeType.BARCODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AlipayPlusExpandedCodeScreenContract$InputData.CodeType.QR_CODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f61087a = iArr;
    }
}
