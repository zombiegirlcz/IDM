package a8d;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.faq.FaqMetaData;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shared.help_centre.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yp0.e0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    @NotNull
    private static final C0007a Companion = new C0007a();

    /* JADX INFO: renamed from: a8d.a$a, reason: collision with other inner class name */
    public static final class C0007a {
        private C0007a() {
        }
    }

    public static List a(List articles, x7d.a analyticsMeta) {
        Intrinsics.checkNotNullParameter(articles, "articles");
        Intrinsics.checkNotNullParameter(analyticsMeta, "analyticsMeta");
        if (articles.isEmpty()) {
            return f0.f322471a;
        }
        List<FaqMetaData> list = articles;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (FaqMetaData faqMetaData : list) {
            arrayList.add(new CellDetailsChevronDelegate.Model(j6.a.q("FAQ_KEY_", faqMetaData.f51419a), new TextClause(faqMetaData.f51420b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), f2.INTERNAL, 0, faqMetaData, new AnalyticsContext(l7d.a.a(analyticsMeta.f303177a, analyticsMeta.f303178b, null, faqMetaData.f51419a, null, null, null, null, null, 500)), 1992));
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("RELATED_ARTICLES_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.help_center_ask_ai_section_related_articles_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        e0 e0Var = e0.INSIDE_BOX;
        int i = R$attr.uikit_dp12;
        return yp0.b.g(arrayList, model, e0Var, i, i, 112);
    }
}
