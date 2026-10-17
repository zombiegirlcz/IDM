package com.fourthline.vision.selfie;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelfieScannerFragment f37227b;

    public /* synthetic */ b(SelfieScannerFragment selfieScannerFragment, int i) {
        this.f37226a = i;
        this.f37227b = selfieScannerFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f37226a) {
            case 0:
                return SelfieScannerFragment._get_scannerDataSource_$lambda$0(this.f37227b);
            case 1:
                return SelfieScannerFragment.subcomponent_delegate$lambda$0$0(this.f37227b);
            default:
                return SelfieScannerFragment.subcomponent_delegate$lambda$0(this.f37227b);
        }
    }
}
