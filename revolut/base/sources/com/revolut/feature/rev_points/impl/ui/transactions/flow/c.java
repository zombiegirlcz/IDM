package com.revolut.feature.rev_points.impl.ui.transactions.flow;

import cli.y;
import eub.l;
import fub.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import mra.d;
import njf.j;
import oi3.g;
import oki.h;
import org.jetbrains.annotations.NotNull;
import ox5.d0;
import p0c.i;
import rd0.e;
import skm.p0;
import te0.w;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends h implements p0c.b {

    @NotNull
    public static final a Companion = new a();
    public final TransactionDetailsPagerFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f83866p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f83867q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nhf.a f83868r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f83869s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ali.b f83870t;

    public c(TransactionDetailsPagerFlowContract$InputData inputData, l revPointsTransactionsPagingInteractor, k revPointsTransactionMapper, nhf.a unitedWalletInteractor, p0c.h saveStateDelegate) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsTransactionsPagingInteractor, "revPointsTransactionsPagingInteractor");
        Intrinsics.checkNotNullParameter(revPointsTransactionMapper, "revPointsTransactionMapper");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        this.o = inputData;
        this.f83866p = revPointsTransactionsPagingInteractor;
        this.f83867q = revPointsTransactionMapper;
        this.f83868r = unitedWalletInteractor;
        a aVar = Companion;
        List list = inputData.f83862a;
        aVar.getClass();
        this.f83869s = d.b(this, new p0c.c(a.a(list), inputData.f83863b, null), new i(), saveStateDelegate, false, 8);
        this.f83870t = s.b(this, new d0(19));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f83870t;
    }

    @Override // yji.l
    public final void I1() {
        yji.l.b1(this, q.C(new g(q.q(e.b(ue0.e.q(w.l(this.f83866p.b(), ((j) this.f83868r).f()), h0.f322473a))), this, 15), p0.f264002b), null, new b(this, null), 3);
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f83869s;
    }
}
