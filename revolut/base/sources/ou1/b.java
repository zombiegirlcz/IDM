package ou1;

import aii.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.apm.blik.impl.ui.flow.BlikFlowContract$Step;
import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.a;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.models.blik.EntryChecksResult;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$OutputData;
import hu1.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ku1.i;
import ku1.j;
import ku1.k;
import ku1.m;
import oli.f;
import pth.g;
import til.n;
import til.o;
import til.r;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.blik.impl.ui.flow.a f229767b;

    public /* synthetic */ b(com.revolut.feature.apm.blik.impl.ui.flow.a aVar, int i) {
        this.f229766a = i;
        this.f229767b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f229766a) {
            case 0:
                com.revolut.feature.apm.blik.impl.ui.terms_acceptance.a outputData = (com.revolut.feature.apm.blik.impl.ui.terms_acceptance.a) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean zF = Intrinsics.f(outputData, a.C0455a.f61690a);
                com.revolut.feature.apm.blik.impl.ui.flow.a aVar = this.f229767b;
                if (zF) {
                    aVar.I2();
                } else {
                    if (!Intrinsics.f(outputData, a.b.f61691a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.l2(new d(aVar, null), new yi5.b(26));
                }
                return Unit.f186387a;
            case 1:
                d12.d outputData2 = (d12.d) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                EntryChecksResult entryChecksResult = ((gu1.a) outputData2).f146656a;
                boolean z = entryChecksResult instanceof EntryChecksResult.Passed;
                com.revolut.feature.apm.blik.impl.ui.flow.a aVar2 = this.f229767b;
                Continuation continuation = null;
                if (z) {
                    aVar2.l2(new c(aVar2, null), new yi5.b(26));
                } else if (entryChecksResult instanceof EntryChecksResult.AcceptanceFlowRequired) {
                    aVar2.E2(new BlikFlowContract$Step.TermsAcceptanceStep(((EntryChecksResult.AcceptanceFlowRequired) entryChecksResult).f61932a), false, TransitionAnimation.NONE.f98393a, false);
                } else if (entryChecksResult instanceof EntryChecksResult.RemediationRequired) {
                    String str = ((EntryChecksResult.RemediationRequired) entryChecksResult).f61935a;
                    aVar2.C1(((g) aVar2.u).d(new WorkflowConfiguration.Workflow(str, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126), false, new b(aVar2, 8)));
                } else {
                    if (!(entryChecksResult instanceof EntryChecksResult.PhoneAlreadyInUse)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l.b1(aVar2, aVar2.X1(((j12.d) aVar2.D).f(ApmBlik.f61809c.e())), null, new f(aVar2, continuation, 22), 3);
                }
                return Unit.f186387a;
            case 2:
                Intrinsics.checkNotNullParameter((PendingPaymentContract$OutputData) obj2, "it");
                this.f229767b.I2();
                return Unit.f186387a;
            case 3:
                m it8 = (m) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                boolean z3 = it8 instanceof i;
                com.revolut.feature.apm.blik.impl.ui.flow.a aVar3 = this.f229767b;
                if (z3) {
                    aVar3.P2(((i) it8).f189612a);
                } else if (it8 instanceof j) {
                    aVar3.P2(((j) it8).f189615a);
                } else if (it8 instanceof k) {
                    String str2 = ((k) it8).f189616a;
                    if (str2 != null) {
                        aVar3.P2(str2);
                    } else {
                        aVar3.f61681t.D(Unit.f186387a);
                        aVar3.I2();
                    }
                } else {
                    if (!(it8 instanceof ku1.l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.I2();
                }
                return Unit.f186387a;
            case 4:
                Intrinsics.checkNotNullParameter((q) obj2, "it");
                this.f229767b.I2();
                return Unit.f186387a;
            case 5:
                Intrinsics.checkNotNullParameter((c12.j) obj2, "it");
                this.f229767b.I2();
                return Unit.f186387a;
            case 6:
                Intrinsics.checkNotNullParameter((q) obj2, "it");
                this.f229767b.I2();
                return Unit.f186387a;
            case 7:
                Intrinsics.checkNotNullParameter((p) obj2, "it");
                this.f229767b.I2();
                return Unit.f186387a;
            default:
                r result = (r) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean zF2 = Intrinsics.f(result, til.q.f271586a);
                com.revolut.feature.apm.blik.impl.ui.flow.a aVar4 = this.f229767b;
                if (zF2 || Intrinsics.f(result, n.f271581a)) {
                    aVar4.E2(BlikFlowContract$Step.RemediationPendingPrompt.f61679a, false, TransitionAnimation.NONE.f98393a, false);
                } else {
                    if (!(result instanceof o) && !(result instanceof til.p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar4.C1(u0.b(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP))));
                }
                return Unit.f186387a;
        }
    }
}
