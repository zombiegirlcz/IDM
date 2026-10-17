package jul;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import com.revolut.feature.statements.R$string;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import hul.q;
import hzb.v;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k0e.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178681a;

    public /* synthetic */ c(int i) {
        this.f178681a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f178681a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new q(61, m.a());
            case 3:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 4:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return null;
            case 5:
                return new SplitAccountsItemGroup.ErrorGroup(new SplitAccountsItemGroup.ErrorItem());
            case 6:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 8:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return i2b.a.p((List) getDefaultErrorItems2.invoke(new iii.d(6, jwf.d.RETRY, true, false, null)), nvf.l.a());
            case 9:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
            case 10:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 11:
                Throwable error2 = (Throwable) obj2;
                TradingAccounts tradingAccounts = (TradingAccounts) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (tradingAccounts == null) {
                    return error2;
                }
                return null;
            case 12:
                Throwable error3 = (Throwable) obj2;
                TradingAccounts tradingAccounts2 = (TradingAccounts) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (tradingAccounts2 == null) {
                    return error3;
                }
                return null;
            case 13:
                Throwable th10 = (Throwable) obj2;
                if (((TradingAccounts) obj3) == null) {
                    return th10;
                }
                return null;
            case 14:
                Throwable error4 = (Throwable) obj2;
                TradingOnboardingFeatureConfig.TradingAccountOrType tradingAccountOrType = (TradingOnboardingFeatureConfig.TradingAccountOrType) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (tradingAccountOrType == null) {
                    return error4;
                }
                return null;
            case 15:
                y0 oldStatusDialog = (y0) obj2;
                y0 newStatusDialog = (y0) obj3;
                Intrinsics.checkNotNullParameter(oldStatusDialog, "oldStatusDialog");
                Intrinsics.checkNotNullParameter(newStatusDialog, "newStatusDialog");
                return Boolean.valueOf(!(newStatusDialog.f216244b instanceof z) && Intrinsics.f(oldStatusDialog, newStatusDialog));
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 18:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new v((List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null)));
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 22:
                Throwable th11 = (Throwable) obj2;
                if (((t61.g) obj3) == null) {
                    return th11;
                }
                return null;
            case 23:
                CryptoOrderDraft oldDraft = (CryptoOrderDraft) obj2;
                CryptoOrderDraft newDraft = (CryptoOrderDraft) obj3;
                Intrinsics.checkNotNullParameter(oldDraft, "oldDraft");
                Intrinsics.checkNotNullParameter(newDraft, "newDraft");
                return Boolean.valueOf(Intrinsics.f(oldDraft.f96689a.f96683a, newDraft.f96689a.f96683a));
            case 24:
                Throwable error5 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list == null) {
                    return error5;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return h.a.f180028a;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new TextLocalisedClause(R$string.savings_statements_footer, null, null, 14);
            case 27:
                Throwable error6 = (Throwable) obj2;
                a2a.d dVar = (a2a.d) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (dVar == null) {
                    return error6;
                }
                return null;
            case 28:
                Throwable error7 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (model == null) {
                    return error7;
                }
                return null;
            default:
                Throwable error8 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model2 = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (model2 == null) {
                    return error8;
                }
                return null;
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f178681a = i;
    }
}
