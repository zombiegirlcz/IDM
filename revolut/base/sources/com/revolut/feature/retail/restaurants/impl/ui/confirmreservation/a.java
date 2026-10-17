package com.revolut.feature.retail.restaurants.impl.ui.confirmreservation;

import beb.j;
import beb.l;
import beb.m;
import beb.o;
import beb.q;
import beb.t;
import beb.v;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.j2;
import wdb.n;
import wdb.w;
import yi5.b;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements j {

    @NotNull
    private static final o Companion = new o();
    public final ConfirmReservationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f82836p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f82837q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f82838r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f82839s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f82840t;

    public a(ConfirmReservationScreenContract$InputData inputData, n reservationsInteractor, w restaurantsPocketInteractor, beb.y stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(reservationsInteractor, "reservationsInteractor");
        Intrinsics.checkNotNullParameter(restaurantsPocketInteractor, "restaurantsPocketInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f82836p = reservationsInteractor;
        this.f82837q = restaurantsPocketInteractor;
        this.f82839s = d.b(this, new beb.h(new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), null, null, false), stateMapper, null, false, 12);
        this.f82840t = e.a(this, new m(this, 0));
    }

    @Override // yji.l
    public final void I1() {
        l2(new q(this, null), new b(26));
    }

    public final void I2(PaymentMethod.Pocket pocket) {
        a2 a2Var = this.f82838r;
        if (a2Var != null) {
            a2Var.f(null);
        }
        y yVar = this.f82839s;
        Reservation.Guarantee guaranteeC = ((beb.h) ((j2) yVar.f22677a).getValue()).c();
        if (guaranteeC == null) {
            H2(yVar, new bbh.a(18));
            return;
        }
        xdb.y yVar2 = (xdb.y) ((beb.h) ((j2) yVar.f22677a).getValue()).f14736b.getContent();
        H2(yVar, new l(yVar2, 0));
        this.f82838r = yji.l.a1(this, this.f82837q.d(guaranteeC, pocket), new t(this, yVar2, null), null, new v(this, yVar2, null), 2);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f82840t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f82839s;
    }
}
