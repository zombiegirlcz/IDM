package kuf;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.q;
import nii.n1;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends n implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wv9.c f189789l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final cpf.c f189790m;

    public f(wv9.c dialogFactory, cpf.c transferResultHandlerExtension) {
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(transferResultHandlerExtension, "transferResultHandlerExtension");
        this.f189789l = dialogFactory;
        this.f189790m = transferResultHandlerExtension;
    }

    public final void Z2(n1 result, Function1 onFinish) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        ((wpf.c) this.f189790m).Z2(result, new q(onFinish, result, 13));
    }

    public final void b3(n1 result, Function1 onFinish) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        ((wpf.c) this.f189790m).b3(result, onFinish);
    }
}
