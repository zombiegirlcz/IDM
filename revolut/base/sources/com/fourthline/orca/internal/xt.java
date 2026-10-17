package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xt implements d40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s30 f35088a;

    public xt(p70 lottieSource) {
        Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
        c81.a aVar = c81.f27404a;
        this.f35088a = new s30("document_intro", c81.a.a(aVar, R.string.step_document_intro_header, 0, 2, null), c81.a.a(aVar, R.string.step_document_intro_message_germany, 0, 2, null), lottieSource, new m80.b(null, 1, null), new m80.a.b(null, 1, null));
    }

    @Override // com.fourthline.orca.internal.d40
    public /* bridge */ Function1 a(boolean z) {
        return super.a(z);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public s30 getInitialState() {
        return this.f35088a;
    }
}
