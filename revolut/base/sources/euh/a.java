package euh;

import a3e.u;
import afj.e4;
import android.content.Context;
import b4g.v;
import cli.n;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.services.ideal.impl.data.network.IDealService;
import com.revolut.feature.apm.services.ideal.impl.ui.registration.IDealStartRegistrationScreenContract$InputData;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.airlines_filter.TravelFlightsAirlinesFilterScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.TravelFlightsBaggageSelectionScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.search_filters.TravelFlightsSearchFiltersScreenContract$InputData;
import com.revolut.feature.wealth.gia.margin_trading.impl.data.network.WealthMarginRequiredMinimumService;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import eyd.g0;
import eyd.i0;
import f4g.b0;
import f4g.p0;
import fzd.a0;
import fzd.x;
import fzd.y;
import fzd.z;
import i3g.k;
import iuh.l;
import iuh.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import mri.w;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import sri.o;
import ulm.a1;
import ulm.b1;
import vc.s;
import y7a.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f129565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f129566c;

    public /* synthetic */ a(Object obj2, int i, int i2) {
        this.f129564a = i2;
        this.f129566c = obj2;
        this.f129565b = i;
    }

    @Override // phm.a
    public final Object get() {
        Object eVar;
        int i = this.f129564a;
        int i2 = this.f129565b;
        Object obj2 = this.f129566c;
        switch (i) {
            case 0:
                b bVar = (b) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new juh.e();
                    }
                    throw new AssertionError(i2);
                }
                BaseQuestionScreenContract$InputData inputData = bVar.f129567a;
                iuh.b answerValidator = (iuh.b) bVar.f129569c.get();
                e eVar2 = bVar.f129568b;
                l buttonClauseFactory = (l) eVar2.d.get();
                m questionSubtitleMapper = (m) eVar2.f.get();
                Intrinsics.checkNotNullParameter(buttonClauseFactory, "buttonClauseFactory");
                Intrinsics.checkNotNullParameter(questionSubtitleMapper, "questionSubtitleMapper");
                juh.d stateMapper = new juh.d(buttonClauseFactory, questionSubtitleMapper);
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(answerValidator, "answerValidator");
                Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
                return new juh.c(inputData, stateMapper, answerValidator);
            case 1:
                g gVar = (g) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new suh.b();
                    }
                    throw new AssertionError(i2);
                }
                BaseQuestionScreenContract$InputData baseQuestionScreenContract$InputData = gVar.f129590a;
                iuh.b bVar2 = (iuh.b) gVar.d.get();
                e eVar3 = gVar.f129592c;
                l buttonClauseFactory2 = (l) eVar3.d.get();
                m questionSubtitleMapper2 = (m) eVar3.f.get();
                Intrinsics.checkNotNullParameter(buttonClauseFactory2, "buttonClauseFactory");
                Intrinsics.checkNotNullParameter(questionSubtitleMapper2, "questionSubtitleMapper");
                suh.m mVar = new suh.m(buttonClauseFactory2, questionSubtitleMapper2);
                l80.e dateProvider = gVar.f129591b.f129576g.h();
                s.j(dateProvider);
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                return new com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.b(baseQuestionScreenContract$InputData, bVar2, mVar, new com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.a());
            case 2:
                i iVar = (i) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new uuh.a();
                    }
                    throw new AssertionError(i2);
                }
                BaseQuestionScreenContract$InputData inputData2 = iVar.f129605a;
                e eVar4 = iVar.f129606b;
                l buttonClauseFactory3 = (l) eVar4.d.get();
                m questionSubtitleMapper3 = (m) eVar4.f.get();
                Intrinsics.checkNotNullParameter(buttonClauseFactory3, "buttonClauseFactory");
                Intrinsics.checkNotNullParameter(questionSubtitleMapper3, "questionSubtitleMapper");
                uuh.f stateMapper2 = new uuh.f(buttonClauseFactory3, questionSubtitleMapper3);
                iuh.b answerValidator2 = (iuh.b) iVar.f129607c.get();
                Intrinsics.checkNotNullParameter(inputData2, "inputData");
                Intrinsics.checkNotNullParameter(stateMapper2, "stateMapper");
                Intrinsics.checkNotNullParameter(answerValidator2, "answerValidator");
                return new uuh.d(inputData2, stateMapper2, answerValidator2);
            case 3:
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new qy.b();
                    }
                    throw new AssertionError(i2);
                }
                ey.b bVar3 = (ey.b) obj2;
                ly.c cVar = bVar3.f130478b;
                y80.a aVarR = bVar3.f130479c.r();
                s.j(aVarR);
                return new com.revolut.camerakit.revolut.ui.flow.b(cVar, aVarR);
            case 4:
                if (i2 == 0) {
                    eya.e eVar5 = (eya.e) obj2;
                    return new uya.h(eVar5.f130622a, (p) eVar5.f130623b.get());
                }
                if (i2 == 1) {
                    return new uya.i();
                }
                throw new AssertionError(i2);
            case 5:
                aj3.j jVar = (aj3.j) obj2;
                PickerScreenContract$InputData pickerScreenContract$InputData = jVar.f5394b;
                if (i2 == 0) {
                    return new f0(ImmutableMap.of("StatementsConsolidatedProductPickerInteractor", (a8a.d) ((eyd.l) jVar.f).e.get()), pickerScreenContract$InputData, (p) jVar.d.get());
                }
                if (i2 == 1) {
                    return new com.revolut.feature.picker.legacy.a(pickerScreenContract$InputData, jVar.f5395c);
                }
                throw new AssertionError(i2);
            case 6:
                g0 g0Var = (g0) obj2;
                if (i2 == 0) {
                    return new a0();
                }
                if (i2 == 1) {
                    return new gzd.h((n) g0Var.e.get(), g0Var.f130751b, (z) g0Var.d.get());
                }
                if (i2 == 2) {
                    return new u(new mzd.d(g0Var.f130752c.f.g()));
                }
                throw new AssertionError(i2);
            case 7:
                i0 i0Var = (i0) obj2;
                if (i2 == 0) {
                    return new y();
                }
                if (i2 == 1) {
                    return new izd.i((n) i0Var.e.get(), i0Var.f130760b, (x) i0Var.d.get());
                }
                if (i2 == 2) {
                    return new k(new mzd.b(i0Var.f130761c.f.g()));
                }
                throw new AssertionError(i2);
            case 8:
                g0 g0Var2 = (g0) obj2;
                if (i2 == 0) {
                    return new a0();
                }
                if (i2 == 1) {
                    return new gzd.h((n) g0Var2.e.get(), g0Var2.f130751b, (z) g0Var2.d.get());
                }
                if (i2 == 2) {
                    return new u(new mzd.d(g0Var2.f130752c.f.g()));
                }
                throw new AssertionError(i2);
            case 9:
                i0 i0Var2 = (i0) obj2;
                if (i2 == 0) {
                    return new y();
                }
                if (i2 == 1) {
                    return new izd.i((n) i0Var2.e.get(), i0Var2.f130760b, (x) i0Var2.d.get());
                }
                if (i2 == 2) {
                    return new k(new mzd.b(i0Var2.f130761c.f.g()));
                }
                throw new AssertionError(i2);
            case 10:
                ezj.b bVar4 = (ezj.b) obj2;
                if (i2 == 0) {
                    sri.m mVar2 = (sri.m) bVar4.f.get();
                    gte.a aVarB = bVar4.f130952b.b();
                    s.j(aVarB);
                    return new fzj.b(aVarB, mVar2);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                Context context = bVar4.f130951a;
                ezj.j.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                return o.c(context, null, null, 14);
            case 11:
                f1b.c cVar2 = (f1b.c) obj2;
                if (i2 == 0) {
                    d4m.a tasks = e4m.b.a(cVar2.f131231j);
                    go0.a aVar = cVar2.i;
                    Context context2 = aVar.f145070a;
                    CoroutineScope coroutineScopeA = aVar.f145071b.a();
                    s.j(coroutineScopeA);
                    zm0.b bVarI = aVar.f145072c.i();
                    s.j(bVarI);
                    yf.c factory = new yf.c(context2, coroutineScopeA, bVarI);
                    f1b.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(tasks, "tasks");
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    Intrinsics.checkNotNullParameter(tasks, "tasks");
                    return new fo0.a(context2, coroutineScopeA, tasks, bVarI);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                w wVarA = ((ozl.a) cVar2.f131226a).a();
                s.j(wVarA);
                br3.a aVar2 = new br3.a(wVarA, 2);
                gbb.a aVar3 = cVar2.f131227b;
                CoroutineScope appCoroutineScope = aVar3.f142248a.a();
                s.j(appCoroutineScope);
                qfe.c enhancedProductDescriptorProvider = (qfe.c) ((jge.m) aVar3.f142249b.e).f174027t.get();
                s.j(enhancedProductDescriptorProvider);
                bn2.p backgroundsInteractor = aVar3.f142250c.c();
                Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
                Intrinsics.checkNotNullParameter(enhancedProductDescriptorProvider, "enhancedProductDescriptorProvider");
                Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
                br3.a aVar4 = new br3.a(new gbb.b(appCoroutineScope, enhancedProductDescriptorProvider, backgroundsInteractor));
                w wVarA2 = ((ozl.a) cVar2.f131228c.f282097q).a();
                s.j(wVarA2);
                br3.a aVar5 = new br3.a(wVarA2, 0);
                ohf.a aVar6 = (ohf.a) cVar2.d.d.get();
                s.j(aVar6);
                pjf.f fVar = (pjf.f) cVar2.e.f.get();
                s.j(fVar);
                w wVarA3 = ((ozl.a) cVar2.f.d).a();
                s.j(wVarA3);
                br3.a aVar7 = new br3.a(wVarA3, 1);
                ah2.e eVar6 = (ah2.e) cVar2.f131229g.D.get();
                s.j(eVar6);
                yd6.d dVar = (yd6.d) ((ee6.b) cVar2.f131230h).f125086n.get();
                s.j(dVar);
                return ImmutableSet.of(aVar2, aVar4, aVar5, (br3.a) aVar6, (br3.a) fVar, aVar7, (br3.a[]) new eo0.b[]{eVar6, dVar});
            case 12:
                f4g.c cVar3 = (f4g.c) obj2;
                if (i2 == 0) {
                    return new t4g.b((n) cVar3.f132078b.get());
                }
                if (i2 == 1) {
                    return new com.revolut.feature.travel.flights.impl.ui.screen.baggage_info.a(cVar3.f132077a);
                }
                throw new AssertionError(i2);
            case 13:
                f4g.d dVar2 = (f4g.d) obj2;
                TravelFlightsBaggageSelectionScreenContract$InputData travelFlightsBaggageSelectionScreenContract$InputData = dVar2.f132093a;
                if (i2 == 0) {
                    j4g.a aVar8 = (j4g.a) dVar2.f132095c.get();
                    jr9.h.j(aVar8);
                    return aVar8;
                }
                if (i2 == 1) {
                    return new j4g.a(new j4g.b());
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        return new com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.c(travelFlightsBaggageSelectionScreenContract$InputData, new x4g.a());
                    }
                    throw new AssertionError(i2);
                }
                n nVar = (n) dVar2.e.get();
                f4g.b bVar5 = dVar2.f132094b;
                v repository = (v) bVar5.H.get();
                h4g.k searchSessionInteractor = (h4g.k) bVar5.v.get();
                Intrinsics.checkNotNullParameter(repository, "repository");
                Intrinsics.checkNotNullParameter(searchSessionInteractor, "searchSessionInteractor");
                r10.d dVar3 = new r10.d();
                dVar3.f250818a = repository;
                dVar3.f250819b = searchSessionInteractor;
                return new com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.b(nVar, travelFlightsBaggageSelectionScreenContract$InputData, dVar3, (j4g.a) dVar2.f132095c.get());
            case 14:
                f4g.o oVar = (f4g.o) obj2;
                if (i2 == 0) {
                    return new com.revolut.feature.travel.flights.impl.ui.screen.fare_selection.a((n) oVar.f132162b.get(), oVar.f132161a);
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                c6g.a fareCardMapper = new c6g.a();
                Intrinsics.checkNotNullParameter(fareCardMapper, "fareCardMapper");
                return new a6g.l();
            case 15:
                b0 b0Var = (b0) obj2;
                TravelFlightsAirlinesFilterScreenContract$InputData travelFlightsAirlinesFilterScreenContract$InputData = b0Var.f132073b;
                if (i2 == 0) {
                    return new r4g.k((n) b0Var.f132074c.get(), travelFlightsAirlinesFilterScreenContract$InputData);
                }
                if (i2 == 1) {
                    return new r4g.m(travelFlightsAirlinesFilterScreenContract$InputData);
                }
                throw new AssertionError(i2);
            case 16:
                b0 b0Var2 = (b0) obj2;
                TravelFlightsAirlinesFilterScreenContract$InputData travelFlightsAirlinesFilterScreenContract$InputData2 = b0Var2.f132073b;
                if (i2 == 0) {
                    return new r4g.k((n) b0Var2.f132074c.get(), travelFlightsAirlinesFilterScreenContract$InputData2);
                }
                if (i2 == 1) {
                    return new r4g.m(travelFlightsAirlinesFilterScreenContract$InputData2);
                }
                throw new AssertionError(i2);
            case 17:
                b0 b0Var3 = (b0) obj2;
                TravelFlightsAirlinesFilterScreenContract$InputData travelFlightsAirlinesFilterScreenContract$InputData3 = b0Var3.f132073b;
                if (i2 == 0) {
                    return new r4g.k((n) b0Var3.f132074c.get(), travelFlightsAirlinesFilterScreenContract$InputData3);
                }
                if (i2 == 1) {
                    return new r4g.m(travelFlightsAirlinesFilterScreenContract$InputData3);
                }
                throw new AssertionError(i2);
            case 18:
                p0 p0Var = (p0) obj2;
                TravelFlightsSearchFiltersScreenContract$InputData travelFlightsSearchFiltersScreenContract$InputData = p0Var.f132171b;
                if (i2 == 0) {
                    return new com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a((n) p0Var.f132172c.get(), travelFlightsSearchFiltersScreenContract$InputData);
                }
                if (i2 == 1) {
                    return new y6g.p(travelFlightsSearchFiltersScreenContract$InputData);
                }
                throw new AssertionError(i2);
            case 19:
                p0 p0Var2 = (p0) obj2;
                TravelFlightsSearchFiltersScreenContract$InputData travelFlightsSearchFiltersScreenContract$InputData2 = p0Var2.f132171b;
                if (i2 == 0) {
                    return new com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a((n) p0Var2.f132172c.get(), travelFlightsSearchFiltersScreenContract$InputData2);
                }
                if (i2 == 1) {
                    return new y6g.p(travelFlightsSearchFiltersScreenContract$InputData2);
                }
                throw new AssertionError(i2);
            case 20:
                p0 p0Var3 = (p0) obj2;
                TravelFlightsSearchFiltersScreenContract$InputData travelFlightsSearchFiltersScreenContract$InputData3 = p0Var3.f132171b;
                if (i2 == 0) {
                    return new com.revolut.feature.travel.flights.impl.ui.screen.search_filters.a((n) p0Var3.f132172c.get(), travelFlightsSearchFiltersScreenContract$InputData3);
                }
                if (i2 == 1) {
                    return new y6g.p(travelFlightsSearchFiltersScreenContract$InputData3);
                }
                throw new AssertionError(i2);
            case 21:
                f56.a aVar9 = (f56.a) obj2;
                a31.a aVar10 = aVar9.f132276b;
                a31.a aVar11 = aVar9.f132275a;
                if (i2 == 0) {
                    return new c3d.d(aVar11, aVar10, 6);
                }
                if (i2 == 1) {
                    return new ayh.a(aVar9.f132277c, aVar9.d, aVar9.e, aVar9.f, aVar9.f132278g, aVar9.f132279h, aVar9.i, aVar9.f132280j, aVar9.k, aVar11, aVar10, aVar9.f132281l, aVar9.f132282m, aVar9.f132283n, aVar9.o, aVar9.f132284p, 1);
                }
                throw new AssertionError(i2);
            case 22:
                f5b.a aVar12 = (f5b.a) obj2;
                h9h.a aVar13 = (h9h.a) aVar12.f132297h;
                if (i2 == 0) {
                    ang.f fVarE = aVar12.f132294b.e();
                    ybl.b bVarB = ((zdl.c) aVar12.f132296g).b();
                    s.j(bVarB);
                    eVar = new e5b.e(fVarE, bVarB, aVar13.f());
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new AssertionError(i2);
                        }
                        gte.a aVarB2 = aVar12.f132295c.b();
                        s.j(aVarB2);
                        return new e5b.d(aVarB2);
                    }
                    eVar = new e5b.a(new c5b.e(aVar13.s()));
                }
                return eVar;
            case 23:
                f6h.c cVar4 = (f6h.c) obj2;
                ee0.a aVar14 = cVar4.f132432g;
                if (i2 == 0) {
                    yk0.a databaseSessionProvider = cVar4.f.b();
                    s.j(databaseSessionProvider);
                    je0.d mapper = aVar14.d();
                    s.j(mapper);
                    xe0.f storageFactory = aVar14.f();
                    s.j(storageFactory);
                    a6h.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                    Intrinsics.checkNotNullParameter(mapper, "mapper");
                    Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                    return xe0.f.c(storageFactory, databaseSessionProvider, "margin_required_minimum_storage", mapper, 0, 24);
                }
                if (i2 == 1) {
                    a6h.b.Companion.getClass();
                    return new ne0.d();
                }
                if (i2 == 2) {
                    return new c6h.e((WealthMarginRequiredMinimumService) cVar4.f132437n.get(), (ne0.j) cVar4.f132435l.get(), (ue0.c) cVar4.k.get());
                }
                if (i2 == 3) {
                    Retrofit retrofit = (Retrofit) cVar4.f132436m.get();
                    a6h.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                    Object objCreate = retrofit.create(WealthMarginRequiredMinimumService.class);
                    Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                    WealthMarginRequiredMinimumService wealthMarginRequiredMinimumService = (WealthMarginRequiredMinimumService) objCreate;
                    s.k(wealthMarginRequiredMinimumService);
                    return wealthMarginRequiredMinimumService;
                }
                if (i2 != 4) {
                    throw new AssertionError(i2);
                }
                ik0.b retrofitFactory = ((nj0.d) cVar4.f132433h).m();
                s.j(retrofitFactory);
                Json baseJson = fe0.d.a();
                a6h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(baseJson, "baseJson");
                rlm.o oVarB = ue0.e.b(baseJson, new a5g.h(10));
                b1.Companion.getClass();
                Retrofit retrofitA = ik0.b.a(retrofitFactory, null, null, ek.b.a(oVarB, a1.a("application/json")), null, 27);
                s.k(retrofitA);
                return retrofitA;
            case 24:
                f97.a aVar15 = (f97.a) obj2;
                a31.a aVar16 = aVar15.f132849g;
                if (i2 == 0) {
                    return new g97.f(aVar15.f132846a, aVar15.f132847b, aVar15.f132848c, aVar15.d, aVar15.e, aVar15.f, aVar16, aVar15.f132854n, aVar15.f132850h);
                }
                if (i2 == 1) {
                    g97.c cVar5 = (g97.c) ((g97.e) aVar15.f132853m.get()).b();
                    s.k(cVar5);
                    return cVar5;
                }
                if (i2 == 2) {
                    return new g97.e();
                }
                if (i2 == 3) {
                    return new e4(aVar15.i, aVar15.f132851j, aVar15.f132855p, aVar15.k, aVar15.f132852l, aVar16);
                }
                if (i2 != 4) {
                    throw new AssertionError(i2);
                }
                g97.d dVar4 = (g97.d) ((g97.f) aVar15.o.get()).b();
                s.k(dVar4);
                return dVar4;
            case 25:
                fae.b bVar6 = (fae.b) obj2;
                if (i2 == 0) {
                    return new ifm.b();
                }
                if (i2 == 1) {
                    return new iri.j();
                }
                if (i2 == 2) {
                    return new gae.d();
                }
                if (i2 == 3) {
                    return new gae.e();
                }
                if (i2 != 4) {
                    throw new AssertionError(i2);
                }
                xua.a aVarA = bVar6.f133296b.a();
                s.j(aVarA);
                gae.g gVar2 = (gae.g) bVar6.f133299h.get();
                i9e.c cVar6 = (i9e.c) bVar6.f133297c.f303681y.get();
                s.j(cVar6);
                gae.g gVar3 = (gae.g) bVar6.f133299h.get();
                whf.b bVarA = bVar6.f133295a.a();
                s.j(bVarA);
                return new gae.c(aVarA, gVar2, cVar6, gVar3, bVarA, new s71.c());
            case 26:
                fc4.c cVar7 = (fc4.c) obj2;
                if (i2 == 0) {
                    return new ifm.b();
                }
                if (i2 == 1) {
                    return new iri.j();
                }
                if (i2 == 2) {
                    return new ec4.a((pgi.l) cVar7.f133640g.get(), 0);
                }
                if (i2 == 3) {
                    return new pgi.o();
                }
                throw new AssertionError(i2);
            case 27:
                fd2.f fVar2 = (fd2.f) obj2;
                nj0.a aVar17 = fVar2.f133860a;
                switch (i2) {
                    case 0:
                        IDealService iDealService = (IDealService) fVar2.i.get();
                        q06.d dVarA = fVar2.f133861b.a();
                        s.j(dVarA);
                        f80.a aVarX = fVar2.f133862c.x();
                        s.j(aVarX);
                        return new bd2.e(iDealService, dVarA, aVarX);
                    case 1:
                        IDealService iDealService2 = (IDealService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) fVar2.f133864h.get(), "retrofit", IDealService.class, "create(...)");
                        s.k(iDealService2);
                        return iDealService2;
                    case 2:
                        Retrofit retrofit3 = ((nj0.d) aVar17).f();
                        OkHttpClient okHttpClient = (OkHttpClient) fVar2.f133863g.get();
                        Intrinsics.checkNotNullParameter(retrofit3, "retrofit");
                        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
                        Retrofit retrofitBuild = retrofit3.newBuilder().client(okHttpClient).build();
                        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                        s.k(retrofitBuild);
                        return retrofitBuild;
                    case 3:
                        OkHttpClient okHttpClient2 = ((nj0.d) aVar17).e();
                        s.j(okHttpClient2);
                        Intrinsics.checkNotNullParameter(okHttpClient2, "okHttpClient");
                        OkHttpClient.a aVarA2 = okHttpClient2.a();
                        aVarA2.i = false;
                        aVarA2.f226075j = false;
                        return new OkHttpClient(aVarA2);
                    case 4:
                        fd2.c.Companion.getClass();
                        zzl.c cVar8 = new zzl.c();
                        wt9.b bVar7 = (wt9.b) ((ut9.a) fVar2.d).f283048t.get();
                        s.j(bVar7);
                        uw1.c cVarD = ((lz1.m) fVar2.e).d();
                        s.j(cVarD);
                        return new n52.c(cVar8, bVar7, cVarD);
                    case 5:
                        return new ed2.a((sri.m) fVar2.f133866l.get());
                    case 6:
                        Context context3 = fVar2.f;
                        fd2.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context3, "context");
                        return o.c(context3, null, null, 14);
                    default:
                        throw new AssertionError(i2);
                }
            case 28:
                if (i2 == 0) {
                    return new dd2.a();
                }
                if (i2 != 1) {
                    throw new AssertionError(i2);
                }
                Context context4 = ((fd2.g) obj2).f133870c;
                Intrinsics.checkNotNullParameter(context4, "context");
                return o.c(context4, null, null, 14);
            default:
                fd2.l lVar = (fd2.l) obj2;
                IDealStartRegistrationScreenContract$InputData iDealStartRegistrationScreenContract$InputData = lVar.f133883a;
                if (i2 == 0) {
                    return new md2.g(iDealStartRegistrationScreenContract$InputData, (n) lVar.f133884b.get());
                }
                if (i2 == 1) {
                    return new md2.j(iDealStartRegistrationScreenContract$InputData);
                }
                throw new AssertionError(i2);
        }
    }
}
