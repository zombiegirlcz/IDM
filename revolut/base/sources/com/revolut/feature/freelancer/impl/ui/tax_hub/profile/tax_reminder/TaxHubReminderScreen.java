package com.revolut.feature.freelancer.impl.ui.tax_hub.profile.tax_reminder;

import android.view.View;
import b47.c;
import b47.d;
import b47.e;
import bt6.s;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.tax_reminder.TaxHubReminderScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.tax_reminder.TaxHubReminderScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import hr6.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/profile/tax_reminder/TaxHubReminderScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lhr6/h;", "Lb47/e;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxHubReminderScreen extends BaseBottomSheetRecyclerController<h, e> {
    public static final /* synthetic */ int X = 0;
    public final TaxHubReminderScreenContract$InputData Q;
    public final FullScreenStateDelegate R;
    public final RowDelegate S;
    public final LargeActionButtonDelegate T;
    public final Object U;
    public final Object V;
    public final List W;

    public TaxHubReminderScreen(TaxHubReminderScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.R = fullScreenStateDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.S = rowDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.T = largeActionButtonDelegate;
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: b47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubReminderScreen f12187b;

            {
                this.f12187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxHubReminderScreen taxHubReminderScreen = this.f12187b;
                switch (i2) {
                    case 0:
                        int i3 = TaxHubReminderScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(taxHubReminderScreen.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bt6.b.class, " is not found"));
                        }
                        bt6.b bVar = ((bt6.b) aVar2.b()).f18307t;
                        TaxHubReminderScreenContract$InputData taxHubReminderScreenContract$InputData = taxHubReminderScreen.Q;
                        taxHubReminderScreenContract$InputData.getClass();
                        return new s(bVar, taxHubReminderScreenContract$InputData);
                    default:
                        int i5 = TaxHubReminderScreen.X;
                        return (h) ((s) taxHubReminderScreen.U.getValue()).f18380b.get();
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: b47.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubReminderScreen f12187b;

            {
                this.f12187b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxHubReminderScreen taxHubReminderScreen = this.f12187b;
                switch (i22) {
                    case 0:
                        int i3 = TaxHubReminderScreen.X;
                        phm.a aVar = (phm.a) ue0.e.j(taxHubReminderScreen.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bt6.b.class, " is not found"));
                        }
                        bt6.b bVar = ((bt6.b) aVar2.b()).f18307t;
                        TaxHubReminderScreenContract$InputData taxHubReminderScreenContract$InputData = taxHubReminderScreen.Q;
                        taxHubReminderScreenContract$InputData.getClass();
                        return new s(bVar, taxHubReminderScreenContract$InputData);
                    default:
                        int i5 = TaxHubReminderScreen.X;
                        return (h) ((s) taxHubReminderScreen.U.getValue()).f18380b.get();
                }
            }
        });
        this.W = v.k(fullScreenStateDelegate, rowDelegate, largeActionButtonDelegate, new LargeActionButtonLoadingDelegate(), new RowLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (s) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (b47.h) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new b47.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.f53225r), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.d.f121375b), new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (b47.h) this.V.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getW() {
        return this.W;
    }
}
