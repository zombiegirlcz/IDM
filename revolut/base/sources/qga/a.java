package qga;

import ang.f;
import com.revolut.feature.pricing_plans.upgrade_prompt.impl.network.PricingPlanContextualUpsellService;
import cwi.x;
import dwi.r;
import ffk.j;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import qgk.k3;
import retrofit2.Retrofit;
import rga.q;
import rlm.o;
import tga.g;
import tga.k;
import ulm.a1;
import ulm.b1;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xmg.a f245708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efk.a f245709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l70.e f245710c;
    public final x d;
    public final nj0.a e;
    public final ite.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ufk.a f245711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pqi.a f245712h;
    public final cri.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f245713j = e4m.b.b(new a9i.b(0, 9));
    public final e4m.e k = e4m.b.b(new a9i.b(1, 9));

    public a(l70.e eVar, ee0.a aVar, nj0.a aVar2, cri.b bVar, ite.a aVar3, efk.a aVar4, ufk.a aVar5, pqi.a aVar6, xmg.a aVar7, x xVar) {
        this.f245708a = aVar7;
        this.f245709b = aVar4;
        this.f245710c = eVar;
        this.d = xVar;
        this.e = aVar2;
        this.f = aVar3;
        this.f245711g = aVar5;
        this.f245712h = aVar6;
        this.i = bVar;
    }

    public final jt0.b a() {
        p56.a aVar = new p56.a(new q(new sga.a()));
        gte.a aVarB = this.f.b();
        s.j(aVarB);
        return new jt0.b(aVar, aVarB, ((s41.a) this.i).d());
    }

    public final k b() {
        xmg.a aVar = this.f245708a;
        f fVarE = aVar.e();
        efk.a aVar2 = this.f245709b;
        t tVarF = aVar2.f();
        s.j(tVarF);
        g gVar = new g();
        uga.c cVar = new uga.c();
        uga.d dVar = new uga.d();
        uga.e eVar = new uga.e();
        uga.b bVar = new uga.b();
        j pricingPlanLimitsInteractor = aVar2.g();
        s.j(pricingPlanLimitsInteractor);
        t pricingPlanInteractor = aVar2.f();
        s.j(pricingPlanInteractor);
        l70.e eVar2 = this.f245710c;
        l80.e dateProvider = eVar2.h();
        s.j(dateProvider);
        f userInteractor = aVar.e();
        Intrinsics.checkNotNullParameter(pricingPlanLimitsInteractor, "pricingPlanLimitsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        vga.b bVar2 = new vga.b(pricingPlanLimitsInteractor, pricingPlanInteractor, dateProvider, userInteractor, 1);
        j pricingPlanLimitsInteractor2 = aVar2.g();
        s.j(pricingPlanLimitsInteractor2);
        t pricingPlanInteractor2 = aVar2.f();
        s.j(pricingPlanInteractor2);
        l80.e dateProvider2 = eVar2.h();
        s.j(dateProvider2);
        f userInteractor2 = aVar.e();
        Intrinsics.checkNotNullParameter(pricingPlanLimitsInteractor2, "pricingPlanLimitsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor2, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(dateProvider2, "dateProvider");
        Intrinsics.checkNotNullParameter(userInteractor2, "userInteractor");
        vga.b bVar3 = new vga.b(pricingPlanLimitsInteractor2, pricingPlanInteractor2, dateProvider2, userInteractor2, 0);
        t tVarF2 = aVar2.f();
        s.j(tVarF2);
        l80.e eVarH = eVar2.h();
        s.j(eVarH);
        r rVar = (r) this.d.E.get();
        s.j(rVar);
        vga.d dVar2 = new vga.d(tVarF2, eVarH, rVar);
        zga.g contextualBannerRepository = new zga.g(c(), (ne0.j) this.f245713j.get());
        t pricingPlanInteractor3 = aVar2.f();
        s.j(pricingPlanInteractor3);
        Intrinsics.checkNotNullParameter(contextualBannerRepository, "contextualBannerRepository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor3, "pricingPlanInteractor");
        ryc.a aVar3 = new ryc.a();
        aVar3.f258289a = contextualBannerRepository;
        aVar3.f258290b = pricingPlanInteractor3;
        gte.a aVarB = this.f.b();
        s.j(aVarB);
        return new k(fVarE, tVarF, gVar, cVar, dVar, eVar, bVar, new ou5.b(bVar2, bVar3, dVar2, aVar3, aVarB), new tga.c(new tga.a(), new tga.f(), ((k3) this.f245711g).b(), new tga.d(), this.f245712h.g()));
    }

    public final PricingPlanContextualUpsellService c() {
        Retrofit retrofit = ((nj0.d) this.e).f();
        Json json = fe0.d.a();
        e.Companion.getClass();
        Intrinsics.checkNotNullParameter(json, "json");
        o json2 = ue0.e.b(json, new b6b.b(json, 1));
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(json2, "json");
        Retrofit.Builder builderNewBuilder = retrofit.newBuilder();
        builderNewBuilder.converterFactories().clear();
        b1.Companion.getClass();
        Retrofit retrofitBuild = builderNewBuilder.addConverterFactory(ek.b.a(json2, a1.a("application/json"))).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
        s.k(retrofitBuild);
        PricingPlanContextualUpsellService pricingPlanContextualUpsellService = (PricingPlanContextualUpsellService) com.google.android.gms.internal.mlkit_vision_face.a.i(retrofitBuild, "retrofit", PricingPlanContextualUpsellService.class, "create(...)");
        s.k(pricingPlanContextualUpsellService);
        return pricingPlanContextualUpsellService;
    }
}
