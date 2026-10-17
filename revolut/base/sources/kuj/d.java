package kuj;

import com.revolut.retail.feature.api.rewards_hub.widget.RewardsHubWidgetContext;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ String A;
    public FlowCollector u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f189834w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f189835x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f189836y;
    public final /* synthetic */ RewardsHubWidgetContext z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, RewardsHubWidgetContext rewardsHubWidgetContext, String str2, Continuation continuation) {
        super(2, continuation);
        this.f189835x = eVar;
        this.f189836y = str;
        this.z = rewardsHubWidgetContext;
        this.A = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.f189835x, this.f189836y, this.z, this.A, continuation);
        dVar.f189834w = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (vkm.q.u(r0, r8, r7) == r1) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f189834w
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.v
            kuj.e r3 = r7.f189835x
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L25
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            yhm.o.b(r8)
            goto L5a
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            kotlinx.coroutines.flow.FlowCollector r0 = r7.u
            yhm.o.b(r8)
            goto L37
        L25:
            yhm.o.b(r8)
            r7.f189834w = r6
            r7.u = r0
            r7.v = r5
            java.lang.String r8 = r7.f189836y
            java.lang.Object r8 = r3.c(r8, r7)
            if (r8 != r1) goto L37
            goto L59
        L37:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L48
            com.revolut.retail.feature.api.rewards_hub.widget.RewardsHubWidgetContext r8 = r7.z
            java.lang.String r2 = r7.A
            vkm.y r8 = r3.i(r8, r2)
            goto L4d
        L48:
            r8 = 3
            vkm.v1 r8 = org.bouncycastle.jcajce.provider.digest.a.s(r8, r6)
        L4d:
            r7.f189834w = r6
            r7.u = r6
            r7.v = r4
            java.lang.Object r8 = vkm.q.u(r0, r8, r7)
            if (r8 != r1) goto L5a
        L59:
            return r1
        L5a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kuj.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
