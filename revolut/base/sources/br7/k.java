package br7;

import com.revolut.core.ui_kit_core.displayers.image.models.FileImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e60.l f17943b;

    public /* synthetic */ k(e60.l lVar, int i) {
        this.f17942a = i;
        this.f17943b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f17942a) {
            case 0:
                e updateState = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return e.a(updateState, d0.F0(((e60.m) this.f17943b).b(), updateState.f17937c));
            default:
                return nt9.g.a((nt9.g) obj2, new FileImage(((e60.m) this.f17943b).b(), (FileImage.Placeholder) null, (ImageTransformations) null, 14), null, null, null, null, false, 126);
        }
    }
}
