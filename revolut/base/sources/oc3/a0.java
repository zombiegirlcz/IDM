package oc3;

import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreenContract$InputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oc3.m;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class a0 extends jki.g implements n {

    @NotNull
    private static final t Companion = new t();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nb3.b f224051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t1 f224052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w39.b f224053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CashTopUpLocationsMapScreenContract$InputData f224054s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f224055t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 mapper, nb3.b cashTopUpInteractor, t1 barcodeInteractor, w39.b locationInteractor, CashTopUpLocationsMapScreenContract$InputData inputData) {
        super(mapper);
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(cashTopUpInteractor, "cashTopUpInteractor");
        Intrinsics.checkNotNullParameter(barcodeInteractor, "barcodeInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f224051p = cashTopUpInteractor;
        this.f224052q = barcodeInteractor;
        this.f224053r = locationInteractor;
        this.f224054s = inputData;
        this.f224055t = new h(0);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        if (this.f224054s.f65678a == cb3.a.EU_FLOW) {
            yji.l.b1(this, rd0.e.b(this.f224052q.j()), null, new z(this, null, 1), 3);
        }
        yji.l.b1(this, blm.g.a(((z39.b) this.f224053r).f319221b.h(50.0f, 10000L)), null, new z(this, null, 0), 3);
        if (((h) t2()).f224063a) {
            n2(new x(this, continuation, 1), new whi.b(6));
        }
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f224055t;
    }

    public final void y2(CashTopUpLocationInfo location, ub3.a aVar) {
        String str = location.f;
        Intrinsics.checkNotNullParameter(location, "location");
        int i = aVar == null ? -1 : u.f224083a[aVar.ordinal()];
        if (i == -1) {
            IllegalStateException illegalStateException = new IllegalStateException("Button type should be configured but was null");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        if (i == 1) {
            v2(new i(str));
            return;
        }
        if (i == 2) {
            v2(m.a.f224072a);
        } else if (i == 3) {
            v2(new k(location));
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            v2(new l(str));
        }
    }
}
