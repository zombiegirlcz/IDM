package com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown;

import aa6.c;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.donations.api.model.quote.DonationQuoteRequest;
import gul.n;
import hb6.b;
import hb6.f;
import hb6.g;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import sa6.t;
import w4l.j;
import ya6.z;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final DonationBreakdownContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f72007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f72008q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f72009r;

    public a(DonationBreakdownContract$InputData inputData, c donationsInteractor, f stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f72007p = donationsInteractor;
        this.f72008q = d.b(this, new hb6.a(new Data(inputData.f72005b, null, false, 6, null)), stateMapper, null, false, 12);
        this.f72009r = e.a(this, new g(0));
    }

    @Override // yji.l
    public final void I1() {
        DonationQuoteRequest quoteRequest = this.o.f72004a;
        t tVar = (t) this.f72007p;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(quoteRequest, "quoteRequest");
        z zVar = (z) tVar.f261345a;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(quoteRequest, "quoteRequest");
        l.a1(this, zi0.c.w(zVar.f311993l.b(quoteRequest, j.f294644c)), null, null, new n(this, null, 29), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f72009r;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f72008q;
    }
}
