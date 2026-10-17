package mq5;

import aw0.n6;
import aw0.o9;
import aw0.t0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.remittance.models.domain.fees.CryptoWithdrawFeesBreakdownDetail;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements n {
    public static CellDetailsDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, boolean z, MoneyClause moneyClause, MoneyClause moneyClause2, g gVar) {
        return new CellDetailsDelegate.Model(str, new t0(textLocalisedClause, z ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, 0, z, 20), moneyClause, moneyClause2, gVar, null, null, 0, null, false, false, null, null, 30640);
    }

    public static MoneyClause b(dj0.d dVar, n9l.a aVar) {
        double d = aVar.f213663c;
        xi0.b bVar = aVar.f213662b;
        xi0.b bVar2 = aVar.f213661a;
        if (d == 0.0d) {
            return null;
        }
        xi0.b bVar3 = dVar.f115083b;
        if (Intrinsics.f(bVar3, bVar2)) {
            return oo5.b.c(pyd.c.K(dVar, d, bVar), false);
        }
        if (Intrinsics.f(bVar3, bVar)) {
            return oo5.b.c(pyd.c.K(dVar, 1.0d / d, bVar2), false);
        }
        return null;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List listK;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f207886a;
        n9l.a aVar = domainState.f207887b;
        CryptoWithdrawFeesBreakdown cryptoWithdrawFeesBreakdown = (CryptoWithdrawFeesBreakdown) data.getContent();
        if (cryptoWithdrawFeesBreakdown == null) {
            listK = v.k(new s7("CryptoFeeBreakdownDialog_Loading1", 0, 0, 0, 0, false, null, 126), new s7("CryptoFeeBreakdownDialog_Loading2", 0, 0, 0, 0, false, null, 126), new s7("CryptoFeeBreakdownDialog_Loading3", 0, 0, 0, 0, false, null, 126));
        } else {
            List list = cryptoWithdrawFeesBreakdown.f;
            List list2 = list;
            if (list2 == null || list2.isEmpty()) {
                aim.e eVarB = u.b();
                dj0.d dVar = cryptoWithdrawFeesBreakdown.f71091c;
                if (dVar != null) {
                    eVarB.add(a("CryptoFeeBreakdownDialog_ExchangeFee", new TextLocalisedClause(R$string.crypto_withdrawals_fees_breakdown_popup_exchange_fee_title, null, null, 14), false, oo5.b.c(dVar, false), aVar != null ? b(dVar, aVar) : null, null));
                }
                dj0.d dVar2 = cryptoWithdrawFeesBreakdown.d;
                if (dVar2 != null) {
                    eVarB.add(a("CryptoFeeBreakdownDialog_WeekendFee", new TextLocalisedClause(R$string.crypto_withdrawals_fees_breakdown_popup_weekend_fee_title, null, null, 14), false, oo5.b.c(dVar2, false), aVar != null ? b(dVar2, aVar) : null, null));
                }
                dj0.d dVar3 = cryptoWithdrawFeesBreakdown.f71089a;
                if (dVar3 != null) {
                    eVarB.add(a("CryptoFeeBreakdownDialog_NetworkFee", new TextLocalisedClause(R$string.crypto_withdrawals_fees_breakdown_popup_network_fee_title, null, null, 14), true, oo5.b.c(dVar3, false), aVar != null ? b(dVar3, aVar) : null, e.f207889a));
                }
                dj0.d dVar4 = cryptoWithdrawFeesBreakdown.f71090b;
                if (dVar4 != null) {
                    eVarB.add(a("CryptoFeeBreakdownDialog_ServiceFee", new TextLocalisedClause(R$string.crypto_withdrawals_fees_breakdown_popup_service_fee_title, null, null, 14), true, oo5.b.c(dVar4, false), aVar != null ? b(dVar4, aVar) : null, f.f207890a));
                }
                aim.e eVarA = u.a(eVarB);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                listK = eVarA;
            } else {
                List list3 = list;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                int i = 0;
                for (Object obj2 : list3) {
                    int i2 = i + 1;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    CryptoWithdrawFeesBreakdownDetail cryptoWithdrawFeesBreakdownDetail = (CryptoWithdrawFeesBreakdownDetail) obj2;
                    String strN = a0.d.n("CryptoFeeBreakdownDialog_BreakdownDetail_", i);
                    String str = cryptoWithdrawFeesBreakdownDetail.f70992c;
                    dj0.d dVar5 = cryptoWithdrawFeesBreakdownDetail.d;
                    arrayList.add(new CellDetailsDelegate.Model(strN, new t0((Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), 0, true, 20), oo5.b.c(dVar5, false), aVar != null ? b(dVar5, aVar) : null, new d(cryptoWithdrawFeesBreakdownDetail), null, null, 0, null, false, false, null, null, 30640));
                    i = i2;
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                listK = arrayList;
            }
        }
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), listK, new lw0.a(new TextLocalisedClause(R$string.crypto_withdrawals_fees_breakdown_popup_title, null, null, 14), null, null, null, false, 30));
    }
}
