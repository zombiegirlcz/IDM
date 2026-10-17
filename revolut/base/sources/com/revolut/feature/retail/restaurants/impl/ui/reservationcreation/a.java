package com.revolut.feature.retail.restaurants.impl.ui.reservationcreation;

import cli.y;
import com.revolut.data.model.Data;
import ieb.g;
import ieb.i;
import ieb.j;
import ieb.m;
import ieb.p;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import l80.e;
import mra.d;
import nkm.t;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.j2;
import wdb.n;
import xdb.v;
import yi5.b;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements j {

    @NotNull
    private static final m Companion = new m();
    public final ReservationCreationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f82861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f82862q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f82863r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f82864s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f82865t;
    public final com.revolut.kompot.navigable.vc.modal.a u;
    public final y v;

    public a(ReservationCreationScreenContract$InputData inputData, n reservationsInteractor, e dateProvider, wj0.a idempotencyKeyHolder, p stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(reservationsInteractor, "reservationsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f82861p = reservationsInteractor;
        this.f82862q = dateProvider;
        this.f82863r = idempotencyKeyHolder;
        this.u = hx7.e.a(this, new i69.p(this, 14));
        this.v = d.b(this, new g(new Data(null, null, true, 3, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), null, null), stateMapper, null, false, 12);
    }

    public static final Data I2(a aVar, Data data, Data data2) {
        return (data.getError() == null || data.getContent() != null || data2.getContent() == null) ? data : Data.copy$default(data, data2.getContent(), null, false, 6, null);
    }

    public static nkm.j L2(List list, List list2) {
        Sequence[] elements = {d0.Q(list), nkm.y.s(d0.Q(list2), new id8.a(18))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return nkm.y.s(t.e(kotlin.collections.d.E(elements)), new id8.a(19));
    }

    @Override // yji.l
    public final void I1() {
        K2();
    }

    public final void J2() {
        v vVar;
        a2 a2Var = this.f82865t;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        y yVar = this.v;
        i iVar = ((g) ((j2) yVar.f22677a).getValue()).f160687g;
        if (iVar == null || (vVar = (v) ((g) ((j2) yVar.f22677a).getValue()).f160684a.getContent()) == null) {
            return;
        }
        H2(yVar, new id8.a(17));
        this.f82865t = l2(new i4g.d(this, vVar, iVar, continuation, 2), new b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    public final void K2() {
        a2 a2Var = this.f82864s;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f82864s = l2(new i44.a(this, continuation, 20), new i4g.g(1, this, a.class, "handleReservationPageError", "handleReservationPageError(Ljava/lang/Throwable;)Z", 0, 11));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
