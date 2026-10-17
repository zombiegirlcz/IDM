package ir1;

import com.revolut.feature.apm.bills.postal_check.impl.data.PostalCheckService;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f167960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f167961b;

    public d(e eVar, int i) {
        this.f167960a = eVar;
        this.f167961b = i;
    }

    @Override // phm.a
    public final Object get() {
        int i = this.f167961b;
        if (i == 0) {
            return new hr1.a();
        }
        e eVar = this.f167960a;
        if (i == 1) {
            return new kr1.e(eVar.a(), (er1.b) eVar.f167970n.get());
        }
        if (i == 2) {
            return new fr1.b((PostalCheckService) eVar.f167968l.get());
        }
        if (i == 3) {
            PostalCheckService postalCheckService = (PostalCheckService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) eVar.k.get(), "retrofit", PostalCheckService.class, "create(...)");
            s.k(postalCheckService);
            return postalCheckService;
        }
        if (i != 4) {
            if (i != 5) {
                throw new AssertionError(i);
            }
            gte.a aVarB = eVar.f167965g.b();
            s.j(aVarB);
            return new er1.b(aVarB, eVar.f167966h.a());
        }
        ik0.b factory = ((nj0.d) eVar.f167964c).m();
        s.j(factory);
        l lVar = eVar.f167963b;
        o oVarH = ((c21.b) eVar.d).h();
        s.j(oVarH);
        o gson = ige.d.l(lVar, oVarH);
        Intrinsics.checkNotNullParameter(gson, "gson");
        GsonConverterFactory converterFactory = GsonConverterFactory.create(gson);
        Intrinsics.checkNotNullExpressionValue(converterFactory, "create(...)");
        s.k(converterFactory);
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Retrofit retrofitA = ik0.b.a(factory, null, null, converterFactory, null, 27);
        s.k(retrofitA);
        return retrofitA;
    }
}
