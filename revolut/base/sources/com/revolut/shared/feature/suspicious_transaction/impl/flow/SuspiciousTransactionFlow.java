package com.revolut.shared.feature.suspicious_transaction.impl.flow;

import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.suspicious_transaction.impl.R$id;
import com.revolut.shared.feature.suspicious_transaction.impl.R$layout;
import com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlow;
import in0.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nal.c;
import nal.d;
import nal.e;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$InputData;", "Lnal/e;", "Lin0/g;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SuspiciousTransactionFlow extends BaseFlow<SuspiciousTransactionFlowContract$Step, SuspiciousTransactionFlowContract$InputData, e> implements g {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(SuspiciousTransactionFlow.class, "binding", "getBinding()Lcom/revolut/shared/feature/suspicious_transaction/impl/databinding/FlowSuspiciousTransactionBinding;", 0))};
    public final int P;
    public final int Q;
    public final boolean R;
    public final h S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspiciousTransactionFlow(SuspiciousTransactionFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = R$layout.flow_suspicious_transaction;
        this.Q = R$id.suspicious_transaction_container;
        this.R = true;
        this.S = s.t(this, nal.b.f);
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: nal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SuspiciousTransactionFlow f213926b;

            {
                this.f213926b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SuspiciousTransactionFlow suspiciousTransactionFlow = this.f213926b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SuspiciousTransactionFlow.X;
                        TwinVerticalButton suspiciousTransactionTwinVerticalButton = suspiciousTransactionFlow.h3().d;
                        Intrinsics.checkNotNullExpressionValue(suspiciousTransactionTwinVerticalButton, "suspiciousTransactionTwinVerticalButton");
                        return suspiciousTransactionTwinVerticalButton;
                    case 1:
                        KProperty[] kPropertyArr2 = SuspiciousTransactionFlow.X;
                        NavBarWithToolbar suspiciousTransactionNavBarWithToolbar = suspiciousTransactionFlow.h3().f172528c;
                        Intrinsics.checkNotNullExpressionValue(suspiciousTransactionNavBarWithToolbar, "suspiciousTransactionNavBarWithToolbar");
                        return suspiciousTransactionNavBarWithToolbar;
                    default:
                        KProperty[] kPropertyArr3 = SuspiciousTransactionFlow.X;
                        return ((oal.a) suspiciousTransactionFlow.V.getValue()).q();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: nal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SuspiciousTransactionFlow f213926b;

            {
                this.f213926b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SuspiciousTransactionFlow suspiciousTransactionFlow = this.f213926b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SuspiciousTransactionFlow.X;
                        TwinVerticalButton suspiciousTransactionTwinVerticalButton = suspiciousTransactionFlow.h3().d;
                        Intrinsics.checkNotNullExpressionValue(suspiciousTransactionTwinVerticalButton, "suspiciousTransactionTwinVerticalButton");
                        return suspiciousTransactionTwinVerticalButton;
                    case 1:
                        KProperty[] kPropertyArr2 = SuspiciousTransactionFlow.X;
                        NavBarWithToolbar suspiciousTransactionNavBarWithToolbar = suspiciousTransactionFlow.h3().f172528c;
                        Intrinsics.checkNotNullExpressionValue(suspiciousTransactionNavBarWithToolbar, "suspiciousTransactionNavBarWithToolbar");
                        return suspiciousTransactionNavBarWithToolbar;
                    default:
                        KProperty[] kPropertyArr3 = SuspiciousTransactionFlow.X;
                        return ((oal.a) suspiciousTransactionFlow.V.getValue()).q();
                }
            }
        });
        this.V = w.y0(new mzb.e(this, inputData, 19));
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: nal.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SuspiciousTransactionFlow f213926b;

            {
                this.f213926b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SuspiciousTransactionFlow suspiciousTransactionFlow = this.f213926b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SuspiciousTransactionFlow.X;
                        TwinVerticalButton suspiciousTransactionTwinVerticalButton = suspiciousTransactionFlow.h3().d;
                        Intrinsics.checkNotNullExpressionValue(suspiciousTransactionTwinVerticalButton, "suspiciousTransactionTwinVerticalButton");
                        return suspiciousTransactionTwinVerticalButton;
                    case 1:
                        KProperty[] kPropertyArr2 = SuspiciousTransactionFlow.X;
                        NavBarWithToolbar suspiciousTransactionNavBarWithToolbar = suspiciousTransactionFlow.h3().f172528c;
                        Intrinsics.checkNotNullExpressionValue(suspiciousTransactionNavBarWithToolbar, "suspiciousTransactionNavBarWithToolbar");
                        return suspiciousTransactionNavBarWithToolbar;
                    default:
                        KProperty[] kPropertyArr3 = SuspiciousTransactionFlow.X;
                        return ((oal.a) suspiciousTransactionFlow.V.getValue()).q();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public final void H2() {
        super.H2();
        ?? r06 = this.T;
        TwinVerticalButton twinVerticalButton = (TwinVerticalButton) r06.getValue();
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinVerticalButton.o0()), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinVerticalButton.p0()), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinVerticalButton.m0()), null, new c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((NavBarWithToolbar) this.U.getValue()).f59410q), null, new c(this, continuation, 3), 3);
        TwinVerticalButton twinVerticalButton2 = (TwinVerticalButton) r06.getValue();
        twinVerticalButton2.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        twinVerticalButton2.setFabEnabled(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (oal.a) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (oal.a) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    /* JADX INFO: renamed from: R2, reason: from getter */
    public final int getQ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final dki.s S2() {
        return (d) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        SuspiciousTransactionFlowContract$Step step = (SuspiciousTransactionFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.P;
    }

    public final jal.a h3() {
        ViewBinding value = this.S.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jal.a) value;
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.R);
    }
}
