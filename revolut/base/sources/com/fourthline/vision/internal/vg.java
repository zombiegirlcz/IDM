package com.fourthline.vision.internal;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class vg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rd f37033b;

    public /* synthetic */ vg(rd rdVar, int i) {
        this.f37032a = i;
        this.f37033b = rdVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f37032a) {
            case 0:
                return i5.CameraXDocumentScanner$lambda$9$0(this.f37033b, (Lifecycle.Event) obj2);
            default:
                return yf.VisionXComposable$lambda$2$0(this.f37033b, (Lifecycle.Event) obj2);
        }
    }
}
