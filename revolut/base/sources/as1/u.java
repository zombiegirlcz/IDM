package as1;

import com.revolut.core.model.account.AccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class u extends gim.i implements Function1 {
    public AccountId u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f8781w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a0 a0Var, Continuation continuation) {
        super(1, continuation);
        this.f8781w = a0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new u(this.f8781w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((u) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r11 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r11 == null) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r10.v
            r2 = 2
            as1.a0 r3 = r10.f8781w
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r2) goto L14
            com.revolut.core.model.account.AccountId r0 = r10.u
            yhm.o.b(r11)
            goto L7c
        L14:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1c:
            com.revolut.core.model.account.AccountId r1 = r10.u
            yhm.o.b(r11)
            goto L4e
        L22:
            yhm.o.b(r11)
            as1.h r11 = r3.o
            com.revolut.core.model.account.AccountId r1 = r11.d
            if (r1 != 0) goto L2d
            com.revolut.core.model.account.AccountId$Personal r1 = com.revolut.core.model.account.AccountId.Personal.f51414a
        L2d:
            java.lang.String r11 = r11.e
            if (r11 == 0) goto L52
            wsg.n r5 = r3.f8756r
            efm.d0 r11 = r5.z(r1, r11)
            arf.h r5 = new arf.h
            r6 = 4
            r5.<init>(r6)
            zhm.h0 r6 = zhm.h0.f322473a
            pfm.z r11 = ue0.e.I(r11, r6, r5)
            r10.u = r1
            r10.v = r4
            java.lang.Object r11 = nim.a.b(r11, r10)
            if (r11 != r0) goto L4e
            goto L7a
        L4e:
            io3.d r11 = (io3.d) r11
            if (r11 != 0) goto L7f
        L52:
            wsg.n r4 = r3.f8756r
            xi0.a r11 = xi0.b.Companion
            r11.getClass()
            xi0.b r5 = xi0.b.z
            r8 = 0
            r9 = 62
            r6 = 0
            r7 = 0
            efm.d0 r11 = osg.b.r(r4, r5, r6, r7, r8, r9)
            arf.h r4 = new arf.h
            r5 = 5
            r4.<init>(r5)
            zhm.h0 r5 = zhm.h0.f322473a
            pfm.z r11 = ue0.e.I(r11, r5, r4)
            r10.u = r1
            r10.v = r2
            java.lang.Object r11 = nim.a.b(r11, r10)
            if (r11 != r0) goto L7b
        L7a:
            return r0
        L7b:
            r0 = r1
        L7c:
            io3.d r11 = (io3.d) r11
            r1 = r0
        L7f:
            kotlin.jvm.internal.Intrinsics.h(r11)
            tr1.f r0 = r3.v
            r0.getClass()
            java.lang.String r2 = "pocket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            java.lang.String r2 = "accountId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            vo9.a r0 = r0.f273633a
            r2 = 4
            kotlinx.coroutines.flow.Flow r0 = vo9.a.a(r0, r11, r1, r2)
            t38.e r4 = new t38.e
            r2 = 6
            r4.<init>(r0, r2, r1, r11)
            as1.r r7 = new as1.r
            r11 = 0
            r0 = 2
            r7.<init>(r3, r11, r0)
            r8 = 3
            r5 = 0
            r6 = 0
            yji.l.a1(r3, r4, r5, r6, r7, r8)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: as1.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
