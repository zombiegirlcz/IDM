package uje;

import aw0.b;
import aw0.d8;
import aw0.e8;
import aw0.x6;
import aw0.z7;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarCenterViewModel;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.tab.crypto.impl.R$string;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import nd.n;
import pak.h;
import pyd.c;
import rje.e;
import tx0.g;
import tx0.i;
import tx0.l;
import tx0.m;
import tx0.r;
import ujb.v;
import yhm.j;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f280607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f280608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f280609c;
    public final Lazy d;
    public final Lazy e;

    public a(e actionsProvider, n investmentsMapper, h tabCryptoEmptyStateProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(actionsProvider, "actionsProvider");
        Intrinsics.checkNotNullParameter(investmentsMapper, "investmentsMapper");
        Intrinsics.checkNotNullParameter(tabCryptoEmptyStateProvider, "tabCryptoEmptyStateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f280607a = actionsProvider;
        this.f280608b = tabCryptoEmptyStateProvider;
        this.f280609c = featureToggleInteractor;
        this.d = j.b(new v(4));
        this.e = j.b(new v(5));
    }

    public static d a(d amount, d dVar, d dVar2) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        if (Intrinsics.f(amount.f115083b, dVar != null ? dVar.f115083b : null)) {
            amount = c.O(amount, dVar);
        }
        return Intrinsics.f(amount.f115083b, dVar2 != null ? dVar2.f115083b : null) ? c.O(amount, dVar2) : amount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f2  */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final aw0.b b(com.revolut.feature.tab.crypto.impl.ui.v2.accounts.crypto.CryptoHeaderData r41, java.util.List r42, com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChart r43, com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView.b r44, com.revolut.core.ui_kit.models.NavBarWithContainerBackground r45) {
        /*
            Method dump skipped, instruction units count: 1638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uje.a.b(com.revolut.feature.tab.crypto.impl.ui.v2.accounts.crypto.CryptoHeaderData, java.util.List, com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChart, com.revolut.core.ui_kit.views.navbar.AccountSelectionNavBarContentView$b, com.revolut.core.ui_kit.models.NavBarWithContainerBackground):aw0.b");
    }

    public final ArrayList c(boolean z) {
        Intrinsics.checkNotNullParameter("ACCOUNT_SELECTION_RETAIL_CRYPTO_LIST_ID", "accountId");
        List listC = u.c(z ? new m(6) : new l("ACCOUNT_SELECTION_RETAIL_CRYPTO_LIST_ID", 6));
        ArrayList arrayList = new ArrayList(w.t(listC, 10));
        Iterator it8 = listC.iterator();
        while (it8.hasNext()) {
            arrayList.add(new b(new d8(ola.c.CRYPTO, new z7(this.f280607a.a().size())), (r) it8.next()));
        }
        return arrayList;
    }

    public final b d(NavBarWithContainerBackground navBarWithContainerBackground) {
        i iVar;
        Intrinsics.checkNotNullParameter("ACCOUNT_SELECTION_RETAIL_CRYPTO_LIST_ID", "accountId");
        List listA = this.f280607a.a();
        tx0.d dVar = new tx0.d(u.c(listA));
        if (listA.size() == 1) {
            ola.d dVar2 = ola.d.CRYPTO;
            List list = listA;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(((ActionsView.Item) it8.next()).f58316a);
            }
            iVar = new i(dVar2, d0.i1(arrayList));
        } else {
            iVar = null;
        }
        g gVar = new g("ACCOUNT_SELECTION_RETAIL_CRYPTO_LIST_ID", new NavBarCenterViewModel((NavBarCenterViewModel.MainText) new NavBarCenterViewModel.MainText.Static(new TextLocalisedClause(R$string.crypto_home_pre_onboarding_intro_v2_title, null, null, 14), NavBarCenterViewModel.MainTextStyle.Marketing.f57863a), (Clause) null, (NavBarCenterViewModel.Subtitle) new NavBarCenterViewModel.Subtitle.Caption(new TextLocalisedClause(R$string.crypto_home_pre_onboarding_intro_v2_subtitle, null, null, 14)), (NavBarCenterViewModel.Button) null, false, false, false, false, (Image) null, (NavBarCenterViewModel.MainTextEndIcon) null, (AnalyticsContext) null, 4090), dVar, navBarWithContainerBackground == null ? (NavBarWithContainerBackground) this.d.getValue() : navBarWithContainerBackground, null, new tx0.e(f0.f322471a, (x6) this.e.getValue(), null, 60), null, null, iVar, null, 2992);
        e8.Companion.getClass();
        return new b(new e8(false), gVar);
    }
}
