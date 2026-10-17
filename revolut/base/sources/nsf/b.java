package nsf;

import android.content.Context;
import b9.w2;
import com.revolut.feature.transfer_reasons.impl.data.network.service.TransferReasonsService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c21.e f218794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nj0.a f218795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jhf.a f218796c;
    public final ite.a d;
    public final djf.c e;
    public final npf.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m41.c f218797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xmg.a f218798h;
    public final vxd.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nf0.a f218799j;
    public final l70.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f218800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f218801m = this;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f218802n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f218803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f218804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f218805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f218806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f218807t;

    public b(jsf.a aVar, l70.e eVar, nf0.a aVar2, nj0.a aVar3, c21.e eVar2, m41.c cVar, ite.a aVar4, vxd.b bVar, jhf.a aVar5, djf.c cVar2, npf.a aVar6, xmg.a aVar7, Context context) {
        this.f218794a = eVar2;
        this.f218795b = aVar3;
        this.f218796c = aVar5;
        this.d = aVar4;
        this.e = cVar2;
        this.f = aVar6;
        this.f218797g = cVar;
        this.f218798h = aVar7;
        this.i = bVar;
        this.f218799j = aVar2;
        this.k = eVar;
        this.f218800l = context;
        int i = 11;
        this.f218802n = e4m.b.b(new nk7.e(this, 0, i));
        this.o = e4m.b.b(new nk7.e(this, 1, i));
        this.f218803p = e4m.b.b(new nk7.e(this, 3, i));
        this.f218804q = e4m.b.b(new nk7.e(this, 2, i));
        this.f218805r = e4m.b.b(new nk7.e(this, 4, i));
        this.f218806s = e4m.b.b(new nk7.e(this, 5, i));
        this.f218807t = e4m.b.b(new nk7.e(this, 6, i));
    }

    public final esf.a a() {
        return (esf.a) this.f218805r.get();
    }

    public final w2 b() {
        asf.a aVar = (asf.a) this.f218806s.get();
        zof.f fVarD = this.f.d();
        vc.s.j(fVarD);
        k61.a aVarE = this.f218797g.e();
        vc.s.j(aVarE);
        return new w2(aVar, fVarD, aVarE, (csf.b) this.f218804q.get(), new isf.e(), this.f218798h.e());
    }

    public final csf.b c() {
        return (csf.b) this.f218804q.get();
    }

    public final TransferReasonsService d() {
        kg.o gson = ((c21.b) this.f218794a).h();
        vc.s.j(gson);
        ik0.b retrofitFactory = ((nj0.d) this.f218795b).m();
        vc.s.j(retrofitFactory);
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Retrofit retrofit = ik0.b.a(retrofitFactory, null, null, GsonConverterFactory.create(gson), null, 27);
        vc.s.k(retrofit);
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TransferReasonsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TransferReasonsService transferReasonsService = (TransferReasonsService) objCreate;
        vc.s.k(transferReasonsService);
        return transferReasonsService;
    }
}
