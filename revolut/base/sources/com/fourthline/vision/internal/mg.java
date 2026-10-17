package com.fourthline.vision.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class mg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f36583b;

    public /* synthetic */ mg(int i, Function0 function0) {
        this.f36582a = i;
        this.f36583b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36582a) {
            case 0:
                return Long.valueOf(ca._init_$lambda$0(this.f36583b));
            case 1:
                return Long.valueOf(n3._init_$lambda$0(this.f36583b));
            default:
                return wf.VisionView$lambda$9$0$0$0$0(this.f36583b);
        }
    }
}
