package com.revolut.feature_crypto_order_details.impl.ui.pager;

import aii.q;
import ali.g;
import ayh.c;
import cli.l;
import cli.o;
import com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlow;
import com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import hyh.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_crypto_order_details/impl/ui/pager/CryptoOrderDetailsPagerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lali/g;", "Lcli/l;", "Lcom/revolut/feature_crypto_order_details/impl/ui/pager/CryptoOrderDetailsPagerFlowContract$OrderPage;", "feature_crypto_order_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoOrderDetailsPagerFlow extends ViewController<q> implements g {
    public final CryptoOrderDetailsPagerFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final int O;

    public CryptoOrderDetailsPagerFlow(CryptoOrderDetailsPagerFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: hyh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoOrderDetailsPagerFlow f156875b;

            {
                this.f156875b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((ayh.c) this.f156875b.N.getValue()).d.get();
                    case 1:
                        int i2 = R$id.flow_pager;
                        CryptoOrderDetailsPagerFlow cryptoOrderDetailsPagerFlow = this.f156875b;
                        return mif.a.a(cryptoOrderDetailsPagerFlow, 0, i2, (b) cryptoOrderDetailsPagerFlow.L.getValue(), 5);
                    default:
                        CryptoOrderDetailsPagerFlow cryptoOrderDetailsPagerFlow2 = this.f156875b;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoOrderDetailsPagerFlow2.m2()).a().get(ayh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ayh.b.class, " is not found"));
                        }
                        ayh.b bVar = ((ayh.b) aVar2.b()).f11202p;
                        CryptoOrderDetailsPagerFlowContract$InputData cryptoOrderDetailsPagerFlowContract$InputData = cryptoOrderDetailsPagerFlow2.K;
                        cryptoOrderDetailsPagerFlowContract$InputData.getClass();
                        return new ayh.c(bVar, cryptoOrderDetailsPagerFlowContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: hyh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoOrderDetailsPagerFlow f156875b;

            {
                this.f156875b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((ayh.c) this.f156875b.N.getValue()).d.get();
                    case 1:
                        int i22 = R$id.flow_pager;
                        CryptoOrderDetailsPagerFlow cryptoOrderDetailsPagerFlow = this.f156875b;
                        return mif.a.a(cryptoOrderDetailsPagerFlow, 0, i22, (b) cryptoOrderDetailsPagerFlow.L.getValue(), 5);
                    default:
                        CryptoOrderDetailsPagerFlow cryptoOrderDetailsPagerFlow2 = this.f156875b;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoOrderDetailsPagerFlow2.m2()).a().get(ayh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ayh.b.class, " is not found"));
                        }
                        ayh.b bVar = ((ayh.b) aVar2.b()).f11202p;
                        CryptoOrderDetailsPagerFlowContract$InputData cryptoOrderDetailsPagerFlowContract$InputData = cryptoOrderDetailsPagerFlow2.K;
                        cryptoOrderDetailsPagerFlowContract$InputData.getClass();
                        return new ayh.c(bVar, cryptoOrderDetailsPagerFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: hyh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoOrderDetailsPagerFlow f156875b;

            {
                this.f156875b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (b) ((ayh.c) this.f156875b.N.getValue()).d.get();
                    case 1:
                        int i22 = R$id.flow_pager;
                        CryptoOrderDetailsPagerFlow cryptoOrderDetailsPagerFlow = this.f156875b;
                        return mif.a.a(cryptoOrderDetailsPagerFlow, 0, i22, (b) cryptoOrderDetailsPagerFlow.L.getValue(), 5);
                    default:
                        CryptoOrderDetailsPagerFlow cryptoOrderDetailsPagerFlow2 = this.f156875b;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoOrderDetailsPagerFlow2.m2()).a().get(ayh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ayh.b.class, " is not found"));
                        }
                        ayh.b bVar = ((ayh.b) aVar2.b()).f11202p;
                        CryptoOrderDetailsPagerFlowContract$InputData cryptoOrderDetailsPagerFlowContract$InputData = cryptoOrderDetailsPagerFlow2.K;
                        cryptoOrderDetailsPagerFlowContract$InputData.getClass();
                        return new ayh.c(bVar, cryptoOrderDetailsPagerFlowContract$InputData);
                }
            }
        });
        this.O = R$layout.flow_pager;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        CryptoOrderDetailsPagerFlowContract$OrderPage page = (CryptoOrderDetailsPagerFlowContract$OrderPage) pagerItem;
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        a aVar = (a) ((b) this.L.getValue());
        aVar.getClass();
        Intrinsics.checkNotNullParameter(page, "page");
        aVar.H2(aVar.f96674s, new hw9.a(page, 12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (b) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.M.getValue();
    }
}
