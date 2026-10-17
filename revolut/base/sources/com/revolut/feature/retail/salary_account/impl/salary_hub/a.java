package com.revolut.feature.retail.salary_account.impl.salary_hub;

import cli.g;
import cli.y;
import com.revolut.kompot.common.ExternalDestination;
import hcj.o;
import hg0.n;
import hgb.b;
import hgb.d0;
import hgb.k;
import hgb.l;
import hgb.w;
import hgb.x;
import hgb.z;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import q06.d;
import s06.c;
import vkm.j2;
import vkm.q;
import w4l.i;
import w4l.j;
import xfb.s;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements l {

    @NotNull
    private static final x Companion = new x();
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f82991p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wzi.a f82992q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f82993r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q06.l f82994s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f82995t;
    public final vii.b u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(d0 stateMapper, b bottomSheetProvider, s salaryHubInteractor, wzi.a incomeSorterInteractor, d deeplinkParser, q06.l deeplinkRouter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(bottomSheetProvider, "bottomSheetProvider");
        Intrinsics.checkNotNullParameter(salaryHubInteractor, "salaryHubInteractor");
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        this.o = bottomSheetProvider;
        this.f82991p = salaryHubInteractor;
        this.f82992q = incomeSorterInteractor;
        this.f82993r = deeplinkParser;
        this.f82994s = deeplinkRouter;
        this.f82995t = mra.d.b(this, new k(0), stateMapper, null, false, 12);
        this.u = new vii.b(i.f294643c);
        this.v = e.a(this, new hfb.d(this, 2));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.u, new o(continuation, this, 2)), null, null, new z(this, continuation, 1), 3);
        yji.l.a1(this, new q87.q(this.f82991p.f305229b.j(j.f294644c), 18), null, null, new z(this, continuation, 0), 3);
        H2(this.f82995t, new w(this, 0));
    }

    public final mgb.k I2() {
        return (mgb.k) ((k) ((j2) this.f82995t.f22677a).getValue()).f152145a.getContent();
    }

    public final void J2(String str) {
        Continuation continuation = null;
        if (((c) this.f82993r).c(str)) {
            n2(new n(this, str, continuation, 1), new whi.b(6));
        } else {
            C1(new ExternalDestination.Browser(str, null));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    public final void K2(Function0 function0) {
        mgb.d dVar;
        mgb.k kVarI2 = I2();
        if (kVarI2 == null || (dVar = kVarI2.f) == null || !dVar.f205230a) {
            function0.invoke();
        } else {
            n2(new n(this, function0, null, 2), new whi.b(6));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (j2 > 0) {
            this.u.a();
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.f82995t;
    }
}
