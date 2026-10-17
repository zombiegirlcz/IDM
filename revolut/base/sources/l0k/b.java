package l0k;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.marketnews.impl.data.database.MarketNewsDatabase;
import com.revolut.retail.feature.marketnews.impl.data.network.services.ScopedSymbolsService;
import com.revolut.retail.feature.marketnews.impl.data.network.wealth.WealthNewsService;
import ewg.w;
import org.joda.time.format.DateTimeFormatter;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f191257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f191258b;

    public b(c cVar, int i) {
        this.f191257a = cVar;
        this.f191258b = i;
    }

    @Override // phm.a
    public final Object get() {
        c cVar = this.f191257a;
        int i = this.f191258b;
        switch (i) {
            case 0:
                return new m0k.a((i0k.b) cVar.f191272t.get());
            case 1:
                ScopedSymbolsService scopedSymbolsService = (ScopedSymbolsService) cVar.f191269q.get();
                zzj.b bVar = (zzj.b) cVar.f191271s.get();
                wzj.b bVar2 = new wzj.b(new ne0.d());
                b80.c cVarP = cVar.e.p();
                s.j(cVarP);
                return new i0k.b(scopedSymbolsService, bVar, bVar2, cVarP);
            case 2:
                return w.x((Retrofit) cVar.f191268p.get());
            case 3:
                ik0.b bVarM = ((nj0.d) cVar.f191259a).m();
                s.j(bVarM);
                return f0k.c.a(((nj0.d) cVar.f191259a).d(), bVarM);
            case 4:
                return a0k.b.y((MarketNewsDatabase) cVar.f191270r.get());
            case 5:
                Context context = cVar.f191260b;
                yk0.a aVarB = cVar.f191261c.b();
                s.j(aVarB);
                return a0k.b.j(context, aVarB, ((c21.b) cVar.d).b());
            case 6:
                return new m0k.e((i0k.h) cVar.D.get(), (n0k.d) cVar.G.get());
            case 7:
                return new i0k.h((w4l.f) cVar.z.get(), (w4l.f) cVar.A.get(), (w4l.f) cVar.B.get(), (w4l.f) cVar.C.get());
            case 8:
                return bjf.f.x((p0k.a) cVar.f191275y.get());
            case 9:
                WealthNewsService wealthNewsService = (WealthNewsService) cVar.v.get();
                ne0.d dVar = new ne0.d();
                zzj.f fVar = (zzj.f) cVar.f191273w.get();
                DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) cVar.f191274x.get();
                b80.c cVarP2 = cVar.e.p();
                s.j(cVarP2);
                return new i0k.g(wealthNewsService, dVar, fVar, dateTimeFormatter, cVarP2);
            case 10:
                return f0k.d.B((Retrofit) cVar.f191268p.get());
            case 11:
                return a0k.b.B((MarketNewsDatabase) cVar.f191270r.get());
            case 12:
                return c0k.c.a();
            case 13:
                return bjf.f.z((p0k.a) cVar.f191275y.get());
            case 14:
                return bjf.f.w((p0k.a) cVar.f191275y.get());
            case 15:
                return bjf.f.y((p0k.a) cVar.f191275y.get());
            case 16:
                return new n0k.d(ImmutableSet.of((n0k.a) cVar.E.get(), (n0k.a) cVar.F.get()));
            case 17:
                ybl.b bVarB = cVar.f.b();
                s.j(bVarB);
                return new n0k.f(bVarB);
            case 18:
                ufm.g gVarE = cVar.f191262g.E();
                zjh.i iVar = new zjh.i(cVar.f191263h.b());
                fk3.a aVarA = cVar.i.a();
                s.j(aVarA);
                return new n0k.c(gVarE, iVar, aVarA);
            case 19:
                h9h.a aVar = cVar.f191262g;
                return new v0k.d(new jbh.f());
            case 20:
                return kxa.j.u(cVar.f191265l, cVar.f191260b);
            default:
                throw new AssertionError(i);
        }
    }
}
