package com.revolut.feature.wealth_discovery.impl.screener.screens.result;

import ble.c1;
import bof.r;
import cli.g;
import cli.y;
import com.revolut.feature.wealth_discovery.impl.screener.screens.result.ScreenerResultScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedSorting;
import d9.e1;
import java.util.List;
import k50.b2;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nqh.c;
import nqh.e;
import oki.h;
import sph.o;
import uqh.l0;
import uqh.t;
import uqh.u;
import uqh.z;
import vkm.j2;
import vkm.v1;
import vph.b;
import yji.l;
import zel.f;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements c {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f96269p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f96270q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vph.a f96271r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o5d.a f96272s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f96273t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(e inputData, o screenerInstrumentTypeMapper, u instrumentsExtension, vph.a closeConfirmationDialogMapper, o5d.a swipeAssetTradeActionsExtension, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(screenerInstrumentTypeMapper, "screenerInstrumentTypeMapper");
        Intrinsics.checkNotNullParameter(instrumentsExtension, "instrumentsExtension");
        Intrinsics.checkNotNullParameter(closeConfirmationDialogMapper, "closeConfirmationDialogMapper");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsExtension, "swipeAssetTradeActionsExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f96269p = screenerInstrumentTypeMapper;
        this.f96270q = instrumentsExtension;
        this.f96271r = closeConfirmationDialogMapper;
        this.f96272s = swipeAssetTradeActionsExtension;
        this.f96273t = d.b(this, new nqh.d(new z(new t(inputData.f218455a, inputData.f218456b), 1022), inputData.d, null), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new nk4.o(this, 13));
    }

    @Override // yji.l
    public final void I1() {
        e eVar = this.o;
        List list = eVar.f218456b;
        f fVar = eVar.f218455a;
        u uVar = this.f96270q;
        uVar.c3(1000, list, fVar);
        ScreenerSelectedSorting screenerSelectedSorting = eVar.d;
        if (screenerSelectedSorting != null) {
            uVar.b3(screenerSelectedSorting);
        }
        uVar.Z2(eVar.e);
    }

    public final void I2() {
        t tVar = ((nqh.d) ((j2) this.f96273t.f22677a).getValue()).f218452a.f282183a;
        List list = tVar != null ? tVar.f282176b : null;
        if (list == null) {
            list = f0.f322471a;
        }
        if (b.a(list, this.o.f218456b)) {
            C2(nqh.f.f218458a);
        } else {
            h.v2(this.u, ScreenerResultScreenContract$ModalStep.ResetFiltersConfirmation.f96265a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        v1 v1VarN = e1.N(new b2(2, this, a.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 16), (j2) ((l0) this.f96270q).f282162r.f22677a);
        l.b1(this, v1VarN, null, new nqh.l(this, null, 0), 3);
        l.b1(this, this.f96272s.Z2(new c1(v1VarN, 24)), null, new nqh.l(this, null, 1), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f96273t;
    }
}
