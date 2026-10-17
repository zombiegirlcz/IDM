package com.fourthline.vision.internal;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class sg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f36919b;

    public /* synthetic */ sg(MutableState mutableState, int i) {
        this.f36918a = i;
        this.f36919b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f36918a) {
            case 0:
                return i5.CameraXDocumentScanner$lambda$1(this.f36919b);
            default:
                return oc.CameraXSelfieScanner$lambda$1(this.f36919b);
        }
    }
}
