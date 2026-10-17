package com.fourthline.vision.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class jh implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rc f36429b;

    public /* synthetic */ jh(rc rcVar, int i) {
        this.f36428a = i;
        this.f36429b = rcVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36428a) {
            case 0:
                return rc.onFacesDetection$lambda$3(this.f36429b);
            case 1:
                return rc.videoRecorderManager$lambda$0(this.f36429b);
            default:
                return rc.randomnessLivenessSteps$lambda$0(this.f36429b);
        }
    }
}
