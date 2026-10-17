package com.revolut.feature.trusted_merchants.impl.ui.kompot.list;

import bjg.f;
import cli.g;
import cli.y;
import com.revolut.feature.trusted_merchants.impl.ui.TrustedMerchantsFlowContract$MerchantsContent;
import hx7.e;
import i3g.k;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import njg.b;
import njg.j;
import oki.h;
import yji.l;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements njg.a {
    public final yig.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f94432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f94433q;

    public a(k stateMapper, yig.a repository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.o = repository;
        f0 f0Var = f0.f322471a;
        this.f94432p = d.b(this, new b(new TrustedMerchantsFlowContract$MerchantsContent(f0Var, f0Var, true, true, null)), stateMapper, null, false, 12);
        this.f94433q = e.a(this, new n8i.e(this, 28));
    }

    @Override // yji.l
    public final void I1() {
        f fVar = (f) this.o;
        w4l.f fVar2 = fVar.d;
        Unit unit = Unit.f186387a;
        l.a1(this, new t38.e(rd0.e.b(fVar2.f(unit, true)), 24, rd0.e.b(fVar.e.f(unit, true)), new j(this, null)), null, null, new naf.j(this, null, 22), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f94433q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f94432p;
    }
}
