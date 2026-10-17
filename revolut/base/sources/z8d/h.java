package z8d;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.upi.impl.screens.verify_account_prompt.VerifyAccountPromptFlowContract$Step;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.onboarding.waiting_verification.WaitingVerificationFlowContract$Step;
import com.revolut.feature.tab.credit.impl.ui.restore.CreditTabRestoreFlowContract$Step;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import do3.n;
import grl.k9;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yki.l;
import zb6.m;
import zgj.a0;
import zgj.q;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320076a;

    public /* synthetic */ h(int i) {
        this.f320076a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        switch (this.f320076a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 1:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 2:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return (List) defaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 3:
                Throwable th10 = (Throwable) obj3;
                if (((Boolean) obj2).booleanValue() || th10 == null) {
                    return null;
                }
                throw th10;
            case 4:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 5:
                Throwable th11 = (Throwable) obj2;
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                m mVar = new m(false, null, (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)));
                if (th11 != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th11, h0Var);
                }
                return mVar;
            case 6:
                l FlowCoordinator = (l) obj2;
                WaitingVerificationFlowContract$Step it8 = (WaitingVerificationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f(it8, WaitingVerificationFlowContract$Step.Await.f78511a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new PromptMarketingContentDelegate.Model("PROMPT_LIST_ID", new TextLocalisedClause(R$string.waiting_verification_prompt_title, null, null, 14), new TextLocalisedClause(R$string.waiting_verification_prompt_subtitle, null, null, 14), new PromptMarketingContentDelegate.Model.Content.MediaContent(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D362", null, null, null, 30), null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097072), null, false, false, null, 30));
            case 7:
                Throwable error2 = (Throwable) obj2;
                Set set = (Set) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (set == null) {
                    return error2;
                }
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, true);
            case 9:
                Throwable error3 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list2 == null) {
                    return error3;
                }
                return null;
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 11:
                Function1 getErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getErrorItem, "getErrorItem");
                return new zdc.h(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_order_summary_details_title, null, null, 14), (List) getErrorItem.invoke(new iii.d(14, null, false, false, null)));
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 13:
                Throwable th12 = (Throwable) obj2;
                if (((kf1.j) obj3) == null) {
                    return th12;
                }
                return null;
            case 14:
                Throwable th13 = (Throwable) obj2;
                if (((Boolean) obj3) == null) {
                    return th13;
                }
                return null;
            case 15:
                Collection collection = (List) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(list3, "new");
                if (collection == null) {
                    collection = f0.f322471a;
                }
                return d0.E0(list3, collection);
            case 16:
                Function1 defaultErrorMapper = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorMapper, "defaultErrorMapper");
                return (List) defaultErrorMapper.invoke(new iii.d(14, null, true, false, null));
            case 17:
                Function1 defaultErrorMapper2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorMapper2, "defaultErrorMapper");
                return (List) defaultErrorMapper2.invoke(new iii.d(14, null, true, false, null));
            case 18:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                VerifyAccountPromptFlowContract$Step step = (VerifyAccountPromptFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!Intrinsics.f(step, VerifyAccountPromptFlowContract$Step.BottomSheet.f63016a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lw0.a aVar = new lw0.a(new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.india_topup_verify_bank_account_explainer_title, null, null, 14), null, new lw0.b(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D158", null, null, null, 30), null), null, false, 26);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.india_topup_verify_bank_account_explainer_primary_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.india_topup_verify_bank_account_explainer_step1_title, null, null, 14);
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                boolean z = false;
                Clause clause = null;
                boolean z3 = false;
                Object[] objArr = 0 == true ? 1 : 0;
                eii.l lVar = new eii.l((Clause) textLocalisedClause, clause, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_send, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, z, null, false, 62), z3, z, (RowDelegate.Model.c) objArr, (Object) null, 488);
                Object[] objArr2 = 0 == true ? 1 : 0;
                boolean z4 = false;
                Object[] objArr3 = 0 == true ? 1 : 0;
                Object[] objArr4 = 0 == true ? 1 : 0;
                Clause clause2 = null;
                boolean z6 = false;
                Object[] objArr5 = 0 == true ? 1 : 0;
                List listK = v.k(lVar, new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.india_topup_verify_bank_account_explainer_step2_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.india_topup_verify_bank_account_explainer_step2_subtitle, null, null, 14), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_notification_badge, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, z, objArr2, false, 62), z4, z, (RowDelegate.Model.c) objArr3, (Object) null, 488), new eii.l((Clause) new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.india_topup_verify_bank_account_explainer_step3_title, null, null, 14), clause2, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_circle_check, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, z, objArr4, false, 62), z6, z, (RowDelegate.Model.c) objArr5, (Object) null, 488));
                k9 k9Var = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new RowActionsBottomSheetController(new eii.c(aVar, eVar, listK, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null));
            case 19:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                q.Companion.getClass();
                return new a0(null, (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null)), q.f322171c);
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 21:
                Throwable error4 = (Throwable) obj2;
                TradingAccounts tradingAccounts = (TradingAccounts) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (tradingAccounts == null) {
                    return error4;
                }
                return null;
            case 22:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                return f0.f322471a;
            case 23:
                Throwable error5 = (Throwable) obj2;
                n nVar = (n) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (nVar == null) {
                    return error5;
                }
                return null;
            case 24:
                yki.b LazyFlowCoordinator2 = (yki.b) obj2;
                CreditTabRestoreFlowContract$Step step2 = (CreditTabRestoreFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (Intrinsics.f(step2, CreditTabRestoreFlowContract$Step.Restore.f89771a)) {
                    throw new IllegalStateException("CreditTabRestoreFlow restores the Credit tab via the main container and shows no in-flow step");
                }
                throw new NoWhenBranchMatchedException();
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, false);
            case 26:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
            case 27:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, false, true, null));
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
        }
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f320076a = i;
    }
}
