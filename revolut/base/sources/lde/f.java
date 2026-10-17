package lde;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;
import yp0.e0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9e.a f194075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mae.o f194076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yd9.k f194077c;
    public final yd9.g d;
    public final z1 e;

    public f(g9e.a subscriptionListPresentationModel, mae.o subscriptionList, yd9.k ordersWidgetPresenterDelegate, yd9.g orderOrdersWidgetMapper) {
        Intrinsics.checkNotNullParameter(subscriptionListPresentationModel, "subscriptionListPresentationModel");
        Intrinsics.checkNotNullParameter(subscriptionList, "subscriptionList");
        Intrinsics.checkNotNullParameter(ordersWidgetPresenterDelegate, "ordersWidgetPresenterDelegate");
        Intrinsics.checkNotNullParameter(orderOrdersWidgetMapper, "orderOrdersWidgetMapper");
        this.f194075a = subscriptionListPresentationModel;
        this.f194076b = subscriptionList;
        this.f194077c = ordersWidgetPresenterDelegate;
        this.d = orderOrdersWidgetMapper;
        this.e = vkm.q.b(0, 7, null);
    }

    public static ListSubheaderDelegate.Model b(f fVar, TextLocalisedClause textLocalisedClause) {
        fVar.getClass();
        return new ListSubheaderDelegate.Model("TRANSACTION_HEADER_ITEM", (Image) null, (Clause) textLocalisedClause, (ResourceImage) null, false, false, (Clause) null, true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946);
    }

    public final List a(b9e.b group, List list, int i) {
        TextLocalisedClause textLocalisedClause;
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        List listV0 = d0.V0(list, i);
        ArrayList arrayList = new ArrayList(w.t(listV0, 10));
        Iterator it8 = listV0.iterator();
        while (it8.hasNext()) {
            arrayList.add(((RecurringPaymentWithExtra) it8.next()).getF81653a());
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList2.add(a9e.h.c(this.f194076b, (qua.p) it9.next()));
        }
        Intrinsics.checkNotNullParameter(group, "group");
        switch (kce.g.f182710a[group.ordinal()]) {
            case 1:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_subscriptions_title, null, null, 14);
                break;
            case 2:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_direct_debits_title, null, null, 14);
                break;
            case 3:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_scheduled_transfers_title, null, null, 14);
                break;
            case 4:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_pay_later_title, null, null, 14);
                break;
            case 5:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_loans_title, null, null, 14);
                break;
            case 6:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_blocked_title, null, null, 14);
                break;
            case 7:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_blocked_or_deactivated_title, null, null, 14);
                break;
            case 8:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_inactive_title, null, null, 14);
                break;
            case 9:
                textLocalisedClause = new TextLocalisedClause(R$string.subscriptions_list_section_blocked_or_inactive_title, null, null, 14);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return yp0.b.g(arrayList2, b(this, textLocalisedClause), e0.OUTSIDE_BOX, 0, 0, 124);
    }
}
