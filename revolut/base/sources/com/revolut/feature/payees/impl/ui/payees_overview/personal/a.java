package com.revolut.feature.payees.impl.ui.payees_overview.personal;

import au.c0;
import cli.y;
import com.revolut.data.model.Data;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import o8b.c;
import oki.h;
import wm9.g;
import wm9.i;
import wm9.k;
import wm9.m;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements i {
    public final im9.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lm9.a f79020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f79021q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f79022r;

    public a(m stateMapper, im9.i payeesInteractor, lm9.a payeesDialogFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(payeesInteractor, "payeesInteractor");
        Intrinsics.checkNotNullParameter(payeesDialogFactory, "payeesDialogFactory");
        this.o = payeesInteractor;
        this.f79020p = payeesDialogFactory;
        this.f79021q = d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f79022r = e.a(this, new k(0));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f79022r;
    }

    @Override // yji.l
    public final void T1(long j2) {
        im9.i iVar = this.o;
        boolean zG = ((c) iVar.e).g();
        Continuation continuation = null;
        l.b1(this, nim.a.u(new c0(zG, iVar, continuation, 10), u0.m(im9.i.d(iVar, null, null, 3), ((hy9.c) iVar.f162330c).a())), null, new wka.e(this, continuation, 5), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f79021q;
    }
}
