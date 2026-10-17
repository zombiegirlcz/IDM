package com.fourthline.vision;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VisionFragment f35879b;

    public /* synthetic */ b(VisionFragment visionFragment, int i) {
        this.f35878a = i;
        this.f35879b = visionFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f35878a) {
            case 0:
                return VisionFragment.setupVisionView$lambda$0(this.f35879b);
            default:
                return VisionFragment.root_delegate$lambda$0(this.f35879b);
        }
    }
}
