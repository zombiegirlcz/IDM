package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class s6 implements j20, fr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o6 f32913a;

    public s6(p70 networkSpinnerThinkLottieSource) {
        Intrinsics.checkNotNullParameter(networkSpinnerThinkLottieSource, "networkSpinnerThinkLottieSource");
        this.f32913a = new o6(new c81.d(R.string.step_qes_loading_header, 0, 2, null), new a9(new c81.d(R.string.shared_button_exit, 0, 2, null), false, false, 6, null), networkSpinnerThinkLottieSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o6 a(boolean z, o6 o6Var) {
        Intrinsics.checkNotNullParameter(o6Var, "<this>");
        return o6.a(o6Var, null, a9.a(o6Var.n(), null, !z, false, 5, null), null, 5, null);
    }

    @Override // com.fourthline.orca.internal.fr0
    public Function1 d(boolean z) {
        return new rk1(z, 8);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public o6 getInitialState() {
        return this.f32913a;
    }
}
