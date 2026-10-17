package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow;

import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.feature.retail.savings.impl.R$id;
import com.revolut.feature.retail.savings.impl.R$layout;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlow;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Input;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rlb.g;
import te0.w;
import vc.s;
import xlb.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzib/a;", "Lwki/a;", "Lxlb/i;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsOnboardingFlow extends ViewController<zib.a> implements wki.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(SavingsOnboardingFlow.class, "binding", "getBinding()Lcom/revolut/feature/retail/savings/impl/databinding/FlowSavingsOnboardingBinding;", 0))};
    public final SavingsOnboardingFlowContract$Input K;
    public final int L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public SavingsOnboardingFlow(SavingsOnboardingFlowContract$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.flow_savings_onboarding;
        this.M = R$style.UiKitTheme_TransparentCompat;
        this.N = s.t(this, xlb.b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: xlb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsOnboardingFlow f306978b;

            {
                this.f306978b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsOnboardingFlow savingsOnboardingFlow = this.f306978b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsOnboardingFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(savingsOnboardingFlow.m2()).a().get(rlb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rlb.e.class, " is not found"));
                        }
                        rlb.e eVar = ((rlb.e) aVar2.b()).u;
                        SavingsOnboardingFlowContract$Input savingsOnboardingFlowContract$Input = savingsOnboardingFlow.K;
                        savingsOnboardingFlowContract$Input.getClass();
                        return new rlb.g(eVar, savingsOnboardingFlowContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsOnboardingFlow.R;
                        return (c) ((rlb.g) savingsOnboardingFlow.O.getValue()).f254992g.get();
                    default:
                        KProperty[] kPropertyArr3 = SavingsOnboardingFlow.R;
                        return md6.s.a(savingsOnboardingFlow, (c) savingsOnboardingFlow.P.getValue(), R$id.container, 4);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: xlb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsOnboardingFlow f306978b;

            {
                this.f306978b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsOnboardingFlow savingsOnboardingFlow = this.f306978b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsOnboardingFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(savingsOnboardingFlow.m2()).a().get(rlb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rlb.e.class, " is not found"));
                        }
                        rlb.e eVar = ((rlb.e) aVar2.b()).u;
                        SavingsOnboardingFlowContract$Input savingsOnboardingFlowContract$Input = savingsOnboardingFlow.K;
                        savingsOnboardingFlowContract$Input.getClass();
                        return new rlb.g(eVar, savingsOnboardingFlowContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsOnboardingFlow.R;
                        return (c) ((rlb.g) savingsOnboardingFlow.O.getValue()).f254992g.get();
                    default:
                        KProperty[] kPropertyArr3 = SavingsOnboardingFlow.R;
                        return md6.s.a(savingsOnboardingFlow, (c) savingsOnboardingFlow.P.getValue(), R$id.container, 4);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: xlb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsOnboardingFlow f306978b;

            {
                this.f306978b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SavingsOnboardingFlow savingsOnboardingFlow = this.f306978b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsOnboardingFlow.R;
                        phm.a aVar = (phm.a) ue0.e.j(savingsOnboardingFlow.m2()).a().get(rlb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rlb.e.class, " is not found"));
                        }
                        rlb.e eVar = ((rlb.e) aVar2.b()).u;
                        SavingsOnboardingFlowContract$Input savingsOnboardingFlowContract$Input = savingsOnboardingFlow.K;
                        savingsOnboardingFlowContract$Input.getClass();
                        return new rlb.g(eVar, savingsOnboardingFlowContract$Input);
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsOnboardingFlow.R;
                        return (c) ((rlb.g) savingsOnboardingFlow.O.getValue()).f254992g.get();
                    default:
                        KProperty[] kPropertyArr3 = SavingsOnboardingFlow.R;
                        return md6.s.a(savingsOnboardingFlow, (c) savingsOnboardingFlow.P.getValue(), R$id.container, 4);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getK() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        xlb.h hVar = qVar instanceof xlb.h ? (xlb.h) qVar : null;
        if ((hVar == null || hVar.f306984a) && uiState.f306985a) {
            ViewBinding value = this.N.getValue(this, R[0]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((xmb.a) value).f307097b.setBackgroundType(AnimatedBackgroundType.SAVINGS.f51489a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (xlb.c) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (wki.c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (wki.c) this.Q.getValue();
    }
}
