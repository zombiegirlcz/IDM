package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue;

import cd1.e;
import cli.y;
import com.revolut.data.model.Data;
import efm.r;
import g2e.m0;
import g75.i;
import g9j.v;
import gaa.g;
import gd8.j;
import ge1.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mra.d;
import nd1.c;
import nd1.n;
import oki.h;
import sfc.f;
import skm.a2;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends h implements ge1.h {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f60777p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f60778q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CatalogueScreenContract$InputData f60779r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f60780s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f60781t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(c catalogueInteractor, n shoppingCartInteractor, f litePosFeatureToggleInteractor, CatalogueScreenContract$InputData inputData, l stateMapper) {
        Intrinsics.checkNotNullParameter(catalogueInteractor, "catalogueInteractor");
        Intrinsics.checkNotNullParameter(shoppingCartInteractor, "shoppingCartInteractor");
        Intrinsics.checkNotNullParameter(litePosFeatureToggleInteractor, "litePosFeatureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = catalogueInteractor;
        this.f60777p = shoppingCartInteractor;
        this.f60778q = litePosFeatureToggleInteractor;
        this.f60779r = inputData;
        Data data = new Data(null, null, true, 3, null);
        e.Companion.getClass();
        this.f60781t = d.b(this, new ge1.f(data, e.f, false), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new i(this, 22));
    }

    @Override // yji.l
    public final void I1() {
        I2();
        H2(this.f60781t, new gd3.i(this, 3));
    }

    public final void I2() {
        a2 a2Var = this.f60780s;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        vkm.y yVar = new vkm.y(new g2d.c(2, 5, continuation), this.f60777p.c());
        c cVar = this.o;
        r map = u1.e(cVar.a(), cVar.b(), cVar.c(true)).map(new v(new j(8), 27));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f60780s = yji.l.a1(this, new t38.e(rd0.e.b(ue0.e.p(map, h0.f322473a)), 24, yVar, new m0(this, continuation, 8)), null, null, new g(this, continuation, 12), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f60781t;
    }
}
