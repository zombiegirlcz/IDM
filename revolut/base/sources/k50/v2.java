package k50;

import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class v2 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j4 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UUID f181261w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(j4 j4Var, UUID uuid, Continuation continuation) {
        super(2, continuation);
        this.v = j4Var;
        this.f181261w = uuid;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v2(this.v, this.f181261w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v2) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r2.l(r10, r9) == r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r2.l(r0, r9) == r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (r2.l(r10, r9) == r3) goto L30;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            k50.j4 r0 = r9.v
            cli.y r1 = r0.f181140w0
            p50.e r2 = r0.L
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r9.u
            r5 = 4
            r6 = 3
            r7 = 1
            r8 = 2
            if (r4 == 0) goto L29
            if (r4 == r7) goto L25
            if (r4 == r8) goto L21
            if (r4 == r6) goto L21
            if (r4 != r5) goto L19
            goto L21
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            yhm.o.b(r10)
            goto L8a
        L25:
            yhm.o.b(r10)
            goto L3f
        L29:
            yhm.o.b(r10)
            k50.l2 r10 = new k50.l2
            r4 = 17
            r10.<init>(r4)
            r0.H2(r1, r10)
            r9.u = r7
            java.lang.Object r10 = r0.c3(r9)
            if (r10 != r3) goto L3f
            goto L89
        L3f:
            com.revolut.chat.domain.model.ChatMode r10 = (com.revolut.chat.domain.model.ChatMode) r10
            boolean r0 = r10 instanceof com.revolut.chat.domain.model.ChatMode.Default
            r4 = 0
            if (r0 == 0) goto L56
            p50.a r10 = new p50.a
            java.util.UUID r0 = r9.f181261w
            r10.<init>(r0, r4)
            r9.u = r8
            java.lang.Object r10 = r2.l(r10, r9)
            if (r10 != r3) goto L8a
            goto L89
        L56:
            boolean r0 = r10 instanceof com.revolut.chat.domain.model.ChatMode.Feed
            if (r0 == 0) goto L6c
            p50.b r0 = new p50.b
            com.revolut.chat.domain.model.ChatMode$Feed r10 = (com.revolut.chat.domain.model.ChatMode.Feed) r10
            java.util.UUID r10 = r10.f51044a
            r0.<init>(r10, r4)
            r9.u = r6
            java.lang.Object r10 = r2.l(r0, r9)
            if (r10 != r3) goto L8a
            goto L89
        L6c:
            boolean r10 = r10 instanceof com.revolut.chat.domain.model.ChatMode.SingleFeed
            if (r10 == 0) goto L8d
            p50.c r10 = new p50.c
            java.lang.Object r0 = r1.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            k50.h0 r0 = (k50.h0) r0
            v30.c0 r0 = r0.f181083h
            r10.<init>(r0, r8)
            r9.u = r5
            java.lang.Object r10 = r2.l(r10, r9)
            if (r10 != r3) goto L8a
        L89:
            return r3
        L8a:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L8d:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.v2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
