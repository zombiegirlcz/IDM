package com.revolut.feature.tax_residency.impl.screens.list;

import a31.v;
import ang.f;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import efm.r;
import hx7.e;
import ihm.k;
import joe.j;
import joe.o;
import koe.c0;
import koe.d0;
import koe.n;
import koe.s;
import koe.u;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rp0.l0;
import te0.w;
import tme.b;
import ufm.i;
import yji.l;
import zhm.f0;
import zi0.c;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements n {

    @NotNull
    public static final s Companion = new s();
    public final TaxResidencyListScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f90092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yme.a f90093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f90094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d0 f90095s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l0 f90096t;
    public final k u;
    public final k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f90097w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f90098x;

    public a(c0 stateMapper, TaxResidencyListScreenContract$InputData inputData, b dialogProvider, yme.a taxResidencyInteractor, f userInteractor, d0 taxResidencyRowActionsProvider, l0 popupMenuDialogDisplayer, k updateTaxResidencySubject, k updateTaxCertificationsSubject) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(taxResidencyRowActionsProvider, "taxResidencyRowActionsProvider");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(updateTaxResidencySubject, "updateTaxResidencySubject");
        Intrinsics.checkNotNullParameter(updateTaxCertificationsSubject, "updateTaxCertificationsSubject");
        this.o = inputData;
        this.f90092p = dialogProvider;
        this.f90093q = taxResidencyInteractor;
        this.f90094r = userInteractor;
        this.f90095s = taxResidencyRowActionsProvider;
        this.f90096t = popupMenuDialogDisplayer;
        this.u = updateTaxResidencySubject;
        this.v = updateTaxCertificationsSubject;
        this.f90097w = d.b(this, new koe.h(c.P(inputData.f90083c, false, null, 3), c.P(inputData.d, false, null, 3), c.P(inputData.e, false, null, 3), inputData.f90085h ? new Data(null, null, true, 3, null) : c.P(f0.f322471a, false, null, 3)), stateMapper, null, false, 12);
        this.f90098x = e.a(this, new kj4.c(this, 9));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new v(this, null), new yi5.b(26));
        l.a1(this, rd0.e.b(this.u), null, null, new u(this, continuation, 1), 3);
        r rVarFlatMapSingle = this.v.filter(new km2.b(8, new koe.r(this, 1))).flatMapSingle(new km2.b(9, new koe.r(this, 2)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
        l.a1(this, rd0.e.b(rVarFlatMapSingle), null, null, null, 7);
        l.a1(this, rd0.e.b(this.f90096t.f256113c), null, null, new u(this, continuation, 2), 3);
    }

    public final ufm.f I2() {
        efm.d0<ioe.k> certifications = ((o) ((hoe.a) this.f90093q).f154277a).f176939a.getCertifications();
        j jVar = j.f;
        int i = 3;
        joe.e eVar = new joe.e(i);
        certifications.getClass();
        i iVar = new i(certifications, eVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.f fVar = new ufm.f(new ufm.f(w.i0(iVar), new km2.b(10, new koe.r(this, i)), 1), new km2.b(11, new koe.r(this, 4)), 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J2(com.revolut.core.ui_kit.delegates.RowDelegate.Model r26) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.tax_residency.impl.screens.list.a.J2(com.revolut.core.ui_kit.delegates.RowDelegate$Model):void");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f90098x;
    }

    @Override // cli.z
    public final g getState() {
        return this.f90097w;
    }
}
