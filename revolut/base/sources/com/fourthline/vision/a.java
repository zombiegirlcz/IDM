package com.fourthline.vision;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VisionActivity f35877b;

    public /* synthetic */ a(VisionActivity visionActivity, int i) {
        this.f35876a = i;
        this.f35877b = visionActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f35876a) {
            case 0:
                return VisionActivity.root_delegate$lambda$0(this.f35877b);
            default:
                return this.f35877b.getDetectionArea$fourthline_vision_release();
        }
    }
}
