package c15;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements n {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f20381a = v.k(new g(93, 100, R$string.credit_score_learn_more_excellent_title, R$string.credit_score_learn_more_excellent_subtitle), new g(81, 92, R$string.credit_score_learn_more_very_good_title, R$string.credit_score_learn_more_very_good_subtitle), new g(49, 80, R$string.credit_score_learn_more_good_title, R$string.credit_score_learn_more_good_subtitle), new g(16, 48, R$string.credit_score_learn_more_fair_title, R$string.credit_score_learn_more_fair_subtitle), new g(1, 15, R$string.credit_score_learn_more_low_title, R$string.credit_score_learn_more_low_subtitle));

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        RowDelegate.Model.c.a aVar;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<g> list = f20381a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (g gVar : list) {
            int i = domainState.f20379a.f69952a;
            int i2 = gVar.f20382a;
            int i3 = gVar.f20384c;
            boolean z = i <= gVar.f20383b && i2 <= i;
            String strN = a0.d.n("LEARN_MORE_ITEM_", i3);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i3, null, null, 14);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(gVar.d, null, null, 14);
            if (z) {
                TagViewData.Companion companion = TagViewData.INSTANCE;
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.credit_score_learn_more_selected_tag, null, null, 14);
                int i5 = R$drawable.uikit_icn_16_check_circle;
                int i6 = R$attr.uikit_colorForeground;
                int i21 = R$attr.uikit_colorForeground_20;
                Integer numValueOf = Integer.valueOf(i5);
                companion.getClass();
                aVar = new RowDelegate.Model.c.a(TagViewData.Companion.b(i21, i6, textLocalisedClause3, numValueOf), null, false, 6);
            } else {
                aVar = null;
            }
            RowDelegate.Model model = new RowDelegate.Model(strN, null, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, aVar, false, null, z, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536859610);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
        }
        return new d(arrayList);
    }
}
