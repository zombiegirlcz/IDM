package com.fourthline.vision.internal;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ug implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MutableState f36993b;

    public /* synthetic */ ug(MutableState mutableState, int i) {
        this.f36992a = i;
        this.f36993b = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f36992a) {
            case 0:
                return i5.CameraXDocumentScanner$lambda$7$0(this.f36993b, (Rect) obj2);
            default:
                return oc.CameraXSelfieScanner$lambda$6$2$0(this.f36993b, (Rect) obj2);
        }
    }
}
