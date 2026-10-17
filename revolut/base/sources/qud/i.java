package qud;

import android.content.Context;
import androidx.room.migration.Migration;
import com.revolut.feature.staking.impl.database.StakingDatabase;
import com.revolut.feature.staking.impl.service.consent.AutoStakingConsentService;
import com.revolut.feature.staking.impl.service.general.StakingService;
import com.revolut.feature.staking.impl.service.pocket.StakingPocketService;
import com.revolut.feature.staking.impl.service.products.v2.StakingProductsService;
import com.revolut.feature.staking.impl.service.rewards.StakingRewardsService;
import com.revolut.feature.staking.impl.service.unstaking.UnstakingDataService;
import com.revolut.feature.staking.impl.service.unstaking.UnstakingLockedTransactionsService;
import dcl.q;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f249409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f249410b;

    public i(j jVar, int i) {
        this.f249409a = jVar;
        this.f249410b = i;
    }

    @Override // phm.a
    public final Object get() {
        j jVar = this.f249409a;
        int i = this.f249410b;
        switch (i) {
            case 0:
                xoj.a aVarA = jVar.f249411a.f129546a.a();
                s.j(aVarA);
                fn2.c cVar = new fn2.c(aVarA);
                ppk.f fVarA = jVar.f249412b.a();
                xv5.c cVarA = jVar.f249413c.a();
                s.j(cVarA);
                return new yud.g(cVar, fVarA, cVarA, (yvd.c) jVar.f249422r.get(), (awd.c) jVar.u.get(), jVar.i.a());
            case 1:
                ne0.j jVar2 = (ne0.j) jVar.f249417l.get();
                jud.b bVar = (jud.b) jVar.f249419n.get();
                jud.f fVar = (jud.f) jVar.o.get();
                ivd.a stakingPocketDtoMapper = new ivd.a();
                hvd.a stakingPocketDomainMapper = new hvd.a();
                jvd.a stakingPocketEntityMapper = new jvd.a();
                Intrinsics.checkNotNullParameter(stakingPocketDtoMapper, "stakingPocketDtoMapper");
                Intrinsics.checkNotNullParameter(stakingPocketDomainMapper, "stakingPocketDomainMapper");
                Intrinsics.checkNotNullParameter(stakingPocketEntityMapper, "stakingPocketEntityMapper");
                return new yvd.c(jVar2, bVar, fVar, new q(), new by5.a(new nvd.a(), new ovd.a(), new pvd.a()), (StakingPocketService) jVar.f249420p.get(), (StakingService) jVar.f249421q.get());
            case 2:
                return new ne0.d();
            case 3:
                StakingDatabase database = (StakingDatabase) jVar.f249418m.get();
                kud.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(database, "database");
                jud.b bVarG = database.g();
                s.k(bVarG);
                return bVarG;
            case 4:
                Context context = jVar.d;
                yk0.a databaseSessionProvider = jVar.e.b();
                s.j(databaseSessionProvider);
                de0.a databaseEncryptionMigratorFactory = ((c21.b) jVar.f).b();
                kud.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                StakingDatabase.Companion companion = StakingDatabase.INSTANCE;
                companion.getClass();
                StakingDatabase stakingDatabase = (StakingDatabase) companion.a(context, databaseSessionProvider, new Migration[]{lud.b.f200222c, lud.c.f200223c, lud.d.f200224c, lud.e.f200225c, lud.f.f200226c, lud.g.f200227c, lud.h.f200228c, lud.i.f200229c, lud.j.f200230c, lud.a.f200221c}, databaseEncryptionMigratorFactory);
                s.k(stakingDatabase);
                return stakingDatabase;
            case 5:
                StakingDatabase database2 = (StakingDatabase) jVar.f249418m.get();
                kud.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(database2, "database");
                jud.f fVarH = database2.h();
                s.k(fVarH);
                return fVarH;
            case 6:
                kwd.a aVar = jVar.f249414g;
                StakingPocketService stakingPocketService = (StakingPocketService) v0.a.f((c21.b) jVar.f, "retrofit", StakingPocketService.class, "create(...)");
                s.k(stakingPocketService);
                return stakingPocketService;
            case 7:
                kwd.a aVar2 = jVar.f249414g;
                StakingService stakingService = (StakingService) v0.a.f((c21.b) jVar.f, "retrofit", StakingService.class, "create(...)");
                s.k(stakingService);
                return stakingService;
            case 8:
                return new awd.c((StakingProductsService) jVar.f249423s.get(), (ue0.c) jVar.f249424t.get(), (ne0.j) jVar.f249417l.get(), new he2.b(new lvd.a()));
            case 9:
                kwd.a aVar3 = jVar.f249414g;
                StakingProductsService stakingProductsService = (StakingProductsService) v0.a.f((c21.b) jVar.f, "retrofit", StakingProductsService.class, "create(...)");
                s.k(stakingProductsService);
                return stakingProductsService;
            case 10:
                je0.d mapper = jVar.f249415h.b();
                s.j(mapper);
                yk0.a databaseSessionProvider2 = jVar.e.b();
                s.j(databaseSessionProvider2);
                xe0.f storageFactory = jVar.f249415h.f();
                s.j(storageFactory);
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider2, "staking_products", mapper, 1, f0.f322471a, 32);
            case 11:
                xv5.c cVarA2 = jVar.f249413c.a();
                s.j(cVarA2);
                return new bvd.a(cVarA2, (bwd.c) jVar.f249427y.get());
            case 12:
                StakingRewardsService stakingRewardsService = (StakingRewardsService) jVar.f249425w.get();
                ne0.j jVar3 = (ne0.j) jVar.f249417l.get();
                ue0.c cVar2 = (ue0.c) jVar.f249426x.get();
                ze0.a aVarA2 = jVar.f249415h.a();
                s.j(aVarA2);
                return new bwd.c(stakingRewardsService, jVar3, cVar2, aVarA2);
            case 13:
                kwd.a aVar4 = jVar.f249414g;
                StakingRewardsService stakingRewardsService2 = (StakingRewardsService) v0.a.f((c21.b) jVar.f, "retrofit", StakingRewardsService.class, "create(...)");
                s.k(stakingRewardsService2);
                return stakingRewardsService2;
            case 14:
                je0.d mapper2 = jVar.f249415h.b();
                s.j(mapper2);
                yk0.a databaseSessionProvider3 = jVar.e.b();
                s.j(databaseSessionProvider3);
                xe0.f storageFactory2 = jVar.f249415h.f();
                s.j(storageFactory2);
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.c(storageFactory2, databaseSessionProvider3, "staking_rewards_summary_file", mapper2, 2, 16);
            case 15:
                return new cvd.a((dwd.a) jVar.C.get(), (yud.g) jVar.v.get());
            case 16:
                return new dwd.a((ne0.j) jVar.f249417l.get(), (UnstakingDataService) jVar.A.get(), (jud.h) jVar.B.get(), new nd.m(new svd.a(), new rvd.a(), new tvd.a()));
            case 17:
                kwd.a aVar5 = jVar.f249414g;
                UnstakingDataService unstakingDataService = (UnstakingDataService) v0.a.f((c21.b) jVar.f, "retrofit", UnstakingDataService.class, "create(...)");
                s.k(unstakingDataService);
                return unstakingDataService;
            case 18:
                StakingDatabase database3 = (StakingDatabase) jVar.f249418m.get();
                kud.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(database3, "database");
                jud.h hVarI = database3.i();
                s.k(hVarI);
                return hVarI;
            case 19:
                return new cvd.c((dwd.c) jVar.F.get());
            case 20:
                return new dwd.c((UnstakingLockedTransactionsService) jVar.E.get(), (ne0.j) jVar.f249417l.get());
            case 21:
                kwd.a aVar6 = jVar.f249414g;
                UnstakingLockedTransactionsService unstakingLockedTransactionsService = (UnstakingLockedTransactionsService) v0.a.f((c21.b) jVar.f, "retrofit", UnstakingLockedTransactionsService.class, "create(...)");
                s.k(unstakingLockedTransactionsService);
                return unstakingLockedTransactionsService;
            case 22:
                return new zud.a((wvd.b) jVar.J.get());
            case 23:
                return new wvd.b((ue0.c) jVar.H.get(), (ne0.j) jVar.f249417l.get(), (AutoStakingConsentService) jVar.I.get());
            case 24:
                je0.d mapper3 = jVar.f249415h.d();
                s.j(mapper3);
                yk0.a databaseSessionProvider4 = jVar.e.b();
                s.j(databaseSessionProvider4);
                xe0.f storageFactory3 = jVar.f249415h.f();
                s.j(storageFactory3);
                xvd.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper3, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider4, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                return xe0.f.f(storageFactory3, databaseSessionProvider4, "auto_staking_consent", mapper3, 1, f0.f322471a, 32);
            case 25:
                kwd.a aVar7 = jVar.f249414g;
                nj0.a aVar8 = jVar.f249416j;
                ik0.b retrofitFactory = ((nj0.d) aVar8).m();
                s.j(retrofitFactory);
                ek.a converterFactory = ((nj0.d) aVar8).d();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(AutoStakingConsentService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                AutoStakingConsentService autoStakingConsentService = (AutoStakingConsentService) objCreate;
                s.k(autoStakingConsentService);
                return autoStakingConsentService;
            case 26:
                return new cwd.b((ue0.c) jVar.L.get());
            case 27:
                je0.d mapper4 = jVar.f249415h.d();
                s.j(mapper4);
                yk0.a databaseSessionProvider5 = jVar.e.b();
                s.j(databaseSessionProvider5);
                xe0.f storageFactory4 = jVar.f249415h.f();
                s.j(storageFactory4);
                Intrinsics.checkNotNullParameter(mapper4, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider5, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory4, "storageFactory");
                return xe0.f.f(storageFactory4, databaseSessionProvider5, "staking_screen_file", mapper4, 1, f0.f322471a, 32);
            case 28:
                hc5.a aVarA3 = ((gc5.c) jVar.k).a();
                s.j(aVarA3);
                return new avd.b(aVarA3, (wvd.b) jVar.J.get(), (yud.g) jVar.v.get());
            default:
                throw new AssertionError(i);
        }
    }
}
