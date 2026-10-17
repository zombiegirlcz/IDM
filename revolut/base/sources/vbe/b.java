package vbe;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import i9e.f;
import ip0.z;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import qua.i;
import qua.p;
import te0.w;
import thf.c;
import wjf.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends abe.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.b f287508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f287509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.c f287510c;

    public b(a9e.b commonSubscriptionMapper, c transactionCategoryResourcesMapper, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(commonSubscriptionMapper, "commonSubscriptionMapper");
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f287508a = commonSubscriptionMapper;
        this.f287509b = transactionCategoryResourcesMapper;
        this.f287510c = uiKitResources;
    }

    @Override // abe.a
    public final z a(Object obj2) {
        cbe.a model = (cbe.a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }

    @Override // abe.a
    public final List b(Object obj2) {
        String str;
        LocalDate localDate;
        cbe.a model = (cbe.a) obj2;
        Intrinsics.checkNotNullParameter(model, "model");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.transaction_status, null, null, 14);
        p pVar = model.f22781a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.recurring_payment_details_refund_pending, null, null, 14);
        i iVar = pVar.Q;
        CellDetailsNoteDelegate.Model model2 = new CellDetailsNoteDelegate.Model("ID_STATUS_ITEM", textLocalisedClause, null, (iVar == null || (str = iVar.f249300b) == null || (localDate = pVar.f249314a.f) == null) ? textLocalisedClause2 : new CompositeClause(v.k(textLocalisedClause2, new HtmlLocalisedClause(R$string.transactionUI_transaction_status_refund_info_extended, v.k(str, this.f287510c.b(new TimeClause(jli.b.b(localDate), new TimeClause.Format.DayAndMonth(0), null, null, 12)), str), (Integer) null, (Object) null, 28)), new DotDividerClause((Integer) null), null, null, 12), null, false, null, null, null, null, null, 0, 131060);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return u.c(model2);
    }

    @Override // abe.a
    public final r c(hce.c subscriptionContent) {
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        hce.b bVar = subscriptionContent.f150886a;
        return w.h(new cbe.a(bVar.f150883a, bVar.f150884b, bVar.f150885c));
    }

    @Override // abe.a
    public final r d(hce.c subscriptionContent) {
        String str;
        Clause textClause;
        Image imageC;
        String str2;
        LocalDateTime localDateTime;
        Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
        MoneyClause moneyClause = new MoneyClause(zae.c.b(subscriptionContent), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
        int i = R$string.recurring_payment_refund_title;
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        p pVar = subscriptionContent.f150886a.f150883a;
        i iVar = pVar.Q;
        if (iVar == null || (str = iVar.f249300b) == null) {
            str = "";
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(str), null, 12);
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        i iVar2 = pVar.Q;
        if (iVar2 == null || (localDateTime = iVar2.f249301c) == null) {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = new TimeClause(localDateTime.toDateTime().getMillis(), new TimeClause.Format.Pretty(0), null, null, 12);
        }
        Clause clause = textClause;
        Intrinsics.checkNotNullParameter(subscriptionContent, "<this>");
        i iVar3 = pVar.Q;
        if (iVar3 != null && (str2 = iVar3.f249299a) != null) {
            imageC = new UrlImage(str2, null, Integer.valueOf(R$drawable.uikit_icn_40_coins_shape), null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507898);
        } else if (iVar3 != null) {
            imageC = ((e) this.f287509b).i(iVar3.d, null, null);
        } else {
            ((f) this.f287508a).getClass();
            imageC = h5k.a.c();
        }
        Image image = imageC;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i2 = R$drawable.uikit_icn_24_revert_left;
        int i3 = R$attr.uikit_colorWhite;
        return w.h(new hce.a(moneyClause, textLocalisedClause, clause, image, companion.d(i2, R$attr.uikit_colorAccent, i3, Integer.valueOf(i3), 2.0f, 2.0f, Float.valueOf(12.0f)), (Serializable) null, 96));
    }
}
