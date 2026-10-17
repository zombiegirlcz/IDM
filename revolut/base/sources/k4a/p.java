package k4a;

import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WhoToTransferActionItem f180880w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, WhoToTransferActionItem whoToTransferActionItem, Continuation continuation) {
        super(1, continuation);
        this.v = uVar;
        this.f180880w = whoToTransferActionItem;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.v, this.f180880w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (k4a.u.K2(r6, r3, r7) == r0) goto L23;
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
            qn3.b$a r2 = qn3.b.a.f247869a
            com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem r3 = r7.f180880w
            r4 = 2
            r5 = 1
            k4a.u r6 = r7.v
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            yhm.o.b(r8)
            goto L6f
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            yhm.o.b(r8)
            goto L3a
        L22:
            yhm.o.b(r8)
            r7.u = r5
            java.util.Set r8 = k4a.u.D
            boolean r8 = r8.contains(r3)
            if (r8 == 0) goto L36
            yn3.d r8 = r6.f180890x
            java.lang.Object r8 = r8.a(r7)
            goto L37
        L36:
            r8 = r2
        L37:
            if (r8 != r0) goto L3a
            goto L6e
        L3a:
            qn3.b r8 = (qn3.b) r8
            boolean r1 = r8 instanceof qn3.a
            if (r1 == 0) goto L60
            qn3.a r8 = (qn3.a) r8
            k4a.n r0 = k4a.u.Companion
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.feature.cooldown_checker.api.CoolDownCheckerDestination r1 = new com.revolut.feature.cooldown_checker.api.CoolDownCheckerDestination
            com.revolut.feature.cooldown_checker.api.UserActivity r2 = com.revolut.feature.cooldown_checker.api.UserActivity.AddBeneficiary
            long r3 = r8.f247868a
            r1.<init>(r2, r3)
            yhi.b r8 = yhi.b.POPUP
            r2 = 0
            r3 = 12
            r4 = 0
            com.revolut.retail.core.navigation.FeatureCommand r8 = vhi.c.c(r1, r8, r4, r2, r3)
            r0.<init>(r8)
            r6.C1(r0)
            goto L6f
        L60:
            boolean r8 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            if (r8 == 0) goto L72
            r7.u = r4
            java.lang.Object r8 = k4a.u.K2(r6, r3, r7)
            if (r8 != r0) goto L6f
        L6e:
            return r0
        L6f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L72:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k4a.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
