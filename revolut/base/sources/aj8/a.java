package aj8;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.a0;
import com.revolut.core.ui_kit.models.g0;
import com.revolut.core.ui_kit.models.s;
import com.revolut.core.ui_kit.models.y;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import com.revolut.feature.junior_payment_links.impl.R$string;
import i80.c;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import xi8.b;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f5523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f5524b;

    public a(fkg.a qrCodeGenerator, b juniorPaymentLinkSharingInteractor) {
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(juniorPaymentLinkSharingInteractor, "juniorPaymentLinkSharingInteractor");
        this.f5523a = qrCodeGenerator;
        this.f5524b = juniorPaymentLinkSharingInteractor;
    }

    public final ProfileCardModel.Error a() {
        return new ProfileCardModel.Error(new TextLocalisedClause(R$string.junior_payment_links_qr_screen_error_title, null, null, 14), new TextLocalisedClause(R$string.junior_payment_links_qr_screen_error_subtitle, null, null, 14), new a0(new TextLocalisedClause(R$string.junior_payment_links_qr_screen_error_action_retry, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_retry, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.revolut.core.ui_kit.models.CompositeClause] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r15v10, types: [com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final ProfileCardModel.Loaded b(si8.a cardInfo) {
        char c2;
        char c3;
        int i;
        ?? r110;
        CompositeClause compositeClause;
        TextLocalisedClause textLocalisedClause;
        ?? compositeClause2;
        ActionsView.Item item;
        Intrinsics.checkNotNullParameter(cardInfo, "cardInfo");
        String str = cardInfo.e;
        String str2 = cardInfo.f263526b;
        PaymentLinkCustomAmountBundle paymentLinkCustomAmountBundle = cardInfo.f;
        b bVar = this.f5524b;
        i80.a aVarL = fkg.a.l(this.f5523a, bVar.a(str, paymentLinkCustomAmountBundle), new h90.a(33, 33), c.H, i80.b.QR_CODE, null, 36);
        g0 g0Var = new g0(new QrCodeImage(aVarL.f159408a, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(900, mif.a.w(aVarL, 36), new QrCodeAppearance.Layer.Image(new ContactImage(cardInfo.f263525a, (String) null, (String) null, (String) null, (String) null, cardInfo.f263527c, (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550), true)), new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28));
        Float fValueOf = Float.valueOf(16.0f);
        if (paymentLinkCustomAmountBundle.a()) {
            c2 = 1;
            c3 = 0;
            r110 = 0;
            i = 12;
            compositeClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.junior_payment_links_qr_screen_content_copy_username, u.c(cardInfo.d), null, 12), new ImageClause(R$drawable.uikit_icn_16_copy, (Integer) null, fValueOf, fValueOf, 18)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        } else {
            c2 = 1;
            c3 = 0;
            i = 12;
            r110 = 0;
            compositeClause = new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_16_copy, (Integer) null, fValueOf, fValueOf, 18), new TextLocalisedClause(R$string.junior_payment_links_qr_screen_content_copy_link, u.c(bVar.a(str, paymentLinkCustomAmountBundle)), null, 12)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.junior_payment_links_qr_screen_explanation_subtitle, u.c(str2), r110, i);
        ?? r112 = !paymentLinkCustomAmountBundle.a() ? paymentLinkCustomAmountBundle : r110;
        if (r112 != 0) {
            String str3 = r112.f77074b;
            ?? r152 = r112;
            textLocalisedClause = textLocalisedClause2;
            ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_24_pencil, Integer.valueOf(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16);
            int i2 = (!d0.W(str3) ? str3 : r110) == 0 ? R$string.junior_payment_links_qr_screen_action_text_amount : R$string.junior_payment_links_qr_screen_action_text_amount_with_note;
            Object[] elements = {new MoneyClause(r152.f77073a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), !d0.W(str3) ? str3 : r110};
            Intrinsics.checkNotNullParameter(elements, "elements");
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i2, d.L(elements), r110, i);
            Clause[] clauseArr = new Clause[2];
            clauseArr[c3] = imageClause;
            clauseArr[c2] = textLocalisedClause3;
            compositeClause2 = new CompositeClause(v.k(clauseArr), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        } else {
            textLocalisedClause = textLocalisedClause2;
            compositeClause2 = r110;
        }
        s sVar = new s(17, compositeClause, compositeClause2, textLocalisedClause);
        if (paymentLinkCustomAmountBundle.a()) {
            item = new ActionsView.Item("LIST_ID_FOOTER_ACTION_CUSTOM_AMOUNT", mx0.d.INVERTED_PRIMARY, false, null, null, new TextLocalisedClause(R$string.junior_payment_links_qr_screen_buttons_custom_amount, r110, r110, 14), new ResourceImage(R$drawable.uikit_icn_24_pencil, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new ri8.b(paymentLinkCustomAmountBundle), null, 24476);
        } else {
            item = new ActionsView.Item("LIST_ID_FOOTER_ACTION_CUSTOM_AMOUNT", mx0.d.INVERTED_PRIMARY, false, null, null, new TextLocalisedClause(R$string.junior_payment_links_qr_screen_buttons_cancel_amount, r110, r110, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, ri8.a.f254566a, null, 24476);
        }
        return new ProfileCardModel.Loaded(null, g0Var, sVar, new y(v.k(item, new ActionsView.Item("LIST_ID_FOOTER_ACTION_SHARE_LINK", mx0.d.INVERTED_PRIMARY, false, null, null, new TextLocalisedClause(R$string.junior_payment_links_qr_screen_buttons_share_link, r110, r110, 14), new ResourceImage(R$drawable.uikit_icn_24_share_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new ri8.c(str2, bVar.a(str, paymentLinkCustomAmountBundle)), null, 24476))), null, 113);
    }
}
