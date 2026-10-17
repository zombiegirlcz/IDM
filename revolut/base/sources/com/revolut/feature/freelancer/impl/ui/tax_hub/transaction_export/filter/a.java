package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter;

import cli.g;
import cli.y;
import gr6.q;
import hcj.o;
import hx7.e;
import i47.j;
import i47.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vii.b;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements j {
    public final TaxHubTransactionExportFilterScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f74379p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f74380q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f74381r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f74382s;

    public a(TaxHubTransactionExportFilterScreenContract$InputData inputData, q taxHubTransactionExportInteractor, r stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxHubTransactionExportInteractor, "taxHubTransactionExportInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f74379p = taxHubTransactionExportInteractor;
        this.f74380q = new b();
        this.f74381r = d.b(this, new i47.h(0), stateMapper, null, false, 12);
        this.f74382s = e.a(this, new hw9.b(this, 28));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, vkm.q.Q(this.f74380q, new o(continuation, this, 15)), null, null, new i13.d(this, continuation, 11), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f74382s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f74381r;
    }
}
