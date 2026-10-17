package jqa;

import b9.w2;
import com.revolut.feature.push_to_card.impl.flows.amount_common.Push2CardAmountService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lpf.a f177629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk3.c f177630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f177631c;
    public final qga.b d;
    public final h4e.a e;
    public final jhf.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final so9.b f177632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z7l.a f177633h;
    public final usg.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ite.a f177634j;
    public final c21.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nsf.b f177635l;

    public o(nj0.a aVar, jk3.c cVar, c21.e eVar, ite.a aVar2, z7l.a aVar3, so9.b bVar, h4e.a aVar4, jhf.a aVar5, lpf.a aVar6, nsf.b bVar2, qga.b bVar3, usg.a aVar7) {
        this.f177629a = aVar6;
        this.f177630b = cVar;
        this.f177631c = aVar;
        this.d = bVar3;
        this.e = aVar4;
        this.f = aVar5;
        this.f177632g = bVar;
        this.f177633h = aVar3;
        this.i = aVar7;
        this.f177634j = aVar2;
        this.k = eVar;
        this.f177635l = bVar2;
    }

    public final jid.z a() {
        Retrofit retrofit = ((nj0.d) this.f177631c).f();
        z zVar = a0.Companion;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(Push2CardAmountService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        Push2CardAmountService push2CardAmountService = (Push2CardAmountService) objCreate;
        vc.s.k(push2CardAmountService);
        zVar.getClass();
        ne0.d dVar = new ne0.d();
        rga.c cVarB = this.d.b();
        vc.s.j(cVarB);
        return new jid.z(new h30.q(push2CardAmountService, dVar, cVarB), this.e.b());
    }

    public final r10.r b() {
        csa.c pushToCardDialogProvider = new csa.c();
        xdk.a aVar = new xdk.a();
        z71.a aVarF = ((c21.b) this.k).f();
        vc.s.j(aVarF);
        utk.f enablePocketExtensionFactory = new utk.f(aVar, aVarF, this.i.a());
        w2 transferReasonLauncherExtensionFactory = this.f177635l.b();
        Intrinsics.checkNotNullParameter(pushToCardDialogProvider, "pushToCardDialogProvider");
        Intrinsics.checkNotNullParameter(enablePocketExtensionFactory, "enablePocketExtensionFactory");
        Intrinsics.checkNotNullParameter(transferReasonLauncherExtensionFactory, "transferReasonLauncherExtensionFactory");
        r10.r rVar = new r10.r();
        rVar.f250851a = pushToCardDialogProvider;
        rVar.f250852b = enablePocketExtensionFactory;
        rVar.f250853c = transferReasonLauncherExtensionFactory;
        return rVar;
    }
}
