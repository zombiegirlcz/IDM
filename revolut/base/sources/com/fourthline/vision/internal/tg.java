package com.fourthline.vision.internal;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class tg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f36970b;

    public /* synthetic */ tg(int i, Function1 function1) {
        this.f36969a = i;
        this.f36970b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f36969a) {
            case 0:
                return i5.CameraXDocumentScanner$lambda$6$0(this.f36970b, (pa) obj2);
            case 1:
                return oc.CameraXSelfieScanner$lambda$6$1$0(this.f36970b, (pa) obj2);
            default:
                return yf.VisionXComposable$lambda$4$0(this.f36970b, (ff) obj2);
        }
    }
}
