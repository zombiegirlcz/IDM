package com.revolut.feature.freelancer.impl.ui.invoice.details.screen;

import cli.g;
import cli.y;
import et6.b1;
import et6.p1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import mra.d;
import okf.m;
import oki.h;
import ox5.r;
import ox6.l;
import vii.b;
import vkm.q;
import xy6.c;
import zjh.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements l {
    public final qx6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f73866p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f73867q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b1 f73868r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p1 f73869s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InvoiceDetailsScreenContract$InputData f73870t;
    public final i u;
    public final c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f73871w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f73872x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f73873y;

    public a(qx6.a actionsBottomDialogFactory, j60.a bottomDialog, e dateProvider, b1 freelancerCustomersInteractor, p1 freelancerInvoiceInteractor, InvoiceDetailsScreenContract$InputData inputData, i invoiceTemplateInteractor, c taxBreakdownUiFactory, qx6.e stateMapper) {
        Intrinsics.checkNotNullParameter(actionsBottomDialogFactory, "actionsBottomDialogFactory");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(freelancerCustomersInteractor, "freelancerCustomersInteractor");
        Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(invoiceTemplateInteractor, "invoiceTemplateInteractor");
        Intrinsics.checkNotNullParameter(taxBreakdownUiFactory, "taxBreakdownUiFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = actionsBottomDialogFactory;
        this.f73866p = bottomDialog;
        this.f73867q = dateProvider;
        this.f73868r = freelancerCustomersInteractor;
        this.f73869s = freelancerInvoiceInteractor;
        this.f73870t = inputData;
        this.u = invoiceTemplateInteractor;
        this.v = taxBreakdownUiFactory;
        this.f73871w = new b();
        this.f73872x = d.b(this, new ox6.i(0), stateMapper, null, false, 12);
        this.f73873y = hx7.e.a(this, new or4.i(this, 13));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f73873y;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, q.Q(this.f73871w, new m(continuation, this, 12)), null, new r(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f73872x;
    }
}
