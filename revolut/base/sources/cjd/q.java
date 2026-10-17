package cjd;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends gim.i implements Function2 {
    public boolean u;
    public Ref$BooleanRef v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Ref$BooleanRef f24657w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f24658x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shops.impl.ui.details.a f24659y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.shops.impl.ui.details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f24659y = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.f24659y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r11 == r2) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            com.revolut.feature.shops.impl.ui.details.a r1 = r10.f24659y
            eub.i r0 = r1.f87171t
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r10.f24658x
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L2e
            if (r3 == r5) goto L24
            if (r3 != r4) goto L1c
            boolean r0 = r10.u
            kotlin.jvm.internal.Ref$BooleanRef r2 = r10.f24657w
            kotlin.jvm.internal.Ref$BooleanRef r3 = r10.v
            yhm.o.b(r11)
            r5 = r0
            r4 = r3
            goto L80
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            boolean r3 = r10.u
            kotlin.jvm.internal.Ref$BooleanRef r6 = r10.f24657w
            kotlin.jvm.internal.Ref$BooleanRef r7 = r10.v
            yhm.o.b(r11)
            goto L56
        L2e:
            yhm.o.b(r11)
            h4g.g r11 = r1.f87173x
            boolean r3 = r11.e()
            kotlin.jvm.internal.Ref$BooleanRef r7 = new kotlin.jvm.internal.Ref$BooleanRef
            r7.<init>()
            kotlin.jvm.internal.Ref$BooleanRef r6 = new kotlin.jvm.internal.Ref$BooleanRef
            r6.<init>()
            if (r3 == 0) goto L68
            efm.d0 r11 = eub.i.b(r0)
            r10.v = r7
            r10.f24657w = r6
            r10.u = r3
            r10.f24658x = r5
            java.lang.Object r11 = nim.a.b(r11, r10)
            if (r11 != r2) goto L56
            goto L7c
        L56:
            m1c.r0 r11 = (m1c.r0) r11
            m1c.x0 r8 = r11.f201447a
            m1c.x0 r9 = m1c.x0.OPTED_IN
            if (r8 != r9) goto L5f
            goto L60
        L5f:
            r5 = 0
        L60:
            r6.f186407a = r5
            boolean r11 = qk.d.l(r11)
            r7.f186407a = r11
        L68:
            nyb.o r0 = (nyb.o) r0
            efm.d0 r11 = r0.d()
            r10.v = r7
            r10.f24657w = r6
            r10.u = r3
            r10.f24658x = r4
            java.lang.Object r11 = nim.a.b(r11, r10)
            if (r11 != r2) goto L7d
        L7c:
            return r2
        L7d:
            r5 = r3
            r2 = r6
            r4 = r7
        L80:
            r3 = r11
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            cli.y r11 = r1.D
            ael.s r0 = new ael.s
            r6 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1.H2(r11, r0)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: cjd.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
