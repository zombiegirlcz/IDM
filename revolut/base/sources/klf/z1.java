package klf;

import com.revolut.domain.models.transactions.SavingsDirection;
import com.revolut.domain.models.transactions.SavingsTransactionLeg;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import tof.o3;

/* JADX INFO: loaded from: classes8.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f185616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final djb.n f185617c;
    public final ypg.f d;
    public final com.revolut.domain.interactors.transactions.a e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f185618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f185619h;

    public z1(CoroutineScope coroutineScope, h0 commonDataSource, djb.n savingsAccountDetailsInteractor, ypg.f transactionsMoneyBoxInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(savingsAccountDetailsInteractor, "savingsAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(transactionsMoneyBoxInteractor, "transactionsMoneyBoxInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f185615a = coroutineScope;
        this.f185616b = commonDataSource;
        this.f185617c = savingsAccountDetailsInteractor;
        this.d = transactionsMoneyBoxInteractor;
        this.e = transactionsInteractor;
        final int i = 0;
        this.f = yhm.j.b(new Function0(this) { // from class: klf.s1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z1 f185573b;

            {
                this.f185573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        z1 z1Var = this.f185573b;
                        Continuation continuation = null;
                        Flow flowQ = vkm.q.q(new vkm.y(new g2d.c(2, 29, continuation), vkm.q.Q(z1Var.f185616b.h(new kkk.u(20)), new u1(continuation, z1Var, 0))));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), z1Var.f185615a);
                    case 1:
                        z1 z1Var2 = this.f185573b;
                        return edl.a.r(vkm.q.Q(z1Var2.f185616b.h(new kkk.u(21)), new u1(null, z1Var2, 2)), z1Var2.f185615a);
                    default:
                        z1 z1Var3 = this.f185573b;
                        return edl.a.r(vkm.q.Q(z1Var3.f185616b.d(), new u1(null, z1Var3, 1)), z1Var3.f185615a);
                }
            }
        });
        final int i2 = 1;
        this.f185618g = yhm.j.b(new Function0(this) { // from class: klf.s1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z1 f185573b;

            {
                this.f185573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        z1 z1Var = this.f185573b;
                        Continuation continuation = null;
                        Flow flowQ = vkm.q.q(new vkm.y(new g2d.c(2, 29, continuation), vkm.q.Q(z1Var.f185616b.h(new kkk.u(20)), new u1(continuation, z1Var, 0))));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), z1Var.f185615a);
                    case 1:
                        z1 z1Var2 = this.f185573b;
                        return edl.a.r(vkm.q.Q(z1Var2.f185616b.h(new kkk.u(21)), new u1(null, z1Var2, 2)), z1Var2.f185615a);
                    default:
                        z1 z1Var3 = this.f185573b;
                        return edl.a.r(vkm.q.Q(z1Var3.f185616b.d(), new u1(null, z1Var3, 1)), z1Var3.f185615a);
                }
            }
        });
        final int i3 = 2;
        this.f185619h = yhm.j.b(new Function0(this) { // from class: klf.s1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ z1 f185573b;

            {
                this.f185573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        z1 z1Var = this.f185573b;
                        Continuation continuation = null;
                        Flow flowQ = vkm.q.q(new vkm.y(new g2d.c(2, 29, continuation), vkm.q.Q(z1Var.f185616b.h(new kkk.u(20)), new u1(continuation, z1Var, 0))));
                        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
                        return edl.a.r(vkm.q.C(flowQ, oji.e.f225788b), z1Var.f185615a);
                    case 1:
                        z1 z1Var2 = this.f185573b;
                        return edl.a.r(vkm.q.Q(z1Var2.f185616b.h(new kkk.u(21)), new u1(null, z1Var2, 2)), z1Var2.f185615a);
                    default:
                        z1 z1Var3 = this.f185573b;
                        return edl.a.r(vkm.q.Q(z1Var3.f185616b.d(), new u1(null, z1Var3, 1)), z1Var3.f185615a);
                }
            }
        });
    }

    public static final boolean a(z1 z1Var, tof.a3 a3Var, SavingsTransactionLeg savingsTransactionLeg) {
        o3 o3Var = a3Var.J;
        if (o3Var == null) {
            return false;
        }
        dj0.d dVar = o3Var.f272965a;
        dj0.d dVar2 = a3Var.N1;
        return k71.k.y1(a3Var, SavingsDirection.WITHDRAW, savingsTransactionLeg) && Intrinsics.f(dVar.f115083b, dVar2.f115083b) && Math.abs(dVar.f115082a) != Math.abs(dVar2.f115082a);
    }
}
