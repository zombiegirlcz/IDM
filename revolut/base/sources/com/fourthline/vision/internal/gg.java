package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.internal.domain.steps.HeadMetadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class gg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bb f36287b;

    public /* synthetic */ gg(bb bbVar, int i) {
        this.f36286a = i;
        this.f36287b = bbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f36286a) {
            case 0:
                return bb.provideCompositeStepInteractor$lambda$3(this.f36287b, ((Integer) obj2).intValue());
            case 1:
                return bb.provideLivenessStepWarningsChecker$lambda$1(this.f36287b, (HeadMetadata) obj2);
            case 2:
                return bb.provideCompositeStepInteractor$lambda$1(this.f36287b, ((Integer) obj2).intValue());
            default:
                return bb.provideCompositeStepInteractor$lambda$2(this.f36287b, ((Integer) obj2).intValue());
        }
    }
}
