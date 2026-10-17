package d92;

import ag1.k;
import cqh.m;
import go.g;
import hrf.f;
import i1l.h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s82.c;
import s82.d;
import yji.n;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s82.b f112332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f112333m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q82.a f112334n;

    public b(s82.b amountBalanceValidator, d withdrawalValidator, q82.a transferErrorStateMapper) {
        Intrinsics.checkNotNullParameter(amountBalanceValidator, "amountBalanceValidator");
        Intrinsics.checkNotNullParameter(withdrawalValidator, "withdrawalValidator");
        Intrinsics.checkNotNullParameter(transferErrorStateMapper, "transferErrorStateMapper");
        this.f112332l = amountBalanceValidator;
        this.f112333m = withdrawalValidator;
        this.f112334n = transferErrorStateMapper;
    }

    public final m Z2(t82.a data) {
        Intrinsics.checkNotNullParameter(data, "data");
        g gVar = data.f268799b > 0 ? new g(f0.f322471a, 2) : new g(u.c(h.f157651a), 2);
        s82.a aVar = new s82.a(data.f268800c.getF92243g().f115082a, data.f268799b, f.OUTGOING);
        this.f112332l.getClass();
        g gVar2 = new g(s82.b.a(aVar).f316033b, 2);
        c cVar = new c(new dj0.d(data.f268799b, w62.a.f295373a), data.f268798a);
        this.f112333m.getClass();
        return new m(new k((Flow[]) d0.d1(v.k(gVar, gVar2, new g(d.a(cVar).f316033b, 2))).toArray(new Flow[0]), 14), this, 7);
    }
}
