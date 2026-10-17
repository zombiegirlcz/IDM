package a68;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public h0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f1568w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function1 f1569x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f1570y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Function1 function1, i iVar, Continuation continuation) {
        super(2, continuation);
        this.f1569x = function1;
        this.f1570y = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.f1569x, this.f1570y, continuation);
        hVar.f1568w = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r10 == r1) goto L21;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f1568w
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r9.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            yhm.o.b(r10)
            goto L6d
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            skm.h0 r0 = r9.u
            yhm.o.b(r10)
            goto L4a
        L23:
            yhm.o.b(r10)
            a68.g r10 = new a68.g
            r2 = 2
            a68.i r6 = r9.f1570y
            r10.<init>(r6, r5, r2)
            r2 = 3
            skm.h0 r10 = skm.e0.g(r0, r5, r5, r10, r2)
            a68.g r7 = new a68.g
            r8 = 1
            r7.<init>(r6, r5, r8)
            skm.h0 r0 = skm.e0.g(r0, r5, r5, r7, r2)
            r9.f1568w = r5
            r9.u = r0
            r9.v = r4
            java.lang.Object r10 = r10.y(r9)
            if (r10 != r1) goto L4a
            goto L6c
        L4a:
            ks8.j r10 = (ks8.j) r10
            boolean r2 = r10 instanceof ks8.i
            if (r2 == 0) goto L58
            r0.f(r5)
            ks8.i r10 = (ks8.i) r10
            com.revolut.retail.core.navigation.FeatureCommand r10 = r10.f189312a
            return r10
        L58:
            ks8.j$a r2 = ks8.j.a.f189313a
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r10, r2)
            if (r10 == 0) goto L84
            r9.f1568w = r5
            r9.u = r5
            r9.v = r3
            java.lang.Object r10 = r0.i(r9)
            if (r10 != r1) goto L6d
        L6c:
            return r1
        L6d:
            java.util.List r10 = (java.util.List) r10
            kotlin.jvm.functions.Function1 r0 = r9.f1569x
            java.lang.Object r10 = r0.invoke(r10)
            com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r10 = (com.revolut.feature.junior_profile.api.models.JuniorBankingProfile) r10
            com.revolut.retail.core.navigation.FeatureCommand r0 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.junior.account_activation.api.navigation.JuniorAccountActivationFeatureConfig$Request r1 = new com.revolut.feature.junior.account_activation.api.navigation.JuniorAccountActivationFeatureConfig$Request
            r2 = 14
            r1.<init>(r10, r5, r2)
            r0.<init>(r1)
            return r0
        L84:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a68.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
