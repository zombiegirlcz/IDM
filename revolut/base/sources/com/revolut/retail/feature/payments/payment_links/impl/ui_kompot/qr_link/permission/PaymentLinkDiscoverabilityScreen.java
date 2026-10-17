package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.permission;

import cli.k;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.profile_card.BaseProfileCardScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.permission.PaymentLinkDiscoverabilityScreen;
import j8k.b;
import j8k.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import q7k.f;
import q7k.j;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/qr_link/permission/PaymentLinkDiscoverabilityScreen;", "Lcom/revolut/feature/profile_card/BaseProfileCardScreen;", "Lcli/k;", "Lj8k/b;", "<init>", "()V", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentLinkDiscoverabilityScreen extends BaseProfileCardScreen<k, b> {
    public final Integer R = Integer.valueOf(R$style.UiKitTheme_Transparent);
    public final Object S;
    public final Object T;

    public PaymentLinkDiscoverabilityScreen() {
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: j8k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinkDiscoverabilityScreen f172223b;

            {
                this.f172223b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f172223b.m2()).a().get(f7k.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f7k.a.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).G;
                        f fVar = new f();
                        fVar.f242883a = e4m.b.b(new q7k.e(jVar, 0));
                        return fVar;
                    default:
                        return (c) ((f) this.f172223b.S.getValue()).f242883a.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: j8k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentLinkDiscoverabilityScreen f172223b;

            {
                this.f172223b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f172223b.m2()).a().get(f7k.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f7k.a.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).G;
                        f fVar = new f();
                        fVar.f242883a = e4m.b.b(new q7k.e(jVar, 0));
                        return fVar;
                    default:
                        return (c) ((f) this.f172223b.S.getValue()).f242883a.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.profile_card.BaseProfileCardScreen
    public final fpa.e d3() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.feature.profile_card.BaseProfileCardScreen
    /* JADX INFO: renamed from: e3 */
    public final boolean getP() {
        return false;
    }
}
