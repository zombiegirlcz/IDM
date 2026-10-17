package com.fourthline.vision.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ch implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3 f36085b;

    public /* synthetic */ ch(o3 o3Var, int i) {
        this.f36084a = i;
        this.f36085b = o3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36084a) {
            case 0:
                return o3.provideVideoRecorderManager$lambda$0(this.f36085b);
            case 1:
                return o3.provideMrzCandidateInteractor$lambda$0(this.f36085b);
            case 2:
                return o3.provideVideoIntervalDataSource$lambda$0$1(this.f36085b);
            case 3:
                return o3.provideDocumentExpirationDateValidator$lambda$0(this.f36085b);
            case 4:
                return o3.provideDocumentCountriesValidator$lambda$0(this.f36085b);
            case 5:
                return o3.provideDocumentCountriesValidator$lambda$1(this.f36085b);
            case 6:
                return Long.valueOf(o3.provideTimeoutFactory$lambda$0(this.f36085b));
            default:
                return Integer.valueOf(o3.provideDocumentBirthDateValidator$lambda$0(this.f36085b));
        }
    }
}
