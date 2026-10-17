package com.revolut.feature.tab.credit.impl.ui.restore;

import a0.d;
import aii.q;
import com.revolut.feature.tab.credit.impl.ui.restore.CreditTabRestoreFlow;
import com.revolut.feature.tab.credit.impl.ui.restore.CreditTabRestoreFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import uie.k;
import uie.l;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/credit/impl/ui/restore/CreditTabRestoreFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_tab_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditTabRestoreFlow extends ViewController<q> implements f {
    public final CreditTabRestoreFlowContract$InputData K;
    public final Object L;
    public final Object M;

    public CreditTabRestoreFlow(CreditTabRestoreFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: zie.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditTabRestoreFlow f322519b;

            {
                this.f322519b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditTabRestoreFlow creditTabRestoreFlow = this.f322519b;
                        phm.a aVar = (phm.a) e.j(creditTabRestoreFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).f280403g;
                        CreditTabRestoreFlowContract$InputData creditTabRestoreFlowContract$InputData = creditTabRestoreFlow.K;
                        creditTabRestoreFlowContract$InputData.getClass();
                        return new k(lVar, creditTabRestoreFlowContract$InputData);
                    default:
                        CreditTabRestoreFlow creditTabRestoreFlow2 = this.f322519b;
                        return c.d(0, 6, null, creditTabRestoreFlow2, (b) ((k) creditTabRestoreFlow2.L.getValue()).f280399b.get());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: zie.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditTabRestoreFlow f322519b;

            {
                this.f322519b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditTabRestoreFlow creditTabRestoreFlow = this.f322519b;
                        phm.a aVar = (phm.a) e.j(creditTabRestoreFlow.m2()).a().get(l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", l.class, " is not found"));
                        }
                        l lVar = ((l) aVar2.b()).f280403g;
                        CreditTabRestoreFlowContract$InputData creditTabRestoreFlowContract$InputData = creditTabRestoreFlow.K;
                        creditTabRestoreFlowContract$InputData.getClass();
                        return new k(lVar, creditTabRestoreFlowContract$InputData);
                    default:
                        CreditTabRestoreFlow creditTabRestoreFlow2 = this.f322519b;
                        return c.d(0, 6, null, creditTabRestoreFlow2, (b) ((k) creditTabRestoreFlow2.L.getValue()).f280399b.get());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (k) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (zie.b) ((k) this.L.getValue()).f280399b.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
