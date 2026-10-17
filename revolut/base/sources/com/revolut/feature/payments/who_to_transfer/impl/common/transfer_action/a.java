package com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action;

import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmAani;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.api.product.ApmPayId;
import com.revolut.feature.apm.core.api.product.ApmPix;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.api.product.ApmSpin;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.bank_transfer.models.PaymentVendor;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import com.revolut.revolut.feature_fourthline_impl.R;
import hx7.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import ms0.i4;
import nya.b0;
import o2g.f;
import qv0.i;
import wp5.y;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static LayeredImage d(int i) {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i2 = R$attr.uikit_colorAccentNeutral;
        return y.h(new Color.Solid(i2), 0.1f, companion, i, new Color.Solid(i2));
    }

    public static TextLocalisedClause f(ApmProduct apmProduct) {
        return new TextLocalisedClause(R$string.apm_contacts_create_new, u.c(apmProduct.e()), null, 12);
    }

    public final RowDelegate.Model a(int i, Integer num, LayeredImage layeredImage, WhoToTransferActionItem whoToTransferActionItem) {
        return b(new TextLocalisedClause(i, null, null, 14), num != null ? new TextLocalisedClause(num.intValue(), null, null, 14) : null, layeredImage, whoToTransferActionItem);
    }

    public final RowDelegate.Model b(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, LayeredImage layeredImage, WhoToTransferActionItem whoToTransferActionItem) {
        return new RowDelegate.Model(h(whoToTransferActionItem), new RowDelegate.Model.MainImage.Image40(layeredImage, null, null, false, null, false, 62), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, whoToTransferActionItem, null, 0, 0, 0, 0, 532676568);
    }

    public final RowDelegate.Model c(ApmProduct apmProduct, WhoToTransferActionItem whoToTransferActionItem) {
        return b(f(apmProduct), null, d(apmProduct.d()), whoToTransferActionItem);
    }

    public final i e(WhoToTransferActionItem transferActionItem) {
        Intrinsics.checkNotNullParameter(transferActionItem, "transferActionItem");
        if (transferActionItem instanceof WhoToTransferActionItem.AddNewRecipient) {
            return a(R$string.who_to_pay_new_recipient_new_recipient_title, null, d(R$drawable.uikit_icn_24_plus), (WhoToTransferActionItem.AddNewRecipient) transferActionItem);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.BankRecipient) {
            return a(R$string.who_to_pay_new_recipient_bank_title, null, d(R$drawable.uikit_icn_24_bank), WhoToTransferActionItem.BankRecipient.f80085a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.AddBankRecipient) {
            return a(R$string.who_to_pay_new_recipient_add_bank_title, Integer.valueOf(R$string.who_to_pay_new_recipient_bank_subtitle), d(R$drawable.uikit_icn_24_bank), WhoToTransferActionItem.AddBankRecipient.f80057a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.AddMobileWalletRecipient) {
            WhoToTransferActionItem.AddMobileWalletRecipient addMobileWalletRecipient = (WhoToTransferActionItem.AddMobileWalletRecipient) transferActionItem;
            return b(new TextLocalisedClause(R$string.who_to_pay_new_recipient_transfer_vendor_title, u.c(addMobileWalletRecipient.f80062a.f64080b), null, 12), new TextLocalisedClause(R$string.who_to_pay_new_recipient_bank_subtitle, null, null, 14), d(R$drawable.uikit_icn_24_bank), addMobileWalletRecipient);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.CardRecipient) {
            return a(R$string.who_to_pay_new_recipient_send_to_card_title, null, d(R$drawable.uikit_icn_24_card), WhoToTransferActionItem.CardRecipient.f80086a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.AddCardRecipient) {
            return a(R$string.who_to_pay_new_recipient_add_card_title, Integer.valueOf(R$string.who_to_pay_new_recipient_add_card_subtitle), d(R$drawable.uikit_icn_24_card), WhoToTransferActionItem.AddCardRecipient.f80058a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.NewCryptoAddress) {
            return a(R$string.who_to_pay_new_recipient_crypto_title, null, d(R$drawable.uikit_icn_24_wallet), WhoToTransferActionItem.NewCryptoAddress.f80095a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.AddNewCryptoAddress) {
            return a(R$string.who_to_pay_new_recipient_crypto_add_title, Integer.valueOf(R$string.who_to_pay_new_recipient_crypto_subtitle), d(R$drawable.uikit_icn_24_wallet), WhoToTransferActionItem.AddNewCryptoAddress.f80063a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.Group) {
            return a(R$string.who_to_pay_new_recipient_create_group_title, null, d(R$drawable.uikit_icn_24_people), WhoToTransferActionItem.Group.f80093a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.CreateGroup) {
            return a(R$string.who_to_pay_new_recipient_create_new_group_title, Integer.valueOf(R$string.who_to_pay_new_recipient_create_group_subtitle), d(R$drawable.uikit_icn_24_people), WhoToTransferActionItem.CreateGroup.f80090a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.AddContact) {
            return a(R$string.who_to_pay_new_recipient_contact_title, Integer.valueOf(R$string.who_to_pay_new_recipient_contact_subtitle), d(R$drawable.uikit_icn_24_add_contact), WhoToTransferActionItem.AddContact.f80060a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.AddFriend) {
            return a(R$string.who_to_pay_new_recipient_add_friend_title, null, d(R$drawable.uikit_icn_24_logo_revolut), WhoToTransferActionItem.AddFriend.f80061a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.SearchAddFriend) {
            return a(R$string.who_to_pay_new_recipient_revolut_friend_title, null, d(R$drawable.uikit_icn_24_add_contact), WhoToTransferActionItem.SearchAddFriend.f80102a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.Remittance) {
            return a(com.revolut.retail.feature.payments.core.R$string.payments_new_transfer_remittance_button_title, Integer.valueOf(com.revolut.retail.feature.payments.core.R$string.payments_new_transfer_remittance_button_subtitle), d(R$drawable.uikit_icn_24_globe), WhoToTransferActionItem.Remittance.f80101a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.PaymentLink) {
            return a(R$string.who_to_pay_new_transfer_payment_link_action_title, Integer.valueOf(R$string.payments_new_transfer_create_payment_link_button_subtitle), d(R$drawable.uikit_icn_24_link), WhoToTransferActionItem.PaymentLink.f80097a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.CharityDonation) {
            return a(R$string.who_to_pay_new_recipient_donate_to_charity_title, Integer.valueOf(R$string.who_to_pay_new_recipient_donate_to_charity_subtitle), d(R$drawable.uikit_icn_24_heart), WhoToTransferActionItem.CharityDonation.f80087a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.CharityList) {
            return a(R$string.payments_common_empty_charities_title, Integer.valueOf(R$string.payments_common_empty_charities_description), d(R$drawable.uikit_icn_24_heart), WhoToTransferActionItem.CharityList.f80088a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.CheckRecipient) {
            return a(R$string.who_to_pay_new_recipient_send_check_title, Integer.valueOf(R$string.who_to_pay_new_recipient_send_check_subtitle), d(R$drawable.uikit_icn_24_cheque), WhoToTransferActionItem.CheckRecipient.f80089a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.AddCheckRecipient) {
            return a(R$string.who_to_pay_new_recipient_add_check_title, Integer.valueOf(R$string.who_to_pay_new_recipient_send_check_subtitle), d(R$drawable.uikit_icn_24_cheque), WhoToTransferActionItem.AddCheckRecipient.f80059a);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.ApmAani) {
            return c(ApmAani.f61807c, transferActionItem);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.ApmBizum) {
            return c(ApmBizum.f61808c, transferActionItem);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.ApmBlik) {
            return c(ApmBlik.f61809c, transferActionItem);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.ApmBreb) {
            return c(ApmBreb.f61810c, transferActionItem);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.ApmIris) {
            return c(ApmIris.f61811c, transferActionItem);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.ApmMultibanco) {
            return c(ApmMultibanco.f61815c, transferActionItem);
        }
        if (transferActionItem instanceof WhoToTransferActionItem.ApmMultibancoViaVerde) {
            return null;
        }
        if (transferActionItem instanceof WhoToTransferActionItem.ApmPayId) {
            return c(ApmPayId.f61819c, transferActionItem);
        }
        if (!(transferActionItem instanceof WhoToTransferActionItem.ApmQvik) && !(transferActionItem instanceof WhoToTransferActionItem.ApmQvikSecId)) {
            if (transferActionItem instanceof WhoToTransferActionItem.ApmSpin) {
                return c(ApmSpin.f61827c, transferActionItem);
            }
            if (transferActionItem instanceof WhoToTransferActionItem.ApmUpi) {
                return c(ApmUpi.f61828c, transferActionItem);
            }
            if (transferActionItem instanceof WhoToTransferActionItem.ApmWero) {
                return c(ApmWero.f61829c, transferActionItem);
            }
            if (transferActionItem instanceof WhoToTransferActionItem.ApmPix) {
                int i = R$string.pix_entry_new_contact;
                ApmPix.f61820c.getClass();
                return a(i, null, d(R$drawable.uikit_icn_24_logo_pix_outline), WhoToTransferActionItem.ApmPix.f80078a);
            }
            if (transferActionItem instanceof WhoToTransferActionItem.PayBillsTaxes) {
                return a(R$string.who_to_pay_new_recipient_pay_bills_taxes_title, Integer.valueOf(R$string.who_to_pay_new_recipient_pay_bills_taxes_subtitle), d(R$drawable.uikit_icn_24_documents_pair), WhoToTransferActionItem.PayBillsTaxes.f80096a);
            }
            if (transferActionItem instanceof WhoToTransferActionItem.PhoneTopUps) {
                return a(R$string.who_to_pay_new_recipient_top_ups_title, null, d(R$drawable.uikit_icn_24_smartphone_add), WhoToTransferActionItem.PhoneTopUps.f80099a);
            }
            if (transferActionItem instanceof WhoToTransferActionItem.ApmBillsBpay) {
                return a(R$string.who_to_pay_new_recipient_bpay_title, Integer.valueOf(R$string.who_to_pay_new_recipient_bpay_subtitle), d(R$drawable.uikit_icn_24_bpay), WhoToTransferActionItem.ApmBillsBpay.f80068a);
            }
            if (transferActionItem instanceof WhoToTransferActionItem.ApmBillsPagoPA) {
                return a(com.revolut.feature.apm.bills.pagopa.api.R$string.pago_pa_action_title, Integer.valueOf(com.revolut.feature.apm.bills.pagopa.api.R$string.pago_pa_action_subtitle), d(R$drawable.uikit_icn_24_documents_pair), WhoToTransferActionItem.ApmBillsPagoPA.f80070a);
            }
            if (transferActionItem instanceof WhoToTransferActionItem.ApmPostalCheck) {
                return a(R$string.who_to_pay_new_recipient_tile_yellow_check, null, d(R$drawable.uikit_icn_24_qr), WhoToTransferActionItem.ApmPostalCheck.f80079a);
            }
            if (transferActionItem instanceof WhoToTransferActionItem.AllPaymentVendors) {
                WhoToTransferActionItem whoToTransferActionItem = WhoToTransferActionItem.AllPaymentVendors.f80066a;
                return new SmallActionButtonDelegate.Model(h(whoToTransferActionItem), h4.FLAT, null, null, new TextLocalisedClause(R.string.common_action_see_more, null, null, 14), null, new i4(), whoToTransferActionItem, null, 0, 0, 0, 0, 32088);
            }
            if (transferActionItem instanceof WhoToTransferActionItem.FavoritePaymentVendor) {
                WhoToTransferActionItem.FavoritePaymentVendor favoritePaymentVendor = (WhoToTransferActionItem.FavoritePaymentVendor) transferActionItem;
                PaymentVendor paymentVendor = favoritePaymentVendor.f80091a;
                String str = paymentVendor.f64079a;
                TextClause textClause = new TextClause(paymentVendor.f64080b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                UrlImage urlImage = new UrlImage(paymentVendor.f64081c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, null, new CustomColors(1, null, new Color.Solid(R$attr.uikit_colorAccent)), gz0.b.CenterInside, null, 24, 24, 19), null, null, false, false, 507902);
                CircleBadgeModel circleBadgeModel = null;
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(urlImage, circleBadgeModel, null, false, null, false, 62);
                int i2 = R$attr.uikit_dp8;
                return new RowDelegate.Model(str, image40, textClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, favoritePaymentVendor, null, i2, i2, 0, 0, 482344952);
            }
            if (transferActionItem instanceof WhoToTransferActionItem.GiroDirectDebits) {
                return a(R$string.who_to_pay_new_recipient_tile_giro, null, d(R$drawable.uikit_icn_24_recurring), WhoToTransferActionItem.GiroDirectDebits.f80092a);
            }
            if (transferActionItem instanceof WhoToTransferActionItem.MasavDirectDebits) {
                return a(R$string.who_to_pay_new_recipient_tile_masav_direct_debit, null, d(R$drawable.uikit_icn_24_recurring), WhoToTransferActionItem.MasavDirectDebits.f80094a);
            }
            if (!(transferActionItem instanceof WhoToTransferActionItem.ApmBillsF24) && !(transferActionItem instanceof WhoToTransferActionItem.PermissionContact) && !(transferActionItem instanceof WhoToTransferActionItem.QrCode) && !(transferActionItem instanceof WhoToTransferActionItem.Alipay)) {
                throw new NoWhenBranchMatchedException();
            }
            e.n(new NotImplementedError(p.a.p("Action `", h(transferActionItem), "` is not supposed to be used here")));
            return null;
        }
        return c(ApmQvik.f61823c, transferActionItem);
    }

    public final RowDelegate.Model g(WhoToTransferActionItem transferActionItem) throws Throwable {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(transferActionItem, "transferActionItem");
        if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.BankRecipient.f80085a) || Intrinsics.f(transferActionItem, WhoToTransferActionItem.AddBankRecipient.f80057a)) {
            textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_new_recipient_add_bank_title, null, null, 14);
        } else if (transferActionItem instanceof WhoToTransferActionItem.AddMobileWalletRecipient) {
            textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_new_recipient_transfer_vendor_title, u.c(((WhoToTransferActionItem.AddMobileWalletRecipient) transferActionItem).f80062a.f64080b), null, 12);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.AddContact.f80060a)) {
            textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_new_recipient_contact_title, null, null, 14);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.CardRecipient.f80086a) || Intrinsics.f(transferActionItem, WhoToTransferActionItem.AddCardRecipient.f80058a)) {
            textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_new_recipient_add_card_title, null, null, 14);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.CheckRecipient.f80089a) || Intrinsics.f(transferActionItem, WhoToTransferActionItem.AddCheckRecipient.f80059a)) {
            textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_new_recipient_add_check_title, null, null, 14);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.NewCryptoAddress.f80095a) || Intrinsics.f(transferActionItem, WhoToTransferActionItem.AddNewCryptoAddress.f80063a)) {
            textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_new_recipient_crypto_add_title, null, null, 14);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmAani.f80067a)) {
            textLocalisedClause = f(ApmAani.f61807c);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmBizum.f80071a)) {
            textLocalisedClause = f(ApmBizum.f61808c);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmBlik.f80072a)) {
            textLocalisedClause = f(ApmBlik.f61809c);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmBreb.f80073a)) {
            textLocalisedClause = f(ApmBreb.f61810c);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmIris.f80074a)) {
            textLocalisedClause = f(ApmIris.f61811c);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmMultibanco.f80075a)) {
            textLocalisedClause = f(ApmMultibanco.f61815c);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmPayId.f80077a)) {
            textLocalisedClause = f(ApmPayId.f61819c);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmQvik.f80080a) || Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmQvikSecId.f80081a)) {
            textLocalisedClause = f(ApmQvik.f61823c);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmSpin.f80082a)) {
            textLocalisedClause = f(ApmSpin.f61827c);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmUpi.f80083a)) {
            textLocalisedClause = f(ApmUpi.f61828c);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmWero.f80084a)) {
            textLocalisedClause = f(ApmWero.f61829c);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmPix.f80078a)) {
            textLocalisedClause = new TextLocalisedClause(R$string.pix_entry_new_pix_key, null, null, 14);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmBillsBpay.f80068a)) {
            textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_new_recipient_bpay_title, null, null, 14);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.Group.f80093a) || Intrinsics.f(transferActionItem, WhoToTransferActionItem.CreateGroup.f80090a)) {
            textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_new_recipient_create_new_group_title, null, null, 14);
        } else if (Intrinsics.f(transferActionItem, WhoToTransferActionItem.CharityList.f80088a)) {
            textLocalisedClause = new TextLocalisedClause(R$string.payments_common_empty_charities_title, null, null, 14);
        } else {
            if (!Intrinsics.f(transferActionItem, WhoToTransferActionItem.SearchAddFriend.f80102a)) {
                if (!Intrinsics.f(transferActionItem, WhoToTransferActionItem.AddFriend.f80061a) && !(transferActionItem instanceof WhoToTransferActionItem.AddNewRecipient) && !Intrinsics.f(transferActionItem, WhoToTransferActionItem.AllPaymentVendors.f80066a) && !Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmMultibancoViaVerde.f80076a) && !Intrinsics.f(transferActionItem, WhoToTransferActionItem.PayBillsTaxes.f80096a) && !Intrinsics.f(transferActionItem, WhoToTransferActionItem.PhoneTopUps.f80099a) && !Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmBillsF24.f80069a) && !Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmBillsPagoPA.f80070a) && !Intrinsics.f(transferActionItem, WhoToTransferActionItem.CharityDonation.f80087a) && !(transferActionItem instanceof WhoToTransferActionItem.FavoritePaymentVendor) && !Intrinsics.f(transferActionItem, WhoToTransferActionItem.PaymentLink.f80097a) && !Intrinsics.f(transferActionItem, WhoToTransferActionItem.PermissionContact.f80098a) && !Intrinsics.f(transferActionItem, WhoToTransferActionItem.Remittance.f80101a) && !Intrinsics.f(transferActionItem, WhoToTransferActionItem.QrCode.f80100a) && !Intrinsics.f(transferActionItem, WhoToTransferActionItem.GiroDirectDebits.f80092a) && !Intrinsics.f(transferActionItem, WhoToTransferActionItem.MasavDirectDebits.f80094a) && !Intrinsics.f(transferActionItem, WhoToTransferActionItem.ApmPostalCheck.f80079a) && !Intrinsics.f(transferActionItem, WhoToTransferActionItem.Alipay.f80065a)) {
                    throw new NoWhenBranchMatchedException();
                }
                e.n(new IllegalArgumentException(p.a.p("Action `", h(transferActionItem), "` is not allowed here")));
                return null;
            }
            textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_new_recipient_revolut_friend_title, null, null, 14);
        }
        return b(textLocalisedClause, null, LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_plus, R$attr.uikit_colorForeground, R$attr.uikit_colorGreyTone10), transferActionItem);
    }

    public final String h(WhoToTransferActionItem whoToTransferActionItem) {
        Object objA;
        if (whoToTransferActionItem instanceof WhoToTransferActionItem.AddNewRecipient) {
            try {
                m.Companion companion = m.INSTANCE;
                objA = d0.k0(((WhoToTransferActionItem.AddNewRecipient) whoToTransferActionItem).f80064a, null, "[", "]", 0, new b0(this, 28), 25);
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            if (objA instanceof n) {
                objA = "[unavailable]";
            }
            return p.a.p("AddNewRecipient(actionItems=", (String) objA, ")");
        }
        if (!(whoToTransferActionItem instanceof WhoToTransferActionItem.FavoritePaymentVendor)) {
            String simpleName = whoToTransferActionItem.getClass().getSimpleName();
            if (kotlin.text.d0.W(simpleName)) {
                simpleName = null;
            }
            return simpleName == null ? whoToTransferActionItem.getClass().getName() : simpleName;
        }
        PaymentVendor paymentVendor = ((WhoToTransferActionItem.FavoritePaymentVendor) whoToTransferActionItem).f80091a;
        StringBuilder sb6 = new StringBuilder("PaymentVendor(id=");
        sb6.append(paymentVendor.f64079a);
        sb6.append(", name=");
        sb6.append(paymentVendor.f64080b);
        sb6.append(", logoMono=");
        sb6.append(paymentVendor.f64081c);
        sb6.append(", logoColored=");
        sb6.append(paymentVendor.d);
        sb6.append(", default=");
        sb6.append(paymentVendor.e);
        sb6.append(", corridors=");
        return p.a.p("FavoritePaymentVendor(paymentVendor=", v0.a.i(sb6, d0.k0(paymentVendor.f, null, "[", "]", 0, new f(4), 25), ")"), ")");
    }
}
