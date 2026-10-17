package uk2;

import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import com.revolut.data.model.Data;
import com.revolut.feature.atm.api.model.Atm;
import com.revolut.feature.atm.api.model.AtmBoundBox;
import com.revolut.feature.atm.api.model.AtmLocation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends oki.h implements dli.b {

    @NotNull
    public static final q Companion = new q();
    public final tk2.p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yj2.l f280664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ukm.q f280665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ukm.q f280666r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r f280667s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ah0.b f280668t;
    public boolean u;
    public final cli.y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final tse.c f280669w;

    public v(cli.n stateMapper, tk2.p atmCoordinator, yj2.l atmsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(atmCoordinator, "atmCoordinator");
        Intrinsics.checkNotNullParameter(atmsInteractor, "atmsInteractor");
        this.o = atmCoordinator;
        this.f280664p = atmsInteractor;
        this.f280665q = vc.s.a(-2, null, null, 6);
        ukm.q qVarA = vc.s.a(-2, null, null, 6);
        this.f280666r = qVarA;
        this.f280667s = r.USER_LOCATION;
        this.v = mra.d.b(this, new a((Data) atmCoordinator.f271849h.f290128a.getValue()), stateMapper, null, false, 12);
        this.f280669w = new tse.c(vkm.q.K(qVarA), this, 17);
    }

    public static AtmBoundBox J2(ah0.b bVar) {
        GmsLatLngBounds gmsLatLngBounds = (GmsLatLngBounds) bVar;
        ah0.a aVarA = gmsLatLngBounds.a();
        return new AtmBoundBox(new AtmLocation(gmsLatLngBounds.b().f4847a, gmsLatLngBounds.b().f4848b), new AtmLocation(gmsLatLngBounds.c().f4847a, gmsLatLngBounds.c().f4848b), new AtmLocation(aVarA.f4847a, aVarA.f4848b));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, this.o.d, null, null, new t(this, continuation, 0), 3);
        yji.l.a1(this, vkm.q.Q(vkm.q.K(this.f280665q), new uec.d(continuation, this, 4)), null, null, new t(this, continuation, 1), 3);
    }

    public final void I2(k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof j;
        tk2.p pVar = this.o;
        if (z) {
            Atm atm = ((j) event).f280653a;
            tk2.o source = tk2.o.LIST;
            pVar.getClass();
            Intrinsics.checkNotNullParameter(atm, "atm");
            Intrinsics.checkNotNullParameter(source, "source");
            pVar.i.k(new tk2.a(atm, source));
            return;
        }
        if (event instanceof g) {
            Integer numValueOf = Integer.valueOf(((g) event).f280650a);
            j2 j2Var = pVar.f271855q;
            j2Var.getClass();
            j2Var.g(null, numValueOf);
            return;
        }
        if (event instanceof f) {
            Integer numValueOf2 = Integer.valueOf(((f) event).f280649a);
            j2 j2Var2 = pVar.f271857s;
            j2Var2.getClass();
            j2Var2.g(null, numValueOf2);
            return;
        }
        if (event instanceof d) {
            zv0.b state = ((d) event).f280646a;
            pVar.getClass();
            Intrinsics.checkNotNullParameter(state, "state");
            j2 j2Var3 = pVar.k;
            j2Var3.getClass();
            j2Var3.g(null, state);
            if (state == zv0.b.HALF_EXPANDED && this.u) {
                this.u = false;
                pVar.b(tk2.k.f271842a);
                return;
            }
            return;
        }
        if (event instanceof e) {
            e eVar = (e) event;
            Integer numValueOf3 = Integer.valueOf(eVar.f280647a);
            Integer numValueOf4 = Integer.valueOf(eVar.f280648b);
            j2 j2Var4 = pVar.f271852m;
            j2Var4.getClass();
            j2Var4.g(null, numValueOf3);
            j2 j2Var5 = pVar.f271853n;
            j2Var5.getClass();
            j2Var5.g(null, numValueOf4);
            return;
        }
        if (!(event instanceof h)) {
            if (!(event instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            pVar.a(new tk2.e(((i) event).f280652a));
            return;
        }
        String str = ((h) event).f280651a;
        if (Intrinsics.f(str, "ATM_LOADING_ERROR_ITEM_ID")) {
            int i = s.f280661a[this.f280667s.ordinal()];
            if (i == 1) {
                pVar.b(tk2.l.f271843a);
                return;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                pVar.b(tk2.m.f271844a);
                return;
            }
        }
        if (Intrinsics.f(str, "ATM_NOT_FOUND_ITEM_ID")) {
            ah0.b bVar = this.f280668t;
            if (bVar == null) {
                bVar = (ah0.b) pVar.v.f290128a.getValue();
            }
            if (bVar != null) {
                this.f280665q.mo3647trySendJP2dKIU(new p(J2(bVar), sj2.c.AUTO_EXPANSION));
            }
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
