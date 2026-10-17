package com.fourthline.vision.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class kg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c8 f36459b;

    public /* synthetic */ kg(c8 c8Var, int i) {
        this.f36458a = i;
        this.f36459b = c8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36458a) {
            case 0:
                return c8.randomnessLivenessSteps$lambda$0(this.f36459b);
            default:
                return c8.handleDetectedFace$lambda$3(this.f36459b);
        }
    }
}
