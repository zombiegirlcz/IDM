package com.revolut.feature.junior_payment_links.impl.ui.screen.consent;

import android.view.View;
import cli.k;
import com.revolut.feature.junior_payment_links.api.navigation.JuniorPaymentLinksConsentInput;
import com.revolut.feature.junior_payment_links.impl.ui.screen.consent.JuniorPaymentLinksConsentScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import dj8.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import te0.w;
import ti8.f;
import ue0.e;
import wi8.d;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_payment_links/impl/ui/screen/consent/JuniorPaymentLinksConsentScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lti8/f;", "Lcli/k;", "feature_junior_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorPaymentLinksConsentScreen extends BaseBottomSheetRecyclerController<f, k> {
    public static final /* synthetic */ int U = 0;
    public final JuniorPaymentLinksConsentInput Q;
    public final List R;
    public final Object S;
    public final Object T;

    public JuniorPaymentLinksConsentScreen(JuniorPaymentLinksConsentInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.Q = input;
        this.R = b.v(null, null, 7);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: dj8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPaymentLinksConsentScreen f115128b;

            {
                this.f115128b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                JuniorPaymentLinksConsentScreen juniorPaymentLinksConsentScreen = this.f115128b;
                switch (i2) {
                    case 0:
                        int i3 = JuniorPaymentLinksConsentScreen.U;
                        phm.a aVar = (phm.a) e.j(juniorPaymentLinksConsentScreen.m2()).a().get(wi8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wi8.e.class, " is not found"));
                        }
                        wi8.e eVar = ((wi8.e) aVar2.b()).f297851h;
                        JuniorPaymentLinksConsentInput juniorPaymentLinksConsentInput = juniorPaymentLinksConsentScreen.Q;
                        juniorPaymentLinksConsentInput.getClass();
                        return new wi8.d(eVar, juniorPaymentLinksConsentInput);
                    default:
                        int i5 = JuniorPaymentLinksConsentScreen.U;
                        return (c) ((wi8.d) juniorPaymentLinksConsentScreen.S.getValue()).f297846b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: dj8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorPaymentLinksConsentScreen f115128b;

            {
                this.f115128b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                JuniorPaymentLinksConsentScreen juniorPaymentLinksConsentScreen = this.f115128b;
                switch (i22) {
                    case 0:
                        int i3 = JuniorPaymentLinksConsentScreen.U;
                        phm.a aVar = (phm.a) e.j(juniorPaymentLinksConsentScreen.m2()).a().get(wi8.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", wi8.e.class, " is not found"));
                        }
                        wi8.e eVar = ((wi8.e) aVar2.b()).f297851h;
                        JuniorPaymentLinksConsentInput juniorPaymentLinksConsentInput = juniorPaymentLinksConsentScreen.Q;
                        juniorPaymentLinksConsentInput.getClass();
                        return new wi8.d(eVar, juniorPaymentLinksConsentInput);
                    default:
                        int i5 = JuniorPaymentLinksConsentScreen.U;
                        return (c) ((wi8.d) juniorPaymentLinksConsentScreen.S.getValue()).f297846b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b h3() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new dj8.b(this, null, 0), 3);
        ViewController.P2(this, f3(), new dj8.b(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
