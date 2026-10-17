package com.onfido.android.sdk.capture.validation;

import igm.o;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnDeviceValidationTransformer f50109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OnDeviceValidationType f50110c;

    public /* synthetic */ b(OnDeviceValidationTransformer onDeviceValidationTransformer, OnDeviceValidationType onDeviceValidationType, int i) {
        this.f50108a = i;
        this.f50109b = onDeviceValidationTransformer;
        this.f50110c = onDeviceValidationType;
    }

    @Override // igm.o
    public final Object apply(Object obj2) {
        switch (this.f50108a) {
            case 0:
                return OnDeviceValidationTransformer.transformRealTimeValidations$lambda$3(this.f50109b, this.f50110c, (Throwable) obj2);
            default:
                return OnDeviceValidationTransformer.transformPostCaptureValidations$lambda$1(this.f50109b, this.f50110c, (Throwable) obj2);
        }
    }
}
