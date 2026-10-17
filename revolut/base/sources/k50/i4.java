package k50;

import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class i4 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j4 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UUID f181111w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(j4 j4Var, UUID uuid, Continuation continuation) {
        super(2, continuation);
        this.v = j4Var;
        this.f181111w = uuid;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i4(this.v, this.f181111w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((i4) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r1.k(r12, r11) == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r1.k(r0, r11) == r2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r1.k(r12, r11) == r2) goto L30;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            k50.j4 r0 = r11.v
            p50.e r1 = r0.L
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r11.u
            java.util.UUID r4 = r11.f181111w
            r5 = 4
            r6 = 3
            r7 = 1
            r8 = 2
            r9 = 0
            if (r3 == 0) goto L2a
            if (r3 == r7) goto L26
            if (r3 == r8) goto L22
            if (r3 == r6) goto L22
            if (r3 != r5) goto L1a
            goto L22
        L1a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L22:
            yhm.o.b(r12)
            goto L91
        L26:
            yhm.o.b(r12)
            goto L47
        L2a:
            yhm.o.b(r12)
            k50.m3 r12 = new k50.m3
            r3 = 5
            r12.<init>(r0, r4, r9, r3)
            whi.b r3 = new whi.b
            r10 = 6
            r3.<init>(r10)
            r0.n2(r12, r3)
            r11.u = r7
            k50.p2 r12 = k50.j4.Companion
            java.lang.Object r12 = r0.c3(r11)
            if (r12 != r2) goto L47
            goto L90
        L47:
            com.revolut.chat.domain.model.ChatMode r12 = (com.revolut.chat.domain.model.ChatMode) r12
            boolean r3 = r12 instanceof com.revolut.chat.domain.model.ChatMode.Default
            if (r3 == 0) goto L5b
            p50.a r12 = new p50.a
            r12.<init>(r4, r9)
            r11.u = r8
            java.lang.Object r12 = r1.k(r12, r11)
            if (r12 != r2) goto L91
            goto L90
        L5b:
            boolean r3 = r12 instanceof com.revolut.chat.domain.model.ChatMode.Feed
            if (r3 == 0) goto L71
            p50.b r0 = new p50.b
            com.revolut.chat.domain.model.ChatMode$Feed r12 = (com.revolut.chat.domain.model.ChatMode.Feed) r12
            java.util.UUID r12 = r12.f51044a
            r0.<init>(r12, r9)
            r11.u = r6
            java.lang.Object r12 = r1.k(r0, r11)
            if (r12 != r2) goto L91
            goto L90
        L71:
            boolean r12 = r12 instanceof com.revolut.chat.domain.model.ChatMode.SingleFeed
            if (r12 == 0) goto L94
            p50.c r12 = new p50.c
            cli.y r0 = r0.f181140w0
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            k50.h0 r0 = (k50.h0) r0
            v30.c0 r0 = r0.f181083h
            r12.<init>(r0, r8)
            r11.u = r5
            java.lang.Object r12 = r1.k(r12, r11)
            if (r12 != r2) goto L91
        L90:
            return r2
        L91:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        L94:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.i4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
