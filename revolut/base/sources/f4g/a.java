package f4g;

import com.revolut.feature.travel.flights.impl.data.network.TravelFlightsApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f132048b;

    public a(b bVar, int i) {
        this.f132047a = bVar;
        this.f132048b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f132047a;
        int i = this.f132048b;
        switch (i) {
            case 0:
                return new ne0.d();
            case 1:
                je0.d mapper = bVar.f132056b.b();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider = bVar.f132057c.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = bVar.f132056b.f();
                vc.s.j(storageFactory);
                f1.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "flights", mapper, 1, null, 48);
            case 2:
                return new b4g.f((TravelFlightsApi) bVar.f132066r.get(), (ne0.j) bVar.f132064p.get(), (ue0.c) bVar.f132065q.get());
            case 3:
                ek.a converterFactory = ((nj0.d) bVar.e).d();
                ik0.b retrofitFactory = ((nj0.d) bVar.e).m();
                vc.s.j(retrofitFactory);
                h1.Companion.getClass();
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(TravelFlightsApi.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                TravelFlightsApi travelFlightsApi = (TravelFlightsApi) objCreate;
                vc.s.k(travelFlightsApi);
                return travelFlightsApi;
            case 4:
                return new b4g.o0((TravelFlightsApi) bVar.f132066r.get());
            case 5:
                return new h4g.k((b4g.m0) bVar.u.get());
            case 6:
                return new b4g.m0((ne0.j) bVar.f132064p.get(), new i90.b(), (ue0.c) bVar.f132065q.get());
            case 7:
                return new h4g.i((b4g.e0) bVar.f132069w.get());
            case 8:
                return new b4g.e0();
            case 9:
                b4g.u uVar = (b4g.u) bVar.f132071y.get();
                qd0.b bVarN = bVar.d.n();
                vc.s.j(bVarN);
                return new h4g.e(uVar, bVarN);
            case 10:
                TravelFlightsApi travelFlightsApi2 = (TravelFlightsApi) bVar.f132066r.get();
                zk0.b bVarL = bVar.d.l();
                vc.s.j(bVarL);
                return new b4g.u(travelFlightsApi2, bVarL, (ne0.j) bVar.f132064p.get(), (ue0.c) bVar.f132065q.get());
            case 11:
                return new b4g.a0((TravelFlightsApi) bVar.f132066r.get(), (ne0.j) bVar.f132064p.get());
            case 12:
                return new b4g.i0((TravelFlightsApi) bVar.f132066r.get(), (ne0.j) bVar.f132064p.get());
            case 13:
                return new i4g.b();
            case 14:
                return new b4g.j((TravelFlightsApi) bVar.f132066r.get(), (ne0.j) bVar.f132064p.get(), (ue0.c) bVar.f132065q.get());
            case 15:
                return new b4g.y((TravelFlightsApi) bVar.f132066r.get(), (ne0.j) bVar.f132064p.get());
            case 16:
                return new b4g.d0((TravelFlightsApi) bVar.f132066r.get(), (ne0.j) bVar.f132064p.get());
            case 17:
                return new b4g.q((TravelFlightsApi) bVar.f132066r.get(), (ne0.j) bVar.f132064p.get());
            case 18:
                return new b4g.v((TravelFlightsApi) bVar.f132066r.get());
            default:
                throw new AssertionError(i);
        }
    }
}
