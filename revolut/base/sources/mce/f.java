package mce;

import aw0.k7;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.subscriptionscommon.impl.R$plurals;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;
import mae.o;
import ofm.q;
import qua.p;
import zhm.c0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.a f204346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f204347b;

    public f(a9e.a mapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f204346a = mapper;
        this.f204347b = dateProvider;
    }

    public final wh a(List upcomingPayments, dj0.d sum, Map contactsWithPaidPlan, Object parcel) {
        boolean z;
        RowDelegate.Model.MainImage.Image40 image40;
        LocalDate localDateE;
        RowDelegate.Model.c.b bVar;
        Intrinsics.checkNotNullParameter(upcomingPayments, "upcomingPayments");
        Intrinsics.checkNotNullParameter(sum, "sum");
        Intrinsics.checkNotNullParameter(contactsWithPaidPlan, "contactsWithPaidPlan");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        List list = upcomingPayments;
        boolean z3 = list instanceof Collection;
        boolean z4 = false;
        if (z3 && list.isEmpty()) {
            z = true;
        } else {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (!q.E((p) it8.next())) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        if (z3 && list.isEmpty()) {
            z4 = true;
        } else {
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                if (q.E((p) it9.next())) {
                    break;
                }
            }
            z4 = true;
        }
        int size = upcomingPayments.size();
        a9e.a aVar = this.f204346a;
        if (size == 1) {
            p subscription = (p) d0.b0(upcomingPayments);
            o oVar = (o) aVar;
            Image imageH = oVar.h(subscription, contactsWithPaidPlan);
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            Image imageA = oVar.i.a(subscription);
            image40 = new RowDelegate.Model.MainImage.Image40(imageH, imageA != null ? new RawImageBadge(imageA) : null, null, false, null, false, 60);
        } else if (upcomingPayments.size() > 1) {
            o oVar2 = (o) aVar;
            Image imageH2 = oVar2.h((p) d0.b0(upcomingPayments), contactsWithPaidPlan);
            if (imageH2 instanceof PairedImage) {
                imageH2 = ((PairedImage) imageH2).f59968b;
            }
            Image imageH3 = oVar2.h((p) upcomingPayments.get(1), contactsWithPaidPlan);
            if (imageH3 instanceof PairedImage) {
                imageH3 = ((PairedImage) imageH3).f59968b;
            }
            image40 = new RowDelegate.Model.MainImage.Image40(new PairedImage(imageH3, imageH2), null, null, false, null, false, 60);
        } else {
            image40 = null;
        }
        TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.upcoming_payments_home_screen_cell_title, Integer.valueOf(upcomingPayments.size()), (List) null, (Style) null, 28);
        List list2 = upcomingPayments;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it10 = list2.iterator();
        while (it10.hasNext()) {
            arrayList.add(((p) it10.next()).f249314a.f);
        }
        SortedSet sortedSetP = c0.P(arrayList, new e());
        LocalDate localDateE2 = ((l80.f) this.f204347b).e();
        TreeSet treeSet = (TreeSet) sortedSetP;
        org.joda.time.LocalDate localDate = (org.joda.time.LocalDate) treeSet.first();
        if (localDate == null || (localDateE = jli.b.e(localDate)) == null) {
            localDateE = localDateE2;
        }
        org.joda.time.LocalDate localDate2 = (org.joda.time.LocalDate) treeSet.last();
        LocalDate localDateE3 = localDate2 != null ? jli.b.e(localDate2) : null;
        int iBetween = (int) ChronoUnit.DAYS.between(localDateE2, localDateE3);
        Clause textLocalisedClause = (localDateE.equals(localDateE2) && Intrinsics.f(localDateE3, localDateE2)) ? new TextLocalisedClause(R$string.recurring_payments_due_today, null, null, 14) : iBetween < 0 ? null : localDateE.equals(localDateE3) ? new TextLocalisedQuantityClause(R$plurals.payments_transfers_scheduled_flow_widget_upcoming_payments_exact_days_subtitle, Integer.valueOf(iBetween), (List) null, (Style) null, 28) : new TextLocalisedQuantityClause(R$plurals.payments_transfers_scheduled_flow_widget_upcoming_payments_future_days_subtitle, Integer.valueOf(iBetween), (List) null, (Style) null, 28);
        if (z || z4) {
            bVar = new RowDelegate.Model.c.b(new MoneyClause(z ? sum : sum.l(), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 8), null, null, false, 126);
        } else {
            bVar = null;
        }
        return new wh("UPCOMING_PAYMENTS_ITEM_ID", new RowDelegate.Model("UPCOMING_PAYMENTS_ITEM_ID", image40, textLocalisedQuantityClause, null, 0, textLocalisedClause, null, null, 0, bVar, false, null, true, null, null, null, null, null, null, parcel, null, 0, 0, 0, 0, 532667352), f0.f322471a, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
