package com.revolut.feature.external_accounts.impl.ui.screen.cross_border.institutions;

import cli.y;
import com.revolut.data.model.Data;
import f9d.c;
import fg6.d;
import hx7.e;
import ji1.m;
import jo6.k;
import jo6.l;
import jo6.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import se6.g;
import w4l.i;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements n {
    public final l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f73077p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jo6.b f73078q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fg6.b f73079r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f73080s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f73081t;

    public b(cli.n stateMapper, l inputData, d crossBorderOpenBankingInteractor, jo6.b crossBorderCountryPickerInteractor, fg6.b countrySelectionInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(crossBorderOpenBankingInteractor, "crossBorderOpenBankingInteractor");
        Intrinsics.checkNotNullParameter(crossBorderCountryPickerInteractor, "crossBorderCountryPickerInteractor");
        Intrinsics.checkNotNullParameter(countrySelectionInteractor, "countrySelectionInteractor");
        this.o = inputData;
        this.f73077p = crossBorderOpenBankingInteractor;
        this.f73078q = crossBorderCountryPickerInteractor;
        this.f73079r = countrySelectionInteractor;
        this.f73080s = mra.d.b(this, new k(new Data(null, null, true, 3, null), "", inputData.f176880c, false, null, f0.f322471a), stateMapper, null, false, 12);
        this.f73081t = e.a(this, new jnf.d(this, 1));
    }

    @Override // yji.l
    public final void I1() {
        l2(new m(this, null, 7), new yi5.b(26));
    }

    public final void I2() {
        g crossBorderOpenBankingOperationType = this.o.f176879b;
        d dVar = this.f73077p;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(crossBorderOpenBankingOperationType, "crossBorderOpenBankingOperationType");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        cf6.e eVar = dVar.f134904a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(crossBorderOpenBankingOperationType, "crossBorderOpenBankingOperationType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        yji.l.a1(this, nim.a.u(new c(crossBorderOpenBankingOperationType, continuation, 14), eVar.i.b(crossBorderOpenBankingOperationType, loadingStrategy)), null, null, new jij.h(this, continuation, 13), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f73081t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f73080s;
    }
}
