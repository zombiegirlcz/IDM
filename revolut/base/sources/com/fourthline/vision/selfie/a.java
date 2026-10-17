package com.fourthline.vision.selfie;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelfieScannerActivity f37225b;

    public /* synthetic */ a(SelfieScannerActivity selfieScannerActivity, int i) {
        this.f37224a = i;
        this.f37225b = selfieScannerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37224a) {
            case 0:
                return SelfieScannerActivity._get_scannerDataSource_$lambda$0(this.f37225b);
            case 1:
                return SelfieScannerActivity.subcomponent_delegate$lambda$0$0(this.f37225b);
            default:
                return SelfieScannerActivity.subcomponent_delegate$lambda$0(this.f37225b);
        }
    }
}
