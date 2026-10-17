package v8k;

import b9.w2;
import j9k.a0;
import j9k.p;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import wsg.n;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jk3.c f286866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m41.c f286867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final usg.a f286868c;
    public final q8b.a d;
    public final xmg.a e;
    public final lpf.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qga.b f286869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z7l.a f286870h;
    public final ite.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l70.e f286871j;
    public final so9.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l89.b f286872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gsc.c f286873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c21.e f286874n;
    public final nsf.b o;

    public h(l70.e eVar, ite.a aVar, xmg.a aVar2, usg.a aVar3, m41.c cVar, lpf.a aVar4, jk3.c cVar2, z7l.a aVar5, q8b.a aVar6, so9.b bVar, c21.e eVar2, l89.b bVar2, gsc.c cVar3, nsf.b bVar3, qga.b bVar4) {
        this.f286866a = cVar2;
        this.f286867b = cVar;
        this.f286868c = aVar3;
        this.d = aVar6;
        this.e = aVar2;
        this.f = aVar4;
        this.f286869g = bVar4;
        this.f286870h = aVar5;
        this.i = aVar;
        this.f286871j = eVar;
        this.k = bVar;
        this.f286872l = bVar2;
        this.f286873m = cVar3;
        this.f286874n = eVar2;
        this.o = bVar3;
    }

    public final b9k.f a() {
        t99.k exchangeGlobalAccessFlowProvider = ((s99.a) this.f286872l).a();
        s.j(exchangeGlobalAccessFlowProvider);
        ang.f userInteractor = this.e.e();
        gsc.c cVar = this.f286873m;
        zrc.d cryptoScaInteractor = cVar.a();
        hsc.c cryptoScaPromptShotDialogProvider = cVar.b();
        xdk.a aVar = new xdk.a();
        z71.a aVarF = ((c21.b) this.f286874n).f();
        s.j(aVarF);
        utk.f enablePocketExtensionFactory = new utk.f(aVar, aVarF, this.f286868c.a());
        l80.h hVarV = this.f286871j.v();
        s.j(hVarV);
        fkg.a appFraudCheckExtensionFactory = new fkg.a(hVarV);
        w2 transferReasonLauncherExtensionFactory = this.o.b();
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessFlowProvider, "exchangeGlobalAccessFlowProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(cryptoScaInteractor, "cryptoScaInteractor");
        Intrinsics.checkNotNullParameter(cryptoScaPromptShotDialogProvider, "cryptoScaPromptShotDialogProvider");
        Intrinsics.checkNotNullParameter(enablePocketExtensionFactory, "enablePocketExtensionFactory");
        Intrinsics.checkNotNullParameter(appFraudCheckExtensionFactory, "appFraudCheckExtensionFactory");
        Intrinsics.checkNotNullParameter(transferReasonLauncherExtensionFactory, "transferReasonLauncherExtensionFactory");
        b9k.f fVar = new b9k.f();
        fVar.f13817b = exchangeGlobalAccessFlowProvider;
        fVar.f13816a = userInteractor;
        fVar.f13818c = cryptoScaInteractor;
        fVar.d = cryptoScaPromptShotDialogProvider;
        fVar.e = enablePocketExtensionFactory;
        fVar.f = appFraudCheckExtensionFactory;
        fVar.f13819g = transferReasonLauncherExtensionFactory;
        return fVar;
    }

    public final p b() {
        jk3.c cVar = this.f286866a;
        fk3.a aVarA = cVar.a();
        s.j(aVarA);
        fk3.a aVarA2 = cVar.a();
        s.j(aVarA2);
        a0 a0Var = new a0(aVarA2);
        fk3.a aVarA3 = cVar.a();
        s.j(aVarA3);
        k61.a aVarE = this.f286867b.e();
        s.j(aVarE);
        r10.a aVar = new r10.a(a0Var, new j9k.c(aVarA3, aVarE));
        n nVarB = this.f286868c.b();
        n8b.a aVarA4 = this.d.a();
        s.j(aVarA4);
        fk3.a aVarA5 = cVar.a();
        s.j(aVarA5);
        f61.a aVar2 = new f61.a(aVarA5);
        l61.a aVarB = this.e.b();
        s.j(aVarB);
        return new p(aVarA, aVar, nVarB, aVarA4, aVar2, aVarB);
    }
}
