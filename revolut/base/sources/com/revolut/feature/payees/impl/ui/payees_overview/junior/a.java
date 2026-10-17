package com.revolut.feature.payees.impl.ui.payees_overview.junior;

import akg.n;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import ogm.i;
import oki.h;
import ou5.b;
import u7k.w;
import uj6.v;
import um9.e;
import um9.f;
import um9.l;
import wq8.c;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements um9.h {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lm9.a f79013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f79014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f79015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f79016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f79017t;

    public a(l stateMapper, f inputData, lm9.a payeesDialogFactory, i juniorTransferSettingsInteractor, b juniorPayeesTransferSettingsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(payeesDialogFactory, "payeesDialogFactory");
        Intrinsics.checkNotNullParameter(juniorTransferSettingsInteractor, "juniorTransferSettingsInteractor");
        Intrinsics.checkNotNullParameter(juniorPayeesTransferSettingsInteractor, "juniorPayeesTransferSettingsInteractor");
        this.o = inputData;
        this.f79013p = payeesDialogFactory;
        this.f79014q = juniorTransferSettingsInteractor;
        this.f79015r = juniorPayeesTransferSettingsInteractor;
        this.f79016s = d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f79017t = hx7.e.a(this, new w(this, 29));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f79017t;
    }

    @Override // yji.l
    public final void T1(long j2) {
        String juniorId = this.o.f281272a;
        b bVar = this.f79015r;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        n nVarA = hj8.a.a((hj8.a) bVar.f229819a, juniorId, loadingStrategy);
        c cVar = (c) bVar.f229820b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.b1(this, nim.a.v(nim.a.v(u0.m(nVarA, cVar.d.b(juniorId, loadingStrategy)), new qpb.i(18)), new v(27)), null, new uf0.d(this, null, 16), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f79016s;
    }
}
