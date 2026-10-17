package u3c;

import cli.y;
import com.revolut.data.model.Data;
import d3c.b0;
import d3c.c0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends oki.h implements g {
    public final e3c.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dl2.a f276914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f276915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.c f276916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.c f276917s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f276918t;
    public final z1 u;

    public o(cli.n stateMapper, e3c.a ippShopRepository, dl2.a merchantRevolutShopFiscalInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(ippShopRepository, "ippShopRepository");
        Intrinsics.checkNotNullParameter(merchantRevolutShopFiscalInteractor, "merchantRevolutShopFiscalInteractor");
        this.o = ippShopRepository;
        this.f276914p = merchantRevolutShopFiscalInteractor;
        this.f276915q = mra.d.b(this, new e(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f276916r = new vii.c();
        this.f276917s = new vii.c();
        this.f276918t = new LinkedHashMap();
        this.u = vkm.q.b(1, 1, ukm.f.DROP_OLDEST);
    }

    @Override // yji.l
    public final void I1() {
        Unit unit = Unit.f186387a;
        vii.c cVar = this.f276916r;
        w4l.i iVar = w4l.i.f294643c;
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(cVar.a(unit, iVar), new j(0, continuation, this)), null, null, new k(0, continuation, this), 3);
        yji.l.a1(this, nim.a.v(vkm.q.Q(this.f276917s.a(unit, iVar), new j(1, continuation, this)), new u3a.g(17)), null, null, new k(1, continuation, this), 3);
    }

    public final void I2(c0 c0Var, int i) {
        Object next;
        b0 b0Var = (b0) ((e) ((j2) this.f276915q.f22677a).getValue()).f276896a.getContent();
        if (b0Var != null) {
            Iterator it8 = b0Var.f110997h.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it8.next();
                    if (Intrinsics.f(((c0) next).f111003a, c0Var.f111003a)) {
                        break;
                    }
                }
            }
            c0 c0Var2 = (c0) next;
            if (c0Var2 != null) {
                long j2 = c0Var2.d;
                long jI = kotlin.ranges.f.i(j2 + ((long) i), 0L, c0Var.e);
                Long lValueOf = jI != j2 ? Long.valueOf(jI) : null;
                if (lValueOf != null) {
                    this.u.k(new i(c0Var, lValueOf.longValue()));
                }
            }
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new m(1, null, this), new whi.b(6));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f276915q;
    }
}
