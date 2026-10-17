package com.revolut.feature.credit.card.impl.ui.statement.export;

import al4.n;
import an4.e;
import ang.f;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nk4.o;
import nv4.i;
import nv4.j;
import nv4.r;
import nv4.t;
import oki.h;
import om4.x2;
import vkm.j2;
import yji.l;
import zh9.u0;
import zhm.h0;
import zi0.c;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends h implements j {
    public final CreditCardStatementExportScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f69699p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f69700q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hk0.a f69701r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f69702s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f69703t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(CreditCardStatementExportScreenContract$InputData inputData, e navigationFactory, n creditCardInteractor, hk0.a networkFileRepository, f userInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navigationFactory, "navigationFactory");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69699p = navigationFactory;
        this.f69700q = creditCardInteractor;
        this.f69701r = networkFileRepository;
        this.f69702s = userInteractor;
        this.f69703t = d.b(this, new i(null, nv4.h.PDF, new Data(null, null, false, 7, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new o(this, 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.credit.card.impl.ui.statement.export.b r7, java.time.LocalDate r8, nv4.h r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.card.impl.ui.statement.export.b.I2(com.revolut.feature.credit.card.impl.ui.statement.export.b, java.time.LocalDate, nv4.h, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.n(nim.a.v(u0.m(nim.a.v(((x2) this.f69700q).s(this.o.f69693a, w4l.h.f294642c), new nuc.n(3)), nim.a.v(this.f69702s.j(w4l.j.f294644c), r.f)), new nuc.n(2)), h0.f322473a), null, null, new t(this, null, 0), 3);
    }

    public final nv4.f J2() {
        return (nv4.f) c.I(((i) ((j2) this.f69703t.f22677a).getValue()).d);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f69703t;
    }
}
