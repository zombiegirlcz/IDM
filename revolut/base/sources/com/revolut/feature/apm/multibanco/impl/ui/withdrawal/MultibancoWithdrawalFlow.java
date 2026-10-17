package com.revolut.feature.apm.multibanco.impl.ui.withdrawal;

import com.revolut.feature.apm.multibanco.api.navigation.MultibancoWithdrawalInputData;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.MultibancoWithdrawalFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import i72.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import t82.c;
import te0.w;
import v62.j;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/ui/withdrawal/MultibancoWithdrawalFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lv62/j;", "Lyki/f;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultibancoWithdrawalFlow extends ViewController<j> implements f {
    public final MultibancoWithdrawalInputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public MultibancoWithdrawalFlow(MultibancoWithdrawalInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: t82.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoWithdrawalFlow f268802b;

            {
                this.f268802b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MultibancoWithdrawalFlow multibancoWithdrawalFlow = this.f268802b;
                        phm.a aVar = (phm.a) ue0.e.j(multibancoWithdrawalFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).A;
                        MultibancoWithdrawalInputData multibancoWithdrawalInputData = multibancoWithdrawalFlow.K;
                        multibancoWithdrawalInputData.getClass();
                        return new i72.w(mVar, multibancoWithdrawalInputData);
                    case 1:
                        return (c) ((i72.w) this.f268802b.L.getValue()).f159176h.get();
                    default:
                        MultibancoWithdrawalFlow multibancoWithdrawalFlow2 = this.f268802b;
                        return czi.c.d(0, 6, null, multibancoWithdrawalFlow2, (c) multibancoWithdrawalFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: t82.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoWithdrawalFlow f268802b;

            {
                this.f268802b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        MultibancoWithdrawalFlow multibancoWithdrawalFlow = this.f268802b;
                        phm.a aVar = (phm.a) ue0.e.j(multibancoWithdrawalFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).A;
                        MultibancoWithdrawalInputData multibancoWithdrawalInputData = multibancoWithdrawalFlow.K;
                        multibancoWithdrawalInputData.getClass();
                        return new i72.w(mVar, multibancoWithdrawalInputData);
                    case 1:
                        return (c) ((i72.w) this.f268802b.L.getValue()).f159176h.get();
                    default:
                        MultibancoWithdrawalFlow multibancoWithdrawalFlow2 = this.f268802b;
                        return czi.c.d(0, 6, null, multibancoWithdrawalFlow2, (c) multibancoWithdrawalFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: t82.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MultibancoWithdrawalFlow f268802b;

            {
                this.f268802b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        MultibancoWithdrawalFlow multibancoWithdrawalFlow = this.f268802b;
                        phm.a aVar = (phm.a) ue0.e.j(multibancoWithdrawalFlow.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).A;
                        MultibancoWithdrawalInputData multibancoWithdrawalInputData = multibancoWithdrawalFlow.K;
                        multibancoWithdrawalInputData.getClass();
                        return new i72.w(mVar, multibancoWithdrawalInputData);
                    case 1:
                        return (c) ((i72.w) this.f268802b.L.getValue()).f159176h.get();
                    default:
                        MultibancoWithdrawalFlow multibancoWithdrawalFlow2 = this.f268802b;
                        return czi.c.d(0, 6, null, multibancoWithdrawalFlow2, (c) multibancoWithdrawalFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i72.w) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (i72.w) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
