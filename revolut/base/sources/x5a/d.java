package x5a;

import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeVoucherTileDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.WithdrawalCodeDetailsScreen;
import com.revolut.feature.apm.spin.impl.ui.settings.SpinSettingsScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.split_by_currency.SplitByCurrencyScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.debts.hub.DebtsHubScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.documents.viewer.CreditApplicationDocumentViewerActivity;
import com.revolut.feature.donations.impl.ui.kompot.screen.collection.details.CharitiesCollectionDetailsScreen;
import com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.WaitingListAwaitingScreen;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock;
import com.revolut.feature.wealth.gia.margin_trading.impl.R$string;
import hi9.g;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.d1;
import qlm.e;
import qlm.v1;
import xda.d0;
import xda.p;
import xda.v0;
import yy0.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302924a;

    public /* synthetic */ d(int i) {
        this.f302924a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f302924a) {
            case 0:
                ProviderBlock.ExpandableVerticalList.Companion companion = ProviderBlock.ExpandableVerticalList.INSTANCE;
                return new e(ProviderBlock.INSTANCE.serializer());
            case 1:
                ProviderBlock.Grid.Companion companion2 = ProviderBlock.Grid.INSTANCE;
                return new e(Provider.a.f80223a);
            case 2:
                return new d1("MERCHANT_NOT_FOUND", ProviderBlock.MerchantNotFound.INSTANCE, new Annotation[]{new g(27)});
            case 3:
                return new d1("NO_RESULTS", ProviderBlock.NoResults.INSTANCE, new Annotation[]{new g(27)});
            case 4:
                return new d1("com.revolut.feature.payments_migration.impl.models.providers.ProviderBlock.Unknown", ProviderBlock.Unknown.INSTANCE, new Annotation[]{new g(27)});
            case 5:
                ProviderBlock.VerticalList.Companion companion3 = ProviderBlock.VerticalList.INSTANCE;
                return new e(Provider.a.f80223a);
            case 6:
                List listC = u.c(new RowDelegate.Model("GiaMarginEntryPoint", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_credit_bag, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.trading_cash_balance_margin_upsellItem_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.trading_cash_balance_margin_upsellItem_subtitle, null, null, 14), null, null, 0, new tf(new j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone10), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, x6h.e.f303103a, null, 0, 0, 0, 0, 532675544));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 7:
                return new e(x7g.a.f303192a);
            case 8:
                KProperty[] kPropertyArr = WithdrawalCodeDetailsScreen.W;
                return new RowDelegate(null, null, 7);
            case 9:
                KProperty[] kPropertyArr2 = WithdrawalCodeDetailsScreen.W;
                return new CellDetailsChevronDelegate();
            case 10:
                KProperty[] kPropertyArr3 = WithdrawalCodeDetailsScreen.W;
                return new ActionsDelegate();
            case 11:
                KProperty[] kPropertyArr4 = WithdrawalCodeDetailsScreen.W;
                return new FullScreenStateDelegate();
            case 12:
                KProperty[] kPropertyArr5 = DebtsHubScreen.f67442e0;
                return new RowDelegate(null, null, 7);
            case 13:
                int i = CreditApplicationDocumentViewerActivity.z0;
                return new WebViewDelegate();
            case 14:
                int i2 = CreditApplicationDocumentViewerActivity.z0;
                return new LargeActionButtonDelegate();
            case 15:
                return Unit.f186387a;
            case 16:
                KProperty[] kPropertyArr6 = CharitiesCollectionDetailsScreen.c0;
                return new LargeVoucherTileDelegate();
            case 17:
                KProperty[] kPropertyArr7 = CharitiesCollectionDetailsScreen.c0;
                return new FullScreenStateDelegate();
            case 18:
                WaitingListAwaitingScreen.a aVar = WaitingListAwaitingScreen.Companion;
                return new PromptMarketingContentDelegate();
            case 19:
                return Unit.f186387a;
            case 20:
                KProperty[] kPropertyArr8 = SpinSettingsScreen.R;
                return new RowDelegate(null, null, 7);
            case 21:
                KProperty[] kPropertyArr9 = SpinSettingsScreen.R;
                return new FullScreenStateDelegate();
            case 22:
                KProperty[] kPropertyArr10 = SplitByCurrencyScreen.f65732b0;
                return v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate());
            case 23:
                return new e(v1.f247718a);
            case 24:
                return new e(v0.f304370a);
            case 25:
                return new e(p.f304355a);
            case 26:
                return new e(d0.f304314a);
            case 27:
                return new e(xda.v.f304369a);
            case 28:
                return new e(xda.j.f304334a);
            default:
                return new e(v1.f247718a);
        }
    }
}
