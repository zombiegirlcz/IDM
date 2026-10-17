package dbg;

import aw0.ja;
import aw0.o9;
import aw0.t0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LogosTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.R$string;
import d7j.o0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb3.l;
import jel.x2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ku1.j0;
import org.bouncycastle.asn1.eac.CertificateBody;
import ss4.a0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f112742b;

    public /* synthetic */ a(Data data, j0 j0Var) {
        this.f112741a = 1;
        this.f112742b = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        dj0.d dVar;
        CellDetailsDelegate.Model model;
        ?? C;
        switch (this.f112741a) {
            case 0:
                ecg.e monetaryPrice = (ecg.e) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(monetaryPrice, "monetaryPrice");
                return (c) iii.c.f(this.f112742b, new dak.c(7), new o0(21), new b(monetaryPrice, 0));
            case 1:
                c02.f content = (c02.f) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                if (this.f112742b.getContent() == null) {
                    return j0.a();
                }
                lrf.a aVar = content.f20104a;
                dj0.d dVar2 = content.f20105b;
                String str = aVar.f199512b;
                String str2 = aVar.f199513c;
                dj0.d dVar3 = content.f20106c.f20110a;
                boolean zF = Intrinsics.f(str2, str);
                if (zF && !dVar3.f(dj0.d.e)) {
                    return f0.f322471a;
                }
                CellDetailsDelegate.Model model2 = !zF ? new CellDetailsDelegate.Model("BLIK_QUOTE_EXCHANGE_RATE_ITEM", new t0((Clause) new TextLocalisedClause(R$string.apm_payment_breakdown_exchange_rate, null, null, 14), (Image) null, 0, false, 30), com.revolut.core.ui_kit.models.b.b(new xi0.b(6, str, null), new xi0.b(6, str2, null), aVar.f199511a, null), null, null, null, null, 0, null, false, false, null, null, 32760) : null;
                CellDetailsDelegate.Model model3 = !zF ? new CellDetailsDelegate.Model("BLIK_QUOTE_EXCHANGED_AMOUNT_ITEM", new t0((Clause) new TextLocalisedClause(R$string.apm_payment_breakdown_exchanged_amount, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760) : null;
                if (dVar3.f(dj0.d.e)) {
                    dVar = dVar3;
                    model = new CellDetailsDelegate.Model("BLIK_QUOTE_FEES_ITEM", new t0((Clause) new TextLocalisedClause(R$string.apm_payment_breakdown_fees, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
                } else {
                    dVar = dVar3;
                    model = null;
                }
                CellDetailsDelegate.Model[] elements = {model2, model3, model, new CellDetailsDelegate.Model("BLIK_QUOTE_PAYMENT_ITEM", new t0((Clause) new TextLocalisedClause(R$string.apm_payment_breakdown_payment, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(pyd.c.O(dVar2, dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                return listL;
            case 2:
                x2 target = (x2) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(target, "target");
                dj0.d dVar4 = (dj0.d) this.f112742b.getContent();
                if (dVar4 == null) {
                    osk.f fVar = osk.f.PRICE_TARGETS;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_instrument_details_forecasts_price_title, null, null, 14);
                    MoneyClause moneyClause = new MoneyClause(target.f173606c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
                    m70.a.c(kotlin.jvm.internal.t0.f186434a);
                    LogosTileDelegate.Model model4 = new LogosTileDelegate.Model(new ja(textLocalisedClause, moneyClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), f0.f322471a, fVar);
                    yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                    return model4;
                }
                dj0.d dVar5 = target.f173606c;
                List listC = u.c(new LayeredImage(v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_circle_background, Integer.valueOf(dVar4.f(dVar5) ? R$attr.uikit_colorPerformanceNegative_10 : R$attr.uikit_colorPerformancePositive_10), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), dVar5.f(dVar4) ? new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_arrow_rates, Integer.valueOf(R$attr.uikit_colorPerformancePositive), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64) : dVar4.f(dVar5) ? new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_arrow_rates_down, Integer.valueOf(R$attr.uikit_colorPerformanceNegative), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64) : new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_arrow_rates, Integer.valueOf(R$attr.uikit_colorDeepGrey), 8.0f, 8.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14));
                osk.f fVar2 = osk.f.PRICE_TARGETS;
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_instrument_details_forecasts_price_title, null, null, 14);
                MoneyClause moneyClause2 = new MoneyClause(target.f173606c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(dVar5.f115082a);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(dVar4.f115082a);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                LogosTileDelegate.Model model5 = new LogosTileDelegate.Model(new ja(textLocalisedClause2, moneyClause2, xqi.a.c(l.t(bigDecimalValueOf, bigDecimalValueOf2), false, false, false, false, false, CertificateBody.profileType)), listC, fVar2);
                yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
                return model5;
            default:
                svi.c lounge = (svi.c) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(lounge, "lounge");
                TextClause textClause = new TextClause(lounge.f265884b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                List list = lounge.i;
                if (list.isEmpty()) {
                    C = u.c(czi.a.f110259a);
                } else {
                    List list2 = list;
                    C = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        C.add(new UrlImage((String) it8.next(), (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, (ImageTransformations) null, (Integer) null, (Integer) null, false, false, (Clause) null, 524282));
                    }
                }
                return new sxi.h(textClause, C, true, (IconNavBarMenuItem) iii.c.f(this.f112742b, new sx2.g(21), new a0(16), new sr8.a(3)));
        }
    }

    public /* synthetic */ a(Object obj2, Data data, int i) {
        this.f112741a = i;
        this.f112742b = data;
    }
}
