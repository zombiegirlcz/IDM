package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gn0 implements d40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s30 f28940a;

    public gn0(p70 poaIntroLottieSource) {
        Intrinsics.checkNotNullParameter(poaIntroLottieSource, "poaIntroLottieSource");
        c81.a aVar = c81.f27404a;
        this.f28940a = new s30("poa_intro", c81.a.a(aVar, R.string.step_poa_intro_header, 0, 2, null), c81.a.a(aVar, R.string.step_poa_intro_message, 0, 2, null), poaIntroLottieSource, new m80.b(null, 1, null), new m80.a.b(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.d40
    public /* bridge */ Function1 a(boolean z) {
        return super.a(z);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public s30 getInitialState() {
        return this.f28940a;
    }
}
