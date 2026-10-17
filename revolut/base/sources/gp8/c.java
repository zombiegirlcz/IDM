package gp8;

import anb.c0;
import com.revolut.feature.apm.qvik.api.navigation.QvikAppSelectorNavigation$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.datepicker.ChallengeEditFrequencyDatePickerScreenContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.details.ChallengeEditDetailsScreenContract$InputData;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.members.ItemizationMembersControllerContract$InputData;
import com.revolut.feature.wealth.analytics.benchmark.service.WealthAnalyticsPerformanceBenchmarkService;
import cwi.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f145296b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f145295a = i;
        this.f145296b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f145295a) {
            case 0:
                ChallengeEditDetailsScreenContract$InputData challengeEditDetailsScreenContract$InputData = ((d) this.f145296b).f145297a;
                return new rp8.o(new rp8.q(challengeEditDetailsScreenContract$InputData), challengeEditDetailsScreenContract$InputData);
            case 1:
                e eVar = (e) this.f145296b;
                ChallengeEditFrequencyDatePickerScreenContract$InputData challengeEditFrequencyDatePickerScreenContract$InputData = eVar.f145299a;
                l80.e eVarH = eVar.f145300b.f145327g.h();
                vc.s.j(eVarH);
                return new pp8.j(new pp8.k(challengeEditFrequencyDatePickerScreenContract$InputData, eVarH), challengeEditFrequencyDatePickerScreenContract$InputData);
            case 2:
                return new vp8.j(new vp8.l(), ((f) this.f145296b).f145302a);
            case 3:
                return new com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.screens.frequency.a(new tp8.n(), ((g) this.f145296b).f145304a);
            case 4:
                gp9.g gVar = (gp9.g) this.f145296b;
                ItemizationMembersControllerContract$InputData itemizationMembersControllerContract$InputData = gVar.f145375a;
                dl3.f fVarC = gVar.f145376b.i.c();
                vc.s.j(fVarC);
                return new fq9.f(itemizationMembersControllerContract$InputData, new fq9.h(new fq9.g(fVarC)));
            case 5:
                return new com.revolut.feature.payments.bills_chooser.impl.ui.flow.summary.a(new kp9.a(), ((gp9.h) this.f145296b).f145378a);
            case 6:
                hq9.i iVar = ((gp9.j) this.f145296b).f145396a;
                return new com.revolut.feature.payments.bills_chooser.impl.ui.itemization.view.a(iVar, new bof.r(new iq9.d(iVar), new f61.a(iVar), new iq9.b(new iq9.a(iVar), iVar)), new bq9.d());
            case 7:
                return new ksc.h(((gsc.a) this.f145296b).f146371a, new ksc.l(new dsc.a(), new nd.k(new msc.a()), new msc.a()));
            case 8:
                gvg.b bVar = (gvg.b) this.f145296b;
                xe0.e eVarA = bVar.a();
                ne0.d dVar = new ne0.d();
                nj0.d dVar2 = (nj0.d) bVar.f147160c;
                ik0.b retrofitFactory = dVar2.m();
                vc.s.j(retrofitFactory);
                ek.a converterFactory = dVar2.d();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(WealthAnalyticsPerformanceBenchmarkService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                WealthAnalyticsPerformanceBenchmarkService wealthAnalyticsPerformanceBenchmarkService = (WealthAnalyticsPerformanceBenchmarkService) objCreate;
                vc.s.k(wealthAnalyticsPerformanceBenchmarkService);
                return new ivg.b(eVarA, dVar, wealthAnalyticsPerformanceBenchmarkService);
            case 9:
                gvg.c cVar = (gvg.c) this.f145296b;
                return new c0(cVar.f147161a, cVar.f147162b, cVar.f147163c, cVar.d, 10);
            case 10:
                gy2.d dVar3 = (gy2.d) this.f145296b;
                l93.f fVarJ = dVar3.f147780a.j();
                vc.s.j(fVarJ);
                ta9.m mVar = dVar3.f147781b;
                u89.a aVarB = mVar.b();
                vc.s.j(aVarB);
                q89.e eVarA2 = mVar.a();
                vc.s.j(eVarA2);
                li0.b bVarC = t2d.c.c(dVar3.f147782c.f271230a);
                uq8.a aVarC = ((oq8.a) dVar3.d).c();
                wsg.n nVarB = dVar3.e.b();
                hj8.a aVarA = dVar3.f.a();
                vc.s.j(aVarA);
                return u.a(fVarJ, aVarB, eVarA2, bVarC, aVarC, nVarB, aVarA);
            case 11:
                gy2.f fVar = (gy2.f) this.f145296b;
                l80.e eVarH2 = fVar.f147801b.f147783g.h();
                vc.s.j(eVarH2);
                return new by2.c(new by2.e(eVarH2), fVar.f147800a);
            case 12:
                gy8.a aVar = (gy8.a) this.f145296b;
                return new c0(aVar.f147835a, aVar.f147836b, aVar.f147837c, aVar.d, 11);
            case 13:
                h0i.d dVar4 = (h0i.d) this.f145296b;
                return new ax4.c(dVar4.f148415a, dVar4.f148416b, dVar4.f148417c, dVar4.d, 6);
            case 14:
                w50.b inputData = ((h30.s) this.f145296b).f148952a;
                x50.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                return new w50.j(inputData.f294651a);
            case 15:
                h4e.b bVar2 = (h4e.b) this.f145296b;
                return new a2d.m(bVar2.f149344a, bVar2.f149345b, bVar2.f149346c, 11);
            case 16:
                h9h.c cVar2 = (h9h.c) this.f145296b;
                kch.a listFilterMapper = new kch.a();
                kch.c rangeFilterMapper = new kch.c();
                Intrinsics.checkNotNullParameter(listFilterMapper, "listFilterMapper");
                Intrinsics.checkNotNullParameter(rangeFilterMapper, "rangeFilterMapper");
                return new com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters.a(new jch.r(), cVar2.f150293a, new lch.a(), new ich.t());
            case 17:
                h9l.a aVar2 = (h9l.a) this.f145296b;
                return new i9l.b(aVar2.f150341a, aVar2.f150342b, aVar2.f150343c, aVar2.d, aVar2.e);
            case 18:
                ha7.a aVar3 = (ha7.a) this.f145296b;
                return new ajf.d(aVar3.f150455a, aVar3.f150456b, aVar3.f150457c, aVar3.d, aVar3.e, 12);
            case 19:
                hc2.n nVar = (hc2.n) this.f145296b;
                QvikAppSelectorNavigation$InputData qvikAppSelectorNavigation$InputData = nVar.f150813a;
                hc2.m mVar2 = nVar.f150814b;
                z70.a aVarF = mVar2.f150802g.f();
                vc.s.j(aVarF);
                nc2.a aVar4 = new nc2.a(new kc2.b(aVarF));
                z70.a aVarF2 = mVar2.f150802g.f();
                vc.s.j(aVarF2);
                return new com.revolut.feature.apm.qvik.impl.ui.app_selector.a(qvikAppSelectorNavigation$InputData, aVar4, new kc2.b(aVarF2));
            case 20:
                lx1.d dVarB = ((ey1.e) ((hc2.m) this.f145296b).f150799a).b();
                vc.s.j(dVarB);
                return new com.revolut.feature.apm.qvik.impl.ui.home.a(dVarB);
            case 21:
                hcc.a aVar5 = (hcc.a) this.f145296b;
                return new ee6.f(aVar5.f150872a, aVar5.f150873b, aVar5.f150874c, aVar5.d, aVar5.e, aVar5.f, aVar5.f150875g, aVar5.f150876h, aVar5.i, 3);
            case 22:
                hd7.a aVar6 = (hd7.a) this.f145296b;
                return new c3d.d(aVar6.f151385a, aVar6.f151386b, 9);
            case 23:
                he2.c cVar3 = ((he2.e) this.f145296b).f151537a;
                fx1.a aVarF3 = ((lz1.m) cVar3.e).f();
                vc.s.j(aVarF3);
                return new ne2.c(new com.revolut.feature.apm.swish.impl.domain.a(aVarF3, (ce2.a) cVar3.k.get(), cVar3.f151531g.e()));
            case 24:
                he2.c cVar4 = (he2.c) this.f145296b;
                til.m mVarA = cVar4.f151528a.a();
                vc.s.j(mVarA);
                jvh.a aVarA2 = cVar4.f151529b.a();
                vc.s.j(aVarA2);
                return new com.revolut.feature.apm.swish.impl.ui.a(mVarA, aVarA2, ((s41.a) cVar4.f151530c).d());
            case 25:
                hf3.a aVar7 = (hf3.a) this.f145296b;
                return new ax4.c(aVar7.f151743a, aVar7.f151744b, aVar7.f151745c, aVar7.d, 9);
            case 26:
                return new add.b(((hfl.a) this.f145296b).f152026a, 5);
            case 27:
                nh5.a aVar8 = ((hh5.b) this.f145296b).f152254a;
                oh5.b bVar3 = (oh5.b) aVar8.f215374g.get();
                vc.s.j(bVar3);
                nw5.a aVarC2 = aVar8.d.c();
                vc.s.j(aVarC2);
                return new kh5.g(bVar3, aVarC2, new kh5.c());
            case 28:
                hla.a aVar9 = (hla.a) this.f145296b;
                return new c0(aVar9.f153418a, aVar9.f153419b, aVar9.f153420c, aVar9.d, 12);
            default:
                return new com.revolut.feature.apm.bills.billers.impl.ui.a(((hm1.e) this.f145296b).f153501a);
        }
    }
}
