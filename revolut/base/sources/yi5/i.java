package yi5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.n3;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.exchange.models.ExchangeOrder;
import dsh.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import pt5.u;
import pt5.v;
import pt5.w;
import qua.p;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f314250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dsh.e f314251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f314252c;

    public i(j jVar, dsh.e eVar, String str) {
        this.f314250a = jVar;
        this.f314251b = eVar;
        this.f314252c = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        qv0.i iVarC;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        int iC = r.a.c(r.Companion, this.f314251b);
        yd9.e eVar = this.f314250a.f314254c;
        List<w> list = content;
        ArrayList<qv0.i> arrayList = new ArrayList(zhm.w.t(list, 10));
        for (w wVar : list) {
            if (wVar instanceof u) {
                ExchangeOrder.Active active = ((u) wVar).f239625a;
                iVarC = eVar.b(active, "", false, false, active);
            } else {
                if (!(wVar instanceof v)) {
                    throw new NoWhenBranchMatchedException();
                }
                p order = ((v) wVar).f239626a;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(order, "order");
                Intrinsics.checkNotNullParameter("", "listIdPrefix");
                iVarC = eVar.f312660b.c(order, "", false);
            }
            arrayList.add(iVarC);
        }
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (qv0.i iVar : arrayList) {
            Intrinsics.i(iVar, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.RowDelegate.Model");
            arrayList2.add((RowDelegate.Model) iVar);
        }
        boolean z = arrayList2.size() > iC;
        RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
        BaseDynamicWidgetDelegate.BigHeaderModel bigHeaderModel = new BaseDynamicWidgetDelegate.BigHeaderModel("ORDERS_WIDGET_HEADER_LIST_ID", new TextLocalisedClause(R$string.crypto_investments_orders_title, null, null, 14), null, false, null, 56);
        List listV0 = d0.V0(arrayList2, iC);
        if (listV0.isEmpty()) {
            CircleBadgeModel circleBadgeModel = null;
            ProgressStyle progressStyle = null;
            boolean z3 = false;
            NewBadgeContent newBadgeContent = null;
            listV0 = zhm.u.c(new RowDelegate.Model("ADD_ORDER_AUTOMATION_BUTTON_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, Float.valueOf(24.0f), null, 32), circleBadgeModel, progressStyle, z3, newBadgeContent, false, 60), new TextLocalisedClause(com.revolut.feature.crypto.orders_widget.impl.R$string.crypto_home_portfolio_orders_empty_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        }
        return RowsWidgetDelegate.Model.Companion.d(companion, this.f314252c, bigHeaderModel, listV0, z ? new n3(new TextLocalisedClause(com.revolut.feature.crypto.orders_widget.impl.R$string.crypto_orders_widget_footer, null, null, 14), null) : null, null, null, null, 112);
    }
}
