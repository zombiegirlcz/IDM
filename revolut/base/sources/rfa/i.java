package rfa;

import com.revolut.feature.post_activation.api.navigation.PostActivationFlowDescriptor;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.post_activation.impl.ui.flow.a f253746w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PostActivationFlowDescriptor.Configuration f253747x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.post_activation.impl.ui.flow.a aVar, PostActivationFlowDescriptor.Configuration configuration, Continuation continuation) {
        super(2, continuation);
        this.f253746w = aVar;
        this.f253747x = configuration;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.f253746w, this.f253747x, continuation);
        iVar.v = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r10 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r7.K2(r10, r9) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (com.revolut.feature.post_activation.impl.ui.flow.a.J2(r7, r9) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.v
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.u
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            com.revolut.feature.post_activation.impl.ui.flow.a r7 = r9.f253746w
            r8 = 0
            if (r2 == 0) goto L32
            if (r2 == r6) goto L2e
            if (r2 == r5) goto L2a
            if (r2 == r4) goto L26
            if (r2 != r3) goto L1e
            yhm.o.b(r10)
            goto L90
        L1e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L26:
            yhm.o.b(r10)
            goto L82
        L2a:
            yhm.o.b(r10)
            goto L6d
        L2e:
            yhm.o.b(r10)
            goto L58
        L32:
            yhm.o.b(r10)
            rfa.e r10 = new rfa.e
            r2 = 3
            r10.<init>(r7, r8, r2)
            skm.h0 r10 = skm.e0.g(r0, r8, r8, r10, r4)
            r7.f80947x = r10
            com.revolut.feature.post_activation.api.navigation.PostActivationFlowDescriptor$Configuration r0 = r9.f253747x
            boolean r2 = r0 instanceof com.revolut.feature.post_activation.api.navigation.PostActivationFlowDescriptor.Configuration.Onboarding
            if (r2 == 0) goto L85
            com.revolut.feature.post_activation.api.navigation.PostActivationFlowDescriptor$Configuration$Onboarding r0 = (com.revolut.feature.post_activation.api.navigation.PostActivationFlowDescriptor.Configuration.Onboarding) r0
            boolean r0 = r0.f80937b
            if (r0 != 0) goto L85
            r9.v = r8
            r9.u = r6
            java.lang.Object r10 = r10.y(r9)
            if (r10 != r1) goto L58
            goto L8f
        L58:
            hfa.c r10 = (hfa.c) r10
            if (r10 != 0) goto L6f
            rfa.f r10 = new rfa.f
            r0 = 2
            r10.<init>(r7, r8, r0)
            r9.v = r8
            r9.u = r5
            java.lang.Object r10 = r7.p2(r9, r10)
            if (r10 != r1) goto L6d
            goto L8f
        L6d:
            hfa.c r10 = (hfa.c) r10
        L6f:
            boolean r0 = r10 instanceof hfa.a
            if (r0 == 0) goto L85
            hfa.a r10 = (hfa.a) r10
            aii.u r10 = r10.f151782a
            r9.v = r8
            r9.u = r4
            java.lang.Object r10 = r7.K2(r10, r9)
            if (r10 != r1) goto L82
            goto L8f
        L82:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L85:
            r9.v = r8
            r9.u = r3
            java.lang.Object r10 = com.revolut.feature.post_activation.impl.ui.flow.a.J2(r7, r9)
            if (r10 != r1) goto L90
        L8f:
            return r1
        L90:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rfa.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
