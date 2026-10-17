package klf;

import com.revolut.feature.teen.accounts.api.TeenAccountsApi$Toggles$TeenGuardianHub;
import kkf.b4;
import kkf.m5;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f185530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hj8.a f185531c;
    public final osg.a d;
    public final gte.a e;
    public final xqe.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f185532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f185533h;

    public m1(CoroutineScope coroutineScope, h0 commonDataSource, hj8.a juniorProfileInteractor, osg.a newWalletInteractor, gte.a featureToggleInteractor, xqe.b teenProfileInteractor) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(newWalletInteractor, "newWalletInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(teenProfileInteractor, "teenProfileInteractor");
        this.f185529a = coroutineScope;
        this.f185530b = commonDataSource;
        this.f185531c = juniorProfileInteractor;
        this.d = newWalletInteractor;
        this.e = featureToggleInteractor;
        this.f = teenProfileInteractor;
        final int i = 0;
        this.f185532g = yhm.j.b(new Function0(this) { // from class: klf.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f185512b;

            {
                this.f185512b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        m1 m1Var = this.f185512b;
                        wkm.l lVarQ = vkm.q.Q(m1Var.f185530b.h(new kkk.u(16)), new m5(null, m1Var, 23));
                        CoroutineScope coroutineScope2 = m1Var.f185529a;
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(lVarQ, skm.e0.D(coroutineScope2, oji.e.f225788b));
                    default:
                        m1 m1Var2 = this.f185512b;
                        Flow flowH = m1Var2.f185530b.h(new kkk.u(17));
                        wsg.b bVar = (wsg.b) m1Var2.d;
                        w4l.h hVar = w4l.h.f294642c;
                        Continuation continuation = null;
                        jhi.b bVarG = mo3.a.g(nim.a.v(zh9.u0.m(bVar.b(hVar), ((nj8.n) m1Var2.f185531c).l(hVar)), new kkk.u(19)), null, new b4(11), 1);
                        int i2 = 3;
                        i23.c cVar = new i23.c(i2, 29, continuation);
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        Flow flowQ = vkm.q.q(ta6.a.h(flowH, rd0.e.e(bVarG, h0Var, cVar), m1Var2.e.a(TeenAccountsApi$Toggles$TeenGuardianHub.f90321c) ? new go.g(h0Var, 2) : rd0.e.e(mo3.a.g(nim.a.v(zh9.u0.m(bVar.b(hVar), m1Var2.f.b(hVar)), new kkk.u(18)), null, new b4(10), 1), h0Var, new l1(i2, 0, continuation)), new ahe.h0(4, 4, continuation)));
                        CoroutineScope coroutineScope3 = m1Var2.f185529a;
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(flowQ, skm.e0.D(coroutineScope3, oji.e.f225788b));
                }
            }
        });
        final int i2 = 1;
        this.f185533h = yhm.j.b(new Function0(this) { // from class: klf.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m1 f185512b;

            {
                this.f185512b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        m1 m1Var = this.f185512b;
                        wkm.l lVarQ = vkm.q.Q(m1Var.f185530b.h(new kkk.u(16)), new m5(null, m1Var, 23));
                        CoroutineScope coroutineScope2 = m1Var.f185529a;
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(lVarQ, skm.e0.D(coroutineScope2, oji.e.f225788b));
                    default:
                        m1 m1Var2 = this.f185512b;
                        Flow flowH = m1Var2.f185530b.h(new kkk.u(17));
                        wsg.b bVar = (wsg.b) m1Var2.d;
                        w4l.h hVar = w4l.h.f294642c;
                        Continuation continuation = null;
                        jhi.b bVarG = mo3.a.g(nim.a.v(zh9.u0.m(bVar.b(hVar), ((nj8.n) m1Var2.f185531c).l(hVar)), new kkk.u(19)), null, new b4(11), 1);
                        int i22 = 3;
                        i23.c cVar = new i23.c(i22, 29, continuation);
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        Flow flowQ = vkm.q.q(ta6.a.h(flowH, rd0.e.e(bVarG, h0Var, cVar), m1Var2.e.a(TeenAccountsApi$Toggles$TeenGuardianHub.f90321c) ? new go.g(h0Var, 2) : rd0.e.e(mo3.a.g(nim.a.v(zh9.u0.m(bVar.b(hVar), m1Var2.f.b(hVar)), new kkk.u(18)), null, new b4(10), 1), h0Var, new l1(i22, 0, continuation)), new ahe.h0(4, 4, continuation)));
                        CoroutineScope coroutineScope3 = m1Var2.f185529a;
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(flowQ, skm.e0.D(coroutineScope3, oji.e.f225788b));
                }
            }
        });
    }

    public final SharedFlow a() {
        return (SharedFlow) this.f185533h.getValue();
    }
}
