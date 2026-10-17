package com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.ReferralsTroubleshooterTopLevelController;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.ReferralsTroubleshooterTopLevelScreenContract$InputData;
import com.revolut.feature.shared.referrals.ui.impl.R$id;
import com.revolut.feature.shared.referrals.ui.impl.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import eya.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import wya.b;
import wya.c;
import wya.d;
import wya.l;
import wya.m;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/impl/ui/referral_troubleshooter/ReferralsTroubleshooterTopLevelController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lwya/l;", "Ldli/a;", "Lwya/m;", "feature_shared_referrals_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReferralsTroubleshooterTopLevelController extends ViewController<l> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ReferralsTroubleshooterTopLevelController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ReferralsTroubleshooterTopLevelScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final CellDetailsChevronDelegate N;
    public final LargeActionButtonDelegate O;
    public final RowDelegate P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public ReferralsTroubleshooterTopLevelController(ReferralsTroubleshooterTopLevelScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = true;
        this.N = new CellDetailsChevronDelegate();
        this.O = new LargeActionButtonDelegate();
        this.P = new RowDelegate(null, null, 7);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: wya.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralsTroubleshooterTopLevelController f301183b;

            {
                this.f301183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ReferralsTroubleshooterTopLevelController referralsTroubleshooterTopLevelController = this.f301183b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ReferralsTroubleshooterTopLevelController.U;
                        qji.b bVarU2 = referralsTroubleshooterTopLevelController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.di.ReferralsTroubleshooterScreenInjector");
                        eya.f fVar = (eya.f) bVarU2;
                        eya.j jVar = fVar.f130626b;
                        eya.f fVar2 = fVar.f130627c;
                        ReferralsTroubleshooterTopLevelScreenContract$InputData referralsTroubleshooterTopLevelScreenContract$InputData = referralsTroubleshooterTopLevelController.K;
                        referralsTroubleshooterTopLevelScreenContract$InputData.getClass();
                        return new eya.g(jVar, fVar2, referralsTroubleshooterTopLevelScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReferralsTroubleshooterTopLevelController.U;
                        return (g) ((eya.g) referralsTroubleshooterTopLevelController.Q.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = ReferralsTroubleshooterTopLevelController.U;
                        ReferralsTroubleshooterTopLevelController referralsTroubleshooterTopLevelController2 = this.f301183b;
                        return dli.f.a(referralsTroubleshooterTopLevelController2, referralsTroubleshooterTopLevelController2.d(), v.k(referralsTroubleshooterTopLevelController2.N, referralsTroubleshooterTopLevelController2.O, referralsTroubleshooterTopLevelController2.P, new FullScreenStateDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = s.t(this, b.f);
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: wya.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralsTroubleshooterTopLevelController f301183b;

            {
                this.f301183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ReferralsTroubleshooterTopLevelController referralsTroubleshooterTopLevelController = this.f301183b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReferralsTroubleshooterTopLevelController.U;
                        qji.b bVarU2 = referralsTroubleshooterTopLevelController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.di.ReferralsTroubleshooterScreenInjector");
                        eya.f fVar = (eya.f) bVarU2;
                        eya.j jVar = fVar.f130626b;
                        eya.f fVar2 = fVar.f130627c;
                        ReferralsTroubleshooterTopLevelScreenContract$InputData referralsTroubleshooterTopLevelScreenContract$InputData = referralsTroubleshooterTopLevelController.K;
                        referralsTroubleshooterTopLevelScreenContract$InputData.getClass();
                        return new eya.g(jVar, fVar2, referralsTroubleshooterTopLevelScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReferralsTroubleshooterTopLevelController.U;
                        return (g) ((eya.g) referralsTroubleshooterTopLevelController.Q.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = ReferralsTroubleshooterTopLevelController.U;
                        ReferralsTroubleshooterTopLevelController referralsTroubleshooterTopLevelController2 = this.f301183b;
                        return dli.f.a(referralsTroubleshooterTopLevelController2, referralsTroubleshooterTopLevelController2.d(), v.k(referralsTroubleshooterTopLevelController2.N, referralsTroubleshooterTopLevelController2.O, referralsTroubleshooterTopLevelController2.P, new FullScreenStateDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: wya.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferralsTroubleshooterTopLevelController f301183b;

            {
                this.f301183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ReferralsTroubleshooterTopLevelController referralsTroubleshooterTopLevelController = this.f301183b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ReferralsTroubleshooterTopLevelController.U;
                        qji.b bVarU2 = referralsTroubleshooterTopLevelController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.di.ReferralsTroubleshooterScreenInjector");
                        eya.f fVar = (eya.f) bVarU2;
                        eya.j jVar = fVar.f130626b;
                        eya.f fVar2 = fVar.f130627c;
                        ReferralsTroubleshooterTopLevelScreenContract$InputData referralsTroubleshooterTopLevelScreenContract$InputData = referralsTroubleshooterTopLevelController.K;
                        referralsTroubleshooterTopLevelScreenContract$InputData.getClass();
                        return new eya.g(jVar, fVar2, referralsTroubleshooterTopLevelScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ReferralsTroubleshooterTopLevelController.U;
                        return (g) ((eya.g) referralsTroubleshooterTopLevelController.Q.getValue()).e.get();
                    default:
                        KProperty[] kPropertyArr3 = ReferralsTroubleshooterTopLevelController.U;
                        ReferralsTroubleshooterTopLevelController referralsTroubleshooterTopLevelController2 = this.f301183b;
                        return dli.f.a(referralsTroubleshooterTopLevelController2, referralsTroubleshooterTopLevelController2.d(), v.k(referralsTroubleshooterTopLevelController2.N, referralsTroubleshooterTopLevelController2.O, referralsTroubleshooterTopLevelController2.P, new FullScreenStateDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((m) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.f59417v0 = false;
        navBarWithToolbar.setTitle(new TextLocalisedClause(((a) d()).v ? R$string.referrals_invite_campaign_faq_title : R$string.referrals_quick_help_title, null, null, 14), null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), null, new wkg.e(this, null, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f51821c), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.d.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new wya.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final wya.g d() {
        return (wya.g) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
