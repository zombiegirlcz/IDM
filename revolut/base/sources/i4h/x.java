package i4h;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ p0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p0 p0Var, Continuation continuation) {
        super(2, continuation);
        this.v = p0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r1 != null) goto L20;
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
            r2 = 1
            i4h.p0 r3 = r5.v
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            yhm.o.b(r6)
            goto L43
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            yhm.o.b(r6)
            e3h.d r6 = r3.f158468l
            eel.c r1 = r6.f
            if (r1 == 0) goto L2d
            java.util.List r6 = r6.f122286b
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto L29
            goto L2a
        L29:
            r1 = 0
        L2a:
            if (r1 == 0) goto L2d
            goto L46
        L2d:
            b4h.e r6 = r3.f158469m
            tnb.k r6 = r6.a()
            ghk.a0 r1 = new ghk.a0
            r4 = 26
            r1.<init>(r6, r3, r4)
            r5.u = r2
            java.lang.Object r6 = vkm.q.x(r1, r5)
            if (r6 != r0) goto L43
            return r0
        L43:
            r1 = r6
            eel.c r1 = (eel.c) r1
        L46:
            vki.a r6 = r3.f158478y
            i4h.p r0 = new i4h.p
            r2 = 1
            r0.<init>(r1, r2)
            r3.X2(r6, r0)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i4h.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
