package es;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.runtime.saveable.SaveableStateRegistryWrapper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingClient;
import com.github.devnied.emvnfccard.parser.EmvTemplate;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.internal.views.chat.ChatParentLayout;
import com.revolut.core.ui_kit.internal.views.chat.ChatSwipeToReplyLayout;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_add_to_googlepay.impl.AddCardToGooglePayActivity;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.DonateWithPointsScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.document.details.AllPolicyDocumentsScreen;
import com.revolut.feature.revolutpay.impl.ui.nativetopup.RevolutPayTopUpScreen;
import com.revolut.feature.transactions.impl.ui.pending.PendingTransactionFlow;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.wealth.ui.impl.cash_balance.unsettled.UnsettledDialogController;
import com.revolut.feature.wealth.ui.impl.holding.disclaimer.cash_selector.CashHoldingsSelectorScreen;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_overall_budget.SetOverallBudgetScreen;
import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.screen.JuniorUpgradeScreen;
import com.revolut.sso.impl.ui.passkeys_management.passkeys_list.bottom_dialog.DeletePasskeyConfirmationBottomSheet;
import com.revolut.ui_kit.card_3d_scene_proxy.errors.CardSceneUnavailable;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.widgets.chip.ChipGroupView;
import com.youTransactor.uCube.rpc.Constants;
import dp4.a1;
import dp4.f1;
import ix0.l0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.f0;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f128754b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f128753a = i;
        this.f128754b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws CardSceneUnavailable {
        float fMin;
        int i = this.f128753a;
        int i2 = 2;
        int i3 = 14;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object obj2 = this.f128754b;
        switch (i) {
            case 0:
                com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar = (com.revolut.biometric_verification.impl.ui.flow.launcher.d) obj2;
                dVar.f50485s.getClass();
                yji.l.a1(dVar, dVar.V2(ds.a.c()), null, null, new eif.j(dVar, objArr == true ? 1 : 0, 28), 3);
                return Unit.f186387a;
            case 1:
                KProperty[] kPropertyArr = SetOverallBudgetScreen.g0;
                return (esj.v) ((erj.m) ((SetOverallBudgetScreen) obj2).f101561e0.getValue()).f128725h.get();
            case 2:
                ((esj.c0) obj2).v2(esj.s.f128983a);
                return Unit.f186387a;
            case 3:
                int i5 = ChatParentLayout.f56823n;
                return new l0((ChatParentLayout) obj2, f0.f322471a);
            case 4:
                return Boolean.valueOf(((ChatSwipeToReplyLayout) obj2).isDragLocked);
            case 5:
                KProperty[] kPropertyArr2 = AllPolicyDocumentsScreen.f76093b0;
                lu7.b0 b0Var = (lu7.b0) ((AllPolicyDocumentsScreen) obj2).X.getValue();
                switch (b0Var.f200070a) {
                    case 0:
                        return (ev7.f) b0Var.d.get();
                    default:
                        return (ev7.f) b0Var.d.get();
                }
            case 6:
                eve.b bVar = (eve.b) obj2;
                return new x4l.c(new a1(bVar, objArr4 == true ? 1 : 0, 21), new eu7.c(bVar, 5), new eul.f(bVar, i2), new enb.f(bVar, objArr3 == true ? 1 : 0, 26), new f1(bVar, objArr2 == true ? 1 : 0, 13));
            case 7:
                KProperty[] kPropertyArr3 = AddCardToGooglePayActivity.f64445v0;
                koi.c cVar = new koi.c(0);
                cVar.a((PromptMarketingContentDelegate) ((AddCardToGooglePayActivity) obj2).f64448t0.getValue());
                return new z4l.j(cVar, z, i3);
            case 8:
                ((exl.b) obj2).f130467a.getClass();
                try {
                    Object objNewInstance = Class.forName("com.revolut.ui_kit.card_3d_scene.filament.CardSceneComponentsFactoryImpl").getDeclaredConstructor(null).newInstance(null);
                    Intrinsics.i(objNewInstance, "null cannot be cast to non-null type com.revolut.ui_kit.card_3d_scene_proxy.factory.CardSceneComponentsFactory");
                    return (gxl.a) objNewInstance;
                } catch (Exception e) {
                    throw new CardSceneUnavailable(e);
                }
            case 9:
                KProperty[] kPropertyArr4 = JuniorUpgradeScreen.f101760a0;
                return (eyj.d) ((yxj.d) ((JuniorUpgradeScreen) obj2).U.getValue()).f317714c.get();
            case 10:
                int i6 = ChipGroupView.f;
                return (RecyclerView) ((ChipGroupView) obj2).findViewById(R$id.chipsRecycler);
            case 11:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((f0m.b) obj2).f131129a.entrySet()) {
                    char[] charArray = ((String) entry.getValue()).toCharArray();
                    Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                    for (char c2 : charArray) {
                        linkedHashMap.put(Character.valueOf(c2), entry.getKey());
                    }
                }
                return linkedHashMap;
            case 12:
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : ((f0m.d) obj2).f131133a.entrySet()) {
                    char[] charArray2 = ((String) entry2.getValue()).toCharArray();
                    Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
                    for (char c3 : charArray2) {
                        linkedHashMap2.put(Character.valueOf(c3), entry2.getKey());
                    }
                }
                return linkedHashMap2;
            case 13:
                return SaveableStateRegistryWrapper._init_$lambda$0((SaveableStateRegistryWrapper) obj2);
            case 14:
                iwg.a[] elements = {iwg.a.SECURITY, iwg.a.ROBO, iwg.a.COMMODITY, ((jte.d) ((f28.t) obj2).d).c(WealthAnalyticsApi$Toggles.CfdsAnalytics.f94966c) ? iwg.a.CFD : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            case 15:
                Object systemService = ((f5l.h) obj2).f132368a.getSystemService("window");
                Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                return (WindowManager) systemService;
            case 16:
                f63.d dVar2 = (f63.d) obj2;
                return EmvTemplate.Builder().setProvider(dVar2.f132403c).setConfig((EmvTemplate.Config) dVar2.d.getValue()).build();
            case 17:
                f7l.k kVar = (f7l.k) obj2;
                ihm.b bVarE = ihm.b.e(kVar.b());
                te0.w.x(bVarE, kVar.f132661c);
                return bVarE;
            case 18:
                return (f9c.c) ((p7c.v) ((RevolutPayTopUpScreen) obj2).N.getValue()).f233733c.get();
            case 19:
                ((com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.b) obj2).u2();
                return Unit.f186387a;
            case 20:
                int i21 = DonateWithPointsScreen.V;
                return (fb6.i) ((pa6.j) ((DonateWithPointsScreen) obj2).S.getValue()).d.get();
            case 21:
                fbg.l lVar = (fbg.l) obj2;
                yji.l.a1(lVar, lVar.X1(new mii.i("COPIED_DIALOG_ID", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, 28)), null, null, null, 7);
                return Unit.f186387a;
            case 22:
                return new fc9.g((BillingClient) ((com.revolut.feature.onboarding.impl.playbilling.e) obj2).e.getValue());
            case 23:
                fif.m mVar = (fif.m) obj2;
                lfm.c cVar2 = mVar.f135414h;
                te0.w.j0(cVar2, new ifm.a(new a08.d(mVar, 20), 0));
                efm.r rVarE = ((tif.q) mVar.f135410a).e();
                fif.c cVar3 = new fif.c(mVar, i2);
                efm.r rVarOnErrorResumeNext = rVarE.onErrorResumeNext(new zjh.c(new fa9.c(new BreadcrumbException(), i2)));
                Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
                ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.f0(11, cVar3), new a08.f0(11, fif.l.f135409a));
                Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
                te0.w.j0(cVar2, cVarSubscribe);
                return Unit.f186387a;
            case 24:
                int i22 = UnsettledDialogController.X;
                return (fkh.d) ((mkh.p) ((UnsettledDialogController) obj2).V.getValue()).i.get();
            case 25:
                int i32 = CashHoldingsSelectorScreen.U;
                return (flh.b) ((mkh.e) ((CashHoldingsSelectorScreen) obj2).S.getValue()).f206321b.get();
            case 26:
                fn5.j jVar = (fn5.j) obj2;
                return ty0.c.a(jVar.f136543g, new TextLocalisedClause(com.revolut.feature.crypto.total.wealth.impl.R$string.crypto_total_wealth_tile_title, null, null, 14), jVar.f, null, null, null, null, Constants.TAG_FC_SPEED_MODE).toString();
            case 27:
                return (fnf.a) ((gnf.b) ((PendingTransactionFlow) obj2).Q.getValue()).d.get();
            case 28:
                int i33 = DeletePasskeyConfirmationBottomSheet.T;
                return (fol.d) ((ljl.s) ((DeletePasskeyConfirmationBottomSheet) obj2).Q.getValue()).f196093b.get();
            default:
                jq0.n nVar = jq0.p.Companion;
                View view = ((fp0.p) obj2).f137029a;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                float height = view.getHeight();
                float width = view.getWidth();
                if (height <= BitmapDescriptorFactory.HUE_RED || width <= BitmapDescriptorFactory.HUE_RED) {
                    fMin = 1.04f;
                } else {
                    Context context = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    float fL = kli.a.l(context, 5.0f) * 2.0f;
                    fMin = Math.min((fL + width) / width, (height + fL) / height);
                }
                return Float.valueOf(fMin);
        }
    }
}
