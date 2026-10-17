package r9c;

import aw0.o9;
import aw0.x4;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.k0;
import com.revolut.core.ui_kit.delegates.r0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.LabelNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.api.shared.domain.models.payment_options.PayLaterOffer;
import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import com.revolut.feature.revolutpay.shared.R$string;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import q9c.r;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [com.revolut.core.ui_kit.delegates.r0] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static List a(r paymentOptionsState) throws Throwable {
        ?? arrayList;
        PayLaterOffer offer;
        Intrinsics.checkNotNullParameter(paymentOptionsState, "paymentOptionsState");
        t6c.o oVar = paymentOptionsState.f243874a;
        t6c.f fVar = paymentOptionsState.f243875b;
        PaymentScheduleSelection paymentScheduleSelection = paymentOptionsState.f243876c;
        Throwable th10 = null;
        PaymentScheduleSelection.PayLater payLater = paymentScheduleSelection instanceof PaymentScheduleSelection.PayLater ? (PaymentScheduleSelection.PayLater) paymentScheduleSelection : null;
        if (payLater == null || (offer = payLater.f84445a) == null) {
            arrayList = oVar.f268306a;
        } else {
            List list = oVar.f268306a;
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                t6c.f fVar2 = (t6c.f) obj2;
                Intrinsics.checkNotNullParameter(fVar2, "<this>");
                Intrinsics.checkNotNullParameter(offer, "offer");
                t6c.k kVar = fVar2.f268293c;
                List list2 = kVar != null ? kVar.f268301b : null;
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                List list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it8 = list3.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        if (com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.a.a((PayLaterOffer) it8.next(), offer)) {
                            arrayList.add(obj2);
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (t6c.f fVar3 : (Iterable) arrayList) {
            t6c.e eVar = fVar3.f268292b;
            Pair pair = eVar != null ? new Pair(eVar, fVar3) : null;
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        if (!arrayList2.isEmpty()) {
            if ((fVar != null ? fVar.f268292b : null) != null) {
                aim.e eVarB = u.b();
                eVarB.add(new RowDelegate.Model("REV_POINTS_SUBHEADER_ID", new RowDelegate.Model.MainImage.Image24(oc.c.a(R$drawable.uikit_icn_24_rev_points_mono), false, false, 6), new TextLocalisedClause(R$string.revolut_pay_order_summary_headers_points, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                int i = 0;
                for (Object obj3 : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        Throwable th11 = th10;
                        v.s();
                        throw th11;
                    }
                    Pair pair2 = (Pair) obj3;
                    t6c.e eVar2 = (t6c.e) pair2.f186385a;
                    t6c.f fVar4 = (t6c.f) pair2.f186386b;
                    String strN = a0.d.n("REV_POINTS_SELECTOR_ATTRIBUTE_ID_", i);
                    MoneyClause moneyClause = new MoneyClause(eVar2.f268288a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
                    long j2 = eVar2.f268289b;
                    Float fValueOf = Float.valueOf(12.0f);
                    NumberClause.Format.Default format = NumberClause.Format.Default.f57900a;
                    Intrinsics.checkNotNullParameter(format, "format");
                    Throwable th12 = th10;
                    ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_24_rev_points_default, (Integer) null, fValueOf, fValueOf, 18);
                    m70.a.t(t0.f186434a);
                    AttributeSelectorSmallDelegate.Model model = new AttributeSelectorSmallDelegate.Model(strN, moneyClause, new CompositeClause(v.k(imageClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), udc.a.b(j2, format)), null, null, null, 14), Intrinsics.f(fVar4, fVar) ? new r0(v.k(Integer.valueOf(R$attr.uikit_colorPurple), Integer.valueOf(R$attr.uikit_colorIndigo))) : th12, null, false, fVar4, k0.NESTED, SyslogConstants.LOG_LOCAL6);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    arrayList3.add(model);
                    th10 = th12;
                    i = i2;
                }
                eVarB.add(new hg("REV_POINTS_SELECTOR_ID", arrayList3, 3, x4.c.f10604a, null, new gg.b(false, 3), false, false, null, null, 0, R$attr.uikit_dp8, 0, 0, 28624));
                return u.a(eVarB);
            }
        }
        return f0.f322471a;
    }

    public static List b(s6c.p revPointsAmount) {
        Intrinsics.checkNotNullParameter(revPointsAmount, "revPointsAmount");
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_rev_points, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246);
        long j2 = revPointsAmount.f260232a;
        Custom style = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
        Intrinsics.checkNotNullParameter(style, "style");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j2, 6);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "getMajorUnits-impl(...)");
        return u.c(new LabelNavBarMenuItem("REV_POINTS_REDEMPTION_AND_EARNING_MENU_ID", resourceImage, new NumberClause(bigDecimalValueOf, NumberClause.Format.Default.f57900a, style, o9.SENSITIVE), null, null, 504));
    }
}
