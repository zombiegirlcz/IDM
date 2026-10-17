package com.revolut.feature.payees.impl.ui.flow;

import a0.d;
import aii.q;
import com.revolut.feature.payees.api.models.PayeesInputData;
import com.revolut.feature.payees.impl.ui.flow.PayeesFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lm9.c;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/flow/PayeesFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayeesFlow extends ViewController<q> implements f {
    public final PayeesInputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public PayeesFlow(PayeesInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: lm9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayeesFlow f196907b;

            {
                this.f196907b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PayeesFlow payeesFlow = this.f196907b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, payeesFlow, (c) payeesFlow.O.getValue());
                    case 1:
                        PayeesFlow payeesFlow2 = this.f196907b;
                        phm.a aVar = (phm.a) e.j(payeesFlow2.m2()).a().get(hm9.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", hm9.b.class, " is not found"));
                        }
                        hm9.b bVar = ((hm9.b) aVar2.b()).f153550j;
                        PayeesInputData payeesInputData = payeesFlow2.K;
                        payeesInputData.getClass();
                        return new hm9.e(bVar, payeesInputData);
                    default:
                        return (c) ((hm9.e) this.f196907b.N.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: lm9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayeesFlow f196907b;

            {
                this.f196907b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PayeesFlow payeesFlow = this.f196907b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, payeesFlow, (c) payeesFlow.O.getValue());
                    case 1:
                        PayeesFlow payeesFlow2 = this.f196907b;
                        phm.a aVar = (phm.a) e.j(payeesFlow2.m2()).a().get(hm9.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", hm9.b.class, " is not found"));
                        }
                        hm9.b bVar = ((hm9.b) aVar2.b()).f153550j;
                        PayeesInputData payeesInputData = payeesFlow2.K;
                        payeesInputData.getClass();
                        return new hm9.e(bVar, payeesInputData);
                    default:
                        return (c) ((hm9.e) this.f196907b.N.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: lm9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayeesFlow f196907b;

            {
                this.f196907b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PayeesFlow payeesFlow = this.f196907b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, payeesFlow, (c) payeesFlow.O.getValue());
                    case 1:
                        PayeesFlow payeesFlow2 = this.f196907b;
                        phm.a aVar = (phm.a) e.j(payeesFlow2.m2()).a().get(hm9.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", hm9.b.class, " is not found"));
                        }
                        hm9.b bVar = ((hm9.b) aVar2.b()).f153550j;
                        PayeesInputData payeesInputData = payeesFlow2.K;
                        payeesInputData.getClass();
                        return new hm9.e(bVar, payeesInputData);
                    default:
                        return (c) ((hm9.e) this.f196907b.N.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (hm9.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (hm9.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
