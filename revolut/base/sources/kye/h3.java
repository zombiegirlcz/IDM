package kye;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class h3 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190738w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.f190738w = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h3 h3Var = new h3(this.f190738w, continuation);
        h3Var.v = obj2;
        return h3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h3) create((o3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (kye.k3.L2(r0, r1, r11) == r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0091, code lost:
    
        if (kye.k3.L2(r0, r12, r11) == r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        return r4;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kye.k3 r0 = r11.f190738w
            cli.y r1 = r0.f190763d0
            boolean r2 = r0.f190762b0
            java.lang.Object r3 = r11.v
            kye.o3 r3 = (kye.o3) r3
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r11.u
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L25
            if (r5 == r7) goto L20
            if (r5 != r6) goto L18
            goto L20
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            yhm.o.b(r12)
            goto L99
        L25:
            yhm.o.b(r12)
            java.lang.String r12 = r3.f190809b
            r0.S2(r12)
            com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod r12 = r3.f190808a
            if (r2 == 0) goto L5d
            boolean r5 = r12 instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod.Card
            if (r5 == 0) goto L5d
            r5 = r12
            com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod$StoredMethod$Card r5 = (com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod.Card) r5
            java.lang.String r5 = r5.f90903a
            java.lang.Object r9 = r1.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            kye.m r9 = (kye.m) r9
            com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod r9 = r9.f190786s
            boolean r10 = r9 instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod.Card
            if (r10 == 0) goto L4d
            com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod$StoredMethod$Card r9 = (com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod.Card) r9
            goto L4e
        L4d:
            r9 = r8
        L4e:
            if (r9 == 0) goto L53
            java.lang.String r9 = r9.f90903a
            goto L54
        L53:
            r9 = r8
        L54:
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r9)
            if (r5 != 0) goto L5d
            r0.V2()
        L5d:
            kp0.q r5 = new kp0.q
            r9 = 28
            r5.<init>(r12, r3, r9)
            r0.H2(r1, r5)
            if (r2 == 0) goto L99
            boolean r1 = r12 instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod.Card
            if (r1 == 0) goto L7f
            r1 = r12
            com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod$StoredMethod$Card r1 = (com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod.Card) r1
            com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData r1 = r1.f90908j
            if (r1 == 0) goto L7f
            r11.v = r3
            r11.u = r7
            java.lang.Object r12 = kye.k3.L2(r0, r1, r11)
            if (r12 != r4) goto L99
            goto L93
        L7f:
            boolean r1 = r12 instanceof vye.b
            if (r1 == 0) goto L94
            vye.b r12 = (vye.b) r12
            com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData r12 = r12.e
            if (r12 == 0) goto L94
            r11.v = r3
            r11.u = r6
            java.lang.Object r12 = kye.k3.L2(r0, r12, r11)
            if (r12 != r4) goto L99
        L93:
            return r4
        L94:
            if (r1 == 0) goto L99
            r0.V2()
        L99:
            com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod r12 = r3.f190808a
            kye.q0 r1 = new kye.q0
            r1.<init>(r12, r0, r8)
            yi5.b r12 = new yi5.b
            r2 = 26
            r12.<init>(r2)
            r0.l2(r1, r12)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.h3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
