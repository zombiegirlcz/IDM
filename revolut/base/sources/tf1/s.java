package tf1;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.o3;
import com.revolut.core.ui_kit.delegates.widgets.u3;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.add.new_product.api.R$string;
import com.revolut.tracking.v3.DiscoverMoreWidgetContext;
import grl.m3;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class s {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static w0 a(s sVar, m3 m3Var, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        DiscoverMoreWidgetContext.a aVarNewBuilder = DiscoverMoreWidgetContext.newBuilder();
        aVarNewBuilder.c();
        ((DiscoverMoreWidgetContext) aVarNewBuilder.f49761b).setState(m3Var);
        if (str != null) {
            aVarNewBuilder.c();
            ((DiscoverMoreWidgetContext) aVarNewBuilder.f49761b).setItemId(str);
        }
        if (str2 != null) {
            aVarNewBuilder.c();
            ((DiscoverMoreWidgetContext) aVarNewBuilder.f49761b).setAllItemIds(str2);
        }
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }

    public final RowsWidgetDelegate.Model b(String listId, ArrayList items) {
        RowDelegate.Model.MainImage.Image40 image40;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        String strK0 = zhm.d0.k0(items, ",", null, null, 0, new tcg.a0(24), 30);
        ArrayList arrayList = new ArrayList(zhm.w.t(items, 10));
        int i = 0;
        for (Object obj2 : items) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            Pair pair = (Pair) obj2;
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            Object obj3 = pair.f186386b;
            LayeredImage layeredImageP = LayeredImage.Companion.p(companion, ((qf1.m) obj3).d, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, 24.0f);
            qf1.m mVar = (qf1.m) obj3;
            CircleBadgeModel circleBadgeModel = mVar.e;
            if (circleBadgeModel != null) {
                image40 = new RowDelegate.Model.MainImage.Image40(layeredImageP, circleBadgeModel, null, false, null, false, 60);
            } else {
                mVar.getClass();
                image40 = new RowDelegate.Model.MainImage.Image40(layeredImageP, null, null, false, 28);
            }
            RowDelegate.Model.MainImage.Image40 image402 = image40;
            String strN = a0.d.n("PRODUCT_ROW_PREFIX_", i);
            Clause clause = mVar.f245222a;
            Clause clause2 = mVar.f245223b;
            pf pfVar = new pf(mVar.f245224c, null, null, false, null, null, 510);
            Object obj4 = pair.f186385a;
            arrayList.add(new RowDelegate.Model(strN, image402, clause, null, 0, clause2, null, null, 0, pfVar, false, null, false, null, null, null, null, null, null, obj4, new AnalyticsContext(a(this, m3.LOADED, ((qf1.l) obj4).name(), null, 4)), 0, 0, 0, 0, 524286936));
            i = i2;
        }
        w0 w0VarA = a(this, m3.LOADED, null, strK0, 2);
        RowsWidgetDelegate.Model.Companion companion2 = RowsWidgetDelegate.Model.INSTANCE;
        BaseDynamicWidgetDelegate.BigHeaderModel bigHeaderModel = new BaseDynamicWidgetDelegate.BigHeaderModel("ADD_NEW_WIDGET_HEADER_ITEM_ID", new TextLocalisedClause(R$string.add_new_widget_title, null, null, 14), null, false, null, 56);
        o3 o3Var = new o3(new TextLocalisedClause(R$string.add_new_widget_action_see_all, null, null, 14), null);
        AnalyticsContext analyticsContext = new AnalyticsContext(w0VarA);
        qf1.q qVar = new qf1.q(listId, new AnalyticsContext(w0VarA));
        companion2.getClass();
        return RowsWidgetDelegate.Model.Companion.c(listId, bigHeaderModel, arrayList, o3Var, analyticsContext, qVar, u3.f55521a);
    }
}
