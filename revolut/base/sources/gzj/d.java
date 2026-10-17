package gzj;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import ffk.t;
import gna.i;
import gqh.o;
import gzg.a0;
import hd.r;
import hzj.j;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rp0.n0;
import te0.w;
import w4l.h;
import yj2.l;
import yji.n;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends bzj.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final yk2.a f148143l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r f148144m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f148145n;
    public final bzj.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f148146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a5h.g f148147q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r60.b f148148r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mzj.g f148149s;

    public d(yk2.a atmNetworkControllerExtension, r limitsDataSource, j limitItemsMapper, bzj.a configuration, Set limitTypes, a5h.g limitsPromptDataSource, r60.b promptControllerExtension, mzj.g limitsPromptNavigationProvider) {
        Intrinsics.checkNotNullParameter(atmNetworkControllerExtension, "atmNetworkControllerExtension");
        Intrinsics.checkNotNullParameter(limitsDataSource, "limitsDataSource");
        Intrinsics.checkNotNullParameter(limitItemsMapper, "limitItemsMapper");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(limitTypes, "limitTypes");
        Intrinsics.checkNotNullParameter(limitsPromptDataSource, "limitsPromptDataSource");
        Intrinsics.checkNotNullParameter(promptControllerExtension, "promptControllerExtension");
        Intrinsics.checkNotNullParameter(limitsPromptNavigationProvider, "limitsPromptNavigationProvider");
        this.f148143l = atmNetworkControllerExtension;
        this.f148144m = limitsDataSource;
        this.f148145n = limitItemsMapper;
        this.o = configuration;
        this.f148146p = limitTypes;
        this.f148147q = limitsPromptDataSource;
        this.f148148r = promptControllerExtension;
        this.f148149s = limitsPromptNavigationProvider;
    }

    @Override // yji.n
    public final void H2() {
        r60.d dVar = (r60.d) this.f148148r;
        efm.r rVarMergeWith = w.a0(dVar.d.d(), new a0(1)).flatMapSingle(new gv5.b(new a(this, 0), 20)).mergeWith(w.a0(dVar.d.f(), new a0(2)).flatMapSingle(new gv5.b(new a(this, 1), 21)));
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        Continuation continuation = null;
        n.l2(this, rd0.e.b(rVarMergeWith), null, new gul.n(this, continuation, 10), 3);
        efm.r map = dVar.d.f256148b.d.map(new rof.e(21, new n0(0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        n.l2(this, rd0.e.b(map), null, new b(this, null), 3);
        n.l2(this, rd0.e.b(w.a0(dVar.d.d(), new a0(3))), null, new o(this, continuation, 8), 3);
    }

    @Override // bzj.b
    public final efm.r Z2() {
        AccountId accountId = this.o.f20047b;
        r rVar = this.f148144m;
        t tVar = (t) rVar.f151364a;
        Set limitTypes = this.f148146p;
        Intrinsics.checkNotNullParameter(limitTypes, "limitTypes");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Pair pair = limitTypes.contains(czj.a.PRICING_PLAN) ? new Pair(nim.a.w(tVar.t(true), new gwe.d(rVar, 10)), nim.a.w(tVar.v(h.f294642c), new a0(4))) : new Pair(zi0.c.j(f0.f322471a), zi0.c.j(Boolean.FALSE));
        efm.r rVar2 = (efm.r) pair.f186385a;
        efm.r rVar3 = (efm.r) pair.f186386b;
        efm.r rVarU = limitTypes.contains(czj.a.WALLET) ? ((wsg.n) rVar.f151365b).U(accountId, true) : zi0.c.j(f0.f322471a);
        efm.r rVarW = nim.a.w(((l) rVar.f151366c).f314396c.k(false), new yi5.b(16));
        efm.r rVarStartWith = mt8.d.c((mt8.d) rVar.d).x().map(new gv5.b(new a0(6), 22)).startWith(new Data(null, null, true, 3, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return m70.a.f(nim.a.w(mif.a.h(rVar2, rVar3, rVarU, rVarW, rVarStartWith, hng.g.b(((ang.b) ((l61.a) rVar.f)).f7765a)), new a0(5)), new i(this, 14), new ghl.c(this, 28), new gug.c(16));
    }

    @Override // bzj.b
    public final void b3(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (!this.f148143l.Z2(model)) {
            Object obj2 = model.u;
            if (obj2 instanceof czj.d) {
                V2(new gsh.w(this, (czj.d) obj2, this.o.f20047b, null, 8), new yi5.b(29));
            }
        }
    }
}
