package se1;

import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nd1.n;
import rvc.k;
import skm.a2;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f262089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nd1.i f262090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xd1.d f262091r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f01.a f262092s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c90.c f262093t;
    public a2 u;
    public final d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p stateMapper, n cartInteractor, nd1.i currencyInteractor, xd1.d fieldsInteractor, f01.a uiKitResources, c90.c uiResources) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cartInteractor, "cartInteractor");
        Intrinsics.checkNotNullParameter(currencyInteractor, "currencyInteractor");
        Intrinsics.checkNotNullParameter(fieldsInteractor, "fieldsInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f262089p = cartInteractor;
        this.f262090q = currencyInteractor;
        this.f262091r = fieldsInteractor;
        this.f262092s = uiKitResources;
        this.f262093t = uiResources;
        this.v = new d(0);
    }

    public static void y2(i iVar) {
        iVar.x2(new exe.c(((d) iVar.t2()).d, ((d) iVar.t2()).f262080a.f115083b));
    }

    public final void A2(String str) {
        if (Intrinsics.f(((d) t2()).f262081b, str)) {
            return;
        }
        x2(new k(str, 29));
        z2(((d) t2()).f262080a, str, ((d) t2()).e);
    }

    public final void B2(TaxRate taxRate) {
        if (Intrinsics.f(((d) t2()).e, taxRate)) {
            return;
        }
        x2(new scl.e(taxRate, 8));
        z2(((d) t2()).f262080a, ((d) t2()).f262081b, taxRate);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new h(this, continuation, 1), new yi5.b(26));
        com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g) this.f262091r;
        l.a1(this, gVar.f60739q.d(), null, null, new s56.i(this, continuation, 29), 3);
        l.a1(this, gVar.f60745y, null, null, new s1k.b(this, continuation, 29), 3);
        l2(new h(this, continuation, 0), new yi5.b(26));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }

    public final void z2(dj0.d dVar, String str, TaxRate taxRate) {
        a2 a2Var = this.u;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.u = n2(new qg7.p(this, dVar, str, taxRate, (Continuation) null, 27), new whi.b(6));
    }
}
