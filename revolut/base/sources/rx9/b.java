package rx9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PaymentGroup f258085w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, PaymentGroup paymentGroup, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f258085w = paymentGroup;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f258085w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            rx9.c r2 = r5.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r6)
            goto L52
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            yhm.o.b(r6)
            goto L2c
        L1e:
            yhm.o.b(r6)
            cu8.r0 r6 = r2.f258086a
            r5.u = r4
            java.lang.Object r6 = ks8.m.b(r6, r5)
            if (r6 != r0) goto L2c
            goto L51
        L2c:
            ks8.j r6 = (ks8.j) r6
            boolean r1 = r6 instanceof ks8.i
            if (r1 == 0) goto L37
            ks8.i r6 = (ks8.i) r6
            com.revolut.retail.core.navigation.FeatureCommand r6 = r6.f189312a
            goto L54
        L37:
            ks8.j$a r1 = ks8.j.a.f189313a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r1)
            if (r6 == 0) goto L58
            rq9.a r6 = r2.f258087b
            com.revolut.feature.payments.groups.api.models.PaymentGroup r1 = r5.f258085w
            zr9.a r6 = (zr9.a) r6
            ufm.b r6 = r6.d(r1)
            r5.u = r3
            java.lang.Object r6 = nim.a.b(r6, r5)
            if (r6 != r0) goto L52
        L51:
            return r0
        L52:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
        L54:
            kotlin.jvm.internal.Intrinsics.h(r6)
            return r6
        L58:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rx9.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
