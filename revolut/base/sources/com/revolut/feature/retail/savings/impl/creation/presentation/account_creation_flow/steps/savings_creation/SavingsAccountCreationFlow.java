package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation;

import aii.q;
import android.app.Activity;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_creation.SavingsAccountCreationFlow;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lmb.j;
import no.m;
import qji.b;
import rlb.d;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_creation/SavingsAccountCreationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lno/m;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsAccountCreationFlow extends ViewController<q> implements f, m {
    public final SavingsAccountCreationStepDestination K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public SavingsAccountCreationFlow(SavingsAccountCreationStepDestination inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137495b;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: lmb.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsAccountCreationFlow f196927b;

            {
                this.f196927b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (j) ((rlb.d) this.f196927b.O.getValue()).f254969g.get();
                    case 1:
                        SavingsAccountCreationFlow savingsAccountCreationFlow = this.f196927b;
                        phm.a aVar = (phm.a) ue0.e.j(savingsAccountCreationFlow.m2()).a().get(rlb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rlb.e.class, " is not found"));
                        }
                        rlb.e eVar = ((rlb.e) aVar2.b()).u;
                        SavingsAccountCreationStepDestination savingsAccountCreationStepDestination = savingsAccountCreationFlow.K;
                        savingsAccountCreationStepDestination.getClass();
                        zfe.d dVar = zfe.e.Companion;
                        Activity activityM2 = savingsAccountCreationFlow.m2();
                        dVar.getClass();
                        return new rlb.d(eVar, savingsAccountCreationStepDestination, zfe.d.a(activityM2));
                    default:
                        SavingsAccountCreationFlow savingsAccountCreationFlow2 = this.f196927b;
                        return czi.c.d(0, 6, null, savingsAccountCreationFlow2, (j) savingsAccountCreationFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: lmb.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsAccountCreationFlow f196927b;

            {
                this.f196927b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (j) ((rlb.d) this.f196927b.O.getValue()).f254969g.get();
                    case 1:
                        SavingsAccountCreationFlow savingsAccountCreationFlow = this.f196927b;
                        phm.a aVar = (phm.a) ue0.e.j(savingsAccountCreationFlow.m2()).a().get(rlb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rlb.e.class, " is not found"));
                        }
                        rlb.e eVar = ((rlb.e) aVar2.b()).u;
                        SavingsAccountCreationStepDestination savingsAccountCreationStepDestination = savingsAccountCreationFlow.K;
                        savingsAccountCreationStepDestination.getClass();
                        zfe.d dVar = zfe.e.Companion;
                        Activity activityM2 = savingsAccountCreationFlow.m2();
                        dVar.getClass();
                        return new rlb.d(eVar, savingsAccountCreationStepDestination, zfe.d.a(activityM2));
                    default:
                        SavingsAccountCreationFlow savingsAccountCreationFlow2 = this.f196927b;
                        return czi.c.d(0, 6, null, savingsAccountCreationFlow2, (j) savingsAccountCreationFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: lmb.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsAccountCreationFlow f196927b;

            {
                this.f196927b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (j) ((rlb.d) this.f196927b.O.getValue()).f254969g.get();
                    case 1:
                        SavingsAccountCreationFlow savingsAccountCreationFlow = this.f196927b;
                        phm.a aVar = (phm.a) ue0.e.j(savingsAccountCreationFlow.m2()).a().get(rlb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rlb.e.class, " is not found"));
                        }
                        rlb.e eVar = ((rlb.e) aVar2.b()).u;
                        SavingsAccountCreationStepDestination savingsAccountCreationStepDestination = savingsAccountCreationFlow.K;
                        savingsAccountCreationStepDestination.getClass();
                        zfe.d dVar = zfe.e.Companion;
                        Activity activityM2 = savingsAccountCreationFlow.m2();
                        dVar.getClass();
                        return new rlb.d(eVar, savingsAccountCreationStepDestination, zfe.d.a(activityM2));
                    default:
                        SavingsAccountCreationFlow savingsAccountCreationFlow2 = this.f196927b;
                        return czi.c.d(0, 6, null, savingsAccountCreationFlow2, (j) savingsAccountCreationFlow2.N.getValue());
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.P.getValue();
    }
}
