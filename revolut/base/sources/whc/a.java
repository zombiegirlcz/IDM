package whc;

import android.content.Context;
import androidx.room.migration.Migration;
import com.revolut.feature.rewards.impl.data.database.RewardsDatabase;
import com.revolut.feature.rewards.impl.data.network.services.ConciergeAlbertineService;
import com.revolut.feature.rewards.impl.data.network.services.RentAndBillsService;
import com.revolut.feature.rewards.impl.data.network.services.RewardsService;
import com.revolut.feature.rewards.impl.data.network.services.SubscriptionsSearchService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f297482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f297483b;

    public a(b bVar, int i) {
        this.f297482a = bVar;
        this.f297483b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f297482a;
        int i = this.f297483b;
        switch (i) {
            case 0:
                return new phc.j((RewardsService) bVar.k.get(), (pgc.g) bVar.f297495m.get(), (pgc.d) bVar.f297496n.get(), (pgc.a) bVar.o.get(), (ue0.c) bVar.f297497p.get(), new ne0.d());
            case 1:
                h0 h0Var = bVar.f297488a;
                RewardsService rewardsService = (RewardsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.f297493j.get(), "retrofit", RewardsService.class, "create(...)");
                vc.s.k(rewardsService);
                return rewardsService;
            case 2:
                h0 h0Var2 = bVar.f297488a;
                Retrofit retrofitI = ((c21.b) bVar.f297489b).i();
                vc.s.j(retrofitI);
                kg.o oVar = (kg.o) bVar.i.get();
                return j6.a.B(p.a.x(retrofitI, "retrofit", oVar, "gson"), oVar, "build(...)");
            case 3:
                h0 h0Var3 = bVar.f297488a;
                kg.o gson = ((c21.b) bVar.f297489b).h();
                vc.s.j(gson);
                Intrinsics.checkNotNullParameter(gson, "gson");
                kg.o oVarB = new kg.p(gson).b();
                Intrinsics.checkNotNullExpressionValue(oVarB, "create(...)");
                return oVarB;
            case 4:
                RewardsDatabase db8 = (RewardsDatabase) bVar.f297494l.get();
                g0.Companion.getClass();
                Intrinsics.checkNotNullParameter(db8, "db");
                pgc.g gVarI = db8.i();
                vc.s.k(gVarI);
                return gVarI;
            case 5:
                Context context = bVar.f297490c;
                yk0.a databaseSessionProvider = bVar.d.b();
                vc.s.j(databaseSessionProvider);
                de0.a databaseEncryptionMigratorFactory = ((c21.b) bVar.f297489b).b();
                g0.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                RewardsDatabase rewardsDatabase = (RewardsDatabase) RewardsDatabase.INSTANCE.a(context, databaseSessionProvider, new Migration[]{ogc.k.f225088c, ogc.q.f225094c, ogc.r.f225095c, ogc.s.f225096c, ogc.t.f225097c, ogc.u.f225098c, ogc.v.f225099c, ogc.w.f225100c, ogc.x.f225101c, ogc.a.f225078c, ogc.b.f225079c, ogc.c.f225080c, ogc.d.f225081c, ogc.e.f225082c, ogc.f.f225083c, ogc.g.f225084c, ogc.h.f225085c, ogc.i.f225086c, ogc.j.f225087c, ogc.l.f225089c, ogc.m.f225090c, ogc.n.f225091c, ogc.o.f225092c, ogc.p.f225093c}, databaseEncryptionMigratorFactory);
                vc.s.k(rewardsDatabase);
                return rewardsDatabase;
            case 6:
                RewardsDatabase db10 = (RewardsDatabase) bVar.f297494l.get();
                g0.Companion.getClass();
                Intrinsics.checkNotNullParameter(db10, "db");
                pgc.d dVarH = db10.h();
                vc.s.k(dVarH);
                return dVarH;
            case 7:
                RewardsDatabase db11 = (RewardsDatabase) bVar.f297494l.get();
                g0.Companion.getClass();
                Intrinsics.checkNotNullParameter(db11, "db");
                pgc.a aVarG = db11.g();
                vc.s.k(aVarG);
                return aVarG;
            case 8:
                je0.d mapper = bVar.e.b();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider2 = bVar.d.b();
                vc.s.j(databaseSessionProvider2);
                xe0.f storageFactory = bVar.e.f();
                vc.s.j(storageFactory);
                j0.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider2, "rewards", mapper, 6, zhm.v.k(shc.a.d, shc.b.d, shc.c.d, shc.d.d, shc.e.d), 32);
            case 9:
                j0.Companion.getClass();
                ne0.n.Companion.getClass();
                return ne0.l.a(1, 1440L);
            case 10:
                j0.Companion.getClass();
                return new ne0.d();
            case 11:
                je0.d mapper2 = bVar.e.d();
                vc.s.j(mapper2);
                yk0.a databaseSessionProvider3 = bVar.d.b();
                vc.s.j(databaseSessionProvider3);
                xe0.f storageFactory2 = bVar.e.f();
                vc.s.j(storageFactory2);
                j0.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.f(storageFactory2, databaseSessionProvider3, "concierge_albertine", mapper2, 0, null, 56);
            case 12:
                je0.d mapper3 = bVar.e.d();
                vc.s.j(mapper3);
                yk0.a databaseSessionProvider4 = bVar.d.b();
                vc.s.j(databaseSessionProvider4);
                xe0.f storageFactory3 = bVar.e.f();
                vc.s.j(storageFactory3);
                j0.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper3, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider4, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                return xe0.f.f(storageFactory3, databaseSessionProvider4, "rent_and_bills", mapper3, 0, null, 56);
            case 13:
                j0.Companion.getClass();
                return new ne0.d();
            case 14:
                je0.d mapper4 = bVar.e.d();
                vc.s.j(mapper4);
                yk0.a databaseSessionProvider5 = bVar.d.b();
                vc.s.j(databaseSessionProvider5);
                xe0.f storageFactory4 = bVar.e.f();
                vc.s.j(storageFactory4);
                j0.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper4, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider5, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory4, "storageFactory");
                return xe0.f.f(storageFactory4, databaseSessionProvider5, "subscriptions_search", mapper4, 0, null, 56);
            case 15:
                return new mhc.b((ConciergeAlbertineService) bVar.f297503x.get(), (ue0.c) bVar.f297501t.get(), new ne0.d());
            case 16:
                h0 h0Var4 = bVar.f297488a;
                nj0.a aVar = bVar.f;
                ik0.b retrofitFactory = ((nj0.d) aVar).m();
                vc.s.j(retrofitFactory);
                ek.a converterFactory = ((nj0.d) aVar).d();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(ConciergeAlbertineService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                ConciergeAlbertineService conciergeAlbertineService = (ConciergeAlbertineService) objCreate;
                vc.s.k(conciergeAlbertineService);
                return conciergeAlbertineService;
            case 17:
                return new nhc.i((RentAndBillsService) bVar.z.get(), (ue0.c) bVar.u.get(), (ne0.j) bVar.f297500s.get());
            case 18:
                h0 h0Var5 = bVar.f297488a;
                nj0.a aVar2 = bVar.f;
                ik0.b retrofitFactory2 = ((nj0.d) aVar2).m();
                vc.s.j(retrofitFactory2);
                ek.a converterFactory2 = ((nj0.d) aVar2).d();
                Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                Object objCreate2 = ik0.b.a(retrofitFactory2, null, null, converterFactory2, null, 27).create(RentAndBillsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                RentAndBillsService rentAndBillsService = (RentAndBillsService) objCreate2;
                vc.s.k(rentAndBillsService);
                return rentAndBillsService;
            case 19:
                nhc.a aVar3 = (nhc.a) bVar.A.get();
                ffk.t tVarF = bVar.f297491g.f();
                vc.s.j(tVarF);
                nhc.a aVar4 = (nhc.a) bVar.A.get();
                sf0.h hVarB = bVar.f297492h.b();
                vc.s.j(hVarB);
                return new vgc.e(aVar3, tVarF, new vgc.m(aVar4, hVarB));
            case 20:
                SubscriptionsSearchService subscriptionsSearchService = (SubscriptionsSearchService) bVar.C.get();
                ue0.c cVar = (ue0.c) bVar.f297502w.get();
                ne0.j jVar = (ne0.j) bVar.v.get();
                ze0.a aVarA = bVar.e.a();
                vc.s.j(aVarA);
                return new qhc.b(subscriptionsSearchService, cVar, jVar, aVarA);
            case 21:
                h0 h0Var6 = bVar.f297488a;
                nj0.a aVar5 = bVar.f;
                ik0.b retrofitFactory3 = ((nj0.d) aVar5).m();
                vc.s.j(retrofitFactory3);
                ek.a converterFactory3 = ((nj0.d) aVar5).d();
                Intrinsics.checkNotNullParameter(retrofitFactory3, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory3, "converterFactory");
                Object objCreate3 = ik0.b.a(retrofitFactory3, null, null, converterFactory3, null, 27).create(SubscriptionsSearchService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                SubscriptionsSearchService subscriptionsSearchService2 = (SubscriptionsSearchService) objCreate3;
                vc.s.k(subscriptionsSearchService2);
                return subscriptionsSearchService2;
            default:
                throw new AssertionError(i);
        }
    }
}
