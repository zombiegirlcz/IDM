package jqa;

import com.revolut.feature.push_to_card.impl.flows.amount_common.Push2CardAmountService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nj0.a f177666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qga.b f177667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h4e.a f177668c;
    public final jhf.a d;
    public final lpf.a e;
    public final so9.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z7l.a f177669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final usg.a f177670h;
    public final ite.a i;

    public r(nj0.a aVar, so9.b bVar, lpf.a aVar2, usg.a aVar3, jhf.a aVar4, h4e.a aVar5, ite.a aVar6, qga.b bVar2, z7l.a aVar7) {
        this.f177666a = aVar;
        this.f177667b = bVar2;
        this.f177668c = aVar5;
        this.d = aVar4;
        this.e = aVar2;
        this.f = bVar;
        this.f177669g = aVar7;
        this.f177670h = aVar3;
        this.i = aVar6;
    }

    public final jid.z a() {
        Retrofit retrofit = ((nj0.d) this.f177666a).f();
        z zVar = a0.Companion;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(Push2CardAmountService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        Push2CardAmountService push2CardAmountService = (Push2CardAmountService) objCreate;
        vc.s.k(push2CardAmountService);
        zVar.getClass();
        ne0.d dVar = new ne0.d();
        rga.c cVarB = this.f177667b.b();
        vc.s.j(cVarB);
        return new jid.z(new h30.q(push2CardAmountService, dVar, cVarB), this.f177668c.b());
    }
}
