package t8j;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.crypto.asset_details.api.R$string;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import ip0.ry;
import ip0.sy;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ranges.IntRange;
import nel.z;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import rzj.i;
import rzj.j;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements d {

    @NotNull
    public static final f Companion = new f();

    public static Clause a(j jVar, boolean z) {
        if (jVar instanceof i) {
            CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
            i iVar = (i) jVar;
            if (z) {
                return new CurrencyClause(iVar.f258696a.f288344a, ticker, null, 4);
            }
            vel.a aVar = iVar.f258696a;
            return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new CurrencyClause(aVar.f288344a, ticker, null, 4), xqi.a.b(aVar.f288346c, false, 1)));
        }
        if (!(jVar instanceof rzj.h)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = "Unexpected item " + e((rzj.h) jVar);
        return null;
    }

    public static ListSubheaderDelegate.Model b(Integer num, boolean z) {
        return new ListSubheaderDelegate.Model("CRYPTO_LATEST_NEWS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(num.intValue(), null, null, 14), (ResourceImage) null, false, false, (Clause) (z ? new TextLocalisedClause(R$string.crypto_home_widget_news_subheader_action_see_all, null, null, 14) : null), z, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946);
    }

    public static List c(Integer num) {
        ListSubheaderDelegate.Model modelB = b(num, false);
        IntRange intRange = new IntRange(0, 5, 1);
        ArrayList arrayList = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            sy syVar = new sy(a0.d.n("CRYPTO_LATEST_NEWS_LOADING_ITEM_ID_", it8.nextInt()), ry.COMPACT, 60);
            yp0.b.l(syVar, 0, 0, 0, 0, null, false, 63);
            arrayList.add(syVar);
        }
        return v.k(modelB, f(arrayList));
    }

    public static CurrencyImage d(j jVar, boolean z) {
        if (jVar instanceof i) {
            return new CurrencyImage(((i) jVar).f258696a.f288344a.f306286a, z ? new ImageTransformations(null, new CircleTransformation(Float.valueOf(1.5f), Integer.valueOf(R$attr.uikit_colorWidgetBackground), false, 8), null, null, null, null, null, ISO781611.SMT_TAG) : null, (TextLocalisedClause) null, 10);
        }
        if (!(jVar instanceof rzj.h)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = "Unexpected item " + e((rzj.h) jVar);
        return null;
    }

    public static String e(rzj.h hVar) {
        InstrumentTicker instrumentTicker = hVar.f258695a;
        String str = instrumentTicker.f105112b;
        String str2 = instrumentTicker.f105113c;
        z zVar = instrumentTicker.d;
        StringBuilder sbM = v0.a.m("InstrumentTickerItem(ref=", str, ", symbol=", str2, ", type=");
        sbM.append(zVar);
        sbM.append(")");
        return sbM.toString();
    }

    public static hg f(ArrayList arrayList) {
        NewsDelegate.INSTANCE.getClass();
        return new hg("CRYPTO_LATEST_NEWS_SCROLLER_ID", arrayList, 2, NewsDelegate.f52830h, null, null, false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28656);
    }
}
