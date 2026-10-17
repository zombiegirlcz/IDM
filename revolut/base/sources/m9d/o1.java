package m9d;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.help_centre.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class o1 implements jki.p {

    @NotNull
    public static final k1 Companion = new k1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j30.c f203732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p9d.l f203733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o9d.a f203734c;
    public final o9d.d d;
    public final tse.l e;

    public o1(j30.c chatFeatureToggles, a helpCenterAnalyticsContextProvider, p9d.l searchHintProvider, o9d.a sharedHelpChatWithUsItemsMapper, o9d.b sharedHelpMyRequestsItemsMapper, o9d.d sharedHelpQuickActionsMapper, o9d.f sharedHelpTopLevelFaqsItemsMapper, o9d.e sharedHelpSuggestedArticlesMapper, tse.l ticketsWidgetUiMapper, lde.n widgetsInteractor) {
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(helpCenterAnalyticsContextProvider, "helpCenterAnalyticsContextProvider");
        Intrinsics.checkNotNullParameter(searchHintProvider, "searchHintProvider");
        Intrinsics.checkNotNullParameter(sharedHelpChatWithUsItemsMapper, "sharedHelpChatWithUsItemsMapper");
        Intrinsics.checkNotNullParameter(sharedHelpMyRequestsItemsMapper, "sharedHelpMyRequestsItemsMapper");
        Intrinsics.checkNotNullParameter(sharedHelpQuickActionsMapper, "sharedHelpQuickActionsMapper");
        Intrinsics.checkNotNullParameter(sharedHelpTopLevelFaqsItemsMapper, "sharedHelpTopLevelFaqsItemsMapper");
        Intrinsics.checkNotNullParameter(sharedHelpSuggestedArticlesMapper, "sharedHelpSuggestedArticlesMapper");
        Intrinsics.checkNotNullParameter(ticketsWidgetUiMapper, "ticketsWidgetUiMapper");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        this.f203732a = chatFeatureToggles;
        this.f203733b = searchHintProvider;
        this.f203734c = sharedHelpChatWithUsItemsMapper;
        this.d = sharedHelpQuickActionsMapper;
        this.e = ticketsWidgetUiMapper;
    }

    public static f0 b() {
        return new f0(p9d.i.a(new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.help_center_screen_help_title_greeting, null, null, 14), new TextLocalisedClause(R$string.help_center_screen_help_title_header, null, null, 14)), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)), new TextLocalisedClause(R$string.help_center_screen_help_title_header, null, null, 14));
    }

    public static g0 c() {
        return new g0(new TextLocalisedClause(R$string.help_center_screen_help_title_header, null, null, 14), p9d.i.a(new TextLocalisedClause(R$string.help_center_screen_help_title_header, null, null, 14)));
    }

    public static ArrayList d(List list) {
        List<f7d.a> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (f7d.a aVar : list2) {
            arrayList.add(new l1(aVar.f132590b, aVar.f132589a));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0173  */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r40) {
        /*
            Method dump skipped, instruction units count: 1105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m9d.o1.a(jki.i):jki.m");
    }
}
