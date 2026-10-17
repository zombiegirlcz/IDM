package com.revolut.feature.payments.groups.impl.ui_chat.group_transactions;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kxk.o;
import mra.d;
import ns9.e;
import ns9.f;
import oki.h;
import ps9.c;
import vii.b;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements f {
    public final GroupTransactionsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f79365p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f79366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f79367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f79368s;

    public a(GroupTransactionsScreenContract$InputData inputData, c interactor, o stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f79365p = interactor;
        this.f79366q = d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f79367r = new b();
        this.f79368s = hx7.e.a(this, new nk4.o(this, 15));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f79367r, new ns9.h(continuation, this, 0)), null, null, new nn7.d(this, continuation, 15), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f79368s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f79366q;
    }
}
