package c5a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends gim.i implements Function2 {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f f21485w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar, Continuation continuation) {
        super(2, continuation);
        this.f21485w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b0(this.f21485w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r6 == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.v
            r2 = 2
            r3 = 1
            com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f r4 = r5.f21485w
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            int r0 = r5.u
            yhm.o.b(r6)
            goto L5f
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            yhm.o.b(r6)
            goto L38
        L20:
            yhm.o.b(r6)
            pn3.a r6 = r4.f80174r
            pn3.b r6 = (pn3.b) r6
            boolean r6 = r6.a()
            if (r6 == 0) goto L41
            t3a.f r6 = r4.G
            r5.v = r3
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L38
            goto L5d
        L38:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L41
            goto L42
        L41:
            r3 = 0
        L42:
            cl3.a r6 = r4.f80179y
            wl3.h r6 = (wl3.h) r6
            efm.r r6 = r6.m()
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r1 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            r5.u = r3
            r5.v = r2
            java.lang.Object r6 = nim.a.b(r6, r5)
            if (r6 != r0) goto L5e
        L5d:
            return r0
        L5e:
            r0 = r3
        L5f:
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            if (r0 == 0) goto L71
            if (r6 <= 0) goto L71
            com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination$NotifyFriends r0 = new com.revolut.feature.payments.who_to_transfer.api.transfer.TransferDestination$NotifyFriends
            r0.<init>(r6)
            r4.C1(r0)
        L71:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c5a.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
