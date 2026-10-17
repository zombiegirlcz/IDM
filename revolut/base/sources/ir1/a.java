package ir1;

import com.revolut.feature.apm.bills.postal_check.impl.data.PostalCheckService;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f167948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f167949b;

    public a(b bVar, int i) {
        this.f167948a = bVar;
        this.f167949b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f167948a;
        int i = this.f167949b;
        if (i == 0) {
            gte.a aVarB = bVar.f167950a.b();
            s.j(aVarB);
            return new er1.b(aVarB, bVar.f167951b.a());
        }
        if (i == 1) {
            return new fr1.b((PostalCheckService) bVar.f167955j.get());
        }
        if (i == 2) {
            PostalCheckService postalCheckService = (PostalCheckService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.i.get(), "retrofit", PostalCheckService.class, "create(...)");
            s.k(postalCheckService);
            return postalCheckService;
        }
        if (i != 3) {
            if (i == 4) {
                return new jr1.f((fr1.b) bVar.k.get());
            }
            throw new AssertionError(i);
        }
        ik0.b factory = ((nj0.d) bVar.d).m();
        s.j(factory);
        l lVar = bVar.f167952c;
        o oVarH = ((c21.b) bVar.e).h();
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
