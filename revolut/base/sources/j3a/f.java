package j3a;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
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
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import ip0.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import mx0.l;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static z a(LinkedHashMap availableFilters, WhoToTransferFilter whoToTransferFilter, List paymentVendors) {
        WhoToTransferFilter.Revolut revolut;
        List list;
        Clause textClause;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        ResourceImage resourceImage;
        ResourceImage resourceImage2;
        TextLocalisedClause textLocalisedClause3;
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(paymentVendors, "paymentVendors");
        ArrayList arrayList = new ArrayList(availableFilters.size());
        Iterator it8 = availableFilters.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            WhoToTransferFilter whoToTransferFilter2 = (WhoToTransferFilter) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            String strN = a0.d.n("ID_ACTIONS_ITEM_", whoToTransferFilter2.hashCode());
            mx0.d dVar = whoToTransferFilter2.equals(whoToTransferFilter) ? mx0.d.ACCENT : mx0.d.SEMIBLACK;
            WhoToTransferFilter.Checks checks = WhoToTransferFilter.Checks.f80000a;
            WhoToTransferFilter.Charities charities = WhoToTransferFilter.Charities.f79999a;
            WhoToTransferFilter.CryptoWallets cryptoWallets = WhoToTransferFilter.CryptoWallets.f80001a;
            WhoToTransferFilter.Groups groups = WhoToTransferFilter.Groups.f80003a;
            WhoToTransferFilter.Device device = WhoToTransferFilter.Device.f80002a;
            WhoToTransferFilter.Revolut revolut2 = WhoToTransferFilter.Revolut.f80005a;
            Iterator it9 = it8;
            WhoToTransferFilter.Cards cards = WhoToTransferFilter.Cards.f79998a;
            WhoToTransferFilter.Billers billers = WhoToTransferFilter.Billers.f79997a;
            WhoToTransferFilter.ApmWero apmWero = WhoToTransferFilter.ApmWero.f79996a;
            WhoToTransferFilter.ApmUpi apmUpi = WhoToTransferFilter.ApmUpi.f79995a;
            WhoToTransferFilter.ApmSpin apmSpin = WhoToTransferFilter.ApmSpin.f79994a;
            mx0.d dVar2 = dVar;
            WhoToTransferFilter.ApmQvik apmQvik = WhoToTransferFilter.ApmQvik.f79993a;
            WhoToTransferFilter.ApmPix apmPix = WhoToTransferFilter.ApmPix.f79992a;
            ArrayList arrayList2 = arrayList;
            WhoToTransferFilter.ApmPayId apmPayId = WhoToTransferFilter.ApmPayId.f79991a;
            WhoToTransferFilter.ApmMultibanco apmMultibanco = WhoToTransferFilter.ApmMultibanco.f79990a;
            WhoToTransferFilter.ApmIris apmIris = WhoToTransferFilter.ApmIris.f79989a;
            WhoToTransferFilter.ApmBreb apmBreb = WhoToTransferFilter.ApmBreb.f79988a;
            WhoToTransferFilter.ApmBlik apmBlik = WhoToTransferFilter.ApmBlik.f79987a;
            WhoToTransferFilter.ApmBizum apmBizum = WhoToTransferFilter.ApmBizum.f79986a;
            WhoToTransferFilter.ApmAani apmAani = WhoToTransferFilter.ApmAani.f79985a;
            WhoToTransferFilter.Accounts accounts = WhoToTransferFilter.Accounts.f79984a;
            if (iIntValue != 0) {
                if (whoToTransferFilter2.equals(accounts)) {
                    textLocalisedClause3 = new TextLocalisedClause(R$string.who_to_pay_filter_banks_counter, u.c(Integer.valueOf(iIntValue)), null, 12);
                } else if (whoToTransferFilter2.equals(apmAani)) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_placeholder_separator_dot, v.k(ApmAani.f61807c.e(), Integer.valueOf(iIntValue)), null, 12);
                } else if (whoToTransferFilter2.equals(apmBizum)) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_placeholder_separator_dot, v.k(ApmBizum.f61808c.e(), Integer.valueOf(iIntValue)), null, 12);
                } else if (whoToTransferFilter2.equals(apmBlik)) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_placeholder_separator_dot, v.k(ApmBlik.f61809c.e(), Integer.valueOf(iIntValue)), null, 12);
                } else if (whoToTransferFilter2.equals(apmBreb)) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_placeholder_separator_dot, v.k(ApmBreb.f61810c.e(), Integer.valueOf(iIntValue)), null, 12);
                } else if (whoToTransferFilter2.equals(apmIris)) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_placeholder_separator_dot, v.k(ApmIris.f61811c.e(), Integer.valueOf(iIntValue)), null, 12);
                } else if (whoToTransferFilter2.equals(apmMultibanco)) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_placeholder_separator_dot, v.k(ApmMultibanco.f61815c.e(), Integer.valueOf(iIntValue)), null, 12);
                } else if (whoToTransferFilter2.equals(apmPayId)) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_placeholder_separator_dot, v.k(ApmPayId.f61819c.e(), Integer.valueOf(iIntValue)), null, 12);
                } else if (whoToTransferFilter2.equals(apmPix)) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_placeholder_separator_dot, v.k(ApmPix.f61820c.e(), Integer.valueOf(iIntValue)), null, 12);
                } else if (whoToTransferFilter2.equals(apmQvik)) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_placeholder_separator_dot, v.k(ApmQvik.f61823c.e(), Integer.valueOf(iIntValue)), null, 12);
                } else if (whoToTransferFilter2.equals(apmSpin)) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_placeholder_separator_dot, v.k(ApmSpin.f61827c.e(), Integer.valueOf(iIntValue)), null, 12);
                } else if (whoToTransferFilter2.equals(apmUpi)) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_placeholder_separator_dot, v.k(ApmUpi.f61828c.e(), Integer.valueOf(iIntValue)), null, 12);
                } else if (whoToTransferFilter2.equals(apmWero)) {
                    textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_placeholder_separator_dot, v.k(ApmWero.f61829c.e(), Integer.valueOf(iIntValue)), null, 12);
                } else if (whoToTransferFilter2.equals(billers)) {
                    textLocalisedClause3 = new TextLocalisedClause(R$string.who_to_pay_filter_billers_counter, u.c(Integer.valueOf(iIntValue)), null, 12);
                } else if (whoToTransferFilter2.equals(cards)) {
                    textLocalisedClause3 = new TextLocalisedClause(R$string.who_to_pay_filter_cards_counter, u.c(Integer.valueOf(iIntValue)), null, 12);
                } else {
                    revolut = revolut2;
                    if (whoToTransferFilter2.equals(revolut)) {
                        textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_filter_revolut_counter, u.c(Integer.valueOf(iIntValue)), null, 12);
                    } else if (whoToTransferFilter2.equals(device)) {
                        textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_filter_others_counter, u.c(Integer.valueOf(iIntValue)), null, 12);
                    } else if (whoToTransferFilter2.equals(groups)) {
                        textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_filter_groups_counter, u.c(Integer.valueOf(iIntValue)), null, 12);
                    } else if (whoToTransferFilter2.equals(cryptoWallets)) {
                        textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_filter_crypto_counter, u.c(Integer.valueOf(iIntValue)), null, 12);
                    } else if (whoToTransferFilter2.equals(charities)) {
                        textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_filter_charities_counter, u.c(Integer.valueOf(iIntValue)), null, 12);
                    } else if (whoToTransferFilter2.equals(checks)) {
                        textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_filter_checks_counter, u.c(Integer.valueOf(iIntValue)), null, 12);
                    } else {
                        if (!(whoToTransferFilter2 instanceof WhoToTransferFilter.MobileWallet)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i = com.revolut.feature.apm.core.api.R$string.apm_placeholder_separator_dot;
                        String strL = s.l(((WhoToTransferFilter.MobileWallet) whoToTransferFilter2).f80004a, paymentVendors);
                        if (strL == null) {
                            strL = "";
                        }
                        textClause = new TextLocalisedClause(i, v.k(strL, Integer.valueOf(iIntValue)), null, 12);
                        list = paymentVendors;
                    }
                    textClause = textLocalisedClause;
                    list = paymentVendors;
                }
                list = paymentVendors;
                textClause = textLocalisedClause3;
                revolut = revolut2;
            } else {
                if (whoToTransferFilter2.equals(accounts)) {
                    textLocalisedClause2 = new TextLocalisedClause(R$string.who_to_pay_filter_banks, null, null, 14);
                } else if (whoToTransferFilter2.equals(apmAani)) {
                    textLocalisedClause2 = ApmAani.f61807c.e();
                } else if (whoToTransferFilter2.equals(apmBizum)) {
                    textLocalisedClause2 = ApmBizum.f61808c.e();
                } else if (whoToTransferFilter2.equals(apmBlik)) {
                    textLocalisedClause2 = ApmBlik.f61809c.e();
                } else if (whoToTransferFilter2.equals(apmBreb)) {
                    textLocalisedClause2 = ApmBreb.f61810c.e();
                } else if (whoToTransferFilter2.equals(apmIris)) {
                    textLocalisedClause2 = ApmIris.f61811c.e();
                } else if (whoToTransferFilter2.equals(apmMultibanco)) {
                    textLocalisedClause2 = ApmMultibanco.f61815c.e();
                } else if (whoToTransferFilter2.equals(apmPayId)) {
                    textLocalisedClause2 = ApmPayId.f61819c.e();
                } else if (whoToTransferFilter2.equals(apmPix)) {
                    textLocalisedClause2 = ApmPix.f61820c.e();
                } else if (whoToTransferFilter2.equals(apmQvik)) {
                    textLocalisedClause2 = ApmQvik.f61823c.e();
                } else if (whoToTransferFilter2.equals(apmSpin)) {
                    textLocalisedClause2 = ApmSpin.f61827c.e();
                } else if (whoToTransferFilter2.equals(apmUpi)) {
                    textLocalisedClause2 = ApmUpi.f61828c.e();
                } else if (whoToTransferFilter2.equals(apmWero)) {
                    textLocalisedClause2 = ApmWero.f61829c.e();
                } else if (whoToTransferFilter2.equals(billers)) {
                    textLocalisedClause2 = new TextLocalisedClause(R$string.who_to_pay_filter_billers, null, null, 14);
                } else if (whoToTransferFilter2.equals(cards)) {
                    textLocalisedClause2 = new TextLocalisedClause(R$string.who_to_pay_filter_cards, null, null, 14);
                } else {
                    revolut = revolut2;
                    if (whoToTransferFilter2.equals(revolut)) {
                        textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_filter_revolut, null, null, 14);
                    } else if (whoToTransferFilter2.equals(groups)) {
                        textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_filter_groups, null, null, 14);
                    } else if (whoToTransferFilter2.equals(cryptoWallets)) {
                        textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_filter_crypto, null, null, 14);
                    } else if (whoToTransferFilter2.equals(charities)) {
                        textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_filter_charities, null, null, 14);
                    } else if (whoToTransferFilter2.equals(checks)) {
                        textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_filter_checks, null, null, 14);
                    } else if (whoToTransferFilter2.equals(device)) {
                        textLocalisedClause = new TextLocalisedClause(R$string.who_to_pay_filter_others, null, null, 14);
                    } else {
                        if (!(whoToTransferFilter2 instanceof WhoToTransferFilter.MobileWallet)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        list = paymentVendors;
                        String strL2 = s.l(((WhoToTransferFilter.MobileWallet) whoToTransferFilter2).f80004a, list);
                        textClause = new TextClause(strL2 == null ? "" : strL2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                    textClause = textLocalisedClause;
                    list = paymentVendors;
                }
                list = paymentVendors;
                textClause = textLocalisedClause2;
                revolut = revolut2;
            }
            if (whoToTransferFilter2.equals(revolut)) {
                resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_logo_revolut, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            } else if (whoToTransferFilter2.equals(apmBlik)) {
                ApmBlik.f61809c.getClass();
                resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_blik_circle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            } else if (whoToTransferFilter2.equals(apmPix)) {
                ApmPix.f61820c.getClass();
                resourceImage2 = new ResourceImage(R$drawable.uikit_icn_24_logo_pix_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
            } else {
                resourceImage = null;
                arrayList = arrayList2;
                arrayList.add(new ActionsView.Item(strN, dVar2, false, null, null, textClause, resourceImage, null, null, null, false, null, null, whoToTransferFilter2, null, 24476));
                it8 = it9;
            }
            resourceImage = resourceImage2;
            arrayList = arrayList2;
            arrayList.add(new ActionsView.Item(strN, dVar2, false, null, null, textClause, resourceImage, null, null, null, false, null, null, whoToTransferFilter2, null, 24476));
            it8 = it9;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new z("ID_ACTIONS_ITEM_HOLDER", arrayList, null, l.SCROLLABLE, R$attr.uikit_dp12, R$attr.uikit_dp0, 68);
    }
}
