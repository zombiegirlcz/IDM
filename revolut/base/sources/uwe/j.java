package uwe;

import a83.o0;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;
import skm.c2;
import skm.e0;
import skm.p0;
import vkm.d2;
import vkm.q;
import vkm.v1;
import yji.n;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f283649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hxe.d f283650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CoroutineScope f283651n;
    public final Lazy o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Lazy f283652p;

    public j(g checkoutPrerequisitesDelegate, hxe.d checkoutLoyaltyQuotesProvider) {
        Intrinsics.checkNotNullParameter(checkoutPrerequisitesDelegate, "checkoutPrerequisitesDelegate");
        Intrinsics.checkNotNullParameter(checkoutLoyaltyQuotesProvider, "checkoutLoyaltyQuotesProvider");
        this.f283649l = checkoutPrerequisitesDelegate;
        this.f283650m = checkoutLoyaltyQuotesProvider;
        c2 c2VarE = e0.e();
        p0 p0Var = p0.f264001a;
        this.f283651n = rd0.e.a(kotlin.coroutines.e.d(c2VarE, elm.f.f127540b));
        final int i = 0;
        this.o = yhm.j.b(new Function0(this) { // from class: uwe.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f283648b;

            {
                this.f283648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        j jVar = this.f283648b;
                        g gVar = jVar.f283649l;
                        gVar.getClass();
                        return q.M(new v1(new sxe.g(gVar, (Continuation) null, 11)), jVar.f283651n, vkm.c2.a(d2.Companion, 0L, 2), 1);
                    default:
                        j jVar2 = this.f283648b;
                        Lazy lazy = jVar2.o;
                        return q.M(q.q(new t38.e((SharedFlow) lazy.getValue(), 24, nim.a.u(new un8.j(jVar2, (Continuation) null, 15), q.s((SharedFlow) lazy.getValue(), new uv1.c(22), q.f290100b)), new o0(3, 19, null))), jVar2.f283651n, vkm.c2.a(d2.Companion, 0L, 2), 1);
                }
            }
        });
        final int i2 = 1;
        this.f283652p = yhm.j.b(new Function0(this) { // from class: uwe.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f283648b;

            {
                this.f283648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        j jVar = this.f283648b;
                        g gVar = jVar.f283649l;
                        gVar.getClass();
                        return q.M(new v1(new sxe.g(gVar, (Continuation) null, 11)), jVar.f283651n, vkm.c2.a(d2.Companion, 0L, 2), 1);
                    default:
                        j jVar2 = this.f283648b;
                        Lazy lazy = jVar2.o;
                        return q.M(q.q(new t38.e((SharedFlow) lazy.getValue(), 24, nim.a.u(new un8.j(jVar2, (Continuation) null, 15), q.s((SharedFlow) lazy.getValue(), new uv1.c(22), q.f290100b)), new o0(3, 19, null))), jVar2.f283651n, vkm.c2.a(d2.Companion, 0L, 2), 1);
                }
            }
        });
    }

    @Override // yji.n
    public final void E2() {
        e0.k(this.f283651n, null);
    }

    public final Object Z2(gim.i iVar) {
        g gVar = this.f283649l;
        gVar.getClass();
        Continuation continuation = null;
        u83.f fVar = new u83.f(gVar, continuation, 28);
        CoroutineScope coroutineScope = this.f283651n;
        Object objH = e0.h(v.k(e0.g(coroutineScope, null, null, fVar, 3), e0.g(coroutineScope, null, null, new f(gVar, continuation, 0), 3)), iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objH != aVar) {
            objH = Unit.f186387a;
        }
        return objH == aVar ? objH : Unit.f186387a;
    }
}
