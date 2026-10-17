package com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents;

import aii.q;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsContract$InputData;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsContract$Step;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsRootFlow;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/forbearance/application/impl/ui/forbearance/documents/CreditForbearanceAgreementsRootFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_credit_forbearance_application_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditForbearanceAgreementsRootFlow extends ViewController<q> implements f {
    public final CreditForbearanceAgreementsContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public CreditForbearanceAgreementsRootFlow(CreditForbearanceAgreementsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: yz4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditForbearanceAgreementsRootFlow f318036b;

            {
                this.f318036b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditForbearanceAgreementsRootFlow creditForbearanceAgreementsRootFlow = this.f318036b;
                        phm.a aVar = (phm.a) ue0.e.j(creditForbearanceAgreementsRootFlow.m2()).a().get(qz4.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qz4.a.class, " is not found"));
                        }
                        qz4.a aVar3 = ((qz4.a) aVar2.b()).k;
                        CreditForbearanceAgreementsContract$InputData creditForbearanceAgreementsContract$InputData = creditForbearanceAgreementsRootFlow.K;
                        creditForbearanceAgreementsContract$InputData.getClass();
                        return new qz4.b(aVar3, creditForbearanceAgreementsContract$InputData);
                    case 1:
                        return (a) ((qz4.b) this.f318036b.M.getValue()).e.get();
                    default:
                        CreditForbearanceAgreementsRootFlow creditForbearanceAgreementsRootFlow2 = this.f318036b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditForbearanceAgreementsRootFlow2, (a) creditForbearanceAgreementsRootFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: yz4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditForbearanceAgreementsRootFlow f318036b;

            {
                this.f318036b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditForbearanceAgreementsRootFlow creditForbearanceAgreementsRootFlow = this.f318036b;
                        phm.a aVar = (phm.a) ue0.e.j(creditForbearanceAgreementsRootFlow.m2()).a().get(qz4.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qz4.a.class, " is not found"));
                        }
                        qz4.a aVar3 = ((qz4.a) aVar2.b()).k;
                        CreditForbearanceAgreementsContract$InputData creditForbearanceAgreementsContract$InputData = creditForbearanceAgreementsRootFlow.K;
                        creditForbearanceAgreementsContract$InputData.getClass();
                        return new qz4.b(aVar3, creditForbearanceAgreementsContract$InputData);
                    case 1:
                        return (a) ((qz4.b) this.f318036b.M.getValue()).e.get();
                    default:
                        CreditForbearanceAgreementsRootFlow creditForbearanceAgreementsRootFlow2 = this.f318036b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditForbearanceAgreementsRootFlow2, (a) creditForbearanceAgreementsRootFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: yz4.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditForbearanceAgreementsRootFlow f318036b;

            {
                this.f318036b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CreditForbearanceAgreementsRootFlow creditForbearanceAgreementsRootFlow = this.f318036b;
                        phm.a aVar = (phm.a) ue0.e.j(creditForbearanceAgreementsRootFlow.m2()).a().get(qz4.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qz4.a.class, " is not found"));
                        }
                        qz4.a aVar3 = ((qz4.a) aVar2.b()).k;
                        CreditForbearanceAgreementsContract$InputData creditForbearanceAgreementsContract$InputData = creditForbearanceAgreementsRootFlow.K;
                        creditForbearanceAgreementsContract$InputData.getClass();
                        return new qz4.b(aVar3, creditForbearanceAgreementsContract$InputData);
                    case 1:
                        return (a) ((qz4.b) this.f318036b.M.getValue()).e.get();
                    default:
                        CreditForbearanceAgreementsRootFlow creditForbearanceAgreementsRootFlow2 = this.f318036b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, creditForbearanceAgreementsRootFlow2, (a) creditForbearanceAgreementsRootFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean J2() {
        h.w2(((c) ((yz4.a) this.N.getValue())).v, CreditForbearanceAgreementsContract$Step.QuitApplicationDialog.f69936a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (qz4.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (qz4.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (yz4.a) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
