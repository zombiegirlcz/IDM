package k50;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class t3 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j4 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(j4 j4Var, Continuation continuation) {
        super(2, continuation);
        this.v = j4Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t3(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t3) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r0.W2(r9, r8) == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r1.h(r9, r8) == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r1.h(r0, r8) == r2) goto L30;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            k50.j4 r0 = r8.v
            p50.e r1 = r0.L
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.u
            r4 = 4
            r5 = 3
            r6 = 1
            r7 = 2
            if (r3 == 0) goto L27
            if (r3 == r6) goto L23
            if (r3 == r7) goto L1f
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L17
            goto L1f
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            yhm.o.b(r9)
            goto L82
        L23:
            yhm.o.b(r9)
            goto L35
        L27:
            yhm.o.b(r9)
            r8.u = r6
            k50.p2 r9 = k50.j4.Companion
            java.lang.Object r9 = r0.c3(r8)
            if (r9 != r2) goto L35
            goto L81
        L35:
            com.revolut.chat.domain.model.ChatMode r9 = (com.revolut.chat.domain.model.ChatMode) r9
            boolean r3 = r9 instanceof com.revolut.chat.domain.model.ChatMode.Default
            r6 = 0
            if (r3 == 0) goto L4c
            k50.e3 r9 = new k50.e3
            r9.<init>(r4, r0, r6)
            r8.u = r7
            k50.p2 r1 = k50.j4.Companion
            java.lang.Object r9 = r0.W2(r9, r8)
            if (r9 != r2) goto L82
            goto L81
        L4c:
            boolean r3 = r9 instanceof com.revolut.chat.domain.model.ChatMode.SingleFeed
            if (r3 == 0) goto L6c
            p50.c r9 = new p50.c
            cli.y r0 = r0.f181140w0
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            k50.h0 r0 = (k50.h0) r0
            v30.c0 r0 = r0.f181083h
            r9.<init>(r0, r7)
            r8.u = r5
            java.lang.Object r9 = r1.h(r9, r8)
            if (r9 != r2) goto L82
            goto L81
        L6c:
            boolean r0 = r9 instanceof com.revolut.chat.domain.model.ChatMode.Feed
            if (r0 == 0) goto L85
            p50.b r0 = new p50.b
            com.revolut.chat.domain.model.ChatMode$Feed r9 = (com.revolut.chat.domain.model.ChatMode.Feed) r9
            java.util.UUID r9 = r9.f51044a
            r0.<init>(r9, r6)
            r8.u = r4
            java.lang.Object r9 = r1.h(r0, r8)
            if (r9 != r2) goto L82
        L81:
            return r2
        L82:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L85:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.t3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
