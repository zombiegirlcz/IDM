package com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit;

import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.ReturnCryptoDepositFlow;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.ReturnCryptoDepositFlowContract$Input;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qbj.v;
import qji.b;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReturnCryptoDepositFlow extends ViewController<q> implements f {
    public final ReturnCryptoDepositFlowContract$Input K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public ReturnCryptoDepositFlow(ReturnCryptoDepositFlowContract$Input inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: gcj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReturnCryptoDepositFlow f142490b;

            {
                this.f142490b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ReturnCryptoDepositFlow returnCryptoDepositFlow = this.f142490b;
                        phm.a aVar = (phm.a) e.j(returnCryptoDepositFlow.m2()).a().get(qbj.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qbj.q.class, " is not found"));
                        }
                        qbj.q qVar = ((qbj.q) aVar2.b()).v;
                        ReturnCryptoDepositFlowContract$Input returnCryptoDepositFlowContract$Input = returnCryptoDepositFlow.K;
                        returnCryptoDepositFlowContract$Input.getClass();
                        return new v(qVar, returnCryptoDepositFlowContract$Input);
                    case 1:
                        return (b) ((v) this.f142490b.M.getValue()).d.get();
                    default:
                        ReturnCryptoDepositFlow returnCryptoDepositFlow2 = this.f142490b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, returnCryptoDepositFlow2, (b) returnCryptoDepositFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: gcj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReturnCryptoDepositFlow f142490b;

            {
                this.f142490b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ReturnCryptoDepositFlow returnCryptoDepositFlow = this.f142490b;
                        phm.a aVar = (phm.a) e.j(returnCryptoDepositFlow.m2()).a().get(qbj.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qbj.q.class, " is not found"));
                        }
                        qbj.q qVar = ((qbj.q) aVar2.b()).v;
                        ReturnCryptoDepositFlowContract$Input returnCryptoDepositFlowContract$Input = returnCryptoDepositFlow.K;
                        returnCryptoDepositFlowContract$Input.getClass();
                        return new v(qVar, returnCryptoDepositFlowContract$Input);
                    case 1:
                        return (b) ((v) this.f142490b.M.getValue()).d.get();
                    default:
                        ReturnCryptoDepositFlow returnCryptoDepositFlow2 = this.f142490b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, returnCryptoDepositFlow2, (b) returnCryptoDepositFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: gcj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReturnCryptoDepositFlow f142490b;

            {
                this.f142490b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ReturnCryptoDepositFlow returnCryptoDepositFlow = this.f142490b;
                        phm.a aVar = (phm.a) e.j(returnCryptoDepositFlow.m2()).a().get(qbj.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", qbj.q.class, " is not found"));
                        }
                        qbj.q qVar = ((qbj.q) aVar2.b()).v;
                        ReturnCryptoDepositFlowContract$Input returnCryptoDepositFlowContract$Input = returnCryptoDepositFlow.K;
                        returnCryptoDepositFlowContract$Input.getClass();
                        return new v(qVar, returnCryptoDepositFlowContract$Input);
                    case 1:
                        return (b) ((v) this.f142490b.M.getValue()).d.get();
                    default:
                        ReturnCryptoDepositFlow returnCryptoDepositFlow2 = this.f142490b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, returnCryptoDepositFlow2, (b) returnCryptoDepositFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (v) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (gcj.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
