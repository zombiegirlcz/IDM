package q12;

import com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pfk.q;
import qe0.o;
import vkm.v1;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements x02.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw1.b f241322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ax1.a f241323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile ConcurrentHashMap f241324c;
    public final hlm.c d;

    public f(yw1.b repository, ax1.a moneyRequestInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        this.f241322a = repository;
        this.f241323b = moneyRequestInteractor;
        this.f241324c = new ConcurrentHashMap();
        this.d = hlm.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection$Incoming] */
    /* JADX WARN: Type inference failed for: r8v1, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v6, types: [hlm.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection.Incoming r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof q12.e
            if (r0 == 0) goto L13
            r0 = r9
            q12.e r0 = (q12.e) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            q12.e r0 = new q12.e
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f241320x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            hlm.a r8 = r0.v
            com.revolut.domain.models.moneyrequest.MoneyRequestChannel$APM r0 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L94
        L2f:
            r9 = move-exception
            goto La8
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            int r8 = r0.f241319w
            hlm.a r2 = r0.v
            com.revolut.domain.models.moneyrequest.MoneyRequestChannel$APM r4 = r0.u
            yhm.o.b(r9)
            r6 = r2
            r2 = r8
            r8 = r6
            goto L70
        L47:
            yhm.o.b(r9)
            com.revolut.domain.models.moneyrequest.MoneyRequestChannel$APM r8 = r8.f62093a
            if (r8 != 0) goto L4f
            return r5
        L4f:
            java.util.concurrent.ConcurrentHashMap r9 = r7.f241324c
            java.lang.Object r9 = r9.get(r8)
            od0.i r9 = (od0.i) r9
            if (r9 == 0) goto L5c
            java.lang.Object r8 = r9.f224257a
            return r8
        L5c:
            hlm.c r9 = r7.d
            r0.u = r8
            r0.v = r9
            r2 = 0
            r0.f241319w = r2
            r0.z = r4
            java.lang.Object r4 = r9.lock(r5, r0)
            if (r4 != r1) goto L6e
            goto L92
        L6e:
            r4 = r8
            r8 = r9
        L70:
            ax1.a r9 = r7.f241323b     // Catch: java.lang.Throwable -> L2f
            r0.u = r4     // Catch: java.lang.Throwable -> L2f
            r0.v = r8     // Catch: java.lang.Throwable -> L2f
            r0.f241319w = r2     // Catch: java.lang.Throwable -> L2f
            r0.z = r3     // Catch: java.lang.Throwable -> L2f
            pz1.c r9 = (pz1.c) r9     // Catch: java.lang.Throwable -> L2f
            qz1.c r9 = r9.f240865a     // Catch: java.lang.Throwable -> L2f
            r9.getClass()     // Catch: java.lang.Throwable -> L2f
            qu4.s r2 = new qu4.s     // Catch: java.lang.Throwable -> L2f
            r3 = 13
            r2.<init>(r9, r4, r5, r3)     // Catch: java.lang.Throwable -> L2f
            skm.p0 r9 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L2f
            elm.f r9 = elm.f.f127540b     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = skm.e0.J(r9, r2, r0)     // Catch: java.lang.Throwable -> L2f
            if (r9 != r1) goto L93
        L92:
            return r1
        L93:
            r0 = r4
        L94:
            s02.a r9 = (s02.a) r9     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.ConcurrentHashMap r1 = r7.f241324c     // Catch: java.lang.Throwable -> L2f
            od0.h r2 = od0.i.Companion     // Catch: java.lang.Throwable -> L2f
            r2.getClass()     // Catch: java.lang.Throwable -> L2f
            od0.i r2 = od0.h.a(r9)     // Catch: java.lang.Throwable -> L2f
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L2f
            r8.unlock(r5)
            return r9
        La8:
            r8.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q12.f.a(com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection$Incoming, gim.c):java.lang.Object");
    }

    public final t38.e b(ApmQuoteDirection direction, m02.b params) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(params, "params");
        Continuation continuation = null;
        return new t38.e(c(direction, params), 24, new v1(new of6.d(this, direction, continuation, 26)), new q(direction, continuation, 13));
    }

    public final Flow c(ApmQuoteDirection direction, m02.b params) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(params, "params");
        Continuation continuation = null;
        if (direction instanceof ApmQuoteDirection.Incoming) {
            return new go.g(null, 2);
        }
        if (!(direction instanceof ApmQuoteDirection.Outgoing)) {
            throw new NoWhenBranchMatchedException();
        }
        ApmQuoteDirection.Outgoing outgoing = (ApmQuoteDirection.Outgoing) direction;
        ApmPaymentMethod apmPaymentMethod = outgoing.f62094a;
        t02.g body = apmPaymentMethod == null ? null : new t02.g(oc.c.u(params.getF72728a()), apmPaymentMethod, params.getF72729b(), null);
        if (body == null) {
            return new go.g(null, 2);
        }
        if (!outgoing.a() || !params.d()) {
            return new v1(new prl.k(this, body, continuation, 10));
        }
        iz1.q qVar = (iz1.q) this.f241322a;
        Intrinsics.checkNotNullParameter(body, "body");
        return mo3.a.g(o.c(qVar.d, body, iz1.q.f, null, 28), null, null, 3);
    }
}
