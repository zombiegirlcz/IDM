package r65;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r7 == r0) goto L18;
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
            r2 = 0
            r3 = 1
            r65.i r4 = r6.v
            r5 = 2
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r5) goto L13
            yhm.o.b(r7)
            goto L60
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            yhm.o.b(r7)
            goto L31
        L1f:
            yhm.o.b(r7)
            r6.u = r3
            r65.g r7 = new r65.g
            r1 = 1
            r7.<init>(r4, r2, r1)
            java.lang.Object r7 = r4.p2(r6, r7)
            if (r7 != r0) goto L31
            goto L5f
        L31:
            r6.u = r5
            n65.a r7 = r4.f251643q
            jki.i r1 = r4.t2()
            r65.c r1 = (r65.c) r1
            int r1 = r1.f251635b
            r7.getClass()
            nii.y0 r7 = n65.a.a(r1)
            kotlinx.coroutines.flow.Flow r7 = r4.X1(r7)
            qkg.a r1 = new qkg.a
            r3 = 4
            r1.<init>(r5, r3, r2)
            knd.g0 r2 = new knd.g0
            r3 = 1
            r2.<init>(r7, r1, r3)
            java.lang.Object r7 = vkm.q.n(r2, r6)
            if (r7 != r0) goto L5b
            goto L5d
        L5b:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L5d:
            if (r7 != r0) goto L60
        L5f:
            return r0
        L60:
            r65.d$a r7 = r65.d.a.f251636a
            r4.v2(r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r65.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
