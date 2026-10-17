package t70;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCache;
import androidx.compose.material.ripple.RippleHostView;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.android.localization.DynamicResourceAnnotationValidationException;
import com.revolut.core.ui_kit.internal.views.chart.ComparisonLineChartView;
import com.revolut.core.ui_kit.views.DateInputView;
import com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.MarketingPhotoHeaderContentView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.core.ui_kit.views.navbar.StoryNavBarContentView;
import com.revolut.core.ui_kit.views.navbar.WallpaperAssetSwitcher;
import com.revolut.feature.crypto.tfr.validation.impl.dob.DateOfBirthScreen;
import com.revolut.feature.retail.cfd.impl.screens.withdraw.CfdWithdrawScreen;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreen;
import com.revolut.feature.shops.impl.ui.bid_custom_input.BidCustomInputScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreen;
import com.revolut.kompot.bridge.impl.launcher.KompotOverlayLauncherActivity;
import com.revolut.sso.impl.ui.revolut_id.documents.identity_documents.IdentityDocumentsScreen;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import ms0.s3;
import ts0.o0;
import tw0.l0;
import tx0.w0;
import ux0.s0;
import vch.x0;
import vkm.j2;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f268406b;

    public /* synthetic */ x(Object obj2, int i) {
        this.f268405a = i;
        this.f268406b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        int i = this.f268405a;
        int i2 = 28;
        Continuation continuation = null;
        Object obj2 = this.f268406b;
        switch (i) {
            case 0:
                throw ((DynamicResourceAnnotationValidationException) obj2);
            case 1:
                KompotOverlayLauncherActivity.Z0((KompotOverlayLauncherActivity) obj2);
                return;
            case 2:
                IdentityDocumentsScreen identityDocumentsScreen = (IdentityDocumentsScreen) obj2;
                KProperty[] kPropertyArr = IdentityDocumentsScreen.f106741a0;
                identityDocumentsScreen.d3(identityDocumentsScreen.N);
                return;
            case 3:
                com.revolut.core.ui_kit.internal.views.chart.d dVar = (com.revolut.core.ui_kit.internal.views.chart.d) obj2;
                dVar.f56773b = true;
                ComparisonLineChartView comparisonLineChartView = dVar.e;
                ComparisonLineChartView.c cVar = comparisonLineChartView.f56621g;
                cVar.o = true;
                comparisonLineChartView.getParent().requestDisallowInterceptTouchEvent(true);
                dVar.f56774c = true;
                ComparisonLineChartView.a(comparisonLineChartView);
                if (!comparisonLineChartView.S.m()) {
                    comparisonLineChartView.k(ts0.p.ENLARGED);
                }
                comparisonLineChartView.d(cVar, comparisonLineChartView.getData().a(), comparisonLineChartView.getData().b());
                comparisonLineChartView.f(cVar.f56654j, cVar.k);
                comparisonLineChartView.e(cVar.k);
                comparisonLineChartView.invalidate();
                return;
            case 4:
                com.revolut.core.ui_kit.internal.views.chart.f fVar = (com.revolut.core.ui_kit.internal.views.chart.f) obj2;
                fVar.d = true;
                ts0.s sVar = fVar.e;
                sVar.f273903a.setSelectedPosition(fVar.b(false));
                sVar.f273903a.getParent().requestDisallowInterceptTouchEvent(true);
                return;
            case 5:
                com.revolut.core.ui_kit.internal.views.chart.i iVar = (com.revolut.core.ui_kit.internal.views.chart.i) obj2;
                iVar.d = true;
                o0 o0Var = iVar.e;
                o0Var.f273895a.setSelectedPosition(iVar.b());
                o0Var.f273895a.getParent().requestDisallowInterceptTouchEvent(true);
                return;
            case 6:
                tv0.n nVar = (tv0.n) obj2;
                if (Intrinsics.f(nVar.f274683j, tv0.i.f274674a)) {
                    nVar.f274683j = tv0.k.f274676a;
                }
                nVar.b();
                return;
            case 7:
                ((l0) obj2).h();
                return;
            case 8:
                AccountSelectionNavBarContentView accountSelectionNavBarContentView = (AccountSelectionNavBarContentView) obj2;
                AccountSelectionNavBarContentView.Companion companion = AccountSelectionNavBarContentView.INSTANCE;
                if (!accountSelectionNavBarContentView.isAttachedToWindow() || Intrinsics.f(accountSelectionNavBarContentView.v, "ID_NULL_PAGE") || d0.W(accountSelectionNavBarContentView.v)) {
                    return;
                }
                Context context = accountSelectionNavBarContentView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                jh.d.f(context).n0().i(accountSelectionNavBarContentView, accountSelectionNavBarContentView.v);
                return;
            case 9:
                MarketingPhotoHeaderContentView marketingPhotoHeaderContentView = ((w0) obj2).f275256a;
                MarketingPhotoHeaderContentView.Companion aVar = MarketingPhotoHeaderContentView.INSTANCE;
                marketingPhotoHeaderContentView.a();
                return;
            case 10:
                NavBarWithContainer.setHeaderDisclaimer$lambda$0((NavBarWithContainer) obj2);
                return;
            case 11:
                NavBarWithContainerHeaderView.setHeaderDisclaimer$lambda$1((NavBarWithContainerHeaderView) obj2);
                return;
            case 12:
                ((s3) obj2).setVisibility(4);
                return;
            case 13:
                StoryNavBarContentView storyNavBarContentView = (StoryNavBarContentView) obj2;
                storyNavBarContentView.f59474a.scrollToPosition(storyNavBarContentView.f59476c);
                storyNavBarContentView.f59475b.c(storyNavBarContentView.f59476c, 5000L);
                return;
            case 14:
                WallpaperAssetSwitcher wallpaperAssetSwitcher = (WallpaperAssetSwitcher) obj2;
                wallpaperAssetSwitcher.setBackground(wallpaperAssetSwitcher.f);
                LottieAnimationView lottieAnimationView = wallpaperAssetSwitcher.f59492b;
                lottieAnimationView.pauseAnimation();
                AnimatorSet animatorSet = wallpaperAssetSwitcher.o;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                Animator[] elements = {wallpaperAssetSwitcher.f(wallpaperAssetSwitcher.f59491a, false, false), wallpaperAssetSwitcher.f(lottieAnimationView, false, false), wallpaperAssetSwitcher.f(wallpaperAssetSwitcher.f59493c, false, false)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                animatorSet2.playTogether(kotlin.collections.d.L(elements));
                wallpaperAssetSwitcher.o = animatorSet2;
                animatorSet2.start();
                wallpaperAssetSwitcher.i(null, null);
                return;
            case 15:
                CfdWithdrawScreen cfdWithdrawScreen = (CfdWithdrawScreen) obj2;
                KProperty[] kPropertyArr2 = CfdWithdrawScreen.V;
                if (cfdWithdrawScreen.o) {
                    u4b.j jVarE3 = cfdWithdrawScreen.e3();
                    cli.y yVar = jVarE3.v;
                    if (((u4b.e) ((j2) yVar.f22677a).getValue()).e) {
                        return;
                    }
                    jVarE3.H2(yVar, new u3a.g(i2));
                    return;
                }
                return;
            case 16:
                TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen = (TravelHotelsSearchResultsMapScreen) obj2;
                KProperty[] kPropertyArr3 = TravelHotelsSearchResultsMapScreen.p0;
                travelHotelsSearchResultsMapScreen.m3().addOnScrollListener(travelHotelsSearchResultsMapScreen.j0);
                return;
            case 17:
                int i3 = BidCustomInputScreen.X;
                uid.d dVarM3 = ((BidCustomInputScreen) obj2).m3();
                dVarM3.getClass();
                dVarM3.n2(new uea.e(dVarM3, continuation, 5), new whi.b(6));
                return;
            case 18:
                s0 s0Var = (s0) obj2;
                if (s0Var.f283813t != 0) {
                    s0Var.requestLayout();
                    return;
                }
                return;
            case 19:
                WithdrawScreen withdrawScreen = (WithdrawScreen) obj2;
                KProperty[] kPropertyArr4 = WithdrawScreen.f95647h0;
                if (withdrawScreen.o) {
                    x0 x0Var = (x0) withdrawScreen.i3();
                    if (((vch.k) x0Var.t2()).f287713j) {
                        return;
                    }
                    x0Var.x2(new v80.a(i2));
                    return;
                }
                return;
            case 20:
                yki.i iVar2 = ((com.revolut.feature.apm.bills.boleto.impl.finder.flow.a) obj2).f61171p;
                if (iVar2.d() == null) {
                    oki.h.D2(iVar2);
                    return;
                }
                return;
            case 21:
                DateOfBirthScreen dateOfBirthScreen = (DateOfBirthScreen) obj2;
                KProperty[] kPropertyArr5 = DateOfBirthScreen.Q;
                DateInputView dateOfBirthScreenDateInput = dateOfBirthScreen.d3().f272158c;
                Intrinsics.checkNotNullExpressionValue(dateOfBirthScreenDateInput, "dateOfBirthScreenDateInput");
                DateInputView.Companion aVar2 = DateInputView.INSTANCE;
                dateOfBirthScreenDateInput.j0(false);
                dateOfBirthScreen.P = false;
                return;
            case 22:
                AudioRestrictionControllerImpl._init_$lambda$0((AudioRestrictionControllerImpl) obj2);
                return;
            case 23:
                Camera2DeviceCache._init_$lambda$1((Camera2DeviceCache) obj2);
                return;
            case 24:
                RippleHostView.setRippleState$lambda$1((RippleHostView) obj2);
                return;
            case 25:
                throw ((Exception) obj2);
            case 26:
                wf.e eVar = (wf.e) obj2;
                wf.d dVar2 = eVar.f296857l;
                boolean z = eVar.f296861q;
                dVar2.d.a(z);
                dVar2.e.a(z);
                return;
            case 27:
                wl0.f fVar2 = ((wl0.q) obj2).f298361b;
                fVar2.d.setText(fVar2.f298349a);
                return;
            case 28:
                ((TemplatesScreen) obj2).f85208b0 = null;
                return;
            default:
                vp0.h hVar = wp0.h.f299001a;
                ((qg7.k) obj2).invoke();
                return;
        }
    }
}
