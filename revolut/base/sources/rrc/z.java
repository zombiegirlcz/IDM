package rrc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes6.dex */
public final class z extends gim.i implements Function3 {
    public String A;
    public int B;
    public int u;
    public /* synthetic */ FlowCollector v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f256808w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f0 f256809x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlowCollector f256810y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Continuation continuation, f0 f0Var) {
        super(3, continuation);
        this.f256809x = f0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        z zVar = new z((Continuation) obj4, this.f256809x);
        zVar.v = (FlowCollector) obj2;
        zVar.f256808w = obj3;
        return zVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c2, code lost:
    
        if (r2 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            r18 = this;
            r0 = r18
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.u
            r3 = 3
            r4 = 2
            rrc.f0 r5 = r0.f256809x
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L2f
            if (r2 == r4) goto L21
            if (r2 != r3) goto L19
            yhm.o.b(r19)
            goto Lc5
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L21:
            java.lang.String r2 = r0.A
            java.lang.String r4 = r0.z
            kotlinx.coroutines.flow.FlowCollector r6 = r0.f256810y
            yhm.o.b(r19)
            r9 = r6
            r6 = r2
            r2 = r19
            goto L7f
        L2f:
            int r2 = r0.B
            java.lang.String r6 = r0.z
            kotlinx.coroutines.flow.FlowCollector r8 = r0.f256810y
            yhm.o.b(r19)
            r9 = r8
            r8 = r6
            r6 = r19
            goto L5f
        L3d:
            yhm.o.b(r19)
            kotlinx.coroutines.flow.FlowCollector r2 = r0.v
            java.lang.Object r8 = r0.f256808w
            java.lang.String r8 = (java.lang.String) r8
            r0.v = r7
            r0.f256808w = r7
            r0.f256810y = r2
            r0.z = r8
            r9 = 0
            r0.B = r9
            r0.u = r6
            java.lang.Object r6 = rrc.f0.J2(r5, r0)
            if (r6 != r1) goto L5a
            goto Lc4
        L5a:
            r17 = r9
            r9 = r2
            r2 = r17
        L5f:
            java.lang.String r6 = (java.lang.String) r6
            wsg.n r10 = r5.f256770t
            com.revolut.core.model.account.AccountId$Personal r11 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r10 = r10.E(r11)
            r0.v = r7
            r0.f256808w = r7
            r0.f256810y = r9
            r0.z = r8
            r0.A = r6
            r0.B = r2
            r0.u = r4
            java.lang.Object r2 = nim.a.b(r10, r0)
            if (r2 != r1) goto L7e
            goto Lc4
        L7e:
            r4 = r8
        L7f:
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            kbb.c r10 = r5.u
            kotlin.jvm.internal.Intrinsics.h(r12)
            xi0.a r2 = xi0.b.Companion
            r2.getClass()
            xi0.b r13 = xi0.a.a(r4)
            io3.l r14 = io3.l.CURRENT
            io3.i r15 = io3.i.INTERNAL
            r16 = 0
            w4l.h r11 = w4l.h.f294642c
            efm.r r2 = r10.G(r11, r12, r13, r14, r15, r16)
            vkm.d r2 = rd0.e.b(r2)
            r0.v = r7
            r0.f256808w = r7
            r0.f256810y = r7
            r0.z = r7
            r0.A = r7
            r0.u = r3
            vkm.q.w(r9)
            pc7.c r3 = new pc7.c
            r3.<init>(r9, r6, r4)
            java.lang.Object r2 = r2.collect(r3, r0)
            if (r2 != r1) goto Lbb
            goto Lbd
        Lbb:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        Lbd:
            if (r2 != r1) goto Lc0
            goto Lc2
        Lc0:
            kotlin.Unit r2 = kotlin.Unit.f186387a
        Lc2:
            if (r2 != r1) goto Lc5
        Lc4:
            return r1
        Lc5:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rrc.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
