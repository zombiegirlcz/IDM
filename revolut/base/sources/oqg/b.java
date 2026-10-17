package oqg;

import ccb.m0;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.AddMoneyFlowContract$FlowInput;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.with_result_navigation.AddMoneyFlowWithResultNavigationContract$Step;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreen;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen.AddMoneyScreenContract$InputData;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import dki.s;
import kotlin.jvm.internal.Intrinsics;
import ok7.c;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends g implements s {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AddMoneyFlowContract$FlowInput f227905t;
    public final m0 u;
    public final AddMoneyFlowWithResultNavigationContract$Step v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final EmptyFlowState f227906w;

    public b(AddMoneyFlowContract$FlowInput flowInput, m0 resultNavigationCommandProvider) {
        Intrinsics.checkNotNullParameter(flowInput, "flowInput");
        Intrinsics.checkNotNullParameter(resultNavigationCommandProvider, "resultNavigationCommandProvider");
        this.f227905t = flowInput;
        this.u = resultNavigationCommandProvider;
        this.v = AddMoneyFlowWithResultNavigationContract$Step.f94769a;
        this.f227906w = EmptyFlowState.f98428a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O2(oqg.b r4, jpg.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof oqg.a
            if (r0 == 0) goto L13
            r0 = r6
            oqg.a r0 = (oqg.a) r0
            int r1 = r0.f227904w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227904w = r1
            goto L18
        L13:
            oqg.a r0 = new oqg.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227904w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            ccb.m0 r6 = r4.u
            if (r5 == 0) goto L54
            ccb.h0 r2 = new ccb.h0
            java.lang.String r5 = r5.f177272a
            r2.<init>(r5)
            r0.f227904w = r3
            java.lang.Object r6 = r6.c(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            if (r6 == 0) goto L51
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r6)
            r4.C1(r5)
        L51:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L54:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oqg.b.O2(oqg.b, jpg.a, gim.c):java.lang.Object");
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        AddMoneyFlowWithResultNavigationContract$Step step = (AddMoneyFlowWithResultNavigationContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        AddMoneyFlowContract$FlowInput addMoneyFlowContract$FlowInput = this.f227905t;
        AddMoneyScreen addMoneyScreen = new AddMoneyScreen(new AddMoneyScreenContract$InputData(addMoneyFlowContract$FlowInput.f94761a, addMoneyFlowContract$FlowInput.f94762b, addMoneyFlowContract$FlowInput.d, addMoneyFlowContract$FlowInput.e, addMoneyFlowContract$FlowInput.f, addMoneyFlowContract$FlowInput.f94763c, addMoneyFlowContract$FlowInput.f94764g, addMoneyFlowContract$FlowInput.f94765h, false));
        c cVar = new c(this, 29);
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        addMoneyScreen.H = cVar;
        return addMoneyScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f227906w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
