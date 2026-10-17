package ryj;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ff;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.learn.impl.R$string;
import ip0.t10;
import ip0.xc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class y implements jki.p {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f258426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f258427b;

    public static final class a {
        private a() {
        }
    }

    public y() {
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            t10 t10Var = new t10(a0.d.n("LOADING_GLOSSARY_ITEM_", i));
            yp0.b.l(t10Var, 0, 0, 0, 0, null, false, 63);
            arrayList.add(t10Var);
        }
        this.f258426a = arrayList;
        RowDelegate.Model model = new RowDelegate.Model("LIST_ID_EMPTY_STATE", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_status_clock_arrows, Integer.valueOf(R$attr.uikit_colorWhite), R$attr.uikit_colorGreyTone20, BitmapDescriptorFactory.HUE_RED, Float.valueOf(16.0f), null, 32), ff.DP_24, null, new TextLocalisedClause(R$string.investmentlearn_home_glossary_empty_no_data, null, null, 14), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741800);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        this.f258427b = zhm.u.c(model);
    }

    public static PlainTextDelegate.Model b(u09.p pVar) {
        PlainTextDelegate.Model model = new PlainTextDelegate.Model(pVar.f276141a, (UrlImage) null, new TextClause(pVar.f276142b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(pVar.f276143c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        Clause textLocalisedClause;
        h domainState = (h) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f258398a;
        List<q> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (q qVar : list2) {
            arrayList.add(new xc(qVar.f258407a.a(), (List) iii.c.f(qVar.f258409c, new ryd.i(this, 1), new ryd.l(4), new rbe.c(this, domainState.f258399b, 19)), 0, null, null, 0, 0, 0, 1020));
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        for (q qVar2 : list2) {
            String strA = qVar2.f258407a.a();
            p pVar = qVar2.f258407a;
            if (pVar instanceof n) {
                textLocalisedClause = new TextLocalisedClause(R$string.investmentlearncatalogue_learn_tab_all_title, null, null, 14);
            } else {
                if (!(pVar instanceof o)) {
                    throw new NoWhenBranchMatchedException();
                }
                u09.v vVar = ((o) pVar).f258405a;
                switch (z.f258428a[vVar.ordinal()]) {
                    case 1:
                        textLocalisedClause = new TextLocalisedClause(R$string.wealth_crypto_investmentlearn_learn_tab_crypto_title, null, null, 14);
                        break;
                    case 2:
                        textLocalisedClause = new TextLocalisedClause(R$string.retail_tips_learn_tab_title, null, null, 14);
                        break;
                    case 3:
                        textLocalisedClause = new TextLocalisedClause(R$string.fraud_learn_tab_title, null, null, 14);
                        break;
                    case 4:
                        String lowerCase = vVar.name().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        textLocalisedClause = new TextClause(kotlin.text.a0.o(lowerCase), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        break;
                    case 5:
                        textLocalisedClause = new TextLocalisedClause(R$string.freelancer_learn_tab_title, null, null, 14);
                        break;
                    case 6:
                        textLocalisedClause = new TextLocalisedClause(R$string.youth_trading_learn_tab_title, null, null, 14);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            arrayList2.add(new com.revolut.core.ui_kit.views.q(strA, new com.revolut.core.ui_kit.views.t(textLocalisedClause), 58));
        }
        for (q qVar3 : list2) {
            if (qVar3.f258408b) {
                String strA2 = qVar3.f258407a.a();
                Iterator it8 = list.iterator();
                int i = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i = -1;
                    } else if (!((q) it8.next()).f258408b) {
                        i++;
                    }
                }
                return new s(arrayList, arrayList2, strA2, i);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
