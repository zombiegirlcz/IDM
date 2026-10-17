package tvf;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transport.impl.ui.activation.flow.a f274763w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f274764x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.transport.impl.ui.activation.flow.a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f274763w = aVar;
        this.f274764x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.f274763w, this.f274764x, continuation);
        gVar.v = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (com.revolut.feature.transport.impl.ui.activation.flow.a.I2(r8, r20) == r6) goto L17;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r5 = r20
            java.lang.Object r0 = r5.v
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            fim.a r6 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.u
            r7 = 2
            r2 = 1
            com.revolut.feature.transport.impl.ui.activation.flow.a r8 = r5.f274763w
            r9 = 0
            if (r1 == 0) goto L27
            if (r1 == r2) goto L21
            if (r1 != r7) goto L19
            yhm.o.b(r21)
            goto L7f
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L21:
            yhm.o.b(r21)
            r0 = r21
            goto L6b
        L27:
            yhm.o.b(r21)
            nii.c0 r1 = new nii.c0
            com.revolut.core.ui_kit.models.TextLocalisedClause r11 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.transport.api.R$string.transport_ticket_activate_loading_title
            r4 = 14
            r11.<init>(r3, r9, r9, r4)
            r18 = 0
            r19 = 2046(0x7fe, float:2.867E-42)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r10 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            ack.n r3 = new ack.n
            r4 = 19
            r3.<init>(r4)
            o9a.v r4 = new o9a.v
            r10 = 12
            r4.<init>(r8, r10)
            r10 = r4
            tvf.f r4 = new tvf.f
            java.lang.String r11 = r5.f274764x
            r4.<init>(r8, r11, r0, r9)
            r5.v = r9
            r5.u = r2
            tji.f r0 = r8.X()
            r2 = r10
            java.lang.Object r0 = n14.k.P(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto L6b
            goto L7e
        L6b:
            nii.e r0 = (nii.e) r0
            r8.s1()
            boolean r1 = r0 instanceof nii.c
            if (r1 == 0) goto L82
            r5.v = r9
            r5.u = r7
            java.lang.Object r0 = com.revolut.feature.transport.impl.ui.activation.flow.a.I2(r8, r5)
            if (r0 != r6) goto L7f
        L7e:
            return r6
        L7f:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        L82:
            boolean r0 = r0 instanceof nii.d
            if (r0 == 0) goto Laa
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FinishCommand r1 = new com.revolut.retail.core.navigation.FinishCommand
            r2 = 7
            r1.<init>(r9, r9, r9, r2)
            com.revolut.feature.transport.api.navigation.TransportFlowDestination r2 = new com.revolut.feature.transport.api.navigation.TransportFlowDestination
            com.revolut.feature.transport.api.navigation.TransportStartType$Hub$Ticket r3 = new com.revolut.feature.transport.api.navigation.TransportStartType$Hub$Ticket
            com.revolut.feature.transport.api.navigation.a r4 = com.revolut.feature.transport.api.navigation.a.TICKET_ACTIVATED
            r3.<init>(r4)
            r2.<init>(r3)
            com.revolut.retail.core.navigation.FeatureCommand r2 = zh9.u0.f(r2)
            com.revolut.retail.core.navigation.CompositeCommand r1 = com.revolut.retail.core.navigation.a.c(r1, r2)
            r0.<init>(r1)
            aii.n r0 = r8.C1(r0)
            return r0
        Laa:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tvf.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
