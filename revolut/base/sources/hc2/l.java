package hc2;

import com.revolut.feature.apm.qvik.impl.data.QvikPayService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f150797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f150798b;

    public l(m mVar, int i) {
        this.f150797a = mVar;
        this.f150798b = i;
    }

    @Override // phm.a
    public final Object get() {
        m mVar = this.f150797a;
        i iVar = mVar.d;
        l70.e eVar = mVar.f150802g;
        nj0.a aVar = mVar.f150803h;
        int i = this.f150798b;
        switch (i) {
            case 0:
                return new fc2.a();
            case 1:
                kz9.a aVarA = mVar.f150801c.a();
                vc.s.j(aVarA);
                cc2.a aVar2 = (cc2.a) iVar.e.get();
                vc.s.j(aVar2);
                return new mc2.d(aVarA, aVar2);
            case 2:
                ky1.c cVar = (ky1.c) ((ey1.e) mVar.f150799a).M.get();
                vc.s.j(cVar);
                cc2.a aVar3 = (cc2.a) iVar.e.get();
                vc.s.j(aVar3);
                mc2.g gVar = new mc2.g((c12.f) mVar.o.get());
                gte.a aVarB = mVar.e.b();
                vc.s.j(aVarB);
                return new mc2.k(cVar, aVar3, gVar, aVarB);
            case 3:
                h12.h hVarF = mVar.f150800b.f();
                vc.s.j(hVarF);
                return new mc2.o(hVarF);
            case 4:
                s70.a aVarM = eVar.m();
                vc.s.j(aVarM);
                y80.a aVarR = eVar.r();
                vc.s.j(aVarR);
                return new pn3.b(aVarM, aVarR);
            case 5:
                uy1.b factory = ((lz1.m) mVar.f).b();
                vc.s.j(factory);
                g.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                zz1.h.Companion.getClass();
                return factory.a(zz1.h.k);
            case 6:
                vw1.b bVar = (vw1.b) mVar.f150811s.get();
                wj0.a aVarI = ((nj0.d) aVar).i();
                vc.s.j(aVarI);
                return new wc2.e(bVar, aVarI);
            case 7:
                QvikPayService qvikPayService = (QvikPayService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) mVar.u.get(), "retrofit", QvikPayService.class, "create(...)");
                vc.s.k(qvikPayService);
                return qvikPayService;
            case 8:
                ik0.b factory2 = ((nj0.d) aVar).m();
                vc.s.j(factory2);
                kg.o gson = ((c21.b) mVar.f150805l).h();
                vc.s.j(gson);
                Intrinsics.checkNotNullParameter(gson, "gson");
                kg.p pVar = new kg.p(gson);
                he0.m mVarB = he0.m.b(ec2.b.class, "action");
                mVarB.c(ec2.a.class, "PAY");
                Intrinsics.checkNotNullExpressionValue(mVarB, "registerSubtype(...)");
                pVar.e.add(mVarB);
                kg.o gson2 = pVar.b();
                Intrinsics.checkNotNullExpressionValue(gson2, "create(...)");
                Intrinsics.checkNotNullParameter(gson2, "gson");
                GsonConverterFactory converterFactory = GsonConverterFactory.create(gson2);
                Intrinsics.checkNotNullExpressionValue(converterFactory, "create(...)");
                vc.s.k(converterFactory);
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Retrofit retrofitA = ik0.b.a(factory2, null, null, converterFactory, null, 27);
                vc.s.k(retrofitA);
                return retrofitA;
            default:
                throw new AssertionError(i);
        }
    }
}
