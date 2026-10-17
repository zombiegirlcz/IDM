package e0a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ b0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f121473w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zm3.a f121474x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, String str, zm3.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = b0Var;
        this.f121473w = str;
        this.f121474x = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a0(this.v, this.f121473w, this.f121474x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (e0a.b0.Z2(r4, r8, r7.f121474x, r7) == r0) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            java.lang.String r2 = r7.f121473w
            r3 = 2
            e0a.b0 r4 = r7.v
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r3) goto L14
            yhm.o.b(r8)
            goto L78
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            yhm.o.b(r8)
            goto L48
        L20:
            yhm.o.b(r8)
            iu9.b r8 = r4.f121476l
            zu9.c r8 = (zu9.c) r8
            r8.getClass()
            java.lang.String r1 = "messageText"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            s8h.j r1 = new s8h.j
            r1.<init>(r8, r2)
            ufm.c r8 = new ufm.c
            r6 = 2
            r8.<init>(r1, r6)
            java.lang.String r1 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
            r7.u = r5
            java.lang.Object r8 = nim.a.b(r8, r7)
            if (r8 != r0) goto L48
            goto L67
        L48:
            iu9.c r8 = (iu9.c) r8
            if (r8 != 0) goto L4e
            r1 = -1
            goto L56
        L4e:
            int[] r1 = e0a.z.f121544a
            int r6 = r8.ordinal()
            r1 = r1[r6]
        L56:
            if (r1 != r5) goto L68
            com.revolut.feature.payments.messaging.data.api.model.MessageType$Text r8 = new com.revolut.feature.payments.messaging.data.api.model.MessageType$Text
            r8.<init>(r2)
            r7.u = r3
            zm3.a r1 = r7.f121474x
            java.lang.Object r8 = e0a.b0.Z2(r4, r8, r1, r7)
            if (r8 != r0) goto L78
        L67:
            return r0
        L68:
            kotlin.jvm.internal.Intrinsics.h(r8)
            j60.a r0 = r4.f121477m
            iu9.a r1 = r4.f121478n
            zu9.b r1 = (zu9.b) r1
            rp0.y r8 = r1.a(r8)
            r0.x(r8)
        L78:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0a.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
