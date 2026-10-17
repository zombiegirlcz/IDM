package com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer;

import a0.d;
import com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer.JapanEasyBankTransferFlow;
import com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer.JapanEasyBankTransferFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import ue0.e;
import we6.o0;
import xf6.t;
import xf6.y;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/japan/easy_bank_transfer/JapanEasyBankTransferFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwe6/o0;", "Lyki/f;", "Lin0/g;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JapanEasyBankTransferFlow extends ViewController<o0> implements f, g {
    public final JapanEasyBankTransferFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public JapanEasyBankTransferFlow(JapanEasyBankTransferFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: xm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JapanEasyBankTransferFlow f307095b;

            {
                this.f307095b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        JapanEasyBankTransferFlow japanEasyBankTransferFlow = this.f307095b;
                        phm.a aVar = (phm.a) e.j(japanEasyBankTransferFlow.m2()).a().get(je6.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", je6.g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        JapanEasyBankTransferFlowContract$InputData japanEasyBankTransferFlowContract$InputData = japanEasyBankTransferFlow.K;
                        japanEasyBankTransferFlowContract$InputData.getClass();
                        return new y(tVar, japanEasyBankTransferFlowContract$InputData);
                    case 1:
                        return (b) ((y) this.f307095b.M.getValue()).d.get();
                    default:
                        JapanEasyBankTransferFlow japanEasyBankTransferFlow2 = this.f307095b;
                        return c.d(R$id.screen_transparent_container, 4, null, japanEasyBankTransferFlow2, (b) japanEasyBankTransferFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: xm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JapanEasyBankTransferFlow f307095b;

            {
                this.f307095b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        JapanEasyBankTransferFlow japanEasyBankTransferFlow = this.f307095b;
                        phm.a aVar = (phm.a) e.j(japanEasyBankTransferFlow.m2()).a().get(je6.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", je6.g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        JapanEasyBankTransferFlowContract$InputData japanEasyBankTransferFlowContract$InputData = japanEasyBankTransferFlow.K;
                        japanEasyBankTransferFlowContract$InputData.getClass();
                        return new y(tVar, japanEasyBankTransferFlowContract$InputData);
                    case 1:
                        return (b) ((y) this.f307095b.M.getValue()).d.get();
                    default:
                        JapanEasyBankTransferFlow japanEasyBankTransferFlow2 = this.f307095b;
                        return c.d(R$id.screen_transparent_container, 4, null, japanEasyBankTransferFlow2, (b) japanEasyBankTransferFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: xm6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JapanEasyBankTransferFlow f307095b;

            {
                this.f307095b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        JapanEasyBankTransferFlow japanEasyBankTransferFlow = this.f307095b;
                        phm.a aVar = (phm.a) e.j(japanEasyBankTransferFlow.m2()).a().get(je6.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", je6.g.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).B;
                        JapanEasyBankTransferFlowContract$InputData japanEasyBankTransferFlowContract$InputData = japanEasyBankTransferFlow.K;
                        japanEasyBankTransferFlowContract$InputData.getClass();
                        return new y(tVar, japanEasyBankTransferFlowContract$InputData);
                    case 1:
                        return (b) ((y) this.f307095b.M.getValue()).d.get();
                    default:
                        JapanEasyBankTransferFlow japanEasyBankTransferFlow2 = this.f307095b;
                        return c.d(R$id.screen_transparent_container, 4, null, japanEasyBankTransferFlow2, (b) japanEasyBankTransferFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (y) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (y) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (xm6.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
