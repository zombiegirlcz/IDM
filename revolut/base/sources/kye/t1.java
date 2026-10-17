package kye;

import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class t1 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k3 f190838w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.f190838w = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t1 t1Var = new t1(this.f190838w, continuation);
        t1Var.v = obj2;
        return t1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t1) create((CardDetailsScreenDescriptor$OutputData$CardData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (kye.k3.L2(r0, r3, r9) == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (kye.k3.L2(r0, r3, r9) == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        return r4;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kye.k3 r0 = r9.f190838w
            boolean r1 = r0.f190762b0
            cli.y r2 = r0.f190763d0
            java.lang.Object r3 = r9.v
            com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData r3 = (com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData) r3
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r9.u
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L23
            if (r5 == r7) goto L1f
            if (r5 != r6) goto L17
            goto L1f
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            yhm.o.b(r10)
            goto L8d
        L23:
            yhm.o.b(r10)
            java.lang.Object r10 = r2.f22677a
            vkm.j2 r10 = (vkm.j2) r10
            java.lang.Object r10 = r10.getValue()
            kye.m r10 = (kye.m) r10
            com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod r10 = r10.f190786s
            boolean r5 = r10 instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod.Card
            r8 = 0
            if (r5 == 0) goto L54
            r5 = r10
            com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod$StoredMethod$Card r5 = (com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod.Card) r5
            boolean r5 = r5.f90906g
            if (r5 == 0) goto L54
            kye.s1 r5 = new kye.s1
            r6 = 0
            r5.<init>()
            r0.H2(r2, r5)
            if (r1 == 0) goto L8d
            r9.v = r8
            r9.u = r7
            java.lang.Object r10 = kye.k3.L2(r0, r3, r9)
            if (r10 != r4) goto L8d
            goto L6c
        L54:
            boolean r5 = r10 instanceof vye.b
            if (r5 == 0) goto L6d
            kye.s1 r5 = new kye.s1
            r5.<init>()
            r0.H2(r2, r5)
            if (r1 == 0) goto L8d
            r9.v = r8
            r9.u = r6
            java.lang.Object r10 = kye.k3.L2(r0, r3, r9)
            if (r10 != r4) goto L8d
        L6c:
            return r4
        L6d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            if (r10 == 0) goto L7a
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getSimpleName()
            goto L7b
        L7a:
            r10 = r8
        L7b:
            java.lang.String r1 = "Attempt to set new card details while method was other than new card kind="
            java.lang.String r10 = j6.a.q(r1, r10)
            r0.<init>(r10)
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r8, r8, r0, r10)
        L8d:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.t1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
