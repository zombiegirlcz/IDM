package com.revolut.feature.wealth.impl.ui.screens.popularassets;

import a0h.b;
import cli.y;
import d9.e1;
import g9h.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kxk.o;
import oki.h;
import q87.q;
import r6f.i;
import rbj.g;
import rch.d;
import rch.e;
import rch.n;
import rch.s;
import vkm.j2;
import vkm.v1;
import ybl.l;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements d {
    public final PopularAssetsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ryc.a f95630p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f95631q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aah.h f95632r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f95633s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f95634t;
    public final o5d.a u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f95635w;

    public a(o stateMapper, PopularAssetsControllerContract$InputData inputData, ryc.a popularAssetsInteractor, l tradingConfigInteractor, aah.h disclaimersExtension, s popularAssetsLearnMoreDialogProvider, c assetDetailsNotAvailableProvider, o5d.a swipeActionsControllerModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(popularAssetsInteractor, "popularAssetsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(disclaimersExtension, "disclaimersExtension");
        Intrinsics.checkNotNullParameter(popularAssetsLearnMoreDialogProvider, "popularAssetsLearnMoreDialogProvider");
        Intrinsics.checkNotNullParameter(assetDetailsNotAvailableProvider, "assetDetailsNotAvailableProvider");
        Intrinsics.checkNotNullParameter(swipeActionsControllerModelExtension, "swipeActionsControllerModelExtension");
        this.o = inputData;
        this.f95630p = popularAssetsInteractor;
        this.f95631q = tradingConfigInteractor;
        this.f95632r = disclaimersExtension;
        this.f95633s = popularAssetsLearnMoreDialogProvider;
        this.f95634t = assetDetailsNotAvailableProvider;
        this.u = swipeActionsControllerModelExtension;
        this.v = mra.d.b(this, new e(inputData.f95627a, inputData.f95628b, null, null, null, null), stateMapper, null, false, 12);
        this.f95635w = hx7.e.a(this, new i(this, 12));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f95635w;
    }

    @Override // yji.l
    public final void T1(long j2) {
        a0h.a aVar;
        PopularAssetsControllerContract$InputData popularAssetsControllerContract$InputData = this.o;
        mzg.d dVar = popularAssetsControllerContract$InputData.f95627a;
        int[] iArr = rch.l.f253281a;
        int i = iArr[dVar.ordinal()];
        if (i == 1) {
            aVar = a0h.a.CRYPTO;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = a0h.a.STOCKS;
        }
        v1 v1VarN = e1.N(new rch.o(2, this, a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 0), rd0.e.b(this.f95630p.h(new b(aVar, popularAssetsControllerContract$InputData.f95628b), false)));
        yji.l.b1(this, v1VarN, null, new n(this, null, 0), 3);
        yji.l.b1(this, this.u.Z2(new q(nim.a.v(v1VarN, new g(10)), 2)), null, new n(this, null, 1), 3);
        yji.l.b1(this, l.d(this.f95631q), null, new n(this, null, 2), 3);
        int i2 = iArr[((e) ((j2) this.v.f22677a).getValue()).f253271a.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            yji.l.b1(this, nim.a.v(this.f95632r.f2828l.w0(), new raf.o(this, 6)), null, new n(this, null, 3), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
