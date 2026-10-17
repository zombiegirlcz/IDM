package com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview;

import android.os.Parcelable;
import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.PromotionalMediumTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.business.referrals.R$id;
import com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.BaseReferralWithIncentiveOverviewScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import grl.x0;
import ht2.b;
import ht2.c;
import ht2.d;
import ht2.f;
import ht2.g;
import ht2.h;
import ht2.j;
import ht2.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import us2.i;
import vkm.q;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/business/referrals/ui/screens/referral_with_incentive_overview/BaseReferralWithIncentiveOverviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lht2/j;", "Ldli/a;", "Lht2/s;", "Lno/m;", "feature_business_referrals_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseReferralWithIncentiveOverviewScreen extends ViewController<j> implements a, m {
    public final int K;
    public final AnalyticsProduct.Business L;
    public final Object M;
    public final Object N;
    public final ListSubheaderDelegate O;
    public final RowDelegate P;
    public final FullScreenStateDelegate Q;
    public final CellDetailsChevronDelegate R;
    public final TextDelegate S;
    public final PromotionalMediumTileDelegate T;
    public final NotificationCentreItemDelegate U;
    public final List V;
    public final Object W;

    public BaseReferralWithIncentiveOverviewScreen(int i) {
        this.K = i;
        x0 value = x0.Referrals;
        Parcelable.Creator<AnalyticsProduct.Business> creator = AnalyticsProduct.Business.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.L = new AnalyticsProduct.Business(value);
        final int i2 = 0;
        this.M = w.y0(new Function0(this) { // from class: ht2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseReferralWithIncentiveOverviewScreen f155219b;

            {
                this.f155219b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BaseReferralWithIncentiveOverviewScreen baseReferralWithIncentiveOverviewScreen = this.f155219b;
                        qji.b bVarU2 = baseReferralWithIncentiveOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.di.ReferralWithIncentiveOverviewScreenInjector");
                        us2.h hVar = (us2.h) bVarU2;
                        return new us2.i(hVar.f282403b, hVar.f282404c, baseReferralWithIncentiveOverviewScreen);
                    case 1:
                        return (n) ((us2.i) this.f155219b.M.getValue()).f.get();
                    default:
                        BaseReferralWithIncentiveOverviewScreen baseReferralWithIncentiveOverviewScreen2 = this.f155219b;
                        return dli.f.a(baseReferralWithIncentiveOverviewScreen2, baseReferralWithIncentiveOverviewScreen2.R2(), baseReferralWithIncentiveOverviewScreen2.getV(), R$id.referralWithIncentiveOverview_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 1;
        this.N = w.y0(new Function0(this) { // from class: ht2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseReferralWithIncentiveOverviewScreen f155219b;

            {
                this.f155219b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BaseReferralWithIncentiveOverviewScreen baseReferralWithIncentiveOverviewScreen = this.f155219b;
                        qji.b bVarU2 = baseReferralWithIncentiveOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.di.ReferralWithIncentiveOverviewScreenInjector");
                        us2.h hVar = (us2.h) bVarU2;
                        return new us2.i(hVar.f282403b, hVar.f282404c, baseReferralWithIncentiveOverviewScreen);
                    case 1:
                        return (n) ((us2.i) this.f155219b.M.getValue()).f.get();
                    default:
                        BaseReferralWithIncentiveOverviewScreen baseReferralWithIncentiveOverviewScreen2 = this.f155219b;
                        return dli.f.a(baseReferralWithIncentiveOverviewScreen2, baseReferralWithIncentiveOverviewScreen2.R2(), baseReferralWithIncentiveOverviewScreen2.getV(), R$id.referralWithIncentiveOverview_recyclerView, null, null, null, 56);
                }
            }
        });
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.O = listSubheaderDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Q = fullScreenStateDelegate;
        CellDetailsChevronDelegate cellDetailsChevronDelegate = new CellDetailsChevronDelegate();
        this.R = cellDetailsChevronDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.S = textDelegate;
        PromotionalMediumTileDelegate promotionalMediumTileDelegate = new PromotionalMediumTileDelegate();
        this.T = promotionalMediumTileDelegate;
        NotificationCentreItemDelegate notificationCentreItemDelegate = new NotificationCentreItemDelegate();
        this.U = notificationCentreItemDelegate;
        final int i5 = 2;
        this.V = v.k(new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), rowDelegate, fullScreenStateDelegate, cellDetailsChevronDelegate, listSubheaderDelegate, textDelegate, promotionalMediumTileDelegate, notificationCentreItemDelegate);
        this.W = w.y0(new Function0(this) { // from class: ht2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseReferralWithIncentiveOverviewScreen f155219b;

            {
                this.f155219b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        BaseReferralWithIncentiveOverviewScreen baseReferralWithIncentiveOverviewScreen = this.f155219b;
                        qji.b bVarU2 = baseReferralWithIncentiveOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.business.referrals.ui.screens.referral_with_incentive_overview.di.ReferralWithIncentiveOverviewScreenInjector");
                        us2.h hVar = (us2.h) bVarU2;
                        return new us2.i(hVar.f282403b, hVar.f282404c, baseReferralWithIncentiveOverviewScreen);
                    case 1:
                        return (n) ((us2.i) this.f155219b.M.getValue()).f.get();
                    default:
                        BaseReferralWithIncentiveOverviewScreen baseReferralWithIncentiveOverviewScreen2 = this.f155219b;
                        return dli.f.a(baseReferralWithIncentiveOverviewScreen2, baseReferralWithIncentiveOverviewScreen2.R2(), baseReferralWithIncentiveOverviewScreen2.getV(), R$id.referralWithIncentiveOverview_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52707c), null, new b(this, null), 3);
        RowDelegate rowDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, q.J(rd0.e.b(rowDelegate.f53218h), rd0.e.b(rowDelegate.f53220l)), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f51821c), null, new ht2.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.d), null, new f(this, null, 0), 3);
        PromotionalMediumTileDelegate promotionalMediumTileDelegate = this.T;
        com.revolut.kompot.navigable.a.g2(this, q.J(rd0.e.b(promotionalMediumTileDelegate.e), rd0.e.b(promotionalMediumTileDelegate.f53038c)), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(promotionalMediumTileDelegate.d), null, new h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53226s), null, new f(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.f52865c), null, new f(this, null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final n R2() {
        return (n) this.N.getValue();
    }

    /* JADX INFO: renamed from: e3, reason: from getter */
    public List getV() {
        return this.V;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }
}
