package com.revolut.feature.tax_residency.impl.flows.submit;

import android.view.View;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.tax_residency.impl.flows.submit.SubmitTaxResidencyFlow;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import cyc.c;
import dki.s;
import e58.d;
import ekd.i0;
import eoe.b;
import eoe.f;
import ine.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/submit/SubmitTaxResidencyFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/tax_residency/impl/flows/submit/SubmitTaxResidencyFlowContract$Step;", "Lcom/revolut/feature/tax_residency/impl/flows/submit/SubmitTaxResidencyFlowContract$InputData;", "Leoe/f;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubmitTaxResidencyFlow extends BaseFlow<SubmitTaxResidencyFlowContract$Step, SubmitTaxResidencyFlowContract$InputData, f> {
    public static final /* synthetic */ int T = 0;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitTaxResidencyFlow(SubmitTaxResidencyFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(new d(this, inputData, 27));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: eoe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubmitTaxResidencyFlow f127901b;

            {
                this.f127901b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((j) this.f127901b.P.getValue()).f162864g.get();
                    default:
                        return (j60.a) ((j) this.f127901b.P.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: eoe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SubmitTaxResidencyFlow f127901b;

            {
                this.f127901b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((j) this.f127901b.P.getValue()).f162864g.get();
                    default:
                        return (j60.a) ((j) this.f127901b.P.getValue()).f.get();
                }
            }
        });
        this.S = w.y0(new i0(3));
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public final void H2() {
        super.H2();
        vkm.d dVarB = e.b(((j60.a) this.R.getValue()).E());
        ?? r102 = this.Q;
        com.revolut.kompot.navigable.a.g2(this, dVarB, null, new c(2, (b) r102.getValue(), b.class, "onDialogDismiss", "onDialogDismiss(Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$DismissReason;)V", 4, 18), 3);
        ?? r110 = this.S;
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, e.b(((TwinHorizontalButtonDelegate) r110.getValue()).f53572c.f121375b), null, new c(i2, (b) r102.getValue(), b.class, "onDialogPrimaryButtonClick", "onDialogPrimaryButtonClick(Lcom/revolut/core/ui_kit/delegates/TwinHorizontalButtonDelegate$Model;)V", i, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((TwinHorizontalButtonDelegate) r110.getValue()).d.f121375b), null, new c(i2, (b) r102.getValue(), b.class, "onDialogSecondaryButtonClick", "onDialogSecondaryButtonClick(Lcom/revolut/core/ui_kit/delegates/TwinHorizontalButtonDelegate$Model;)V", i, 20), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (j) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (j) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (b) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void a3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackgroundColor(0);
        ((j60.a) this.R.getValue()).d(v.k(new PlainTextDelegate(), (TwinHorizontalButtonDelegate) this.S.getValue()));
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        SubmitTaxResidencyFlowContract$Step step = (SubmitTaxResidencyFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }
}
