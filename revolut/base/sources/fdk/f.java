package fdk;

import android.content.Context;
import com.revolut.retail.feature.plan_rewards.impl.data.service.MilestoneRewardsService;
import com.revolut.retail.feature.plan_rewards.impl.data.service.MonthlyDrawsService;
import com.revolut.retail.feature.plan_rewards.impl.data.service.PlanRewardsService;
import kotlin.jvm.internal.Intrinsics;
import sri.o;
import vc.s;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f133980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f133981b;

    public f(g gVar, int i) {
        this.f133980a = gVar;
        this.f133981b = i;
    }

    @Override // phm.a
    public final Object get() {
        g gVar = this.f133980a;
        int i = this.f133981b;
        switch (i) {
            case 0:
                Context context = gVar.f133983b;
                l.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return o.c(context, null, null, 14);
            case 1:
                je0.d mapper = gVar.f133984c.d();
                s.j(mapper);
                yk0.a databaseSessionProvider = gVar.d.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = gVar.f133984c.f();
                s.j(storageFactory);
                yck.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "milestone_rewards", mapper, 0, null, 56);
            case 2:
                je0.d mapper2 = gVar.f133984c.d();
                s.j(mapper2);
                yk0.a databaseSessionProvider2 = gVar.d.b();
                s.j(databaseSessionProvider2);
                xe0.f storageFactory2 = gVar.f133984c.f();
                s.j(storageFactory2);
                yck.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper2, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                return xe0.f.f(storageFactory2, databaseSessionProvider2, "monthly_draw_hub", mapper2, 0, null, 56);
            case 3:
                return new ne0.d();
            case 4:
                bdk.c cVar = (bdk.c) gVar.f133995t.get();
                bdk.j jVar = (bdk.j) gVar.v.get();
                fk3.a aVarA = gVar.i.a();
                s.j(aVarA);
                return new gdk.c(cVar, jVar, aVarA);
            case 5:
                return new bdk.c((MilestoneRewardsService) gVar.f133994s.get(), (ne0.j) gVar.f133993r.get(), (ue0.c) gVar.f133991p.get());
            case 6:
                yck.a aVar = gVar.f133985g;
                nj0.a aVar2 = gVar.f133986h;
                ik0.b retrofitFactory = ((nj0.d) aVar2).m();
                s.j(retrofitFactory);
                ek.a converterFactory = ((nj0.d) aVar2).d();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(MilestoneRewardsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                MilestoneRewardsService milestoneRewardsService = (MilestoneRewardsService) objCreate;
                s.k(milestoneRewardsService);
                return milestoneRewardsService;
            case 7:
                return new bdk.j((PlanRewardsService) gVar.u.get());
            case 8:
                yck.a aVar3 = gVar.f133985g;
                nj0.a aVar4 = gVar.f133986h;
                ik0.b retrofitFactory2 = ((nj0.d) aVar4).m();
                s.j(retrofitFactory2);
                ek.a converterFactory2 = ((nj0.d) aVar4).d();
                Intrinsics.checkNotNullParameter(retrofitFactory2, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory2, "converterFactory");
                Object objCreate2 = ik0.b.a(retrofitFactory2, null, null, converterFactory2, null, 27).create(PlanRewardsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate2, "create(...)");
                PlanRewardsService planRewardsService = (PlanRewardsService) objCreate2;
                s.k(planRewardsService);
                return planRewardsService;
            case 9:
                bdk.f fVar = (bdk.f) gVar.f133998y.get();
                bdk.j jVar2 = (bdk.j) gVar.v.get();
                fk3.a aVarA2 = gVar.i.a();
                s.j(aVarA2);
                sfk.a aVarE = gVar.k.e();
                s.j(aVarE);
                return new gdk.g(fVar, jVar2, aVarA2, aVarE);
            case 10:
                return new bdk.f((MonthlyDrawsService) gVar.f133997x.get(), (ne0.j) gVar.f133993r.get(), (ue0.c) gVar.f133992q.get());
            case 11:
                yck.a aVar5 = gVar.f133985g;
                nj0.a aVar6 = gVar.f133986h;
                ik0.b retrofitFactory3 = ((nj0.d) aVar6).m();
                s.j(retrofitFactory3);
                ek.a converterFactory3 = ((nj0.d) aVar6).d();
                Intrinsics.checkNotNullParameter(retrofitFactory3, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory3, "converterFactory");
                Object objCreate3 = ik0.b.a(retrofitFactory3, null, null, converterFactory3, null, 27).create(MonthlyDrawsService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate3, "create(...)");
                MonthlyDrawsService monthlyDrawsService = (MonthlyDrawsService) objCreate3;
                s.k(monthlyDrawsService);
                return monthlyDrawsService;
            default:
                throw new AssertionError(i);
        }
    }
}
