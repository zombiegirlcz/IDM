package ga9;

import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ SubmitCitizenshipFlowOutput v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v f142099w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(SubmitCitizenshipFlowOutput submitCitizenshipFlowOutput, com.revolut.feature.onboarding.impl.onboarding.v vVar, Continuation continuation) {
        super(1, continuation);
        this.v = submitCitizenshipFlowOutput;
        this.f142099w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.v, this.f142099w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (com.revolut.feature.onboarding.impl.onboarding.v.Y2(r3, null, r7, 3) != r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (com.revolut.feature.onboarding.impl.onboarding.v.Y2(r3, null, r7, 3) == r0) goto L24;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            r2 = 0
            com.revolut.feature.onboarding.impl.onboarding.v r3 = r7.f142099w
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L23
            if (r1 == r6) goto L1f
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L13
            goto L1b
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            yhm.o.b(r8)
            goto L77
        L1f:
            yhm.o.b(r8)
            goto L3d
        L23:
            yhm.o.b(r8)
            com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput$Decline r8 = com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput.Decline.f97506a
            com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput r1 = r7.v
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r1, r8)
            if (r8 == 0) goto L46
            fwj.p r8 = r3.A
            r7.u = r6
            o0j.c$e r1 = o0j.c.e.f221220a
            java.lang.Object r8 = r8.h(r1, r7)
            if (r8 != r0) goto L3d
            goto L52
        L3d:
            r7.u = r5
            java.lang.Object r8 = com.revolut.feature.onboarding.impl.onboarding.v.Y2(r3, r2, r7, r4)
            if (r8 != r0) goto L77
            goto L52
        L46:
            boolean r8 = r1 instanceof com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput.SelectedCitizenship
            if (r8 == 0) goto L53
            r7.u = r4
            java.lang.Object r8 = com.revolut.feature.onboarding.impl.onboarding.v.Y2(r3, r2, r7, r4)
            if (r8 != r0) goto L77
        L52:
            return r0
        L53:
            com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput$Close r8 = com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput.Close.f97505a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r1, r8)
            if (r8 == 0) goto L5f
            r3.B2()
            goto L77
        L5f:
            com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput$Back r8 = com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput.Back.f97504a
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r1, r8)
            if (r8 == 0) goto L7a
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Back is not supported"
            r8.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r2, r2, r8, r0)
        L77:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L7a:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ga9.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
