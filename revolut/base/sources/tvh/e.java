package tvh;

import a83.w0;
import a83.z;
import android.os.Parcelable;
import aw0.bb;
import aw0.cb;
import aw0.l1;
import aw0.o9;
import aw0.p9;
import aw0.r2;
import aw0.t0;
import com.google.android.gms.wallet.WalletConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.mf;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.credit.application.plugins.api.models.action_button.Button;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.OfferContentScreenContract$InputData;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$SepaDirectDebit;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentFee;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.transaction.recogniser.api.domain.models.RecogniserTransaction;
import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import com.revolut.feature.wealth.models.robo.BenchmarkInfo;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.marketnews.api.delegate.WealthTopStoriesContract$TopStoriesParcel;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import cv3.p;
import cv3.r;
import cv3.s;
import cv3.x;
import d9.e1;
import dx4.b4;
import dx4.d4;
import ip0.hm0;
import ip0.jm0;
import ip0.vj0;
import ip0.zj;
import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kxk.o;
import ms0.h4;
import od0.i;
import pf4.q;
import pr6.j;
import pr6.m;
import u36.l;
import uef.k;
import uw2.n;
import v17.t;
import v7f.f;
import zhm.a0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f274771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f274772c;

    public /* synthetic */ e(Object obj2, int i, Object obj3, Object obj4) {
        this.f274770a = i;
        this.f274771b = obj3;
        this.f274772c = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05b4 A[PHI: r7 r16 r26 r28 r30 r31 r39 r40
      0x05b4: PHI (r7v13 tvb.e) = (r7v12 tvb.e), (r7v45 tvb.e) binds: [B:283:0x05b1, B:280:0x05a1] A[DONT_GENERATE, DONT_INLINE]
      0x05b4: PHI (r16v4 java.lang.Enum) = (r16v33 java.lang.Enum), (r16v34 java.lang.Enum) binds: [B:283:0x05b1, B:280:0x05a1] A[DONT_GENERATE, DONT_INLINE]
      0x05b4: PHI (r26v5 com.revolut.feature.shops.api.model.ShopsCampaignOffer) = 
      (r26v4 com.revolut.feature.shops.api.model.ShopsCampaignOffer)
      (r26v11 com.revolut.feature.shops.api.model.ShopsCampaignOffer)
     binds: [B:283:0x05b1, B:280:0x05a1] A[DONT_GENERATE, DONT_INLINE]
      0x05b4: PHI (r28v7 twb.n) = (r28v6 twb.n), (r28v12 twb.n) binds: [B:283:0x05b1, B:280:0x05a1] A[DONT_GENERATE, DONT_INLINE]
      0x05b4: PHI (r30v7 java.lang.String) = (r30v6 java.lang.String), (r30v13 java.lang.String) binds: [B:283:0x05b1, B:280:0x05a1] A[DONT_GENERATE, DONT_INLINE]
      0x05b4: PHI (r31v5 tvb.c) = (r31v4 tvb.c), (r31v6 tvb.c) binds: [B:283:0x05b1, B:280:0x05a1] A[DONT_GENERATE, DONT_INLINE]
      0x05b4: PHI (r39v3 boolean) = (r39v2 boolean), (r39v4 boolean) binds: [B:283:0x05b1, B:280:0x05a1] A[DONT_GENERATE, DONT_INLINE]
      0x05b4: PHI (r40v2 boolean) = (r40v1 boolean), (r40v3 boolean) binds: [B:283:0x05b1, B:280:0x05a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x09ee  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r70, java.lang.Object r71, java.lang.Object r72) {
        /*
            Method dump skipped, instruction units count: 2567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tvh.e.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        l lVar = (l) this.f274771b;
        u36.b bVar = (u36.b) this.f274772c;
        List assets = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(assets, "assets");
        String str = bVar.f276781b;
        String string = d0.F0(str).toString();
        if (string.length() != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj5 : assets) {
                t36.c cVar = (t36.c) obj5;
                xi0.b bVar2 = cVar.f267659a;
                f01.c cVar2 = lVar.f276788a;
                if (jli.g.d(cVar2.b(ix0.d0.a(bVar2, null)).toString(), string) || jli.g.d(cVar2.b(new CurrencyClause(cVar.f267659a, null, null, 6)).toString(), string)) {
                    arrayList.add(obj5);
                }
            }
            assets = arrayList;
        }
        if (assets.isEmpty()) {
            if (string.length() <= 0) {
                return f0.f322471a;
            }
            List listC = u.c(new FullScreenStateDelegate.Model("CeFiToDeFiAssetPicker_SearchEmpty", new TextLocalisedClause(R$string.search_empty_title, null, null, 14), new TextLocalisedClause(R.string.search_empty_message, u.c(str), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.feature.defi.exchange.impl.R$string.crypto_common_action_clear_search, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1984));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        List<t36.c> list = assets;
        ArrayList arrayList2 = new ArrayList(w.t(list, 10));
        for (t36.c cVar3 : list) {
            xi0.b bVar3 = cVar3.f267659a;
            xi0.b bVar4 = cVar3.f267659a;
            String str2 = bVar3.f306286a;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(str2, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62);
            CurrencyClause currencyClauseA = ix0.d0.a(bVar4, null);
            CurrencyClause currencyClause = new CurrencyClause(bVar4, null, null, 6);
            t36.a aVar = cVar3.f267660b;
            arrayList2.add(new RowDelegate.Model(str2, image40, currencyClauseA, null, 0, currencyClause, null, null, 0, aVar != null ? new RowDelegate.Model.c.b(new MoneyClause(aVar.f267657b, new MoneyClause.Format.Defaults(null, ScaleMode.CryptoHoldingFormat.f51439a, false, false, 13), null, null, 12), new MoneyClause(aVar.f267658c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, false, 124) : null, false, null, false, null, null, null, null, null, null, cVar3, null, 0, 0, 0, 0, 532675544));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r74, java.lang.Object r75, java.lang.Object r76) {
        /*
            Method dump skipped, instruction units count: 1273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tvh.e.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03a8  */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.revolut.core.ui_kit.models.Style, java.lang.Integer, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r68, java.lang.Object r69, java.lang.Object r70) {
        /*
            Method dump skipped, instruction units count: 2834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tvh.e.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        k kVar = (k) this.f274771b;
        TransactionRecogniserDetails transactionRecogniserDetails = (TransactionRecogniserDetails) this.f274772c;
        gef.a content = (gef.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ArrayList arrayList = content.f143281a;
        RecogniserTransaction recogniserTransaction = transactionRecogniserDetails.f91803a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj5 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            RecogniserTransaction recogniserTransaction2 = (RecogniserTransaction) obj5;
            arrayList2.add(((dff.b) kVar.f279358a).b(recogniserTransaction2, Intrinsics.f(recogniserTransaction2.f91800a, recogniserTransaction.f91800a)));
            i = i2;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        q qVar;
        String str;
        TextLocalisedClause textLocalisedClause;
        String str2;
        Click click;
        List listC;
        o oVar = (o) this.f274771b;
        pf4.e eVar = (pf4.e) this.f274772c;
        s content = (s) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(content, "content");
        r rVar = content.f109267a;
        String str3 = content.d;
        TextLocalisedClause textLocalisedClause2 = null;
        p pVar = rVar instanceof p ? (p) rVar : null;
        if (pVar == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "CreditCardOfferContentStateMapper", "Unsupported header " + rVar, null, h0Var);
            pVar = null;
        }
        if (pVar != null) {
            x xVar = pVar.f109263a;
            ResourceImage resourceImageA = !xVar.f109280j ? q74.b.a(((OfferContentScreenContract$InputData) oVar.f190611b).f68136g) : null;
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_constructor_tile_title, u.c(xVar.f109276b), null, 12);
            dx4.q qVar2 = xVar.d;
            ResourceImage resourceImage = qVar2 != null ? new ResourceImage(c8g.c.v(qVar2), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null;
            boolean z = xVar.e != null;
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_constructor_tile_subtitle, u.c(xVar.f109277c), null, 12);
            b4 b4Var = xVar.f109278g;
            cv3.v vVar = xVar.f;
            if (b4Var != null) {
                int i = com.revolut.feature.credit.core.R$string.credit_application_constructor_tile_label;
                Intrinsics.checkNotNullParameter(b4Var, "<this>");
                textLocalisedClause = new TextLocalisedClause(i, u.c(new CompositeClause(d4.a(b4Var), null, null, null, 14)), null, 12);
            } else if (vVar != null) {
                int i2 = com.revolut.feature.credit.core.R$string.credit_application_constructor_tile_label;
                String str4 = vVar.f109271a;
                dx4.l lVar = vVar.f109272b;
                if (lVar != null) {
                    str2 = str4;
                    click = new Click(28, (Integer) null, (Object) lVar, str2, false);
                } else {
                    str2 = str4;
                    click = null;
                }
                textLocalisedClause = new TextLocalisedClause(i2, u.c(new TextClause(str2, (Style) click, (Integer) null, false, (o9) null, (List) null, 124)), null, 12);
            } else {
                textLocalisedClause = null;
            }
            cv3.w wVar = xVar.i;
            if (wVar == null || (listC = u.c(new TextNavBarMenuItem(wVar.f109274b.f120542a, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_manual_input_title_value, u.c(wVar.f109273a), null, 12), null, null, 12))) == null) {
                listC = f0.f322471a;
            }
            qVar = new q(resourceImageA, textLocalisedClause3, resourceImage, z, textLocalisedClause4, textLocalisedClause, listC);
        } else {
            qVar = null;
        }
        pf4.r rVar2 = new pf4.r(qVar);
        TextLocalisedClause textLocalisedClause5 = str3 != null ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_offer_action, u.c(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null;
        Button button = content.f;
        if (button != null && (str = button.f66298a) != null) {
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_offer_action_secondary, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        }
        return new pf4.u(((pf4.b) oVar.f190612c).c(content, eVar.f235435a), rVar2, zBooleanValue, textLocalisedClause5, textLocalisedClause2, str3 != null, eVar.f235437c);
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.c cVar = (com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.c) this.f274771b;
        uj6.k kVar = (uj6.k) this.f274772c;
        qg6.b preview = (qg6.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(preview, "preview");
        Set set = kVar.f280497c;
        Map map = kVar.e;
        Map map2 = kVar.d;
        aim.e eVarB = u.b();
        ThirdPartyBrazil thirdPartyBrazil = preview.e;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(((di6.a) cVar.f72616b).c(thirdPartyBrazil.f73115a), null, null, false, null, false, 60);
        TextClause textClause = new TextClause(thirdPartyBrazil.f73116b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        uj6.l lVar = cVar.f72617c;
        we6.k kVar2 = lVar.e;
        we6.k kVar3 = we6.k.STEERING;
        RowDelegate.Model model = new RowDelegate.Model("ID_THIRD_PARTY_ITEM", image40, textClause, null, 0, null, null, null, 0, kVar2 == kVar3 ? new pf(new TextLocalisedClause(R.string.common_action_change, null, null, 14), null, null, false, null, null, 510) : null, false, null, false, null, null, new mf(new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true), null, null, null, null, null, 0, 0, 0, 0, 536804344);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        eVarB.addAll(ne6.b.a(cVar.f72615a, preview.d, set, new z(cVar, 17, map, map2), map, map2, 32));
        return new uj6.r(u.a(eVarB), false, new TextClause(preview.f245655a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(preview.f245656b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), new TextClause(preview.f245657c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.topup_pix_smart_transfer_review_authorization_continue_with, u.c(new TextClause(preview.e.f73116b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), lVar.e == kVar3 ? new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.open_banking_common_action_not_now, null, null, 14) : null);
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        ArrayList arrayList;
        String str;
        CellDetailsDelegate.Model model;
        Iterable iterable;
        CellDetailsNoteDelegate.Model modelA;
        String str2;
        String str3;
        String str4;
        CellDetailsNoteDelegate.Model modelA2;
        String str5;
        String str6;
        String str7;
        or6.a aVar;
        or6.a aVar2;
        or6.a aVar3;
        or6.a aVar4;
        uu6.r rVar = (uu6.r) this.f274771b;
        uu6.h hVar = (uu6.h) this.f274772c;
        i paymentDetailsOptional = (i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(paymentDetailsOptional, "paymentDetailsOptional");
        if (!paymentDetailsOptional.d()) {
            return new uu6.k(iii.c.b(null, null, 6, true));
        }
        pr6.g gVar = (pr6.g) paymentDetailsOptional.c();
        pr6.e payment = gVar.f238951a;
        dj0.d dVar = payment.f;
        dj0.d dVar2 = payment.f;
        or6.g gVar2 = payment.f238944l;
        j paymentMethod = payment.k;
        lr6.a aVar5 = payment.f238939b;
        uu6.l lVar = new uu6.l(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), rVar.f283158a.c(payment), new TimeClause(oi0.d.R(payment.f238940c), new TimeClause.Format.Pretty(q0.ONLY_TIME), null, null, 12), hv6.b.b(paymentMethod, gVar2 != null ? gVar2.e : null), hv6.b.a(aVar5, payment.f238943j));
        aim.e eVarB = u.b();
        dj0.d equivalentAmount = gVar.f238953c;
        if (equivalentAmount != null) {
            Intrinsics.checkNotNullParameter(equivalentAmount, "equivalentAmount");
            CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("LIST_EQUIVALENT_AMOUNT", new t0((Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_details_section_equivalent_to, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(equivalentAmount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model2);
        }
        aim.e eVarB2 = u.b();
        Intrinsics.checkNotNullParameter(payment, "payment");
        eVarB2.add(new CellDetailsDelegate.Model("LIST_ID_STATUS_ITEM", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_word_status, null, null, 14), wu6.b.b(aVar5), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        String id10 = payment.f238938a;
        Intrinsics.checkNotNullParameter(id10, "id");
        eVarB2.add(iv6.q.a("LIST_ID_PAYMENT_ID", id10, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_payment_id, null, null, 14), new iv6.s(id10)));
        Intrinsics.checkNotNullParameter(payment, "payment");
        LocalDateTime localDateTime = payment.e;
        CellDetailsDelegate.Model model3 = (localDateTime == null || aVar5 != lr6.a.CAPTURED) ? null : new CellDetailsDelegate.Model("LIST_ID_SETTLED_ON", new t0((Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_settles_on, null, null, 14), (Image) null, 0, false, 30), new TimeClause(oi0.d.R(localDateTime), new TimeClause.Format.Pretty(q0.DATETIME), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        if (model3 != null) {
            eVarB2.add(model3);
        }
        String arn = payment.f238950s;
        if (arn != null) {
            Intrinsics.checkNotNullParameter(arn, "arn");
            eVarB2.add(iv6.q.a("LIST_ID_ARN", arn, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_arn, null, null, 14), new iv6.r(arn)));
        }
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        a0.x(eVarA, eVarB);
        nr6.b order = gVar.f238952b;
        if (order != null) {
            iv6.f fVar = rVar.f283160c;
            Intrinsics.checkNotNullParameter(order, "order");
            ListSubheaderDelegate.Model model4 = new ListSubheaderDelegate.Model("LIST_ID_ODER_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_order_info, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            RowDelegate.Model modelD = fVar.f168756a.d(order, true);
            yp0.b.l(modelD, 0, 0, 0, 0, null, false, 63);
            List listK = v.k(model4, modelD);
            if (listK != null) {
                eVarB.addAll(listK);
            }
        }
        iv6.c cVar = rVar.f283159b;
        lr6.h hVar2 = payment.f238949r;
        pr6.c cVar2 = payment.f238947p;
        AcquiringPayment$SepaDirectDebit acquiringPayment$SepaDirectDebit = payment.f238945m;
        jw6.c cVar3 = cVar.f168755b;
        jw6.d dVar3 = cVar.f168754a;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i = iv6.b.f168752a[paymentMethod.ordinal()];
        if (i == 1 || i == 2) {
            arrayList = arrayList2;
            arrayList4.add(new CellDetailsDelegate.Model("LIST_ID_CARD_TYPE_ITEM", new t0((Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_payment_method_type, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_pay_by_bank_method, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 32760));
            if (cVar2 != null && (str = cVar2.f) != null) {
                arrayList4.add(dVar3.b(str));
            }
        } else if (i == 3) {
            arrayList = arrayList2;
            if (gVar2 != null) {
                arrayList3.addAll(iv6.c.b(gVar2, cVar2, com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_paid_with));
            } else {
                arrayList3.add(new CellDetailsDelegate.Model("LIST_ID_PAID_WITH", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_paid_with, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_paid_with_revolut, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760));
            }
            arrayList4.add(new CellDetailsDelegate.Model("LIST_ID_REVOLUT_PAY_TYPE_ITEM", new t0((Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_payment_method_type, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_payment_method_revolut_pay, null, null, 14), null, null, null, null, 0, null, false, false, null, null, 32760));
            if (cVar2 != null && (str4 = cVar2.f) != null) {
                arrayList4.add(dVar3.b(str4));
            }
            if (cVar2 != null && (str3 = cVar2.d) != null) {
                arrayList4.add(dVar3.a(str3));
            }
            if (cVar2 != null && (str2 = cVar2.e) != null) {
                arrayList4.add(dVar3.c(str2));
            }
            if (hVar2 != null && (modelA = cVar3.a(hVar2)) != null) {
                arrayList4.add(modelA);
            }
        } else if (i != 4) {
            if (gVar2 != null) {
                aim.e eVarB3 = u.b();
                or6.c cVar4 = gVar2.f228071c;
                if (cVar4 != null && (aVar4 = cVar4.f228068c) != null) {
                    eVarB3.add(iv6.c.a("LIST_ID_CARD_CHECK_CVV_ITEM", com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_card_cvv, aVar4));
                }
                if (cVar4 != null && (aVar3 = cVar4.f228067b) != null) {
                    eVarB3.add(iv6.c.a("LIST_ID_CARD_CHECK_POSTCODE_ITEM", com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_card_postcode, aVar3));
                }
                if (cVar4 != null && (aVar2 = cVar4.f228066a) != null) {
                    eVarB3.add(iv6.c.a("LIST_ID_CARD_CHECK_ADDRESS_ITEM", com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_card_address, aVar2));
                }
                if (cVar4 != null && (aVar = cVar4.d) != null) {
                    eVarB3.add(iv6.c.a("LIST_ID_CARD_CHECK_THREEDS_ITEM", com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_card_threeds, aVar));
                }
                arrayList2.addAll(u.a(eVarB3));
                arrayList3.addAll(iv6.c.b(gVar2, cVar2, com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_payment_method_type));
            }
            arrayList = arrayList2;
        } else {
            arrayList = arrayList2;
            arrayList4.add(new CellDetailsDelegate.Model("LIST_ID_CARD_TYPE_ITEM", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_payment_method_type, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_sepa, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
            if (acquiringPayment$SepaDirectDebit != null) {
                arrayList4.add(new CellDetailsDelegate.Model("LIST_ID_IBAN_ITEM", new t0((Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_iban, null, null, 14), (Image) null, 0, false, 30), new TextClause(j6.a.q("•••• ", acquiringPayment$SepaDirectDebit.f73364a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760));
            }
            if (cVar2 != null && (str7 = cVar2.f) != null) {
                arrayList4.add(dVar3.b(str7));
            }
            if (cVar2 != null && (str6 = cVar2.d) != null) {
                arrayList4.add(dVar3.a(str6));
            }
            if (cVar2 != null && (str5 = cVar2.e) != null) {
                arrayList4.add(dVar3.c(str5));
            }
            if (hVar2 != null && (modelA2 = cVar3.a(hVar2)) != null) {
                arrayList4.add(modelA2);
            }
        }
        yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
        yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
        List listO = i2b.a.o(arrayList4, arrayList3);
        ArrayList arrayList5 = arrayList;
        yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
        List listO2 = i2b.a.o(listO, arrayList5);
        if (listO2.isEmpty()) {
            listO2 = null;
        }
        List listQ = listO2 != null ? i2b.a.q(new ListSubheaderDelegate.Model("LIST_ID_CARD_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_payment_method, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), listO2) : null;
        if (listQ == null) {
            listQ = f0.f322471a;
        }
        a0.x(listQ, eVarB);
        Intrinsics.checkNotNullParameter(payment, "payment");
        aim.e eVarB4 = u.b();
        eVarB4.add(new ListSubheaderDelegate.Model("LIST_ID_TOTAL_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_funds_summary, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        aim.e eVarB5 = u.b();
        eVarB5.add(new CellDetailsDelegate.Model("LIST_ID_TOTAL_AMOUNT_ITEM", new t0((Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_amount, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        List list = payment.f238946n;
        if (!list.isEmpty()) {
            t0 t0Var = new t0((Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_fees, null, null, 14), (Image) null, 0, false, 30);
            dj0.d.Companion.getClass();
            dj0.d dVarO = dj0.d.e;
            int i2 = 0;
            for (Object obj5 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                dVarO = i2 == 0 ? ((AcquiringPaymentFee) obj5).f73365a : pyd.c.O(dVarO, ((AcquiringPaymentFee) obj5).f73365a);
                i2 = i3;
            }
            eVarB5.add(new CellDetailsDelegate.Model("LIST_ID_TOTAL_PROCESSING_FEE_ITEM", t0Var, new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, null, null, 31736));
        }
        int i5 = 10;
        t0 t0Var2 = new t0((Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_net, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, 0, false, 30);
        dj0.d dVar4 = payment.i;
        eVarB5.add(new CellDetailsDelegate.Model("LIST_ID_TOTAL_NET_ITEM", t0Var2, new MoneyClause(dVar4 == null ? dVar2 : dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        aim.e eVarA2 = u.a(eVarB5);
        yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
        a0.x(eVarA2, eVarB4);
        a0.x(u.a(eVarB4), eVarB);
        iv6.h hVar3 = rVar.d;
        boolean z = hVar.f283143b;
        Data settlementTransactionsData = hVar.e;
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(settlementTransactionsData, "settlementTransactionsData");
        List list2 = payment.o;
        int i6 = 9;
        if (list2.isEmpty()) {
            iterable = f0.f322471a;
        } else {
            List list3 = list2;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj6 : list3) {
                if (((pr6.o) obj6).d == m.RELEASED) {
                    arrayList6.add(obj6);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            for (Object obj7 : list3) {
                if (hVar3.f168758b.contains(((pr6.o) obj7).d)) {
                    arrayList7.add(obj7);
                }
            }
            if (arrayList7.isEmpty()) {
                model = null;
            } else {
                t0 t0Var3 = new t0((Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_settling, null, null, 14), (Image) null, 0, false, 30);
                dj0.d.Companion.getClass();
                dj0.d dVarO2 = dj0.d.e;
                int i21 = 0;
                for (Object obj8 : arrayList7) {
                    int i22 = i21 + 1;
                    if (i21 < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO2 = i21 == 0 ? ((pr6.o) obj8).e : pyd.c.O(dVarO2, ((pr6.o) obj8).e);
                    i21 = i22;
                }
                model = new CellDetailsDelegate.Model("LIST_ID_SETTLING_HEADER", t0Var3, new MoneyClause(dVarO2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
            }
            aim.e eVarB6 = u.b();
            if (arrayList6.isEmpty()) {
                eVarB6.add(new CellDetailsDelegate.Model("LIST_ID_SETTLED_HEADER", new t0((Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_settled_title, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(new dj0.d(0L, dVar2.f115083b), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
                if (model != null) {
                    eVarB6.add(model);
                }
            } else {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_acquiring_payment_details_settled, u.c(Integer.valueOf(arrayList6.size())), null, 12);
                ArrayList arrayList8 = new ArrayList();
                Iterator it8 = arrayList6.iterator();
                while (it8.hasNext()) {
                    dj0.d dVar5 = ((pr6.o) it8.next()).f238957g;
                    if (dVar5 != null) {
                        arrayList8.add(dVar5);
                    }
                }
                dj0.d.Companion.getClass();
                dj0.d dVarO3 = dj0.d.e;
                int i32 = 0;
                for (Object obj9 : arrayList8) {
                    int i33 = i32 + 1;
                    if (i32 < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO3 = i32 == 0 ? (dj0.d) obj9 : pyd.c.O(dVarO3, (dj0.d) obj9);
                    i32 = i33;
                }
                a0.x(i26.l.e(new ListSubheaderDelegate.Model("LIST_ID_SETTLED_HEADER", (Image) null, (Clause) textLocalisedClause, (Image) new ResourceImage(z ? R$drawable.uikit_icn_16_chevron_up : R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (Clause) new MoneyClause(dVarO3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), (String) null, (ListSubheaderDelegate.Model.a) ListSubheaderDelegate.Model.a.C0411a.f52724a, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65442), z ? (List) iii.c.f(settlementTransactionsData, new iui.a(i6), new iui.b(8), new igh.o(hVar3, 17)) : f0.f322471a), eVarB6);
                if (model != null) {
                    eVarB6.add(model);
                }
            }
            aim.e eVarA3 = u.a(eVarB6);
            yp0.b.k(eVarA3, 0, 0, 0, 0, 31);
            iterable = eVarA3;
        }
        a0.x(iterable, eVarB);
        iv6.o oVar = rVar.e;
        Data timeline = hVar.f283144c;
        boolean z3 = hVar.d;
        Intrinsics.checkNotNullParameter(timeline, "timeline");
        a0.x((List) iii.c.f(timeline, new iui.a(i5), new iui.b(i6), new w0(oVar, z3, 5)), eVarB);
        return new uu6.j(lVar, u.a(eVarB));
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        Object next;
        hxi.d dVar;
        com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.b bVar = (com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.b) this.f274771b;
        uwi.k kVar = (uwi.k) this.f274772c;
        List lounges = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(lounges, "lounges");
        if (lounges.isEmpty()) {
            List listC = u.c(new FullScreenStateDelegate.Model("ID_NO_LOUNGES", new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_airport_details_no_results_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_airport_details_no_results_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32736));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        List list = (List) iii.c.f(kVar.f283677c, new uwi.v(0), new utk.b(12), new n(1));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : lounges) {
            String str = ((svi.b) obj5).f;
            Object objO = linkedHashMap.get(str);
            if (objO == null) {
                objO = v0.a.o(linkedHashMap, str);
            }
            ((List) objO).add(obj5);
        }
        List<Map.Entry> listP0 = zhm.d0.P0(linkedHashMap.entrySet(), new uwi.x());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        for (Map.Entry entry : listP0) {
            String str2 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(j6.a.q("ID_TERMINAL_", str2), (Image) null, (Clause) new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            List<svi.b> list3 = list2;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            for (svi.b bVar2 : list3) {
                if (list == null) {
                    dVar = hxi.d.UNKNOWN;
                } else {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it8.next();
                        if (Intrinsics.f(((svi.b) next).f265874a, bVar2.f265874a)) {
                            break;
                        }
                    }
                    boolean z = next != null;
                    if (z) {
                        dVar = hxi.d.SAVED;
                    } else {
                        if (z) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar = hxi.d.NOT_SAVED;
                    }
                }
                ListingCardBasicDelegate.Model modelB = bVar.f99036b.b(bVar2, dVar);
                yp0.b.l(modelB, 0, 0, 0, 0, null, false, 63);
                arrayList2.add(modelB);
            }
            arrayList.add(i2b.a.q(model, arrayList2));
        }
        return w.u(arrayList);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        ux6.j jVar = (ux6.j) this.f274771b;
        ux6.r rVar = (ux6.r) this.f274772c;
        List items = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        String str = jVar.f283881b;
        boolean z = jVar.f283882c;
        if (z && str != null && !d0.W(str)) {
            String string = d0.F0(str).toString();
            ArrayList arrayList = new ArrayList();
            for (Object obj5 : items) {
                gw6.d dVar = (gw6.d) obj5;
                if (jli.g.h(dVar.b(), string) || jli.g.h(dVar.a(), string) || jli.g.h(dVar.c(), string)) {
                    arrayList.add(obj5);
                }
            }
            items = arrayList;
        }
        String str2 = jVar.f283881b;
        boolean z3 = jVar.e;
        boolean z4 = jVar.d;
        if (items.isEmpty() && z) {
            if (str2 == null) {
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                str2 = "";
            }
            return yp0.b.i(new RowDelegate.Model("ID_EMPTY_STATE_ALL", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30), null, null, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_who_to_bill_search_no_results_description, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580), new ListSubheaderDelegate.Model("ITEM_ID_EMPTY_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_who_to_bill_section_customers_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp8, 0, 0, 57338), null, 0, 0, 126);
        }
        if (items.isEmpty()) {
            if (!z3) {
                return u.c(ux6.r.b());
            }
            RowDelegate.Model model = new RowDelegate.Model("ID_EMPTY_STATE_ALL", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_profile, Integer.valueOf(R$attr.uikit_colorGrey50), R$attr.uikit_colorBackground, 12.0f, Float.valueOf(16.0f), null, 32), null, null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_who_to_bill_empty_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737708);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return u.c(model);
        }
        if (z) {
            aim.e eVarB = u.b();
            if (!z3) {
                eVarB.add(ux6.r.b());
            }
            TextLocalisedClause textLocalisedClause = items.size() >= 3 ? z4 ? new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_action_show_less, null, null, 14) : new TextLocalisedClause(R.string.common_show_more, null, null, 14) : null;
            if (!z4) {
                items = zhm.d0.V0(items, 3);
            }
            List list = items;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList2.add(rVar.a((gw6.d) it8.next()));
            }
            eVarB.addAll(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("ID_SEARCH_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_who_to_bill_section_customers_title, null, null, 14), (ResourceImage) null, false, false, (Clause) textLocalisedClause, true, (Object) null, (AnalyticsContext) null, 0, R$attr.uikit_dp8, 0, 0, (String) null, 245562), null, 0, 0, 126));
            return u.a(eVarB);
        }
        aim.e eVarB2 = u.b();
        eVarB2.add(new SearchButtonDelegate.Model("ID_SEARCH_ITEM", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_word_search, null, null, 14), null, 0, 0, 508));
        if (!z3) {
            eVarB2.add(ux6.r.b());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj6 : items) {
            Character chQ0 = kotlin.text.f0.Q0(((gw6.d) obj6).b());
            Character chValueOf = Character.valueOf((chQ0 == null || !Character.isLetter(chQ0.charValue())) ? '#' : chQ0.charValue());
            Object arrayList3 = linkedHashMap.get(chValueOf);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(chValueOf, arrayList3);
            }
            ((List) arrayList3).add(obj6);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            List list2 = (List) entry.getValue();
            String strValueOf = String.valueOf(cCharValue);
            ListSubheaderDelegate.Model model2 = new ListSubheaderDelegate.Model(j6.a.q("ID_HEADER_", strValueOf), (Image) null, (Clause) new TextClause(jli.g.c(strValueOf), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp8, 0, 0, 57338);
            List list3 = list2;
            ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                arrayList5.add(rVar.a((gw6.d) it9.next()));
            }
            yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
            a0.x(i2b.a.q(model2, arrayList5), arrayList4);
        }
        eVarB2.addAll(arrayList4);
        return u.a(eVarB2);
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        uxe.q qVar = (uxe.q) this.f274771b;
        uxe.m mVar = (uxe.m) this.f274772c;
        so6.a content = (so6.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Set set = mVar.f283996b;
        aim.e eVarB = u.b();
        ne6.b bVar = qVar.f284000a;
        eVarB.addAll(ne6.b.a(bVar, content.e, set, new umd.n(qVar, 18), null, null, 56));
        RowDelegate.Model model = new RowDelegate.Model("ID_REVOKE_ITEM", null, new TextLocalisedClause(com.revolut.feature.topup_screen.impl.R$string.open_finance_authrization_details_revoke_action, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        String str = content.f;
        if (str != null) {
            eVarB.add(((hj6.a) bVar).d(str));
        }
        return u.a(eVarB);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        Clause textLocalisedClause;
        Parcelable currencyImage;
        Parcelable parcelableA;
        v0k.d dVar = (v0k.d) this.f274771b;
        qzj.a aVar = (qzj.a) this.f274772c;
        List articlesContent = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(articlesContent, "articlesContent");
        if (articlesContent.isEmpty() && zBooleanValue) {
            dVar.getClass();
            return v0k.d.c(aVar);
        }
        dVar.getClass();
        v0k.d.a(aVar.f250661a.f101803a);
        if (articlesContent.isEmpty()) {
            return f0.f322471a;
        }
        ListSubheaderDelegate.Model modelB = v0k.d.b(aVar);
        List<rzj.f> list = articlesContent;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (rzj.f fVar : list) {
            List instruments = g4i.a.f(fVar);
            String strQ = j6.a.q("WEALTH_TOP_STORY_ID_", fVar.d().f101797a);
            TextClause textClause = new TextClause(fVar.d().f101798b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            UrlImage urlImage = new UrlImage(fVar.d().f101799c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
            WealthTopStoriesContract$TopStoriesParcel wealthTopStoriesContract$TopStoriesParcel = new WealthTopStoriesContract$TopStoriesParcel(fVar.d());
            Intrinsics.checkNotNullParameter(instruments, "instruments");
            List<rzj.j> list2 = instruments;
            ArrayList arrayList2 = new ArrayList();
            for (rzj.j jVar : list2) {
                if (jVar instanceof rzj.h) {
                    parcelableA = e1k.b.b(((rzj.h) jVar).f258695a);
                } else {
                    if (!(jVar instanceof rzj.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    parcelableA = e1k.b.a(((rzj.i) jVar).f258696a);
                }
                arrayList2.add(parcelableA);
            }
            if (arrayList2.size() > 1) {
                textLocalisedClause = yoj.b.m(new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), arrayList2);
            } else if (instruments.isEmpty()) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.marketnews.impl.R$string.wealth_news_widget_no_instrument_placeholder, null, null, 14);
            } else {
                rzj.j item = (rzj.j) zhm.d0.b0(instruments);
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof rzj.h) {
                    InstrumentTicker instrumentTicker = ((rzj.h) item).f258695a;
                    TextClause textClauseB = e1k.b.b(instrumentTicker);
                    BigDecimal bigDecimalN = jb3.l.N(instrumentTicker);
                    Clause[] elements = {textClauseB, bigDecimalN != null ? xqi.a.c(bigDecimalN, false, false, false, false, true, 79) : null};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    textLocalisedClause = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements));
                } else {
                    if (!(item instanceof rzj.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vel.a aVar2 = ((rzj.i) item).f258696a;
                    Clause[] elements2 = {e1k.b.a(aVar2), cp5.d.z(aVar2.f288344a) ? xqi.a.b(aVar2.f288346c, false, 1) : xqi.a.c(aVar2.f288346c, false, false, false, false, true, 79)};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    textLocalisedClause = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements2));
                }
            }
            Clause clause = textLocalisedClause;
            ArrayList arrayList3 = new ArrayList();
            for (rzj.j jVar2 : list2) {
                if (jVar2 instanceof rzj.h) {
                    currencyImage = new InstrumentImage(((rzj.h) jVar2).f258695a.f105112b, 30, null, null);
                } else if (jVar2 instanceof rzj.i) {
                    currencyImage = new CurrencyImage(((rzj.i) jVar2).f258696a.f288344a.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
                } else {
                    if (jVar2 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    currencyImage = null;
                }
                if (currencyImage != null) {
                    arrayList3.add(currencyImage);
                }
            }
            NewsDelegate.Model model = new NewsDelegate.Model(strQ, textClause, urlImage, new TextClause(fVar.d().f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), jbh.f.a(jli.b.g(fVar.d().e)), clause, arrayList3, NewsDelegate.Model.b.a.f52847a, null, wealthTopStoriesContract$TopStoriesParcel, null, 2592);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
        }
        NewsDelegate.INSTANCE.getClass();
        qv0.i[] elements3 = {modelB, new hg("WEALTH_TOP_STORIES_SCROLLER_ID", arrayList, 2, NewsDelegate.f52830h, null, new gg.c(0), false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28624)};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        return kotlin.collections.d.L(elements3);
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        t tVar = (t) this.f274771b;
        v17.k domainState = (v17.k) this.f274772c;
        v17.j filtersInfo = (v17.j) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(filtersInfo, "filtersInfo");
        ArrayList arrayList = new ArrayList();
        t17.m mVar = tVar.f285266b;
        t17.j jVar = tVar.f285265a;
        List list = domainState.f285246c;
        List list2 = domainState.e;
        FreelancerSalesFilters$CompoundFreelancerSalesFilter freelancerSalesFilters$CompoundFreelancerSalesFilter = domainState.f285244a;
        if (!list.isEmpty()) {
            int size = list.size();
            List list3 = freelancerSalesFilters$CompoundFreelancerSalesFilter.f73470b;
            cs6.g gVar = freelancerSalesFilters$CompoundFreelancerSalesFilter.f73469a;
            int size2 = list3.size();
            int i = com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_statuses_header_title_selected;
            int i2 = com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_statuses_header_title;
            t17.k kVar = (t17.k) jVar;
            kVar.getClass();
            Intrinsics.checkNotNullParameter("STATUS_HEADER", "headerId");
            Intrinsics.checkNotNullParameter("STATUS_HEADER", "headerId");
            arrayList.add(t17.p.a(size, size2, i, i2, "STATUS_HEADER"));
            List list4 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
            Iterator it8 = list4.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((t17.o) mVar).c((cs6.f) it8.next(), gVar));
            }
            List list5 = freelancerSalesFilters$CompoundFreelancerSalesFilter.f73470b;
            ArrayList arrayList3 = new ArrayList(w.t(list5, 10));
            Iterator it9 = list5.iterator();
            while (it9.hasNext()) {
                arrayList3.add(((t17.o) mVar).c((cs6.f) it9.next(), gVar));
            }
            arrayList.add(kVar.a(arrayList2, arrayList3, "STATUSES_GROUP"));
        }
        List list6 = filtersInfo.f285243b;
        if (!list6.isEmpty()) {
            int size3 = list6.size();
            int size4 = freelancerSalesFilters$CompoundFreelancerSalesFilter.f73471c.size();
            int i3 = com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_payment_methods_header_title_selected;
            int i5 = com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_payment_methods_header_title;
            t17.k kVar2 = (t17.k) jVar;
            kVar2.getClass();
            Intrinsics.checkNotNullParameter("PAYMENT_METHOD_HEADER", "headerId");
            Intrinsics.checkNotNullParameter("PAYMENT_METHOD_HEADER", "headerId");
            arrayList.add(t17.p.a(size3, size4, i3, i5, "PAYMENT_METHOD_HEADER"));
            List list7 = list6;
            ArrayList arrayList4 = new ArrayList(w.t(list7, 10));
            Iterator it10 = list7.iterator();
            while (it10.hasNext()) {
                arrayList4.add(((t17.o) mVar).b((cs6.e) it10.next()));
            }
            List list8 = freelancerSalesFilters$CompoundFreelancerSalesFilter.f73471c;
            ArrayList arrayList5 = new ArrayList(w.t(list8, 10));
            Iterator it11 = list8.iterator();
            while (it11.hasNext()) {
                arrayList5.add(((t17.o) mVar).b((cs6.e) it11.next()));
            }
            arrayList.add(kVar2.a(arrayList4, arrayList5, "PAYMENT_METHOD_GROUP"));
        }
        List list9 = domainState.d;
        if (!list9.isEmpty()) {
            int size5 = list9.size();
            int size6 = freelancerSalesFilters$CompoundFreelancerSalesFilter.d.size();
            int i6 = com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_types_header_title_selected;
            int i21 = com.revolut.feature.freelancer.impl.R$string.freelancer_sales_filters_types_header_title;
            t17.k kVar3 = (t17.k) jVar;
            kVar3.getClass();
            Intrinsics.checkNotNullParameter("TYPE_HEADER", "headerId");
            Intrinsics.checkNotNullParameter("TYPE_HEADER", "headerId");
            arrayList.add(t17.p.a(size5, size6, i6, i21, "TYPE_HEADER"));
            List list10 = list9;
            ArrayList arrayList6 = new ArrayList(w.t(list10, 10));
            Iterator it12 = list10.iterator();
            while (it12.hasNext()) {
                arrayList6.add(((t17.o) mVar).d((cs6.h) it12.next()));
            }
            List list11 = freelancerSalesFilters$CompoundFreelancerSalesFilter.d;
            ArrayList arrayList7 = new ArrayList(w.t(list11, 10));
            Iterator it13 = list11.iterator();
            while (it13.hasNext()) {
                arrayList7.add(((t17.o) mVar).d((cs6.h) it13.next()));
            }
            arrayList.add(kVar3.a(arrayList6, arrayList7, "TYPES_GROUP"));
        }
        if (!list2.isEmpty()) {
            FilteringDateRange filteringDateRange = freelancerSalesFilters$CompoundFreelancerSalesFilter.e;
            t17.k kVar4 = (t17.k) jVar;
            kVar4.getClass();
            t17.h hVar = kVar4.f267203b;
            Intrinsics.checkNotNullParameter("DATE_RANGE_HEADER", "headerId");
            arrayList.add(t17.h.a("DATE_RANGE_HEADER", filteringDateRange));
            List list12 = list2;
            ArrayList allDateRanges = new ArrayList(w.t(list12, 10));
            Iterator it14 = list12.iterator();
            while (it14.hasNext()) {
                allDateRanges.add(((t17.o) mVar).a((FilteringDateRange) it14.next()));
            }
            FilteringDateRange filteringDateRange2 = freelancerSalesFilters$CompoundFreelancerSalesFilter.e;
            t17.l lVarA = filteringDateRange2 != null ? ((t17.o) mVar).a(filteringDateRange2) : null;
            Intrinsics.checkNotNullParameter("DATE_RANGE_GROUP", "groupId");
            Intrinsics.checkNotNullParameter(allDateRanges, "allDateRanges");
            arrayList.add(hVar.b("DATE_RANGE_GROUP", allDateRanges, lVarA));
        }
        String str = freelancerSalesFilters$CompoundFreelancerSalesFilter.f;
        Set set = freelancerSalesFilters$CompoundFreelancerSalesFilter.f73473h;
        String str2 = freelancerSalesFilters$CompoundFreelancerSalesFilter.f73472g;
        boolean z = (str == null && str2 == null) ? false : true;
        t17.k kVar5 = (t17.k) jVar;
        kVar5.getClass();
        t17.c cVar = kVar5.f267204c;
        Intrinsics.checkNotNullParameter("AMOUNT_HEADER", "headerId");
        arrayList.add(t17.c.a("AMOUNT_HEADER", z));
        String str3 = freelancerSalesFilters$CompoundFreelancerSalesFilter.f;
        Intrinsics.checkNotNullParameter("MINIMUM_AMOUNT_ID", "minimumAmountItemId");
        Intrinsics.checkNotNullParameter("MAXIMUM_AMOUNT_ID", "maximumAmountItemId");
        a0.x(cVar.b("MINIMUM_AMOUNT_ID", str3, "MAXIMUM_AMOUNT_ID", str2), arrayList);
        Set allCurrencies = filtersInfo.f285242a;
        if (!allCurrencies.isEmpty()) {
            int size7 = allCurrencies.size();
            int size8 = set.size();
            t17.g gVar2 = kVar5.d;
            Intrinsics.checkNotNullParameter("CURRENCIES_HEADER", "headerId");
            arrayList.add(gVar2.a(size7, size8, "CURRENCIES_HEADER"));
            Intrinsics.checkNotNullParameter(domainState, "domainState");
            Intrinsics.checkNotNullParameter(allCurrencies, "allCurrencies");
            Intrinsics.checkNotNullParameter("SEE_ALL_CURRENCIES_BUTTON", "seeAllItemId");
            a0.x(gVar2.b(domainState.f, set, allCurrencies, "SEE_ALL_CURRENCIES_BUTTON"), arrayList);
        }
        return arrayList;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object o(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r57v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    private final java.lang.Object p(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r51v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r55, java.lang.Object r56, java.lang.Object r57) {
        /*
            Method dump skipped, instruction units count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tvh.e.q(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object r(Object obj2, Object obj3, Object obj4) {
        Iterable iterableI;
        List list = (List) this.f274771b;
        v7e.g gVar = (v7e.g) this.f274772c;
        v7e.f content = (v7e.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list2 = list;
        SubaccountType subaccountType = gVar.f286590a;
        boolean z = content.d;
        if (!(subaccountType instanceof SubaccountType.Personal) && !(subaccountType instanceof SubaccountType.Joint) && !(subaccountType instanceof SubaccountType.Group) && !(subaccountType instanceof SubaccountType.Pro) && !(subaccountType instanceof SubaccountType.Teen) && !(subaccountType instanceof SubaccountType.ProTax)) {
            if (!(subaccountType instanceof SubaccountType.Junior)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        if (z) {
            xi0.b bVar = content.f286587a;
            iterableI = yp0.b.i(new RowDelegate.Model("CURRENCY_LIST_ID", new RowDelegate.Model.MainImage.Image40(new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62), new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4), null, 0, new CurrencyClause(bVar, null, null, 6), null, null, 0, new pf(new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_creation_customise_select_currency_action_change, null, null, 14), 0 == true ? 1 : 0, null, false, null, null, 510), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800), new ListSubheaderDelegate.Model("CURRENCY_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_creation_customise_pockets_currency_picker_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
        } else {
            iterableI = f0.f322471a;
        }
        ArrayList arrayListE0 = zhm.d0.E0(iterableI, list2);
        ChosenBackground chosenBackground = gVar.f286592c;
        return new v7e.m(arrayListE0, chosenBackground != null ? chosenBackground.f63742b : null, !d0.W(gVar.f286591b), v7e.v.b(gVar.f286590a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.math.BigDecimal] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.math.BigDecimal] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    private final Object s(Object obj2, Object obj3, Object obj4) throws Throwable {
        TextLocalisedQuantityClause textLocalisedQuantityClause;
        ?? r3;
        BigDecimal bigDecimal;
        BigDecimal bigDecimalZ;
        ?? r62;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimalZ2;
        jm0 jm0Var;
        Integer num = (Integer) this.f274771b;
        v7f.a aVar = (v7f.a) this.f274772c;
        sdh.b chart = (sdh.b) obj2;
        ((Boolean) obj3).getClass();
        f.a aVar2 = v7f.f.Companion;
        Intrinsics.checkNotNullParameter(chart, "chart");
        r2 r2Var = new r2(new PercentageClause(e1.Z(chart.f261892c), (PercentageClause.Format) null, (Style) null, 6), null);
        if (num != null) {
            int iIntValue = num.intValue();
            textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.wealth_robo_insights_max_drawdown_recovery_period_description, Integer.valueOf(iIntValue), u.c(Integer.valueOf(iIntValue)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
        } else {
            textLocalisedQuantityClause = null;
        }
        Throwable th10 = null;
        HeaderDelegate.Model model = new HeaderDelegate.Model("DrawdownChart_header", null, r2Var, null, textLocalisedQuantityClause, null, null, HeaderDelegate.a.c.f52422a, null, null, null, 127960);
        TagViewData.Companion companion = TagViewData.INSTANCE;
        BenchmarkInfo benchmarkInfo = aVar.f286626c;
        boolean z = aVar.e;
        TextClause textClause = benchmarkInfo != null ? new TextClause(benchmarkInfo.f95698b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorDeepGrey), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : null;
        BigDecimal bigDecimal3 = chart.f;
        Object[] elements = {textClause, bigDecimal3 != null ? new PercentageClause(e1.Z(bigDecimal3), new PercentageClause.Format.Custom(2, 10, p9.ALWAYS, null, null), new Custom(new Custom.Color.Solid(R$attr.uikit_colorDeepGrey), false, false, 254)) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        CompositeClause compositeClause = new CompositeClause(kotlin.collections.d.L(elements), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        ResourceImage resourceImage = new ResourceImage(z ? R$drawable.uikit_icn_24_eye : R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorDeepGrey), (List) null, (ImageTransformations) null, (Clause) null, 246);
        int i = R$attr.uikit_colorDeepGrey_10;
        TagViewData.CollapseState collapseState = new TagViewData.CollapseState();
        companion.getClass();
        vj0 vj0Var = new vj0("DrawdownChart_badge", TagViewData.Companion.a(resourceImage, compositeClause, i, collapseState, null), false, null, R$attr.uikit_dp8, R$attr.uikit_dp0, 0, 0, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION);
        pdh.c cVar = aVar.d;
        pdh.c[] cVarArr = v7f.f.f286631a;
        ArrayList arrayList = chart.f261893g;
        if (arrayList.isEmpty()) {
            int iY = kotlin.collections.d.Y(cVarArr, cVar);
            f0 f0Var = f0.f322471a;
            cb.Companion.getClass();
            cb cbVarC = bb.c();
            hm0 hm0Var = hm0.Thick;
            l1.c cVar2 = new l1.c(0);
            int i2 = R$attr.uikit_dp16;
            jm0Var = new jm0("DrawdownChart_chart", cbVarC, f0Var, false, null, null, iY, false, 161, null, false, false, null, null, cVar2, hm0Var, null, null, null, null, 0, 0, i2, i2, -1610665416);
            int i3 = R$attr.uikit_dp0;
            int i5 = R$attr.uikit_dp16;
            yp0.b.r(jm0Var, i3, 0, i5, i5, 2);
        } else {
            int size = arrayList.size();
            MathContext DECIMAL128 = MathContext.DECIMAL128;
            Intrinsics.checkNotNullExpressionValue(DECIMAL128, "DECIMAL128");
            BigDecimal bigDecimal4 = new BigDecimal(size, DECIMAL128);
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            int i6 = 0;
            for (Object obj5 : arrayList) {
                int i21 = i6 + 1;
                Throwable th11 = th10;
                if (i6 < 0) {
                    v.s();
                    throw th11;
                }
                arrayList2.add(new hw0.k((String) null, e1.Z(((sdh.a) obj5).f261888b).floatValue(), v7f.f.a(i6, bigDecimal4).floatValue(), (iw0.a) null, (Object) null, (Clause) null, 49));
                i6 = i21;
                th10 = th11;
            }
            Throwable th12 = th10;
            ArrayList arrayList3 = new ArrayList();
            int i22 = 0;
            for (Object obj6 : arrayList) {
                int i32 = i22 + 1;
                if (i22 < 0) {
                    v.s();
                    throw th12;
                }
                BigDecimal bigDecimal5 = ((sdh.a) obj6).f261889c;
                Object kVar = bigDecimal5 != null ? new hw0.k((String) null, e1.Z(bigDecimal5).floatValue(), v7f.f.a(i22, bigDecimal4).floatValue(), (iw0.a) null, (Object) null, (Clause) null, 49) : th12;
                if (kVar != null) {
                    arrayList3.add(kVar);
                }
                i22 = i32;
            }
            Object dVar = new hw0.d((List) arrayList3, false, R$attr.uikit_colorDeepGrey, 12);
            if (arrayList3.isEmpty()) {
                dVar = th12;
            }
            List listL = v.l(dVar);
            cb.Companion.getClass();
            cb cbVarC2 = bb.c();
            hm0 hm0Var2 = hm0.Thick;
            l1.c cVar3 = new l1.c(0);
            int iY2 = kotlin.collections.d.Y(cVarArr, cVar);
            Intrinsics.checkNotNullParameter(chart, "chart");
            Iterator it8 = arrayList.iterator();
            if (it8.hasNext()) {
                sdh.a aVar3 = (sdh.a) it8.next();
                if (z) {
                    BigDecimal bigDecimal6 = aVar3.f261888b;
                    BigDecimal bigDecimal7 = aVar3.f261889c;
                    if (bigDecimal7 == null) {
                        bigDecimal7 = bigDecimal6;
                    }
                    r3 = (BigDecimal) cim.c.k(bigDecimal6, bigDecimal7);
                } else {
                    r3 = aVar3.f261888b;
                }
                while (it8.hasNext()) {
                    sdh.a aVar4 = (sdh.a) it8.next();
                    if (z) {
                        BigDecimal bigDecimal8 = aVar4.f261888b;
                        BigDecimal bigDecimal9 = aVar4.f261889c;
                        if (bigDecimal9 == null) {
                            bigDecimal9 = bigDecimal8;
                        }
                        bigDecimal = (BigDecimal) cim.c.k(bigDecimal8, bigDecimal9);
                    } else {
                        bigDecimal = aVar4.f261888b;
                    }
                    if (r3.compareTo(bigDecimal) < 0) {
                        r3 = bigDecimal;
                    }
                }
            } else {
                r3 = th12;
            }
            if (r3 == 0 || (bigDecimalZ = e1.Z(r3)) == null) {
                throw new IllegalStateException("Array is empty");
            }
            Iterator it9 = arrayList.iterator();
            if (it9.hasNext()) {
                sdh.a aVar5 = (sdh.a) it9.next();
                if (z) {
                    BigDecimal bigDecimal10 = aVar5.f261888b;
                    BigDecimal bigDecimal11 = aVar5.f261889c;
                    if (bigDecimal11 == null) {
                        bigDecimal11 = bigDecimal10;
                    }
                    r62 = (BigDecimal) cim.c.l(bigDecimal10, bigDecimal11);
                } else {
                    r62 = aVar5.f261888b;
                }
                while (it9.hasNext()) {
                    sdh.a aVar6 = (sdh.a) it9.next();
                    if (z) {
                        BigDecimal bigDecimal12 = aVar6.f261888b;
                        BigDecimal bigDecimal13 = aVar6.f261889c;
                        if (bigDecimal13 == null) {
                            bigDecimal13 = bigDecimal12;
                        }
                        bigDecimal2 = (BigDecimal) cim.c.l(bigDecimal12, bigDecimal13);
                    } else {
                        bigDecimal2 = aVar6.f261888b;
                    }
                    if (r62.compareTo(bigDecimal2) > 0) {
                        r62 = bigDecimal2;
                    }
                }
            } else {
                r62 = th12;
            }
            if (r62 == 0 || (bigDecimalZ2 = e1.Z(r62)) == null) {
                throw new IllegalStateException("Array is empty");
            }
            hw0.z zVar = new hw0.z(ms0.v.NoBackground, v.k(v7f.f.b(bigDecimalZ), v7f.f.b(bigDecimalZ2)), 4);
            ?? r292 = z ? listL : th12;
            int i33 = R$attr.uikit_dp16;
            jm0Var = new jm0("DrawdownChart_chart", cbVarC2, arrayList2, false, null, null, iY2, false, 161, null, false, false, zVar, r292, cVar3, hm0Var2, null, null, null, null, 0, 0, i33, i33, -1610677704);
        }
        Object[] elements2 = {model, vj0Var, jm0Var};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return kotlin.collections.d.L(elements2);
    }

    private final Object t(Object obj2, Object obj3, Object obj4) {
        Data data = (Data) this.f274771b;
        tsb.f fVar = (tsb.f) this.f274772c;
        Clause title = (Clause) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        return new vch.w(title, data != null ? (CompositeClause) iii.c.f(data, new v80.a(23), new v78.d(17), new uk2.w(fVar, 25)) : null);
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        Data data = (Data) this.f274771b;
        veh.n nVar = (veh.n) this.f274772c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        InstrumentTicker instrumentTicker = (InstrumentTicker) pair.f186385a;
        return (List) iii.c.f(data, new vdl.a(nVar, instrumentTicker, 12), new vea.b(nVar, 4), new aa7.j(nVar, instrumentTicker, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0035  */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v18, types: [com.revolut.feature.unified_transactions.models.UnifiedTransaction] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [com.revolut.feature.unified_transactions.models.UnifiedTransaction$Standard] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object v(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 1168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tvh.e.v(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x084f A[PHI: r2
      0x084f: PHI (r2v22 dj0.d) = (r2v18 dj0.d), (r2v23 dj0.d) binds: [B:191:0x085a, B:186:0x084c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0a0d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0ca6  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0d5a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0cea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0603  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r68, java.lang.Object r69, java.lang.Object r70) {
        /*
            Method dump skipped, instruction units count: 3566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tvh.e.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ e(Object obj2, Object obj3, int i) {
        this.f274770a = i;
        this.f274771b = obj2;
        this.f274772c = obj3;
    }

    public /* synthetic */ e(List list, v7e.v vVar, v7e.g gVar) {
        this.f274770a = 23;
        this.f274771b = list;
        this.f274772c = gVar;
    }
}
