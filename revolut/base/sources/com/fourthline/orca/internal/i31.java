package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class i31 extends q91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s30 f29485a;

    public i31(p70 tinIntroLottieSource) {
        Intrinsics.checkNotNullParameter(tinIntroLottieSource, "tinIntroLottieSource");
        c81.a aVar = c81.f27404a;
        this.f29485a = new s30("tin_intro", c81.a.a(aVar, R.string.step_tin_intro_header_esp, 0, 2, null), c81.a.a(aVar, R.string.step_tin_intro_message_esp, 0, 2, null), tinIntroLottieSource, new m80.b(null, 1, null), new m80.a.b(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public s30 getInitialState() {
        return this.f29485a;
    }
}
