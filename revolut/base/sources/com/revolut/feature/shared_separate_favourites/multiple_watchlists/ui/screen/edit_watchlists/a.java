package com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.edit_watchlists;

import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import l3d.r;
import mra.d;
import oki.h;
import qgd.g;
import x2g.b;
import xgd.k;
import xgd.m;
import xgd.q;
import xgd.t;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements k {
    public final EditWatchlistsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f86924p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xgd.r f86925q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pgd.a f86926r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f86927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f86928t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(EditWatchlistsControllerContract$InputData inputData, t stateMapper, r multipleWatchlistInteractor, xgd.r updateWatchlistsOrderInScreen, pgd.a removeWatchlistConfirmationBottomSheetBuilder, g newWatchlistDialogMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(multipleWatchlistInteractor, "multipleWatchlistInteractor");
        Intrinsics.checkNotNullParameter(updateWatchlistsOrderInScreen, "updateWatchlistsOrderInScreen");
        Intrinsics.checkNotNullParameter(removeWatchlistConfirmationBottomSheetBuilder, "removeWatchlistConfirmationBottomSheetBuilder");
        Intrinsics.checkNotNullParameter(newWatchlistDialogMapper, "newWatchlistDialogMapper");
        this.o = inputData;
        this.f86924p = multipleWatchlistInteractor;
        this.f86925q = updateWatchlistsOrderInScreen;
        this.f86926r = removeWatchlistConfirmationBottomSheetBuilder;
        this.f86927s = newWatchlistDialogMapper;
        this.f86928t = d.b(this, new m(0), stateMapper, null, false, 12);
        this.u = e.a(this, new b(this, 25));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, nim.a.v(this.f86924p.f(this.o.f86920a.f86890b), new q(this, 0)), null, new x64.b(this, null, 22), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f86928t;
    }
}
