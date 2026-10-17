package com.revolut.feature.card_management.impl.cardlimit.screens.overview;

import cli.g;
import cli.y;
import com.revolut.feature.card_management.impl.cardlimit.domain.CardLimitSetData;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import mra.d;
import nz2.i;
import nz2.j;
import nz2.q;
import oki.h;
import vkm.j2;
import wsg.n;
import yi5.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements j {
    public final CardLimitOverviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f64830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fk3.a f64831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f64832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f64833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f64834t;

    public a(cli.n stateMapper, CardLimitOverviewScreenContract$InputData inputData, f cardsInteractor, fk3.a configurationInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.o = inputData;
        this.f64830p = cardsInteractor;
        this.f64831q = configurationInteractor;
        this.f64832r = walletInteractor;
        this.f64833s = d.b(this, new nz2.h(null), stateMapper, null, false, 12);
        this.f64834t = e.a(this, new nx2.f(this, 6));
    }

    @Override // yji.l
    public final void I1() {
        l2(new q(this, null), new b(26));
    }

    public final void I2() {
        jz2.a aVar = ((nz2.h) ((j2) this.f64833s.f22677a).getValue()).f220940a;
        if (aVar != null) {
            C2(new i(new CardLimitSetData(aVar.f179580a.f150110a, aVar.f179581b, aVar.f179582c, aVar.d)));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f64834t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f64833s;
    }
}
