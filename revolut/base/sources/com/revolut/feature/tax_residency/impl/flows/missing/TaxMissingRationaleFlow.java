package com.revolut.feature.tax_residency.impl.flows.missing;

import android.content.Intent;
import android.view.View;
import bi2.n;
import boe.g;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature.tax_residency.impl.flows.missing.TaxMissingRationaleFlow;
import com.revolut.kompot.navigable.flow.BaseFlow;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.s;
import ine.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import rd0.e;
import te0.w;
import vkm.d;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/flows/missing/TaxMissingRationaleFlow;", "Lcom/revolut/kompot/navigable/flow/BaseFlow;", "Lcom/revolut/feature/tax_residency/impl/flows/missing/TaxMissingRationaleFlowContract$Step;", "Lcom/revolut/feature/tax_residency/impl/flows/missing/TaxMissingRationaleFlowContract$InputData;", "Lboe/g;", "Lno/m;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxMissingRationaleFlow extends BaseFlow<TaxMissingRationaleFlowContract$Step, TaxMissingRationaleFlowContract$InputData, g> implements m {
    public static final /* synthetic */ int V = 0;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final boolean S;
    public final Object T;
    public final Object U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxMissingRationaleFlow(TaxMissingRationaleFlowContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = w.y0(boe.b.f17394a);
        this.Q = w.y0(new bc1.a(this, inputData, 18));
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: boe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxMissingRationaleFlow f17393b;

            {
                this.f17393b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (d) ((ine.l) this.f17393b.Q.getValue()).i.get();
                    default:
                        return (j60.a) ((ine.l) this.f17393b.Q.getValue()).f162871h.get();
                }
            }
        });
        this.S = true;
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: boe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxMissingRationaleFlow f17393b;

            {
                this.f17393b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (d) ((ine.l) this.f17393b.Q.getValue()).i.get();
                    default:
                        return (j60.a) ((ine.l) this.f17393b.Q.getValue()).f162871h.get();
                }
            }
        });
        this.U = w.y0(new bkd.a(15));
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow, com.revolut.kompot.navigable.a
    public final void H2() {
        super.H2();
        ?? r110 = this.U;
        d dVarB = e.b(((TwinHorizontalButtonDelegate) r110.getValue()).f53572c.f121375b);
        ?? r112 = this.R;
        com.revolut.kompot.navigable.a.g2(this, dVarB, null, new aee.g(2, (boe.d) r112.getValue(), boe.d.class, "onDialogPrimaryButtonClick", "onDialogPrimaryButtonClick(Lcom/revolut/core/ui_kit/delegates/TwinHorizontalButtonDelegate$Model;)V", 4, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((TwinHorizontalButtonDelegate) r110.getValue()).d.f121375b), null, new aee.g(2, (boe.d) r112.getValue(), boe.d.class, "onDialogSecondaryButtonClick", "onDialogSecondaryButtonClick(Lcom/revolut/core/ui_kit/delegates/TwinHorizontalButtonDelegate$Model;)V", 4, 14), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return (AnalyticsProduct) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final qji.a Q2() {
        return (l) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // qji.c
    public final qji.b R1() {
        return (l) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final s S2() {
        return (boe.d) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void X2(int i, int i2, Intent intent) {
        if (i2 == -1) {
            b bVar = (b) ((boe.d) this.R.getValue());
            bVar.getClass();
            if (i == 10002) {
                bVar.l2(new n(bVar, null, 14), new yi5.b(26));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void a3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.T.getValue()).d(v.k(new PlainTextDelegate(), (TwinHorizontalButtonDelegate) this.U.getValue()));
    }

    @Override // com.revolut.kompot.navigable.flow.BaseFlow
    public final void f3(FlowStep flowStep) {
        TaxMissingRationaleFlowContract$Step step = (TaxMissingRationaleFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.S);
    }
}
