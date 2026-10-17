package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.AmountInputActionsDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f0 implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AmountInputActionsDelegate f54137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ip0.w0 f54138b;

    public f0(AmountInputActionsDelegate amountInputActionsDelegate, ip0.w0 w0Var) {
        this.f54137a = amountInputActionsDelegate;
        this.f54138b = w0Var;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        ihm.f fVar = this.f54137a.f;
        koi.j jVar = this.f54138b.e;
        Intrinsics.i(jVar, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.AmountInputActionsDelegate.Model");
        fVar.onNext(new e0((AmountInputActionsDelegate.Model) jVar, extractedValue, z));
    }
}
