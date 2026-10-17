package uye;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xi0.b f284328w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, xi0.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f284328w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new x(this.v, this.f284328w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((x) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (com.revolut.feature.topup_screen.impl.flows.topup.flow.i.J2(r3, r4, r6) == r0) goto L19;
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
            r2 = 2
            com.revolut.feature.topup_screen.impl.flows.topup.flow.i r3 = r6.v
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r2) goto L12
            yhm.o.b(r7)
            goto L72
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            goto L42
        L1e:
            yhm.o.b(r7)
            fk3.a r7 = r3.A
            w4l.j r1 = w4l.j.f294644c
            ik3.c r7 = (ik3.c) r7
            e7l.g$b r5 = e7l.g.b.f123407a
            efm.r r7 = r7.l(r5, r1)
            utk.b r1 = new utk.b
            r5 = 27
            r1.<init>(r5)
            r5 = 0
            efm.r r7 = m70.a.g(r7, r5, r1, r4)
            r6.u = r4
            java.lang.Object r7 = nim.a.c(r7, r6)
            if (r7 != r0) goto L42
            goto L60
        L42:
            e7l.f r7 = (e7l.f) r7
            java.util.LinkedHashSet r1 = r7.O
            xi0.b r4 = r6.f284328w
            java.lang.String r5 = r4.f306286a
            boolean r1 = r1.contains(r5)
            if (r1 != 0) goto L61
            java.util.Set r7 = r7.Q
            boolean r7 = r7.contains(r4)
            if (r7 != 0) goto L61
            r6.u = r2
            java.lang.Object r7 = com.revolut.feature.topup_screen.impl.flows.topup.flow.i.J2(r3, r4, r6)
            if (r7 != r0) goto L72
        L60:
            return r0
        L61:
            uye.a r7 = r3.f90942b0
            java.lang.String r0 = r4.f306286a
            r7.getClass()
            java.lang.String r1 = "currencyCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            vkm.z1 r7 = r7.f284255a
            r7.k(r0)
        L72:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: uye.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
