package com.fourthline.vision.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class hg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bb f36337b;

    public /* synthetic */ hg(bb bbVar, int i) {
        this.f36336a = i;
        this.f36337b = bbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36336a) {
            case 0:
                return Boolean.valueOf(bb.provideStepsDataSource$lambda$0(this.f36337b));
            case 1:
                return Integer.valueOf(bb.provideLivenessStepWarningsChecker$lambda$0(this.f36337b));
            default:
                return bb.provideVideoRecorderManager$lambda$0(this.f36337b);
        }
    }
}
