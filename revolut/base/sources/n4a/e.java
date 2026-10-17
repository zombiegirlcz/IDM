package n4a;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
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
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.api.product.ApmSpin;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.bank_transfer.models.PaymentVendor;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import dx1.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import n1.y;
import n33.v0;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    public e(b newTransferPaymentMethodsGridExpandButtonMapper) {
        Intrinsics.checkNotNullParameter(newTransferPaymentMethodsGridExpandButtonMapper, "newTransferPaymentMethodsGridExpandButtonMapper");
    }

    public static d a(h hVar) {
        return new d(hVar.e(), hVar.d());
    }

    public static Map d(wi0.b bVar) {
        Pair pair = new Pair(WhoToTransferActionItem.AddFriend.f80061a, new d(R$string.who_to_pay_new_recipient_tile_revolut, R$drawable.uikit_icn_24_revolut));
        Pair pair2 = new Pair(WhoToTransferActionItem.QrCode.f80100a, new d(R$string.who_to_pay_new_recipient_tile_qr, R$drawable.uikit_icn_24_scan_qr));
        Pair pair3 = new Pair(WhoToTransferActionItem.ApmAani.f80067a, a(ApmAani.f61807c));
        Pair pair4 = new Pair(WhoToTransferActionItem.ApmBizum.f80071a, a(ApmBizum.f61808c));
        Pair pair5 = new Pair(WhoToTransferActionItem.ApmBlik.f80072a, a(ApmBlik.f61809c));
        Pair pair6 = new Pair(WhoToTransferActionItem.ApmBreb.f80073a, a(ApmBreb.f61810c));
        Pair pair7 = new Pair(WhoToTransferActionItem.ApmIris.f80074a, a(ApmIris.f61811c));
        Pair pair8 = new Pair(WhoToTransferActionItem.ApmMultibanco.f80075a, a(ApmMultibanco.f61815c));
        Pair pair9 = new Pair(WhoToTransferActionItem.ApmMultibancoViaVerde.f80076a, a(ApmMultibanco.b.f61816a));
        Pair pair10 = new Pair(WhoToTransferActionItem.ApmPayId.f80077a, a(ApmPayId.f61819c));
        Pair pair11 = new Pair(WhoToTransferActionItem.ApmPix.f80078a, a(ApmPix.f61820c));
        Pair pair12 = new Pair(WhoToTransferActionItem.ApmQvik.f80080a, a(ApmQvik.f61823c));
        Pair pair13 = new Pair(WhoToTransferActionItem.ApmQvikSecId.f80081a, a(ApmQvik.b.f61824a));
        Pair pair14 = new Pair(WhoToTransferActionItem.ApmSpin.f80082a, a(ApmSpin.f61827c));
        Pair pair15 = new Pair(WhoToTransferActionItem.ApmUpi.f80083a, a(ApmUpi.f61828c));
        Pair pair16 = new Pair(WhoToTransferActionItem.ApmWero.f80084a, a(ApmWero.f61829c));
        Pair pair17 = new Pair(WhoToTransferActionItem.Alipay.f80065a, new d(new TextLocalisedClause(com.revolut.feature.alipay.api.R$string.alipay_payments_new_title, null, null, 14), R$drawable.uikit_icn_24_alipayplus));
        Pair pair18 = new Pair(WhoToTransferActionItem.ApmBillsF24.f80069a, new d(new TextLocalisedClause(com.revolut.feature.apm.bills.f24.api.R$string.f24_title, null, null, 14), R$drawable.uikit_icn_24_documents_pair));
        Pair pair19 = new Pair(WhoToTransferActionItem.ApmBillsPagoPA.f80070a, new d(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_product_bills_pago_pa_title, null, null, 14), R$drawable.uikit_icn_24_pagopa));
        Pair pair20 = new Pair(WhoToTransferActionItem.BankRecipient.f80085a, new d(R$string.who_to_pay_new_recipient_tile_bank, R$drawable.uikit_icn_24_bank));
        Pair pair21 = new Pair(WhoToTransferActionItem.CardRecipient.f80086a, new d(R$string.who_to_pay_new_recipient_tile_card, R$drawable.uikit_icn_24_card));
        Pair pair22 = new Pair(WhoToTransferActionItem.Group.f80093a, new d(R$string.who_to_pay_new_recipient_tile_group, R$drawable.uikit_icn_24_people));
        Pair pair23 = new Pair(WhoToTransferActionItem.PaymentLink.f80097a, new d(R$string.who_to_pay_new_recipient_tile_link, R$drawable.uikit_icn_24_share_ios));
        wi0.b.Companion.getClass();
        return r0.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, new Pair(WhoToTransferActionItem.PayBillsTaxes.f80096a, new d(Intrinsics.f(bVar, wi0.b.A) ? R$string.who_to_pay_new_recipient_tile_boleto : Intrinsics.f(bVar, wi0.b.l2) ? R$string.who_to_pay_new_recipient_tile_nzbills : Intrinsics.f(bVar, wi0.b.y2) ? R$string.who_to_pay_new_recipient_tile_references : Intrinsics.f(bVar, wi0.b.f297734c) ? R$string.bpm_product_uae_bills_title : R$string.who_to_pay_new_recipient_tile_bill, R$drawable.uikit_icn_24_documents_pair)), new Pair(WhoToTransferActionItem.PhoneTopUps.f80099a, new d(R$string.who_to_pay_new_recipient_top_ups_title, R$drawable.uikit_icn_24_smartphone_add)), new Pair(WhoToTransferActionItem.ApmBillsBpay.f80068a, new d(com.revolut.feature.apm.core.api.R$string.apm_product_bills_bpay_title, R$drawable.uikit_icn_24_bpay)), new Pair(WhoToTransferActionItem.Remittance.f80101a, new d(R$string.who_to_pay_new_recipient_tile_remittance, R$drawable.uikit_icn_24_globe_p2p)), new Pair(WhoToTransferActionItem.NewCryptoAddress.f80095a, new d(R$string.who_to_pay_new_recipient_tile_crypto, R$drawable.uikit_icn_24_bitcoin)), new Pair(WhoToTransferActionItem.AllPaymentVendors.f80066a, new d(R$string.who_to_pay_new_recipient_tile_mobile_wallets, R$drawable.uikit_icn_24_ellipsis)), new Pair(WhoToTransferActionItem.GiroDirectDebits.f80092a, new d(R$string.who_to_pay_new_recipient_tile_giro, R$drawable.uikit_icn_24_recurring)), new Pair(WhoToTransferActionItem.MasavDirectDebits.f80094a, new d(R$string.who_to_pay_new_recipient_tile_masav_direct_debit, R$drawable.uikit_icn_24_recurring)), new Pair(WhoToTransferActionItem.ApmPostalCheck.f80079a, new d(R$string.who_to_pay_new_recipient_tile_yellow_check, R$drawable.uikit_icn_24_qr)));
    }

    public final aim.e b(Set availableTransferMethods, wi0.b bVar, boolean z) throws Throwable {
        Object next;
        IconDelegate.Model model;
        float f;
        int iIntValue;
        Object objA;
        IconDelegate.Model model2;
        Float fValueOf = Float.valueOf(56.0f);
        Intrinsics.checkNotNullParameter(availableTransferMethods, "availableTransferMethods");
        Iterator it8 = availableTransferMethods.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof WhoToTransferActionItem.FavoritePaymentVendor) {
                break;
            }
        }
        int i = 33;
        WhoToTransferActionItem[] elements = {WhoToTransferActionItem.AddFriend.f80061a, WhoToTransferActionItem.QrCode.f80100a, (WhoToTransferActionItem.FavoritePaymentVendor) next, WhoToTransferActionItem.ApmAani.f80067a, WhoToTransferActionItem.ApmBizum.f80071a, WhoToTransferActionItem.ApmBlik.f80072a, WhoToTransferActionItem.ApmBreb.f80073a, WhoToTransferActionItem.ApmIris.f80074a, WhoToTransferActionItem.ApmMultibanco.f80075a, WhoToTransferActionItem.ApmPayId.f80077a, WhoToTransferActionItem.ApmPix.f80078a, WhoToTransferActionItem.ApmQvik.f80080a, WhoToTransferActionItem.ApmUpi.f80083a, WhoToTransferActionItem.ApmWero.f80084a, WhoToTransferActionItem.Alipay.f80065a, WhoToTransferActionItem.BankRecipient.f80085a, WhoToTransferActionItem.CardRecipient.f80086a, WhoToTransferActionItem.Group.f80093a, WhoToTransferActionItem.PaymentLink.f80097a, WhoToTransferActionItem.PayBillsTaxes.f80096a, WhoToTransferActionItem.PhoneTopUps.f80099a, WhoToTransferActionItem.GiroDirectDebits.f80092a, WhoToTransferActionItem.ApmMultibancoViaVerde.f80076a, WhoToTransferActionItem.ApmQvikSecId.f80081a, WhoToTransferActionItem.ApmSpin.f80082a, WhoToTransferActionItem.ApmBillsBpay.f80068a, WhoToTransferActionItem.ApmBillsF24.f80069a, WhoToTransferActionItem.ApmBillsPagoPA.f80070a, WhoToTransferActionItem.ApmPostalCheck.f80079a, WhoToTransferActionItem.MasavDirectDebits.f80094a, WhoToTransferActionItem.Remittance.f80101a, WhoToTransferActionItem.NewCryptoAddress.f80095a, WhoToTransferActionItem.AllPaymentVendors.f80066a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listL) {
            int i2 = i;
            if (availableTransferMethods.contains((WhoToTransferActionItem) obj2)) {
                arrayList.add(obj2);
            }
            i = i2;
        }
        int i3 = i;
        int size = availableTransferMethods.size();
        List<WhoToTransferActionItem> listV0 = (!z && size > 8) ? d0.V0(arrayList, 7) : arrayList;
        List listV02 = d0.V0(d0.W0(size - listV0.size(), arrayList), 4);
        aim.e eVarB = u.b();
        ArrayList arrayList2 = new ArrayList();
        for (WhoToTransferActionItem whoToTransferActionItem : listV0) {
            if (whoToTransferActionItem instanceof WhoToTransferActionItem.FavoritePaymentVendor) {
                PaymentVendor paymentVendor = ((WhoToTransferActionItem.FavoritePaymentVendor) whoToTransferActionItem).f80091a;
                model2 = new IconDelegate.Model(j6.a.q("TRANSFER_METHOD_LIST_ID_PREFIX_", c(whoToTransferActionItem)), new UrlImage(paymentVendor.f64081c, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, null, new CustomColors(new Color.Solid(a.f212339b), new Color.Solid(a.f212338a)), gz0.b.CenterInside, null, Integer.valueOf(i3), Integer.valueOf(i3), 19), null, null, false, false, 507902), new TextClause(paymentVendor.f64080b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), whoToTransferActionItem, 88);
            } else {
                try {
                    m.Companion companion = m.INSTANCE;
                    objA = (d) d(bVar).get(whoToTransferActionItem);
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    objA = o.a(th10);
                }
                if (objA == null) {
                    throw new IllegalArgumentException("Unable to build icon for transfer method " + c(whoToTransferActionItem));
                }
                Throwable thA = m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                if (objA instanceof n) {
                    objA = null;
                }
                d dVar = (d) objA;
                model2 = dVar != null ? new IconDelegate.Model(j6.a.q("TRANSFER_METHOD_LIST_ID_PREFIX_", c(whoToTransferActionItem)), new LayeredImage(v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_rect_background, Integer.valueOf(a.f212339b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(dVar.f212341b, Integer.valueOf(a.f212338a), 11.2f, 11.2f, 11.2f, 11.2f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), fValueOf, fValueOf, 8), dVar.f212340a, whoToTransferActionItem, 88) : null;
            }
            IconDelegate.Model model3 = model2;
            if (model3 != null) {
                arrayList2.add(model3);
            }
        }
        eVarB.addAll(arrayList2);
        List<WhoToTransferActionItem> list = listV02;
        ArrayList innerIcons = new ArrayList(w.t(list, 10));
        for (WhoToTransferActionItem whoToTransferActionItem2 : list) {
            d dVar2 = (d) d(bVar).get(whoToTransferActionItem2);
            Integer numValueOf = dVar2 != null ? Integer.valueOf(dVar2.f212341b) : null;
            if (numValueOf == null) {
                hx7.e.n(new IllegalStateException(j6.a.q("Unable to find icon for transfer method ", c(whoToTransferActionItem2))));
                iIntValue = R$drawable.uikit_icn_24_revolut;
            } else {
                iIntValue = numValueOf.intValue();
            }
            innerIcons.add(Integer.valueOf(iIntValue));
        }
        Intrinsics.checkNotNullParameter(innerIcons, "innerIcons");
        int size2 = innerIcons.size();
        if (1 > size2 || size2 >= 5) {
            model = null;
        } else {
            List listC = u.c(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_rounded_background, Integer.valueOf(a.f212339b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124));
            ArrayList arrayList3 = new ArrayList(w.t(innerIcons, 10));
            int i5 = 0;
            for (Object obj3 : innerIcons) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    v.s();
                    throw null;
                }
                ((Number) obj3).intValue();
                int i21 = i5 % 2;
                int i22 = i5 / 2;
                int i32 = R$drawable.uikit_shape_circle;
                Integer numValueOf2 = Integer.valueOf(R$attr.uikit_colorAccentNeutral_10);
                float f4 = 5.0f;
                float f5 = i21 != 0 ? 31.75f : 5.0f;
                if (i21 == 1) {
                    f = 5.0f;
                } else {
                    f = 5.0f;
                    f4 = 31.75f;
                }
                arrayList3.add(new LayeredImage.Layer.Drawable(i32, numValueOf2, f5, f4, i22 == 0 ? f : 31.75f, i22 == 1 ? f : 31.75f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64));
                i5 = i6;
            }
            ArrayList arrayListE0 = d0.E0(arrayList3, listC);
            ArrayList arrayList4 = new ArrayList(w.t(innerIcons, 10));
            int i33 = 0;
            for (Object obj4 : innerIcons) {
                int i43 = i33 + 1;
                if (i33 < 0) {
                    v.s();
                    throw null;
                }
                int iIntValue2 = ((Number) obj4).intValue();
                int i59 = i33 % 2;
                int i66 = i33 / 2;
                arrayList4.add(new LayeredImage.Layer.Drawable(iIntValue2, Integer.valueOf(a.f212338a), i59 == 0 ? 8.85f : 35.6f, i59 == 1 ? 8.85f : 35.6f, i66 == 0 ? 8.85f : 35.6f, i66 == 1 ? 8.85f : 35.6f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64));
                i33 = i43;
            }
            model = new IconDelegate.Model("TRANSFER_METHOD_EXPAND_BUTTON_ID", new LayeredImage(d0.E0(arrayList4, arrayListE0), fValueOf, fValueOf, 8), new TextLocalisedClause(R$string.who_to_pay_new_recipient_tile_see_all, null, null, 14), "TRANSFER_METHOD_EXPAND_BUTTON_ID", 88);
        }
        if (model != null) {
            eVarB.add(model);
        }
        return u.a(eVarB);
    }

    public final String c(WhoToTransferActionItem whoToTransferActionItem) {
        if (whoToTransferActionItem instanceof WhoToTransferActionItem.AddNewRecipient) {
            return p.a.p("AddNewRecipient(actionItems=", d0.k0(((WhoToTransferActionItem.AddNewRecipient) whoToTransferActionItem).f80064a, null, "[", "]", 0, new y(this, 16), 25), ")");
        }
        if (!(whoToTransferActionItem instanceof WhoToTransferActionItem.FavoritePaymentVendor)) {
            String strM = o0.f186429a.b(whoToTransferActionItem.getClass()).m();
            return strM == null ? whoToTransferActionItem.getClass().getName() : strM;
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
        return p.a.p("FavoritePaymentVendor(paymentVendor=", v0.a.i(sb6, d0.k0(paymentVendor.f, null, "[", "]", 0, new v0(22), 25), ")"), ")");
    }
}
