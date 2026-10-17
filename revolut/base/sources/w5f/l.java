package w5f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.managed_portfolios.impl.data.network.investor_updates.InvestorUpdatesService;
import com.revolut.feature.trading.managed_portfolios.impl.data.network.template.TemplateIntroService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f295187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f295188b;

    public l(m mVar, int i) {
        this.f295187a = mVar;
        this.f295188b = i;
    }

    @Override // phm.a
    public final Object get() {
        m mVar = this.f295187a;
        int i = this.f295188b;
        switch (i) {
            case 0:
                nd.p factory = new nd.p();
                h0.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new h(mVar);
            case 1:
                gte.a aVarB = mVar.f295189a.b();
                vc.s.j(aVarB);
                return new m5f.a(ImmutableSet.of(new com.revolut.feature.trading.managed_portfolios.impl.navigation.a(aVarB)));
            case 2:
                return new x5f.k(mVar.d());
            case 3:
                p5f.b provider = new p5f.b((InvestorUpdatesService) mVar.f295204x.get(), new q5f.h(), (ue0.c) mVar.f295205y.get(), new ne0.d());
                n5f.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                x4l.c cVar = provider.d;
                vc.s.k(cVar);
                return cVar;
            case 4:
                o5f.a aVar = mVar.f295192g;
                InvestorUpdatesService investorUpdatesService = (InvestorUpdatesService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) mVar.f295203w.get(), "retrofit", InvestorUpdatesService.class, "create(...)");
                vc.s.k(investorUpdatesService);
                return investorUpdatesService;
            case 5:
                o5f.a aVar2 = mVar.f295192g;
                Retrofit retrofit = ((nj0.d) mVar.f295193h).f();
                kg.o gson = fe0.c.a();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Intrinsics.checkNotNullParameter(gson, "gson");
                return j6.a.B(retrofit.newBuilder(), gson, "build(...)");
            case 6:
                je0.d mapper = mVar.i.b();
                vc.s.j(mapper);
                yk0.a databaseSessionProvider = mVar.f295194j.b();
                vc.s.j(databaseSessionProvider);
                xe0.f storageFactory = mVar.i.f();
                vc.s.j(storageFactory);
                n5f.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "managed_portfolios_storage", mapper, 1, zhm.f0.f322471a, 32);
            case 7:
                p5f.e provider2 = new p5f.e((InvestorUpdatesService) mVar.f295204x.get(), new q5f.h(), (ue0.c) mVar.f295205y.get(), new ne0.d());
                n5f.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider2, "provider");
                x4l.c cVar2 = provider2.d;
                vc.s.k(cVar2);
                return cVar2;
            case 8:
                s5f.b provider3 = new s5f.b((TemplateIntroService) mVar.B.get(), new t5f.j(), (ue0.c) mVar.f295205y.get(), new ne0.d());
                n5f.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider3, "provider");
                x4l.c cVar3 = provider3.e;
                vc.s.k(cVar3);
                return cVar3;
            case 9:
                o5f.a aVar3 = mVar.f295192g;
                nj0.a aVar4 = mVar.f295193h;
                ik0.b retrofitFactory = ((nj0.d) aVar4).m();
                vc.s.j(retrofitFactory);
                ek.a converterFactory = ((nj0.d) aVar4).d();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(TemplateIntroService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                TemplateIntroService templateIntroService = (TemplateIntroService) objCreate;
                vc.s.k(templateIntroService);
                return templateIntroService;
            default:
                throw new AssertionError(i);
        }
    }
}
