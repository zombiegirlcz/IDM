package fcj;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.v3;
import com.revolut.core.ui_kit.delegates.y3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress;
import com.revolut.retail.feature.crypto_deposits.impl.R$string;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$InputData;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.CryptoDepositsOverviewFlowContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import ix0.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uj5.a f133830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xj5.c f133831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.a f133832c;
    public final bbj.c d;
    public final CryptoDepositsOverviewControllerContract$InputData e;

    public b(uj5.a blockchainUiMapper, xj5.c revolutFriendsTabUiMapper, f01.a uiKitResources, f selectNetworkDialogMapper, e mindfulOfNetworkDialogMapper, h tagDialogMapper, i viewAddressDialogMapper, bbj.c cryptoDisclaimerMapper, CryptoDepositsOverviewControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(blockchainUiMapper, "blockchainUiMapper");
        Intrinsics.checkNotNullParameter(revolutFriendsTabUiMapper, "revolutFriendsTabUiMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(selectNetworkDialogMapper, "selectNetworkDialogMapper");
        Intrinsics.checkNotNullParameter(mindfulOfNetworkDialogMapper, "mindfulOfNetworkDialogMapper");
        Intrinsics.checkNotNullParameter(tagDialogMapper, "tagDialogMapper");
        Intrinsics.checkNotNullParameter(viewAddressDialogMapper, "viewAddressDialogMapper");
        Intrinsics.checkNotNullParameter(cryptoDisclaimerMapper, "cryptoDisclaimerMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f133830a = blockchainUiMapper;
        this.f133831b = revolutFriendsTabUiMapper;
        this.f133832c = uiKitResources;
        this.d = cryptoDisclaimerMapper;
        this.e = inputData;
    }

    public static y3 b(CryptoDepositAddress cryptoDepositAddress, CircleActionButtonsBarDelegate.CircleActionButton circleActionButton) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_receive_screen_receive_copy_action, null, null, 14);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_16_copy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        boolean z = cryptoDepositAddress != null;
        CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.WhiteButton whiteButton = CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.WhiteButton.f52098a;
        CircleActionButtonsBarDelegate.CircleActionButton[] elements = {new CircleActionButtonsBarDelegate.CircleActionButton("COPY_BUTTON_ID", textLocalisedClause, resourceImage, whiteButton, (v3) null, (String) null, z, cryptoDepositAddress, 304), circleActionButton, new CircleActionButtonsBarDelegate.CircleActionButton("SHARE_BUTTON_ID", new TextLocalisedClause(R$string.crypto_receive_screen_receive_share_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_share, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), whiteButton, (v3) null, (String) null, cryptoDepositAddress != null, cryptoDepositAddress, 304)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new y3(kotlin.collections.d.L(elements), "ACTION_BUTTONS_ID", 0, R$attr.uikit_dp16, 220);
    }

    public static ListSubheaderDelegate.Model c() {
        return new ListSubheaderDelegate.Model("IMPORTANT_INFO_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.crypto_receive_screen_receive_summary_header_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, R$attr.uikit_dp8, 0, 0, 53242);
    }

    public final ArrayList a(wk5.a aVar, xi0.b bVar) {
        if (!Intrinsics.f(this.e.f, CryptoDepositsOverviewFlowContract$InputData.Source.CeFi.f100099a)) {
            ListSubheaderDelegate.Model modelC = c();
            List listL = v.l(d(aVar, bVar));
            yp0.b.k(listL, 0, R$attr.uikit_dp16, 0, 0, 29);
            return ue0.e.J(modelC, listL);
        }
        ListSubheaderDelegate.Model modelC2 = c();
        RowDelegate.Model[] elements = {new RowDelegate.Model("UNSUPPORTED_EXCHANGE_ID", new ResourceImage(R$drawable.uikit_icn_16_canceled, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 24, 24, 31), (Clause) null, 190), null, null, new TextLocalisedClause(R$string.crypto_receive_screen_unsupported_exchange_title, null, null, 14), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.crypto_receive_screen_unsupported_exchange_subtitle, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "UNSUPPORTED_EXCHANGE_LEARN_MORE_CTA_ID", false), 10))), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580), d(aVar, bVar), new RowDelegate.Model("WITHDRAW_LIMITS_ID", new ResourceImage(R$drawable.uikit_icn_24_info, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(R$string.crypto_receive_screen_info_limits_title, null, null, 14), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.crypto_receive_screen_info_limits_description, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "LIMITS_LEARN_MORE_CTA_ID", false), 10))), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL2 = kotlin.collections.d.L(elements);
        yp0.b.k(listL2, 0, R$attr.uikit_dp16, 0, 0, 29);
        return ue0.e.J(modelC2, listL2);
    }

    public final RowDelegate.Model d(wk5.a aVar, xi0.b bVar) {
        if (bVar == null || aVar == null) {
            return null;
        }
        return new RowDelegate.Model("RISK_OF_LOSS_ID", new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, new TextLocalisedClause(R$string.crypto_receive_screen_receive_summary_risk_of_loss_title, null, null, 14), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.crypto_receive_screen_risk_of_loss_network, v.k(d0.a(bVar, null), ((ik5.a) this.f133830a).b(aVar, true, Integer.valueOf(R$attr.uikit_colorGreyTone50))), null, 12), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(30, (Integer) null, (Object) null, "RISK_OF_LOSS_LEARN_MORE_CTA_ID", false), 10))), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580);
    }

    public final TextLocalisedClause e(xi0.b currency, boolean z) {
        Object textClause;
        Intrinsics.checkNotNullParameter(currency, "currency");
        int i = R$string.crypto_receive_screen_receive_header_title;
        if (z) {
            textClause = new CurrencyClause(currency, CurrencyClause.Format.Ticker.f57756a, null, 4);
        } else {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new TextLocalisedClause(i, u.c(textClause), null, 12);
    }
}
