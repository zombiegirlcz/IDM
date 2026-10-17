package com.revolut.feature.defi.asset_details.impl.ui.screen;

import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreen;
import com.revolut.feature.defi.asset_details.impl.ui.screen.DeFiAssetDetailsScreenContract$InputData;
import com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen;
import java.util.List;
import k26.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l26.b;
import l26.c;
import l26.f;
import pt5.r;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/defi/asset_details/impl/ui/screen/DeFiAssetDetailsScreen;", "Lcom/revolut/retail/feature/crypto/asset_details/common/api/ui/BaseCryptoAssetDetailsScreen;", "Ll26/b;", "Ll26/c;", "Lo26/b;", "Lpt5/r;", "feature_defi_asset_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiAssetDetailsScreen extends BaseCryptoAssetDetailsScreen<b, c> implements o26.b, r {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ int f71676d0 = 0;
    public final DeFiAssetDetailsScreenContract$InputData Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f71677a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f71678b0;
    public final List c0;

    public DeFiAssetDetailsScreen(DeFiAssetDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Z = inputData;
        final int i = 0;
        this.f71677a0 = w.y0(new Function0(this) { // from class: l26.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiAssetDetailsScreen f191659b;

            {
                this.f191659b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeFiAssetDetailsScreen deFiAssetDetailsScreen = this.f191659b;
                switch (i2) {
                    case 0:
                        int i3 = DeFiAssetDetailsScreen.f71676d0;
                        phm.a aVar = (phm.a) ue0.e.j(deFiAssetDetailsScreen.m2()).a().get(k26.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k26.c.class, " is not found"));
                        }
                        k26.c cVar = ((k26.c) aVar2.b()).k;
                        DeFiAssetDetailsScreenContract$InputData deFiAssetDetailsScreenContract$InputData = deFiAssetDetailsScreen.Z;
                        deFiAssetDetailsScreenContract$InputData.getClass();
                        return new k26.d(cVar, deFiAssetDetailsScreen, deFiAssetDetailsScreenContract$InputData);
                    default:
                        int i5 = DeFiAssetDetailsScreen.f71676d0;
                        return (f) ((k26.d) deFiAssetDetailsScreen.f71677a0.getValue()).u.get();
                }
            }
        });
        final int i2 = 1;
        this.f71678b0 = w.y0(new Function0(this) { // from class: l26.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiAssetDetailsScreen f191659b;

            {
                this.f191659b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeFiAssetDetailsScreen deFiAssetDetailsScreen = this.f191659b;
                switch (i22) {
                    case 0:
                        int i3 = DeFiAssetDetailsScreen.f71676d0;
                        phm.a aVar = (phm.a) ue0.e.j(deFiAssetDetailsScreen.m2()).a().get(k26.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k26.c.class, " is not found"));
                        }
                        k26.c cVar = ((k26.c) aVar2.b()).k;
                        DeFiAssetDetailsScreenContract$InputData deFiAssetDetailsScreenContract$InputData = deFiAssetDetailsScreen.Z;
                        deFiAssetDetailsScreenContract$InputData.getClass();
                        return new k26.d(cVar, deFiAssetDetailsScreen, deFiAssetDetailsScreenContract$InputData);
                    default:
                        int i5 = DeFiAssetDetailsScreen.f71676d0;
                        return (f) ((k26.d) deFiAssetDetailsScreen.f71677a0.getValue()).u.get();
                }
            }
        });
        this.c0 = u.c(new PlainTextWarningDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.f71677a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.f71678b0.getValue();
    }

    @Override // pt5.r
    public final efm.r S() {
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    @Override // pt5.r
    public final efm.r T() {
        return c().f53218h;
    }

    @Override // pt5.r
    public final efm.r U() {
        return j0().f52707c;
    }

    @Override // com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen
    /* JADX INFO: renamed from: d3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen
    public final d8j.f f3() {
        return (f) this.f71678b0.getValue();
    }

    @Override // pt5.r
    public final efm.r h0() {
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    @Override // pt5.r
    public final efm.r i0() {
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }

    @Override // pt5.r
    public final efm.r j1() {
        efm.r rVarEmpty = efm.r.empty();
        Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
        return rVarEmpty;
    }
}
