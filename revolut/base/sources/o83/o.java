package o83;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_screen.common.cards.models.CardsStateSnapshot$SubscriptionsContent;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.youTransactor.uCube.rpc.Constants;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.h f222929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f222930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f222931c;
    public final Object d;

    public o(a9e.h subscriptionsItemMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(subscriptionsItemMapper, "subscriptionsItemMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f222929a = subscriptionsItemMapper;
        this.f222930b = featureToggleInteractor;
        this.f222931c = w.y0(new o10.c(this, 9));
        this.d = w.y0(new o23.b(22));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    public final List a(List list, q qVar, boolean z) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return z ? yp0.b.i(new FullScreenStateDelegate.Model("NO_SUBSCRIPTIONS_LIST_ID", new TextLocalisedClause(R$string.card_subscription_empty_list_title, null, null, 14), null, null, null, null, false, null, null, false, 0, 0, 32764), new ListSubheaderDelegate.Model("SUBSCRIPTIONS_HEADER_ACTIVE", (Image) null, (Clause) new TextLocalisedClause(R$string.card_subscriptions_list_active_section, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126) : f0.f322471a;
        }
        int i = z ? R$string.card_subscriptions_list_active_section : R$string.card_subscriptions_list_blocked_section;
        String str = z ? "SUBSCRIPTIONS_HEADER_ACTIVE" : "SUBSCRIPTIONS_HEADER_BLOCKED";
        LayeredImage layeredImage = z ? null : (LayeredImage) this.d.getValue();
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        List<RecurringPaymentWithExtra> list3 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
        for (RecurringPaymentWithExtra recurringPaymentWithExtra : list3) {
            LayeredImage layeredImage2 = layeredImage;
            RowDelegate.Model modelD = a9e.h.d(this.f222929a, recurringPaymentWithExtra, f0.f322471a, qVar, true, z, layeredImage2, !z, null, null, 384);
            if (!z) {
                qua.g gVar = recurringPaymentWithExtra.getF81653a().f249332w;
                LocalDate localDate = gVar != null ? gVar.f249296h : null;
                modelD = RowDelegate.Model.x(modelD, null, null, null, localDate == null ? null : new TextLocalisedClause(com.revolut.feature.subscriptionscommon.impl.R$string.recurring_payments_blocked_since, u.c(new TimeClause(oc.c.F(localDate), new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12)), null, 12), null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15);
            }
            arrayList.add(modelD);
            layeredImage = layeredImage2;
        }
        return yp0.b.g(arrayList, model, null, 0, 0, 126);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CardsStateSnapshot$SubscriptionsContent cardsStateSnapshot$SubscriptionsContent = domainState.f222915a;
        q qVar = domainState.f222916b;
        aim.e eVarB = u.b();
        List list = cardsStateSnapshot$SubscriptionsContent.f65370a;
        if (list == null) {
            list = f0.f322471a;
        }
        eVarB.addAll(((mae.o) this.f222929a).n(list));
        eVarB.addAll(a(cardsStateSnapshot$SubscriptionsContent.f65371b, qVar, true));
        eVarB.addAll(a(cardsStateSnapshot$SubscriptionsContent.f65372c, qVar, false));
        return new h(u.a(eVarB), ((Boolean) this.f222931c.getValue()).booleanValue() ? u.c(new IconNavBarMenuItem("ADD_NEW_SUBSCRIPTION_ACTION_LIST_ID", new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.card_subscriptions_list_add_subscription_accessibility_label, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)) : f0.f322471a);
    }
}
