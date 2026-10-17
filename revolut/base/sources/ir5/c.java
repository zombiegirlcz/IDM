package ir5;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.xh0;
import java.time.Instant;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.l;
import zhm.v;
import zq5.f0;
import zq5.g0;
import zq5.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr5.a f168007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sj5.b f168008b;

    public c(gr5.a commonRecipientsMapper, sj5.b cryptoRemittanceValuesShortener) {
        Intrinsics.checkNotNullParameter(commonRecipientsMapper, "commonRecipientsMapper");
        Intrinsics.checkNotNullParameter(cryptoRemittanceValuesShortener, "cryptoRemittanceValuesShortener");
        this.f168007a = commonRecipientsMapper;
        this.f168008b = cryptoRemittanceValuesShortener;
    }

    public static SwipeToActionDelegate.SwipeAction a(f0 f0Var, boolean z) {
        return new SwipeToActionDelegate.SwipeAction(j6.a.q("CryptoSendWalletsListController_SwipeAction_Details_", f0Var.f324378a.f71059a), new ResourceImage(R$drawable.uikit_icn_24_info, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.crypto_withdrawals_screen_swipe_action_details, null, null, 14), z ? xh0.NEUTRAL : xh0.PRIMARY, null, f0Var, null, 80);
    }

    public final l b(h0 recipient) {
        List listK;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        if (!(recipient instanceof f0)) {
            if (!(recipient instanceof g0)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((g0) recipient).f324382a;
            return new RowDelegate.Model("CRYPTO_SEND_WALLETS_UNKNOWN_COMPATIBLE_ADDRESS_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_overview_header_all_title, null, null, 14), new TextClause(((hk5.b) this.f168008b).a(str), (Style) null, (Integer) null, false, (o9) null, (List) null, 126))), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new g0(str), null, 0, 0, 0, 0, 532676600);
        }
        f0 f0Var = (f0) recipient;
        CryptoAddress cryptoAddress = f0Var.f324378a;
        String str2 = cryptoAddress.f71059a;
        if (!f0Var.f324380c) {
            return null;
        }
        String strQ = j6.a.q("CryptoSendWalletsListController_SwipeToAction_", str2);
        ko5.a aVarE = CryptoAddress.e(cryptoAddress, 0, 3);
        String strQ2 = j6.a.q("CRYPTO_SEND_WALLETS_ADDRESS_ITEM_ID", str2);
        ContactImage contactImage = new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, aVarE.a(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
        Image image = (Image) bp5.c.f17561c.getValue();
        Instant instant = cryptoAddress.o;
        gr5.a aVar = this.f168007a;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(contactImage, image, null, aVar.a(instant), 20);
        TextClause textClause = new TextClause(aVarE.f186223a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = R$attr.uikit_dp16;
        RowDelegate.Model modelB = aVar.b(aVar.c(new RowDelegate.Model(strQ2, image40, textClause, null, 0, null, null, null, 1, null, false, null, false, null, null, null, null, null, null, f0Var, null, i, i, 0, 0, 482344664), f0Var.f324379b), instant, R$string.crypto_withdrawals_screen_wallets_list_subtitles_tap_to_send);
        int i2 = b.f168006a[cryptoAddress.f71062g.ordinal()];
        if (i2 == 1) {
            listK = v.k(a(f0Var, true), new SwipeToActionDelegate.SwipeAction(j6.a.q("CryptoSendWalletsListController_SwipeAction_Send_", str2), new ResourceImage(R$drawable.uikit_icn_24_arrow_send, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.crypto_withdrawals_screen_swipe_action_send, null, null, 14), xh0.PRIMARY, null, f0Var, null, 80));
        } else if (i2 == 2 || i2 == 3) {
            listK = v.k(new SwipeToActionDelegate.SwipeAction(j6.a.q("CryptoSendWalletsListController_SwipeAction_Delete_", str2), new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.crypto_withdrawals_screen_swipe_action_delete, null, null, 14), xh0.NEGATIVE, null, f0Var, null, 80), a(f0Var, false));
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            listK = zhm.f0.f322471a;
        }
        return new wh(strQ, modelB, listK, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public final RowDelegate.Model c(f0 f0Var) {
        CryptoAddress cryptoAddress = f0Var.f324378a;
        ko5.a aVarE = CryptoAddress.e(cryptoAddress, 0, 3);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, aVarE.a(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), (Image) bp5.c.f17561c.getValue(), null, this.f168007a.a(cryptoAddress.o), 20);
        TextClause textClause = new TextClause(aVarE.f186223a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = aVarE.f186224b;
        TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        int i = R$attr.uikit_dp16;
        boolean z = f0Var.f324380c;
        return new RowDelegate.Model("CRYPTO_SEND_WALLETS_ADDRESS_ITEM_ID", image40, textClause, null, 0, textClause2, null, null, 1, null, z, null, false, z ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, null, f0Var, null, i, i, 0, 0, 482326232);
    }
}
