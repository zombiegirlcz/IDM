package com.revolut.feature.invest.smart_notifications.impl.ui.screen.compliance_popup;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.compliance_popup.InsightsComplianceBottomSheetScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m18.d;
import pki.b;
import te0.w;
import urd.n;
import v0k.g;
import v18.c;
import v18.h;
import vkm.q;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/impl/ui/screen/compliance_popup/InsightsComplianceBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lv18/c;", "Lcli/k;", "<init>", "()V", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsightsComplianceBottomSheetScreen extends BaseBottomSheetRecyclerController<c, k> {
    public static final /* synthetic */ int U = 0;
    public final PlainTextDelegate Q;
    public final List R;
    public final Object S;
    public final Object T;

    public InsightsComplianceBottomSheetScreen() {
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.Q = plainTextDelegate;
        this.R = u.c(plainTextDelegate);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: v18.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightsComplianceBottomSheetScreen f285272b;

            {
                this.f285272b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InsightsComplianceBottomSheetScreen insightsComplianceBottomSheetScreen = this.f285272b;
                switch (i2) {
                    case 0:
                        int i3 = InsightsComplianceBottomSheetScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(insightsComplianceBottomSheetScreen.m2()).a().get(m18.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m18.e.class, " is not found"));
                        }
                        m18.e eVar = ((m18.e) aVar2.b()).f201271q;
                        m18.d dVar = new m18.d();
                        dVar.f201260a = e4m.b.b(new m0m.a(1));
                        return dVar;
                    default:
                        int i5 = InsightsComplianceBottomSheetScreen.U;
                        return (h) ((m18.d) insightsComplianceBottomSheetScreen.S.getValue()).f201260a.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: v18.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsightsComplianceBottomSheetScreen f285272b;

            {
                this.f285272b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InsightsComplianceBottomSheetScreen insightsComplianceBottomSheetScreen = this.f285272b;
                switch (i22) {
                    case 0:
                        int i3 = InsightsComplianceBottomSheetScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(insightsComplianceBottomSheetScreen.m2()).a().get(m18.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m18.e.class, " is not found"));
                        }
                        m18.e eVar = ((m18.e) aVar2.b()).f201271q;
                        m18.d dVar = new m18.d();
                        dVar.f201260a = e4m.b.b(new m0m.a(1));
                        return dVar;
                    default:
                        int i5 = InsightsComplianceBottomSheetScreen.U;
                        return (h) ((m18.d) insightsComplianceBottomSheetScreen.S.getValue()).f201260a.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (h) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, q.J(rd0.e.b(w.a0(this.Q.d.f121375b, new g(14))), new n(e3(), 28)), new up2.q(this, null, 23), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (h) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getQ() {
        return this.R;
    }
}
