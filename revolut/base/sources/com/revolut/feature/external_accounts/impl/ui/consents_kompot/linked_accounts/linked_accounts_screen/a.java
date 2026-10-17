package com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_accounts_screen;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import th6.q;
import xg6.r;
import yji.l;
import yk6.m;
import yl6.e;
import yl6.f;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements f {
    public final r o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f72812p;

    public a(n stateMapper, r linkedAccountConsentInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(linkedAccountConsentInteractor, "linkedAccountConsentInteractor");
        this.o = linkedAccountConsentInteractor;
        this.f72812p = d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        r rVar = this.o;
        rVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        q qVar = rVar.f305600a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, qVar.d.b(Unit.f186387a, loadingStrategy), null, null, new m(this, (Continuation) null, 1), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f72812p;
    }
}
