package kti;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.airport.security_fast_track.impl.network.AsftAirportsService;
import com.revolut.retail.feature.airport.security_fast_track.impl.network.AsftConfigService;
import com.revolut.retail.feature.airport.security_fast_track.impl.network.AsftPassesService;
import com.revolut.retail.feature.airport.security_fast_track.impl.network.AsftSlotPrebookingService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import mti.l;
import mti.n;
import mti.p;
import pti.k;
import pti.z;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f189533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f189534b;

    public f(g gVar, int i) {
        this.f189533a = gVar;
        this.f189534b = i;
    }

    @Override // phm.a
    public final Object get() {
        int i = 6;
        int i2 = 5;
        int i3 = 4;
        int i5 = 3;
        int i6 = 2;
        int i21 = 1;
        g gVar = this.f189533a;
        int i22 = this.f189534b;
        switch (i22) {
            case 0:
                gVar.getClass();
                return new iti.b(ImmutableSet.of(new jti.a()), (cti.a) gVar.i.get());
            case 1:
                return new nti.a();
            case 2:
                return new ne0.d();
            case 3:
                je0.d mapper = gVar.f189535a.d();
                s.j(mapper);
                yk0.a databaseSessionProvider = gVar.f189536b.b();
                s.j(databaseSessionProvider);
                xe0.f fVarF = gVar.f189535a.f();
                s.j(fVarF);
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                int i32 = 5;
                return xe0.f.f(fVarF, databaseSessionProvider, "asft_config_storage", mapper, 4, v.k(v0.a.c(fVarF, "storageFactory", 1, 2), new exa.a(i6, i5, i32), new exa.a(i5, i3, i32)), 32);
            case 4:
                je0.d mapper2 = gVar.f189535a.d();
                s.j(mapper2);
                yk0.a databaseSessionProvider2 = gVar.f189536b.b();
                s.j(databaseSessionProvider2);
                xe0.f fVarF2 = gVar.f189535a.f();
                s.j(fVarF2);
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                int i33 = 5;
                return xe0.f.f(fVarF2, databaseSessionProvider2, "asft_airports_storage", mapper2, 6, v.k(v0.a.c(fVarF2, "storageFactory", 1, 2), new exa.a(i6, i5, i33), new exa.a(i5, i3, i33), new exa.a(i3, i2, i33), new exa.a(i2, i, i33)), 32);
            case 5:
                je0.d mapper3 = gVar.f189535a.d();
                s.j(mapper3);
                yk0.a databaseSessionProvider3 = gVar.f189536b.b();
                s.j(databaseSessionProvider3);
                xe0.f fVarF3 = gVar.f189535a.f();
                s.j(fVarF3);
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper3, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                int i43 = 5;
                return xe0.f.f(fVarF3, databaseSessionProvider3, "asft_passes_storage", mapper3, 7, v.k(v0.a.c(fVarF3, "storageFactory", 1, 2), new exa.a(i6, i5, i43), new exa.a(i5, i3, i43), new exa.a(i3, i2, i43), new exa.a(i2, i, i43), new exa.a(i, 7, 5)), 32);
            case 6:
                je0.d mapper4 = gVar.f189535a.d();
                s.j(mapper4);
                yk0.a databaseSessionProvider4 = gVar.f189536b.b();
                s.j(databaseSessionProvider4);
                xe0.f storageFactory = gVar.f189535a.f();
                s.j(storageFactory);
                d.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper4, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider4, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider4, "asft_slot_prebooking_storage", mapper4, 2, u.c(new exa.a(i21, i6, 5)), 32);
            case 7:
                return new mti.h(gVar.f189537c.a());
            case 8:
                return new mti.a((pti.e) gVar.f189546r.get());
            case 9:
                return new pti.e((AsftAirportsService) gVar.f189545q.get(), (ne0.j) gVar.k.get(), (ue0.c) gVar.f189542m.get());
            case 10:
                b bVar = gVar.d;
                nj0.a aVar = gVar.e;
                ik0.b retrofitFactory = ((nj0.d) aVar).m();
                s.j(retrofitFactory);
                ek.a converterFactory = ((nj0.d) aVar).d();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(AsftAirportsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                AsftAirportsService asftAirportsService = (AsftAirportsService) objCreate;
                s.k(asftAirportsService);
                return asftAirportsService;
            case 11:
                return new mti.b((k) gVar.u.get());
            case 12:
                return new k((AsftConfigService) gVar.f189548t.get(), (ne0.j) gVar.k.get(), (ue0.c) gVar.f189541l.get());
            case 13:
                b bVar2 = gVar.d;
                nj0.a aVar2 = gVar.e;
                ik0.b retrofitFactory2 = ((nj0.d) aVar2).m();
                s.j(retrofitFactory2);
                ek.a converterFactory2 = ((nj0.d) aVar2).d();
                Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                Object objCreate2 = ik0.b.a(retrofitFactory2, null, null, converterFactory2, null, 27).create(AsftConfigService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                AsftConfigService asftConfigService = (AsftConfigService) objCreate2;
                s.k(asftConfigService);
                return asftConfigService;
            case 14:
                return new mti.g((pti.u) gVar.f189550x.get());
            case 15:
                AsftPassesService asftPassesService = (AsftPassesService) gVar.f189549w.get();
                ne0.j jVar = (ne0.j) gVar.k.get();
                ue0.c cVar = (ue0.c) gVar.f189543n.get();
                l80.e eVarH = gVar.f.h();
                s.j(eVarH);
                sf0.h hVarB = gVar.f189538g.b();
                s.j(hVarB);
                return new pti.u(asftPassesService, jVar, cVar, eVarH, hVarB);
            case 16:
                b bVar3 = gVar.d;
                nj0.a aVar3 = gVar.e;
                ik0.b retrofitFactory3 = ((nj0.d) aVar3).m();
                s.j(retrofitFactory3);
                ek.a converterFactory3 = ((nj0.d) aVar3).d();
                Intrinsics.checkNotNullParameter(retrofitFactory3, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory3, "converterFactory");
                Object objCreate3 = ik0.b.a(retrofitFactory3, null, null, converterFactory3, null, 27).create(AsftPassesService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                AsftPassesService asftPassesService2 = (AsftPassesService) objCreate3;
                s.k(asftPassesService2);
                return asftPassesService2;
            case 17:
                return new l((z) gVar.A.get());
            case 18:
                AsftSlotPrebookingService asftSlotPrebookingService = (AsftSlotPrebookingService) gVar.z.get();
                ne0.j jVar2 = (ne0.j) gVar.k.get();
                Json jsonA = fe0.d.a();
                ue0.c cVar2 = (ue0.c) gVar.o.get();
                sf0.h hVarB2 = gVar.f189538g.b();
                s.j(hVarB2);
                return new z(asftSlotPrebookingService, jVar2, jsonA, cVar2, hVarB2);
            case 19:
                b bVar4 = gVar.d;
                nj0.a aVar4 = gVar.e;
                ik0.b retrofitFactory4 = ((nj0.d) aVar4).m();
                s.j(retrofitFactory4);
                ek.a converterFactory4 = ((nj0.d) aVar4).d();
                Intrinsics.checkNotNullParameter(retrofitFactory4, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory4, "converterFactory");
                Object objCreate4 = ik0.b.a(retrofitFactory4, null, null, converterFactory4, null, 27).create(AsftSlotPrebookingService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate4, "create(...)");
                AsftSlotPrebookingService asftSlotPrebookingService2 = (AsftSlotPrebookingService) objCreate4;
                s.k(asftSlotPrebookingService2);
                return asftSlotPrebookingService2;
            case 20:
                return new n((pti.e) gVar.f189546r.get(), (mti.a) gVar.f189547s.get());
            case 21:
                pre.c cVarA = gVar.f189539h.a();
                s.j(cVarA);
                return new p(cVarA);
            case 22:
                l80.e eVarH2 = gVar.f.h();
                s.j(eVarH2);
                return new jvi.c(eVarH2);
            default:
                throw new AssertionError(i22);
        }
    }
}
