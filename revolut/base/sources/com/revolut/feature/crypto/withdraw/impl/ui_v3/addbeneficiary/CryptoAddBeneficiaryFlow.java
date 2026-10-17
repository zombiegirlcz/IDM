package com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary;

import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.CryptoAddBeneficiaryFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lo5.e;
import te0.w;
import uki.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/CryptoAddBeneficiaryFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llo5/e;", "Luki/c;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoAddBeneficiaryFlow extends ViewController<e> implements c {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CryptoAddBeneficiaryFlow(CryptoAddBeneficiaryInput inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: aq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAddBeneficiaryFlow f8258b;

            {
                this.f8258b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CryptoAddBeneficiaryFlow cryptoAddBeneficiaryFlow = this.f8258b;
                        return czi.c.a(R$id.screen_transparent_container, (b) cryptoAddBeneficiaryFlow.N.getValue(), cryptoAddBeneficiaryFlow);
                    default:
                        return (b) ((zo5.a) this.f8258b.M.getValue()).d.get();
                }
            }
        });
        this.M = w.y0(new agh.b(this, inputData, 20));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: aq5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoAddBeneficiaryFlow f8258b;

            {
                this.f8258b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CryptoAddBeneficiaryFlow cryptoAddBeneficiaryFlow = this.f8258b;
                        return czi.c.a(R$id.screen_transparent_container, (b) cryptoAddBeneficiaryFlow.N.getValue(), cryptoAddBeneficiaryFlow);
                    default:
                        return (b) ((zo5.a) this.f8258b.M.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (zo5.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (zo5.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (aq5.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.L.getValue();
    }
}
