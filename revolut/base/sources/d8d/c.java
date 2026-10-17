package d8d;

import android.os.Parcelable;
import aw0.o9;
import b8d.l;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.faq.FaqAction;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.tracking.v3.IdContext;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import kii.e;
import kotlin.jvm.internal.Intrinsics;
import lde.n;
import v20.d1;
import yp0.e0;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f112218a;

    public c(n widgetsInteractor, e8d.b needMoreHelpSectionItemsProvider) {
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        Intrinsics.checkNotNullParameter(needMoreHelpSectionItemsProvider, "needMoreHelpSectionItemsProvider");
        this.f112218a = widgetsInteractor;
    }

    public static List b() {
        s7 s7Var = new s7("FAQ_SUGGESTED_ACTIONS_LOADING_ITEM_ID", 0, 0, 0, 0, false, null, 126);
        yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
        return u.c(s7Var);
    }

    public final ArrayList a(aj0.c cVar, l lVar, boolean z, d1 d1Var) {
        n nVar = this.f112218a;
        boolean z3 = z && nVar.b(cVar);
        d1 d1Var2 = d1Var;
        if (Intrinsics.f(d1Var2, d1.a.f285360a)) {
            d1Var2 = null;
        }
        List listB = e8d.b.b(z3, d1Var2);
        ArrayList arrayList = new ArrayList();
        if (z && !nVar.b(cVar)) {
            List<FaqAction> list = lVar.f13175b;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            for (FaqAction faqAction : list) {
                TextClause textClause = new TextClause(faqAction.f51416a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                IdContext.a aVarNewBuilder = IdContext.newBuilder();
                String str = faqAction.f51418c;
                if (str == null && (str = faqAction.f51417b) == null) {
                    str = faqAction.f51416a;
                }
                arrayList2.add(new RowDelegate.Model("FAQ_SUGGESTED_ACTIONS_ITEM_ID", null, textClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, faqAction, new AnalyticsContext(e.d(aVarNewBuilder, str, companion)), 0, 0, 0, 0, 524287994));
            }
            a0.x(arrayList2, arrayList);
        }
        List<FaqAction> list2 = lVar.f13174a;
        ArrayList arrayList3 = new ArrayList(w.t(list2, 10));
        for (FaqAction faqAction2 : list2) {
            TextClause textClause2 = new TextClause(faqAction2.f51416a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            AnalyticsContext.Companion companion2 = AnalyticsContext.INSTANCE;
            IdContext.a aVarNewBuilder2 = IdContext.newBuilder();
            String str2 = faqAction2.f51418c;
            if (str2 == null && (str2 = faqAction2.f51417b) == null) {
                str2 = faqAction2.f51416a;
            }
            arrayList3.add(new RowDelegate.Model("FAQ_SUGGESTED_ACTIONS_ITEM_ID", null, textClause2, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, faqAction2, new AnalyticsContext(e.d(aVarNewBuilder2, str2, companion2)), 0, 0, 0, 0, 524287994));
        }
        a0.x(arrayList3, arrayList);
        return d0.E0(listB, arrayList.isEmpty() ? f0.f322471a : yp0.b.g(arrayList, new ListSubheaderDelegate.Model("FAQ_SUGGESTED_ACTIONS_TITLE_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.help_center_section_suggested_actions_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.OUTSIDE_BOX, 0, 0, 124));
    }
}
