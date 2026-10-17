package com.revolut.feature.junior_consent.impl.ui.screen.payment_links_approve;

import aii.q;
import com.revolut.feature.junior_consent.impl.ui.screen.payment_links_approve.JuniorPaymentLinksConsentApproveScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import j1a.k;
import jd8.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import pki.b;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_consent/impl/ui/screen/payment_links_approve/JuniorPaymentLinksConsentApproveScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "<init>", "()V", "feature_junior_consent_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorPaymentLinksConsentApproveScreen extends SimpleViewController<q> {
    public final int N = R$layout.screen_transparent;
    public final Object O;
    public final Object P;

    public JuniorPaymentLinksConsentApproveScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: qd8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPaymentLinksConsentApproveScreen f244882b;

            {
                this.f244882b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f244882b.m2()).a().get(jd8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jd8.e.class, " is not found"));
                        }
                        jd8.e eVar = ((jd8.e) ((rd8.a) aVar2.b())).f;
                        jd8.f fVar = new jd8.f();
                        fVar.f173028a = e4m.b.b(new k(eVar, 5));
                        return fVar;
                    default:
                        return (b) ((jd8.f) this.f244882b.O.getValue()).f173028a.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: qd8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPaymentLinksConsentApproveScreen f244882b;

            {
                this.f244882b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(this.f244882b.m2()).a().get(jd8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", jd8.e.class, " is not found"));
                        }
                        jd8.e eVar = ((jd8.e) ((rd8.a) aVar2.b())).f;
                        jd8.f fVar = new jd8.f();
                        fVar.f173028a = e4m.b.b(new k(eVar, 5));
                        return fVar;
                    default:
                        return (b) ((jd8.f) this.f244882b.O.getValue()).f173028a.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (qd8.b) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }
}
