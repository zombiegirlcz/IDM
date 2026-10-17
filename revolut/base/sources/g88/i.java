package g88;

import com.revolut.feature.junior.accounts.impl.ui.switcher.mapper.JuniorDiscoveryProductAccountMapper;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf8.m;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f141296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y79.a f141297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c91.a f141298c;
    public final e d;

    public i(s78.a juniorDashboardActionsProvider, fkg.a swipeActionsMapper, y79.a onHoldAccountMapper, c91.a juniorAccountNameProvider, e juniorAccountEmptyStateProvider, JuniorDiscoveryProductAccountMapper juniorDiscoveryProductAccountMapper, c juniorAccountConfigMapper) {
        Intrinsics.checkNotNullParameter(juniorDashboardActionsProvider, "juniorDashboardActionsProvider");
        Intrinsics.checkNotNullParameter(swipeActionsMapper, "swipeActionsMapper");
        Intrinsics.checkNotNullParameter(onHoldAccountMapper, "onHoldAccountMapper");
        Intrinsics.checkNotNullParameter(juniorAccountNameProvider, "juniorAccountNameProvider");
        Intrinsics.checkNotNullParameter(juniorAccountEmptyStateProvider, "juniorAccountEmptyStateProvider");
        Intrinsics.checkNotNullParameter(juniorDiscoveryProductAccountMapper, "juniorDiscoveryProductAccountMapper");
        Intrinsics.checkNotNullParameter(juniorAccountConfigMapper, "juniorAccountConfigMapper");
        this.f141296a = swipeActionsMapper;
        this.f141297b = onHoldAccountMapper;
        this.f141298c = juniorAccountNameProvider;
        this.d = juniorAccountEmptyStateProvider;
    }

    public final AccountWidgetItemModel.EmptyStateStories a(List list, m mVar) {
        sf8.h hVar = mVar.e;
        if (!Intrinsics.f(hVar, sf8.b.f262351a) && !Intrinsics.f(hVar, sf8.c.f262352a) && !Intrinsics.f(hVar, sf8.d.f262353a) && !Intrinsics.f(hVar, sf8.e.f262354a) && !Intrinsics.f(hVar, sf8.f.f262355a) && !(hVar instanceof sf8.g)) {
            if (!Intrinsics.f(hVar, sf8.a.f262350a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!mVar.f.f(dj0.d.e)) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((ProductAccountWidgetAction) it8.next()).f89538a);
                }
                return this.d.a(arrayList, mVar);
            }
        }
        return AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0325  */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13, types: [com.revolut.core.ui_kit.models.CurrencyClause$Format, com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.revolut.analytics.tracking.v3.AnalyticsContext, com.revolut.core.ui_kit.models.Style, java.lang.Integer, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(java.util.List r34, sf8.m r35, java.util.List r36, boolean r37, java.util.List r38, eb8.n r39, do3.n r40, boolean r41, od0.i r42, boolean r43, mf8.e r44) {
        /*
            Method dump skipped, instruction units count: 1135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g88.i.b(java.util.List, sf8.m, java.util.List, boolean, java.util.List, eb8.n, do3.n, boolean, od0.i, boolean, mf8.e):java.util.List");
    }
}
