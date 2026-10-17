package tr9;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.me;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.d3;
import com.revolut.core.ui_kit.delegates.widgets.e3;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.groups.api.R$plurals;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements nq9.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy f273764b = j.b(new tl7.a(17));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f273765c = j.b(new tl7.a(18));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f273766a = j.b(new tl7.a(19));

    public static final class a {
        private a() {
        }
    }

    public static Image e(PaymentGroup paymentGroup) {
        String str = paymentGroup.f79287c;
        if (str == null) {
            return lq9.a.f199213b;
        }
        return new UrlImage(str, null, null, null, 0L, null, null, null, null, lq9.a.f199213b, true, new ImageTransformations(new CircleTransformation((Float) null, (Integer) null, false, 15), true, false, (Integer) null, (Integer) null, (Integer) null, 505), null, null, false, false, 502782);
    }

    public static TagViewData f(PaymentGroup paymentGroup) {
        MoneyClause moneyClause;
        oq9.a aVar = paymentGroup.f;
        oq9.e eVar = aVar != null ? aVar.f227798a : null;
        oq9.d dVarC = eVar != null ? eVar.c() : null;
        int i = dVarC == null ? -1 : d.f273767a[dVarC.ordinal()];
        if (i == 1) {
            moneyClause = new MoneyClause(eVar.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), null, 8);
        } else {
            if (i != 2) {
                return null;
            }
            moneyClause = new MoneyClause(eVar.b(), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreen), false, null, false, null, 254), null, 8);
        }
        return new TagViewData(null, moneyClause, R$attr.uikit_colorBackground, null, R$attr.uikit_colorTransparent, null, 968);
    }

    public static TextClause g(PaymentGroup paymentGroup) {
        return new TextClause(paymentGroup.f79286b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public final RewardDelegate.Model a(PaymentGroup group, boolean z) {
        RewardDelegate.a meVar;
        Intrinsics.checkNotNullParameter(group, "group");
        if (z) {
            Companion.getClass();
            meVar = new me((LayeredImage) f273765c.getValue());
        } else {
            meVar = RewardDelegate.a.b.f53196a;
        }
        return new RewardDelegate.Model(group.f79285a, e(group), (Clause) g(group), (CompositeClause) null, meVar, false, (Object) group, (AnalyticsContext) null, 744);
    }

    public final RowDelegate.Model b(PaymentGroup group) {
        dj0.d dVarB;
        Intrinsics.checkNotNullParameter(group, "group");
        oq9.a aVar = group.f;
        RowDelegate.Model.c.b bVar = null;
        if (aVar != null) {
            oq9.e eVar = aVar.f227798a;
            int i = d.f273767a[eVar.c().ordinal()];
            if (i == 1) {
                bVar = new RowDelegate.Model.c.b(new MoneyClause(eVar.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), null, 8), new TextLocalisedClause(R$string.payments_groups_widget_common_owe, null, null, 14), null, false, 124);
            } else if (i == 2) {
                if (eVar instanceof oq9.b) {
                    dVarB = ((oq9.b) eVar).b();
                } else {
                    if (!(eVar instanceof oq9.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVarB = ((oq9.c) eVar).f227809a;
                }
                bVar = new RowDelegate.Model.c.b(new MoneyClause(dVarB, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorTeal), false, null, false, null, 254), null, 8), new TextLocalisedClause(R$string.payments_groups_widget_common_owed, null, null, 14), null, false, 124);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar = new RowDelegate.Model.c.b(null, new TextLocalisedClause(R$string.payments_groups_widget_common_settled, null, null, 14), null, false, ISO781611.SMT_TAG);
            }
        }
        RowDelegate.Model.c.b bVar2 = bVar;
        return new RowDelegate.Model(j6.a.q("ID_GROUP", group.f79285a), new RowDelegate.Model.MainImage.Image40(e(group), null, null, false, null, false, 62), g(group), null, 0, new TextLocalisedQuantityClause(R$plurals.payments_groups_groups_subtitle, Integer.valueOf(oc.c.j(group).size()), (List) null, (Style) null, 28), null, null, 0, bVar2, false, null, false, null, null, null, null, null, null, group, null, 0, 0, 0, 0, 532675544);
    }

    public final QuickActionWidgetDelegate.Model c(String listId, PaymentGroup group, int i) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(group, "group");
        return new QuickActionWidgetDelegate.Model(listId, e(group), null, i != 0 ? com.revolut.core.ui_kit_core.displayers.image.models.a.a(i, Integer.valueOf(R$attr.uikit_colorWidgetBackground), Integer.valueOf(R$attr.uikit_colorAccent), Integer.valueOf(R$attr.uikit_colorAccent), 2.0f) : null, g(group), new d3(new e3(R$drawable.uikit_icn_24_arrow_split, true), (e3) null, 6), f(group), null, 388);
    }

    public final RowDelegate.Model d(PaymentGroup group) {
        Intrinsics.checkNotNullParameter(group, "group");
        String strQ = j6.a.q("ID_GROUP", group.f79285a);
        TextClause textClauseG = g(group);
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.payments_groups_groups_subtitle, Integer.valueOf(oc.c.j(group).size()), (List) null, (Style) null, 28);
        Image imageE = e(group);
        Companion.getClass();
        return new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(imageE, (Image) f273764b.getValue(), null, false, 28), textClauseG, null, 0, textLocalisedQuantityClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, group, null, 0, 0, 0, 0, 532676568);
    }
}
