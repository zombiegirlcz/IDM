package vt3;

import android.app.Application;
import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCache;
import androidx.compose.material.ripple.AndroidRippleNode;
import aw0.o9;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.impl.ui.stories.StoriesScreenController;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.browser.InAppBrowserView;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileLoadingDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.entry.MultibancoExternalEnrollmentEntryScreen;
import com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreen;
import com.revolut.feature.card_management.api.CardManagementApi$Toggles;
import com.revolut.feature.cash_topup.impl.ui.entry.CashTopUpEntryScreen;
import com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.LoanDirectDebitRootFlow;
import com.revolut.feature.credit.loan.impl.ui.statements.LoanStatementsListScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.date.DateSelectorScreen;
import com.revolut.feature.pay_later.impl.ui.paymentbreakdown.PayLaterPaymentBreakdownScreen;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreen;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.RemittanceFlow;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.ui_easter_egg.EmojiEmitterView;
import fa0.h;
import fa0.u;
import grl.k9;
import i72.o;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import l80.e;
import l80.f;
import mb3.n;
import p2k.z;
import qc0.f1;
import te0.w;
import u45.n0;
import u45.p;
import v60.g;
import vc.s;
import vu0.d;
import vx5.r;
import vz2.b;
import w01.c;
import w72.j;
import wb3.m;
import wlh.k;
import wm.l;
import wo7.i;
import wol.t;
import zh9.u0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f291900b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f291899a = i;
        this.f291900b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v111, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v88, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f291899a;
        String strV0 = null;
        int i2 = 14;
        boolean z = false;
        Object obj2 = this.f291900b;
        switch (i) {
            case 0:
                return (Map) ((d8e.a) obj2).invoke();
            case 1:
                return ((f) ((e) ((g) obj2).f286252c)).k();
            case 2:
                return Float.valueOf(com.google.android.gms.internal.mlkit_vision_face.a.a(((d) obj2).f292136a, "getContext(...)", 2.0f));
            case 3:
                EmojiEmitterView emojiEmitterView = (EmojiEmitterView) obj2;
                return Float.valueOf((emojiEmitterView.d.ascent() + emojiEmitterView.d.descent()) / 2);
            case 4:
                KProperty[] kPropertyArr = CardLabelScreen.f64758b0;
                return (vy2.d) ((iwh.f) ((CardLabelScreen) obj2).Z.getValue()).f169102c.get();
            case 5:
                return Boolean.valueOf(((jte.d) ((b) obj2).f293369b).c(CardManagementApi$Toggles.NewChecksForMxMCYClosure.f64774c));
            case 6:
                return Camera2DeviceCache.cameraDeviceSetupCompatFactory_delegate$lambda$0((Camera2DeviceCache) obj2);
            case 7:
                ViewGroup viewGroup = ((c) obj2).f293607a;
                LottieAnimationView lottieAnimationView = new LottieAnimationView(viewGroup.getContext());
                lottieAnimationView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewGroup.addView(lottieAnimationView);
                lottieAnimationView.addAnimatorListener(new vt0.f(lottieAnimationView, 3));
                return lottieAnimationView;
            case 8:
                return AndroidRippleNode.addRipple_12SF9DM$lambda$0$0$0((AndroidRippleNode) obj2);
            case 9:
                return (w3k.a) ((z) ((RemittanceFlow) obj2).P.getValue()).f232540j.get();
            case 10:
                ((pfm.g) obj2).onComplete();
                return Unit.f186387a;
            case 11:
                return (w55.a) ((p) ((LoanDirectDebitRootFlow) obj2).P.getValue()).d.get();
            case 12:
                KProperty[] kPropertyArr2 = MultibancoExternalEnrollmentEntryScreen.S;
                return (j) ((o) ((MultibancoExternalEnrollmentEntryScreen) obj2).Q.getValue()).f159146b.get();
            case 13:
                KProperty[] kPropertyArr3 = LoanStatementsListScreen.f70611d0;
                return (w85.e) ((n0) ((LoanStatementsListScreen) obj2).f70612a0.getValue()).f277184c.get();
            case 14:
                ((com.revolut.feature.revolutpay.impl.ui.flow.pay_with_any.a) obj2).I2();
                return Unit.f186387a;
            case 15:
                u uVar = (u) ((StoriesScreenController) obj2).O.getValue();
                switch (uVar.f133160a) {
                    case 0:
                        return new wb0.c(uVar.f133161b, (in0.g) ((fa0.j) uVar.f133162c).f0.get());
                    default:
                        return new wb0.c(uVar.f133161b, (in0.g) ((h) uVar.f133162c).f0.get());
                }
            case 16:
                KProperty[] kPropertyArr4 = CashTopUpEntryScreen.f65628b0;
                n nVar = (n) ((CashTopUpEntryScreen) obj2).W.getValue();
                wb3.p pVar = new wb3.p(nVar.f204087a);
                mb3.p pVar2 = nVar.f204088b;
                fk3.a aVarA = pVar2.e.a();
                s.j(aVarA);
                pre.c cVarA = pVar2.f204094g.a();
                s.j(cVarA);
                return new m(pVar, aVarA, cVarA, nVar.f204087a, new nb3.c());
            case 17:
                return ((f1) ((wc0.a) obj2).d).l();
            case 18:
                wda.z zVar = (wda.z) obj2;
                return ((ze0.c) zVar.f296510c).a(zVar.f296508a, CoreConstants.MILLIS_IN_ONE_DAY);
            case 19:
                return ((wdd.a) obj2).f296549a.g();
            case 20:
                wgc.c cVar = (wgc.c) obj2;
                lfm.c cVar2 = cVar.d;
                efm.b bVarConcatMapCompletable = cVar.f297306c.a().concatMapCompletable(new wf6.o(7, new wdb.b(cVar, 19)));
                Intrinsics.checkNotNullExpressionValue(bVarConcatMapCompletable, "concatMapCompletable(...)");
                ugc.a aVar = new ugc.a(new r(new BreadcrumbException(), 21));
                bVarConcatMapCompletable.getClass();
                pfm.a aVar2 = new pfm.a(bVarConcatMapCompletable, aVar, 2);
                Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                ofm.h hVarW = aVar2.w(new nw8.d(17, wgc.b.f297303a), wgc.a.f297302a);
                Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                w.j0(cVar2, hVarW);
                return Unit.f186387a;
            case 21:
                String processName = Application.getProcessName();
                String packageName = ((Context) ((smd.s) obj2).f264432a).getPackageName();
                if (Intrinsics.f(processName, packageName)) {
                    return zi2.a.f322495a;
                }
                if (processName != null) {
                    Intrinsics.h(packageName);
                    strV0 = d0.v0(processName, packageName, processName);
                }
                return new zi2.b(strV0);
            case 22:
                KProperty[] kPropertyArr5 = PayLaterPaymentBreakdownScreen.c0;
                return (wj9.e) ((oi9.j) ((xj9.a) ((PayLaterPaymentBreakdownScreen) obj2).Z.getValue())).f225527c.get();
            case 23:
                y99.c cVar3 = (y99.c) ((ou5.b) obj2).e;
                if (cVar3 != null) {
                    cVar3.invoke();
                }
                return Unit.f186387a;
            case 24:
                k kVar = (k) obj2;
                kVar.getClass();
                k9 value = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                Set set = ((uih.g) kVar.b3()).f280445a;
                if (!set.isEmpty()) {
                    kVar.A2(u0.c(new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(DummyCommand.f98635a, new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountTypeAndProducts(TradingAccountType.Gia.f105270a, zhm.d0.d1(set)), null, new EndPromptParams(true, EndPromptType.TRADING), new AnalyticsProduct.Retail(value))));
                }
                return Unit.f186387a;
            case 25:
                int i3 = 13;
                int i5 = 12;
                opi.d dVar = ((l) obj2).f298581j;
                rp0.m mVarN = ((opi.b) dVar).N();
                efm.r map = mVarN.o.map(new rof.e(15, new rp0.k(mVarN, 3)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                opi.b bVar = (opi.b) dVar;
                return efm.r.mergeArray(map.map(new wl3.b(new wl3.d(i5), 11)), bVar.V().map(new wl3.b(new wl3.d(i3), i5)), bVar.R().map(new wl3.b(new wl3.d(i2), i3)));
            case 26:
                TemplatesScreen templatesScreen = (TemplatesScreen) obj2;
                KProperty[] kPropertyArr6 = TemplatesScreen.g0;
                return new z4l.j(7, zhm.u.c(new ContainerDelegate(v.k(new PlanTileDelegate(0), templatesScreen.Z, new CellDetailsDelegate(), templatesScreen.U, templatesScreen.O, templatesScreen.P, templatesScreen.Q, new PlanTileLoadingDelegate(), templatesScreen.R, templatesScreen.Y, templatesScreen.X, templatesScreen.S, new FixedTabsLoadingDelegate(), templatesScreen.W), null, 6)), z);
            case 27:
                return new z4l.j(zhm.u.c(((InAppBrowserView) obj2).f51522h), false, true, true);
            case 28:
                KProperty[] kPropertyArr7 = DateSelectorScreen.c0;
                return (i) ((ql7.v) ((DateSelectorScreen) obj2).Y.getValue()).i.get();
            default:
                ((t) obj2).X1(new mii.f("SHOT_ID_COPIED_TO_CLIPBOARD_CONFIRMATION", new TextClause("[DEV] Copied to clipboard", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 124));
                return Unit.f186387a;
        }
    }
}
