package xuj;

import com.revolut.retail.feature.impl.travel_trips.data.network.TravelTripsService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f309090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f309091b;

    public h(i iVar, int i) {
        this.f309090a = iVar;
        this.f309091b = i;
    }

    @Override // phm.a
    public final Object get() {
        i iVar = this.f309090a;
        nj0.a aVar = iVar.f309093b;
        ee0.a aVar2 = iVar.f309094c;
        int i = this.f309091b;
        switch (i) {
            case 0:
                pvj.c.Companion.getClass();
                return new pvj.a();
            case 1:
                return new yuj.a((tuj.g) iVar.f309103r.get());
            case 2:
                return new tuj.g((TravelTripsService) iVar.o.get(), (ne0.j) iVar.f309101p.get(), (ue0.c) iVar.f309102q.get());
            case 3:
                ek.a converterFactory = ((nj0.d) aVar).d();
                ik0.b retrofitFactory = ((nj0.d) aVar).m();
                s.j(retrofitFactory);
                k.Companion.getClass();
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(TravelTripsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                TravelTripsService travelTripsService = (TravelTripsService) objCreate;
                s.k(travelTripsService);
                return travelTripsService;
            case 4:
                return new ne0.d();
            case 5:
                je0.d mapper = aVar2.d();
                s.j(mapper);
                yk0.a databaseSessionProvider = iVar.d.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar2.f();
                s.j(storageFactory);
                m.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.c(storageFactory, databaseSessionProvider, "travel_trips", mapper, 2, 16);
            case 6:
                gte.a aVarB = iVar.f309092a.b();
                s.j(aVarB);
                return new ovj.a(aVarB);
            default:
                throw new AssertionError(i);
        }
    }
}
