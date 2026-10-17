package y1l;

import com.revolut.retail.feature.travel_status.impl.data.service.TravelStatusService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f310389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f310390b;

    public a(b bVar, int i) {
        this.f310389a = bVar;
        this.f310390b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f310389a;
        ee0.a aVar = bVar.f310392b;
        nj0.a aVar2 = bVar.d;
        int i = this.f310390b;
        if (i == 0) {
            je0.d mapper = aVar.d();
            s.j(mapper);
            yk0.a databaseSessionProvider = bVar.f310393c.b();
            s.j(databaseSessionProvider);
            xe0.f storageFactory = aVar.f();
            s.j(storageFactory);
            k.Companion.getClass();
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
            Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
            return xe0.f.f(storageFactory, databaseSessionProvider, "travel_status", mapper, 0, null, 56);
        }
        if (i == 1) {
            return new u1l.b((TravelStatusService) bVar.f310398m.get(), (ue0.c) bVar.f310397l.get(), new ne0.d());
        }
        if (i != 2) {
            if (i == 3) {
                return new u1l.g((TravelStatusService) bVar.f310398m.get(), (ue0.c) bVar.f310397l.get(), new ne0.d());
            }
            if (i == 4) {
                return new u1l.e((TravelStatusService) bVar.f310398m.get(), (ue0.c) bVar.f310397l.get(), new ne0.d());
            }
            throw new AssertionError(i);
        }
        ik0.b retrofitFactory = ((nj0.d) aVar2).m();
        s.j(retrofitFactory);
        ek.a converterFactory = ((nj0.d) aVar2).d();
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(TravelStatusService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TravelStatusService travelStatusService = (TravelStatusService) objCreate;
        s.k(travelStatusService);
        return travelStatusService;
    }
}
