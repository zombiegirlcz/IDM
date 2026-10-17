package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review;

import aii.m;
import ang.f;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreenContract$InputData;
import ds6.f0;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import r3k.c;
import rt4.o;
import s47.j;
import s47.k;
import s47.n;
import s47.u;
import u47.g;
import vii.b;
import vkm.q;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements n {
    public final v47.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f74431p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f74432q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f74433r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f74434s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f74435t;

    public a(v47.a dialogFactory, g reviewExtension, f userInteractor, TaxHubTransactionExportReviewScreenContract$InputData inputData, u stateMapper) {
        f0 f0Var;
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(reviewExtension, "reviewExtension");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = dialogFactory;
        this.f74431p = reviewExtension;
        this.f74432q = userInteractor;
        this.f74433r = new b();
        if (inputData instanceof TaxHubTransactionExportReviewScreenContract$InputData.Inbound) {
            f0Var = f0.INBOUND;
        } else {
            if (!(inputData instanceof TaxHubTransactionExportReviewScreenContract$InputData.Outbound)) {
                throw new NoWhenBranchMatchedException();
            }
            f0Var = f0.OUTBOUND;
        }
        f0 f0Var2 = f0Var;
        this.f74434s = d.b(this, new j(f0Var2, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), h0.f322473a, inputData.getE()), stateMapper, null, false, 12);
        this.f74435t = e.a(this, new s42.f(this, 2));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f74433r, new c(continuation, this, 21)), null, null, new o(this, continuation, 27), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f74435t;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f74434s;
    }

    @Override // yji.l
    public final aii.n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof u47.d) {
            C2(new k(((u47.d) event).f277273b));
            return null;
        }
        if (!(event instanceof u47.e)) {
            return super.o2(event);
        }
        C2(new s47.l(((u47.e) event).f277274b));
        return null;
    }
}
