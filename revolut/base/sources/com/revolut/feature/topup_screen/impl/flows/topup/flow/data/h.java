package com.revolut.feature.topup_screen.impl.flows.topup.flow.data;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.domain.models.topup.methods.CardMethodState;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import vye.i;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je6.h f90933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oye.c f90934b;

    public h(je6.h logoMapper, oye.c fallbackImageProvider) {
        Intrinsics.checkNotNullParameter(logoMapper, "logoMapper");
        Intrinsics.checkNotNullParameter(fallbackImageProvider, "fallbackImageProvider");
        this.f90933a = logoMapper;
        this.f90934b = fallbackImageProvider;
    }

    public static CompositeClause a(String str) {
        if (str == null) {
            return null;
        }
        Custom custom = new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254);
        List listK = v.k(new TextLocalisedClause(R$string.topup_amount_method_topup_funds_timeframe_arriving, null, custom, 10), new TextClause(str, (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124));
        m70.a.a(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" · ", (Style) custom, (Integer) null, false, (o9) null, (List) null, 124), null, null, 12);
    }

    public final Image b(TopupMethod topupMethod) {
        Image imageA = this.f90934b.a(topupMethod);
        Image imageA2 = ((di6.a) this.f90933a).a(topupMethod.getE(), imageA);
        return imageA2 == null ? imageA : imageA2;
    }

    public final vye.a c(TopupMethod.OtherMethod method, String str) {
        Intrinsics.checkNotNullParameter(method, "method");
        TextClause textClause = new TextClause(method.f60441b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str2 = method.f60442c;
        return new vye.a(a(method.f60443g), textClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, e(method), str);
    }

    public final vye.d d(TopupMethod topupMethod, vye.c cVar) {
        TextClause textClause = new TextClause(topupMethod.getF60522c(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String d = topupMethod.getD();
        return new vye.d(textClause, d != null ? new TextClause(d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, e(topupMethod), a(topupMethod.getF60523g()), cVar);
    }

    public final Image e(TopupMethod topupMethod) {
        Image imageB = ((di6.a) this.f90933a).b(topupMethod.getE());
        return imageB == null ? this.f90934b.a(topupMethod) : imageB;
    }

    public final SelectedMethod f(TopupMethod method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (method instanceof TopupMethod.OtherMethod) {
            TopupMethod.OtherMethod otherMethod = (TopupMethod.OtherMethod) method;
            String str = otherMethod.f60443g;
            TopupMethodType topupMethodType = otherMethod.f60440a;
            switch (i.f293316a[topupMethodType.ordinal()]) {
                case 1:
                    return c(otherMethod, null);
                case 2:
                    return d(method, vye.c.CHECK);
                case 3:
                    return d(method, vye.c.GOOGLE_PAY);
                case 4:
                    TextClause textClause = new TextClause(otherMethod.f60441b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str2 = otherMethod.f60442c;
                    return new vye.b(textClause, str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, b(method), a(str), null);
                case 5:
                    return d(method, vye.c.EASY_BANK_TRANSFER);
                case 6:
                    return d(method, vye.c.REVOLUT_ACCOUNT);
                case 7:
                    return d(method, vye.c.MOVE_MONEY);
                case 8:
                    return new vye.d(new TextClause(otherMethod.f60441b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, e(method), a(str), vye.c.CHECKOUT_PREORDER);
                case 9:
                    return d(method, vye.c.IDEAL);
                case 10:
                    return d(method, vye.c.PIX);
                case 11:
                    return d(method, vye.c.PIX_SMART_TRANSFER);
                case 12:
                    return d(method, vye.c.PAY_TO);
                case 13:
                    return d(method, vye.c.UPI_APP);
                case 14:
                    return d(method, vye.c.MCY_UPI_APP);
                case 15:
                    return d(method, vye.c.NET_BANKING);
                case 16:
                    return d(method, vye.c.MCY_NET_BANKING);
                case 17:
                    return d(method, vye.c.MCY_BANK_TRANSFER);
                case 18:
                    return d(method, vye.c.BREB);
                case 19:
                    return d(method, vye.c.PAYNOW);
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot select method with type " + topupMethodType);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                    return null;
                case 28:
                    return d(method, vye.c.PSE);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (method instanceof TopupMethod.StoredMethod.Card) {
            TopupMethod.StoredMethod.Card card = (TopupMethod.StoredMethod.Card) method;
            TopupMethod.StoredMethod.Card.Restrictions restrictions = card.f60460j;
            String str3 = card.f60455a;
            TextClause textClause2 = new TextClause(card.f60456b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str4 = card.f60457c;
            return new SelectedMethod.StoredMethod.Card(str3, textClause2, str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, b(method), card.f60458g == null && restrictions == null, a(card.i), card.k == CardMethodState.EXPIRED, restrictions != null, card.f60461l, null, card.f60462m);
        }
        if (method instanceof TopupMethod.StoredMethod.Openbanking) {
            TopupMethod.StoredMethod.Openbanking openbanking = (TopupMethod.StoredMethod.Openbanking) method;
            String str5 = openbanking.f60481a;
            TextClause textClause3 = new TextClause(openbanking.f60482b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str6 = openbanking.f60483c;
            return new d(str5, textClause3, str6 != null ? new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, e(method), openbanking.f60484g == null, a(openbanking.i));
        }
        if (method instanceof TopupMethod.StoredMethod.PayTo) {
            TopupMethod.StoredMethod.PayTo payTo = (TopupMethod.StoredMethod.PayTo) method;
            String str7 = payTo.f60490a;
            TextClause textClause4 = new TextClause(payTo.f60491b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str8 = payTo.f60492c;
            return new e(str7, textClause4, str8 != null ? new TextClause(str8, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, e(method), payTo.f60493g == null, a(payTo.i), payTo.k);
        }
        if (method instanceof TopupMethod.SuggestedMethod.OpenBankingInstitution) {
            TopupMethod.SuggestedMethod.OpenBankingInstitution openBankingInstitution = (TopupMethod.SuggestedMethod.OpenBankingInstitution) method;
            String str9 = openBankingInstitution.f60509b;
            TextClause textClause5 = new TextClause(openBankingInstitution.f60510c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str10 = openBankingInstitution.d;
            return new vye.h(a(openBankingInstitution.f60511g), textClause5, str10 != null ? new TextClause(str10, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, e(method), str9);
        }
        if (method instanceof TopupMethod.StoredMethod.NetBanking) {
            TopupMethod.StoredMethod.NetBanking netBanking = (TopupMethod.StoredMethod.NetBanking) method;
            String str11 = netBanking.f60475a;
            TextClause textClause6 = new TextClause(netBanking.f60476b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str12 = netBanking.f60477c;
            return new c(str11, textClause6, str12 != null ? new TextClause(str12, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, e(method), netBanking.f60478g == null, a(netBanking.i), netBanking.f60480j);
        }
        if (method instanceof TopupMethod.StoredMethod.UpiApp) {
            TopupMethod.StoredMethod.UpiApp upiApp = (TopupMethod.StoredMethod.UpiApp) method;
            String str13 = upiApp.f60502a;
            TextClause textClause7 = new TextClause(upiApp.f60503b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str14 = upiApp.f60504c;
            return new g(str13, textClause7, str14 != null ? new TextClause(str14, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, e(method), upiApp.f60505g == null, a(upiApp.i), upiApp.f60507j);
        }
        if (method instanceof TopupMethod.StoredMethod.PixSmartTransfer) {
            TopupMethod.StoredMethod.PixSmartTransfer pixSmartTransfer = (TopupMethod.StoredMethod.PixSmartTransfer) method;
            String str15 = pixSmartTransfer.f60496a;
            TextClause textClause8 = new TextClause(pixSmartTransfer.f60497b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str16 = pixSmartTransfer.f60498c;
            return new f(str15, textClause8, str16 != null ? new TextClause(str16, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, e(method), pixSmartTransfer.f60499g == null, a(pixSmartTransfer.i));
        }
        if (method instanceof TopupMethod.StoredMethod.Akahu) {
            TopupMethod.StoredMethod.Akahu akahu = (TopupMethod.StoredMethod.Akahu) method;
            String str17 = akahu.f60449a;
            TextClause textClause9 = new TextClause(akahu.f60450b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str18 = akahu.f60451c;
            return new a(str17, textClause9, str18 != null ? new TextClause(str18, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, e(method), akahu.f60452g == null, a(akahu.i));
        }
        if (method instanceof TopupMethod.StoredMethod.GmoPgBankDirect) {
            TopupMethod.StoredMethod.GmoPgBankDirect gmoPgBankDirect = (TopupMethod.StoredMethod.GmoPgBankDirect) method;
            String str19 = gmoPgBankDirect.f60467a;
            TextClause textClause10 = new TextClause(gmoPgBankDirect.f60468b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str20 = gmoPgBankDirect.f60469c;
            return new b(str19, textClause10, str20 != null ? new TextClause(str20, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, e(method), gmoPgBankDirect.f60470g == null, a(gmoPgBankDirect.i));
        }
        if (!(method instanceof TopupMethod.SuggestedMethod)) {
            throw new NoWhenBranchMatchedException();
        }
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Suggested method " + method + " can't be selected");
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
        return null;
    }

    public final vye.f g(EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data preselectedInstitutionInfo, boolean z) {
        Intrinsics.checkNotNullParameter(preselectedInstitutionInfo, "preselectedInstitutionInfo");
        String f72268b = preselectedInstitutionInfo.getF72268b();
        return new vye.f(new TextClause(f72268b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(f72268b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ((di6.a) this.f90933a).d(preselectedInstitutionInfo.getF72269c()), preselectedInstitutionInfo, z);
    }
}
