package com.fourthline.vision.document;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DocumentScannerActivity f35914b;

    public /* synthetic */ a(DocumentScannerActivity documentScannerActivity, int i) {
        this.f35913a = i;
        this.f35914b = documentScannerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f35913a) {
            case 0:
                return DocumentScannerActivity.subcomponent_delegate$lambda$0$0(this.f35914b);
            case 1:
                return DocumentScannerActivity.subcomponent_delegate$lambda$0(this.f35914b);
            default:
                return DocumentScannerActivity._get_scannerDataSource_$lambda$0(this.f35914b);
        }
    }
}
