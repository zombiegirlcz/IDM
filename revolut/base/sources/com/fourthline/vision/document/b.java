package com.fourthline.vision.document;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DocumentScannerFragment f35916b;

    public /* synthetic */ b(DocumentScannerFragment documentScannerFragment, int i) {
        this.f35915a = i;
        this.f35916b = documentScannerFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f35915a) {
            case 0:
                return DocumentScannerFragment.subcomponent_delegate$lambda$0$0(this.f35916b);
            case 1:
                return DocumentScannerFragment._get_scannerDataSource_$lambda$0(this.f35916b);
            default:
                return DocumentScannerFragment.subcomponent_delegate$lambda$0(this.f35916b);
        }
    }
}
