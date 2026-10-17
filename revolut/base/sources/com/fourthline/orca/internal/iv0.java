package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class iv0 implements d40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s30 f29713a;

    public iv0(p70 qesIntroLottieSource) {
        Intrinsics.checkNotNullParameter(qesIntroLottieSource, "qesIntroLottieSource");
        this.f29713a = new s30("qes_intro", new c81.d(R.string.step_qes_intro_header, 0, 2, null), new c81.d(R.string.step_qes_intro_message, 0, 2, null), qesIntroLottieSource, new m80.b(c81.a.a(c81.f27404a, R.string.shared_button_start, 0, 2, null)), new m80.a.b(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.d40
    public /* bridge */ Function1 a(boolean z) {
        return super.a(z);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public s30 getInitialState() {
        return this.f29713a;
    }
}
