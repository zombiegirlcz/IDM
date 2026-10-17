package fl9;

import com.revolut.feature.pay_with_photo.impl.network.PayWithPhotoService;
import eyd.v;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f135908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f135909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f135910c;
    public final t2j.a d;
    public final ite.a e;
    public final bw9.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f135911g = this;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f135912h = new v(this, 22);

    public a(t2j.a aVar, l70.e eVar, nj0.a aVar2, ite.a aVar3, bw9.a aVar4, c cVar) {
        this.f135908a = aVar2;
        this.f135909b = eVar;
        this.f135910c = cVar;
        this.d = aVar;
        this.e = aVar3;
        this.f = aVar4;
    }

    public final ll9.b a() {
        nj0.d dVar = (nj0.d) this.f135908a;
        ik0.b retrofitFactory = dVar.m();
        s.j(retrofitFactory);
        ek.a converterFactory = dVar.d();
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(PayWithPhotoService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        PayWithPhotoService payWithPhotoService = (PayWithPhotoService) objCreate;
        s.k(payWithPhotoService);
        l70.e eVar = this.f135909b;
        zk0.b bVarL = eVar.l();
        s.j(bVarL);
        jl9.b bVar = new jl9.b(payWithPhotoService, bVarL);
        l80.e eVarH = eVar.h();
        s.j(eVarH);
        fn2.c cVar = new fn2.c(bVar, eVarH);
        c cVar2 = this.f135910c;
        kl9.d dVar2 = new kl9.d();
        ll9.a aVar = new ll9.a();
        zk0.b bVarL2 = cVar2.f135915a.l();
        s.j(bVarL2);
        return new ll9.b(cVar, dVar2, this.f135912h, aVar, new kl9.c(bVarL2));
    }
}
