package com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details;

import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.AssetDetailsFlow;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import prk.g;
import prk.g0;
import prk.n0;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AssetDetailsFlow extends ViewController<q> implements f {
    public final AssetDetailsDestination K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public AssetDetailsFlow(AssetDetailsDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.K = destination;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ntk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AssetDetailsFlow f219145b;

            {
                this.f219145b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AssetDetailsFlow assetDetailsFlow = this.f219145b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, assetDetailsFlow, (b) assetDetailsFlow.O.getValue());
                    case 1:
                        AssetDetailsFlow assetDetailsFlow2 = this.f219145b;
                        phm.a aVar = (phm.a) ue0.e.j(assetDetailsFlow2.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new prk.g(((g0) ((n0) aVar2.b())).N, new c(assetDetailsFlow2.K));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                    default:
                        return (b) ((prk.g) this.f219145b.N.getValue()).f239138b.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: ntk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AssetDetailsFlow f219145b;

            {
                this.f219145b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AssetDetailsFlow assetDetailsFlow = this.f219145b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, assetDetailsFlow, (b) assetDetailsFlow.O.getValue());
                    case 1:
                        AssetDetailsFlow assetDetailsFlow2 = this.f219145b;
                        phm.a aVar = (phm.a) ue0.e.j(assetDetailsFlow2.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new prk.g(((g0) ((n0) aVar2.b())).N, new c(assetDetailsFlow2.K));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                    default:
                        return (b) ((prk.g) this.f219145b.N.getValue()).f239138b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: ntk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AssetDetailsFlow f219145b;

            {
                this.f219145b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        AssetDetailsFlow assetDetailsFlow = this.f219145b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, assetDetailsFlow, (b) assetDetailsFlow.O.getValue());
                    case 1:
                        AssetDetailsFlow assetDetailsFlow2 = this.f219145b;
                        phm.a aVar = (phm.a) ue0.e.j(assetDetailsFlow2.m2()).a().get(n0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new prk.g(((g0) ((n0) aVar2.b())).N, new c(assetDetailsFlow2.K));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", n0.class, " is not found"));
                    default:
                        return (b) ((prk.g) this.f219145b.N.getValue()).f239138b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (g) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b h3() {
        return (ntk.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.M.getValue();
    }
}
