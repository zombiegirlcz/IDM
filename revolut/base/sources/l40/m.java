package l40;

import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends gim.i implements Function2 {
    public UUID u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f192002w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f192003x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, r rVar, Continuation continuation) {
        super(2, continuation);
        this.f192002w = qVar;
        this.f192003x = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.f192002w, this.f192003x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
    
        if (l40.q.l3(r6, r8, r9, r10, r12) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b6, code lost:
    
        if (l40.q.k3(r6, r13, r8, r9, r10, r12) == r0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.v
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            l40.r r10 = r12.f192003x
            l40.q r6 = r12.f192002w
            r7 = 0
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L24
            if (r1 == r3) goto L17
            if (r1 != r2) goto L1c
        L17:
            yhm.o.b(r13)
            goto Lb9
        L1c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L24:
            java.util.UUID r1 = r12.u
            yhm.o.b(r13)
        L29:
            r8 = r1
            goto L70
        L2b:
            yhm.o.b(r13)
            goto L3c
        L2f:
            yhm.o.b(r13)
            r12.v = r5
            java.lang.Object r13 = l40.q.h3(r6, r12)
            if (r13 != r0) goto L3c
            goto Lb8
        L3c:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L47
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        L47:
            com.revolut.chat.domain.model.ChatMode r13 = r10.f192021a
            boolean r1 = r13 instanceof com.revolut.chat.domain.model.ChatMode.Feed
            if (r1 == 0) goto L53
            com.revolut.chat.domain.model.ChatMode$Feed r13 = (com.revolut.chat.domain.model.ChatMode.Feed) r13
            java.util.UUID r13 = r13.f51044a
            r1 = r13
            goto L63
        L53:
            boolean r1 = r13 instanceof com.revolut.chat.domain.model.ChatMode.Default
            if (r1 != 0) goto L62
            boolean r13 = r13 instanceof com.revolut.chat.domain.model.ChatMode.SingleFeed
            if (r13 == 0) goto L5c
            goto L62
        L5c:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L62:
            r1 = r7
        L63:
            java.util.UUID r13 = r10.f192023c
            r12.u = r1
            r12.v = r4
            java.lang.Object r13 = l40.q.i3(r6, r1, r13, r12)
            if (r13 != r0) goto L29
            goto Lb8
        L70:
            v30.j r13 = (v30.j) r13
            if (r13 == 0) goto L83
            boolean r1 = v30.r.b(r13)
            if (r1 == 0) goto L7c
            r1 = r13
            goto L7d
        L7c:
            r1 = r7
        L7d:
            if (r1 == 0) goto L83
            java.util.UUID r1 = r1.f285785a
            r9 = r1
            goto L84
        L83:
            r9 = r7
        L84:
            v30.c0 r1 = r10.f192022b
            int[] r11 = l40.l.f192001a
            int r1 = r1.ordinal()
            r1 = r11[r1]
            if (r1 == r5) goto La9
            if (r1 == r4) goto L9b
            r7 = r9
            java.lang.String r9 = r10.d
            r11 = r10
            r10 = 0
            r6.o3(r7, r8, r9, r10, r11)
            goto Lb9
        L9b:
            r1 = r7
            r7 = r9
            r11 = r10
            r12.u = r1
            r12.v = r2
            java.lang.Object r13 = l40.q.l3(r6, r8, r7, r11, r12)
            if (r13 != r0) goto Lb9
            goto Lb8
        La9:
            r1 = r7
            r7 = r9
            r11 = r10
            r12.u = r1
            r12.v = r3
            r11 = r12
            r7 = r13
            java.lang.Object r13 = l40.q.k3(r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto Lb9
        Lb8:
            return r0
        Lb9:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l40.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
