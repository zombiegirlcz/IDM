package com.fourthline.vision.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class rg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36824a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f36825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f36826c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ rg(Modifier modifier, u uVar, Function1 function1, int i, int i2) {
        this.f36825b = modifier;
        this.f36826c = uVar;
        this.d = function1;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f36824a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                Modifier modifier = this.f36825b;
                return i0.CameraPreviewContent$lambda$2(this.f36826c, modifier, this.d, this.e, this.f, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return i0.CameraPreview$lambda$2(this.f36825b, this.f36826c, this.d, this.e, this.f, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ rg(u uVar, Modifier modifier, Function1 function1, int i, int i2) {
        this.f36826c = uVar;
        this.f36825b = modifier;
        this.d = function1;
        this.e = i;
        this.f = i2;
    }
}
