package wo6;

import ang.f;
import nj0.d;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xmg.a f298891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ite.a f298892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f298893c;

    public a(xmg.a aVar, nj0.a aVar2, ite.a aVar3) {
        this.f298891a = aVar;
        this.f298892b = aVar3;
        this.f298893c = aVar2;
    }

    public final vo6.b a() {
        f fVarE = this.f298891a.e();
        gte.a aVarB = this.f298892b.b();
        s.j(aVarB);
        return new vo6.b(fVarE, aVarB);
    }

    public final Retrofit b() {
        return ((d) this.f298893c).f();
    }
}
