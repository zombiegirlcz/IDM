package z52;

import com.revolut.feature.apm.iris.impl.data.IrisPayService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f319431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f319432b;

    public i(j jVar, int i) {
        this.f319431a = jVar;
        this.f319432b = i;
    }

    @Override // phm.a
    public final Object get() {
        j jVar = this.f319431a;
        l70.e eVar = jVar.e;
        int i = this.f319432b;
        if (i == 0) {
            IrisPayService irisPayService = (IrisPayService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) jVar.f319442p.get(), "retrofit", IrisPayService.class, "create(...)");
            vc.s.k(irisPayService);
            return irisPayService;
        }
        if (i != 1) {
            if (i == 2) {
                return new f62.l(((lz1.m) jVar.f319438j).g());
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
            s70.a aVarM = eVar.m();
            vc.s.j(aVarM);
            y80.a aVarR = eVar.r();
            vc.s.j(aVarR);
            return new pn3.b(aVarM, aVarR);
        }
        ik0.b factory = ((nj0.d) jVar.f319433a).m();
        vc.s.j(factory);
        kg.o gson = ((c21.b) jVar.i).h();
        vc.s.j(gson);
        Intrinsics.checkNotNullParameter(gson, "gson");
        kg.p pVar = new kg.p(gson);
        he0.m mVarB = he0.m.b(v52.c.class, "action");
        mVarB.c(v52.b.class, "PAY");
        mVarB.c(v52.a.class, "AUTHORISATION");
        Intrinsics.checkNotNullExpressionValue(mVarB, "registerSubtype(...)");
        pVar.e.add(mVarB);
        kg.o gson2 = pVar.b();
        Intrinsics.checkNotNullExpressionValue(gson2, "create(...)");
        Intrinsics.checkNotNullParameter(gson2, "gson");
        GsonConverterFactory converterFactory = GsonConverterFactory.create(gson2);
        Intrinsics.checkNotNullExpressionValue(converterFactory, "create(...)");
        vc.s.k(converterFactory);
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Retrofit retrofitA = ik0.b.a(factory, null, null, converterFactory, null, 27);
        vc.s.k(retrofitA);
        return retrofitA;
    }
}
