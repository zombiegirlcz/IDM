package zmj;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.blocked_merchants.impl.R$string;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import dej.e1;
import ip0.m00;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import zsk.d;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323581a;

    public /* synthetic */ p0(int i) {
        this.f323581a = i;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        ola.c cVar;
        int i = 0;
        AnimatedBackgroundType background = null;
        switch (this.f323581a) {
            case 0:
                e1 subscriptionOffer = (e1) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(subscriptionOffer, "subscriptionOffer");
                m00 m00Var = new m00("ID_OFFER_BANNER", new TextClause(subscriptionOffer.f113527a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(subscriptionOffer.f113529c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new UrlImage(subscriptionOffer.f113528b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, null, 2032);
                yp0.b.l(m00Var, 0, 0, 0, 0, null, false, 63);
                return m00Var;
            case 1:
                glc.j uiModel = (glc.j) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(uiModel, "uiModel");
                return new znc.e(uiModel.f144611a, uiModel.f144612b, uiModel.f144613c, uiModel.d, uiModel.e, uiModel.f);
            case 2:
                a3 content = (a3) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                String str = content.A.f272779a.d;
                if (str != null) {
                    String str2 = !kotlin.text.d0.W(str) ? str : null;
                    if (str2 != null) {
                        return new TextLocalisedClause(R$string.merchants_block_confirmation_cta, zhm.u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                    }
                }
                return new TextLocalisedClause(R$string.merchants_block_confirmation_cta_placeholder, null, null, 14);
            case 3:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj3).getClass();
                d.a aVar = zsk.d.Companion;
                if (!zBooleanValue) {
                    return zhm.f0.f322471a;
                }
                ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("spac_warning.title", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_spac_risk_warning_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                List listK = zhm.v.k(new Pair(zsk.d.f324946b, zsk.d.f324945a), new Pair(zsk.d.d, zsk.d.f324947c), new Pair(zsk.d.f, zsk.d.e));
                ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
                for (Object obj5 : listK) {
                    int i2 = i + 1;
                    if (i < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    Pair pair = (Pair) obj5;
                    arrayList.add(new ListCellDelegate.Model(a0.d.n("spac_warning.cell.", i), new j8((ResourceImage) pair.f186385a), (TextLocalisedClause) pair.f186386b, null, false, null, null, 0, 0, 0, 0, 4072));
                    i = i2;
                }
                yp0.b.k(arrayList, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 28);
                return ue0.e.J(model, arrayList);
            case 4:
                ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter((yhm.r) obj2, "<unused var>");
                return Boolean.TRUE;
            default:
                AccountWidgetItemModel.EmptyStateStories mainStories = (AccountWidgetItemModel.EmptyStateStories) obj2;
                AccountWidgetItemModel.EmptyStateStories planStories = (AccountWidgetItemModel.EmptyStateStories) obj3;
                AccountWidgetItemModel.EmptyStateStories studentStories = (AccountWidgetItemModel.EmptyStateStories) obj4;
                Intrinsics.checkNotNullParameter(mainStories, "mainStories");
                Intrinsics.checkNotNullParameter(planStories, "planStories");
                Intrinsics.checkNotNullParameter(studentStories, "studentStories");
                boolean z = mainStories instanceof AccountWidgetItemModel.EmptyStateStories.DelayedStories;
                AccountWidgetItemModel.EmptyStateStories.DelayedStories delayedStories = AccountWidgetItemModel.EmptyStateStories.DelayedStories.f89488a;
                if (z || (planStories instanceof AccountWidgetItemModel.EmptyStateStories.DelayedStories) || (studentStories instanceof AccountWidgetItemModel.EmptyStateStories.DelayedStories)) {
                    return delayedStories;
                }
                AccountWidgetItemModel.EmptyStateStories.NotApplicable notApplicable = AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a;
                if (!Intrinsics.f(mainStories, notApplicable) && !(mainStories instanceof AccountWidgetItemModel.EmptyStateStories.V2)) {
                    if (Intrinsics.f(mainStories, delayedStories) || (mainStories instanceof AccountWidgetItemModel.EmptyStateStories.Sequence) || (mainStories instanceof AccountWidgetItemModel.EmptyStateStories.V1)) {
                        return mainStories;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                List listK2 = zhm.v.k(mainStories, planStories, studentStories);
                AccountWidgetItemModel.EmptyStateStories.V2 v2 = planStories instanceof AccountWidgetItemModel.EmptyStateStories.V2 ? (AccountWidgetItemModel.EmptyStateStories.V2) planStories : null;
                if (v2 != null && (cVar = v2.f89494b) != null) {
                    background = cVar.getBackground();
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : listK2) {
                    if (obj6 instanceof AccountWidgetItemModel.EmptyStateStories.V2) {
                        arrayList2.add(obj6);
                    }
                }
                return arrayList2.isEmpty() ? notApplicable : arrayList2.size() == 1 ? (AccountWidgetItemModel.EmptyStateStories) zhm.d0.b0(arrayList2) : new AccountWidgetItemModel.EmptyStateStories.Sequence(arrayList2, background);
        }
    }

    public /* synthetic */ p0(Object obj2, int i) {
        this.f323581a = i;
    }
}
