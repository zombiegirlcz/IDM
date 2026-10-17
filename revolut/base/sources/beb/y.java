package beb;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.restaurants.impl.R$string;
import com.revolut.feature.retail.restaurants.impl.domain.model.Customer;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements cli.n {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f14760a;

    public y(b0 paymentSectionMapper) {
        Intrinsics.checkNotNullParameter(paymentSectionMapper, "paymentSectionMapper");
        this.f14760a = paymentSectionMapper;
    }

    public static RowDelegate.Model a(y yVar, String str, TextLocalisedClause textLocalisedClause, Clause clause, Clause clause2, Integer num, int i) {
        RowDelegate.Model.MainImage.Image40 image40;
        Clause clause3 = (i & 4) != 0 ? null : clause;
        Clause clause4 = (i & 8) != 0 ? null : clause2;
        Integer num2 = (i & 16) != 0 ? null : num;
        if (num2 != null) {
            int iIntValue = num2.intValue();
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i2 = R$attr.uikit_colorForeground;
            image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.a(companion, iIntValue, new Color.Solid(i2), new Color.ModifiedColor(new Color.Solid(i2), 0.1f), 8.0f, null, 48), null, null, false, null, false, 62);
        } else {
            image40 = null;
        }
        Style custom = textLocalisedClause.f57942c;
        if (custom == null) {
            custom = new Custom(Integer.valueOf(clause4 == null ? R$attr.uikit_colorGreyTone50 : R$attr.uikit_colorForeground), false, null, false, null, 254);
        }
        return new RowDelegate.Model(str, image40, TextLocalisedClause.c(textLocalisedClause, null, custom, 27), null, 0, clause4, null, null, 0, clause3 != null ? new RowDelegate.Model.c.b(clause3, null, null, false, 126) : null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867800);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Customer customer;
        xdb.r rVar;
        Reservation reservation;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f14735a, new bbh.a(this, 20), new bb2.t(this, 13), new b1c.p(this, domainState, 11));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.retail_restaurants_confirm_reservation_screen_title, null, null, 14);
        f0 f0Var = f0.f322471a;
        Data data = domainState.f14735a;
        xdb.m mVar = (xdb.m) data.getContent();
        return new k(list, textLocalisedClause, f0Var, new aw0.e(false, new TextLocalisedClause(R$string.retail_restaurants_confirm_reservation_disclaimers_footer, null, null, 14), null, m6.c(n6.Companion, new TextLocalisedClause(R$string.retail_restaurants_confirm_reservation_actions_confirm, null, null, 14), LargeActionButton.ButtonStyle.d, null, "CONFIRM_RESERVATION_CONFIRM", data.getContent() != null && (((mVar == null || (rVar = mVar.f304398a) == null || (reservation = rVar.f304405a) == null) ? null : reservation.i) == null) && (customer = domainState.f14737c) != null && customer.a(), null, null, null, 972), null, null, 53));
    }
}
