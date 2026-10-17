package g0a;

import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f139389w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MessageItem f139390x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, MessageItem messageItem, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
        this.f139389w = str;
        this.f139390x = messageItem;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f139389w, this.f139390x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (g0a.g.Z2(r2, r6.f139390x, r7, r6) == r0) goto L18;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            g0a.g r2 = r6.v
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            yhm.o.b(r7)
            goto L47
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            goto L3a
        L1e:
            yhm.o.b(r7)
            tbk.e r7 = r2.f139392m
            wj0.a r1 = r2.f139394p
            java.lang.String r5 = "CHAT_PAID_PLAN_GIFT_IDEMPOTENCY_KEY"
            java.lang.String r1 = r1.b(r5)
            if (r1 != 0) goto L2f
            java.lang.String r1 = ""
        L2f:
            r6.u = r4
            java.lang.String r4 = r6.f139389w
            java.lang.Object r7 = r7.a(r4, r1, r6)
            if (r7 != r0) goto L3a
            goto L46
        L3a:
            com.revolut.feature.payments.messaging.data.api.model.c r7 = com.revolut.feature.payments.messaging.data.api.model.c.REJECTED
            r6.u = r3
            com.revolut.feature.payments.messaging.data.api.model.MessageItem r1 = r6.f139390x
            java.lang.Object r7 = g0a.g.Z2(r2, r1, r7, r6)
            if (r7 != r0) goto L47
        L46:
            return r0
        L47:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g0a.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
