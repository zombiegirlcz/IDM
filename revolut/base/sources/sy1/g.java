package sy1;

import com.revolut.feature.apm.core.gateway.impl.common.UnsupportedApmProduct;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f266574a;

    public g(Set set) {
        Intrinsics.checkNotNullParameter(set, "set");
        this.f266574a = set;
    }

    public final my1.b a(dx1.a aVar) {
        Object next;
        Iterator it8 = this.f266574a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((my1.b) next).d(aVar)) {
                break;
            }
        }
        my1.b bVar = (my1.b) next;
        if (bVar == null) {
            UnsupportedApmProduct unsupportedApmProduct = new UnsupportedApmProduct("ApmPendingPaymentsInteractor", aVar);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, unsupportedApmProduct, h0Var);
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.apm.core.api.product.ApmProductComplete r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof sy1.f
            if (r0 == 0) goto L13
            r0 = r6
            sy1.f r0 = (sy1.f) r0
            int r1 = r0.f266573w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266573w = r1
            goto L18
        L13:
            sy1.f r0 = new sy1.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266573w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            my1.b r5 = r4.a(r5)
            if (r5 == 0) goto L48
            r0.f266573w = r3
            java.lang.Object r6 = r5.i(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            goto L49
        L48:
            r5 = 0
        L49:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sy1.g.b(com.revolut.feature.apm.core.api.product.ApmProductComplete, gim.c):java.lang.Object");
    }
}
