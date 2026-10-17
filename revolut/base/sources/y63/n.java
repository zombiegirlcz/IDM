package y63;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.feature.card_screen.common.cards.models.CardsStateSnapshot$SubscriptionsContent;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f311137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f311138b;

    public n(l subscriptionsMapper, p transactionsMapper) {
        Intrinsics.checkNotNullParameter(subscriptionsMapper, "subscriptionsMapper");
        Intrinsics.checkNotNullParameter(transactionsMapper, "transactionsMapper");
        this.f311137a = subscriptionsMapper;
        this.f311138b = transactionsMapper;
    }

    public final ArrayList a(boolean z, s63.f transactionsContent, CardsStateSnapshot$SubscriptionsContent subscriptionsContent) {
        Collection collectionC;
        RowDelegate.Model.MainImage.Image40 image40;
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(subscriptionsContent, "subscriptionsContent");
        Intrinsics.checkNotNullParameter(subscriptionsContent, "subscriptionsContent");
        Collection collection = subscriptionsContent.f65371b;
        if (collection == null) {
            collection = f0.f322471a;
        }
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            collection2 = subscriptionsContent.f65372c;
        }
        List list = (List) collection2;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            collectionC = f0.f322471a;
        } else {
            List list3 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                arrayList.add(((RecurringPaymentWithExtra) it8.next()).getF81653a());
            }
            List list4 = subscriptionsContent.f65371b;
            Clause textLocalisedClause = (list4 == null || list4.isEmpty()) ? new TextLocalisedClause(R$string.card_subscriptions_widget_title, null, null, 14) : new CompositeClause(zhm.v.k(new TextLocalisedClause(R$string.card_subscriptions_widget_title, null, null, 14), new TextClause(String.valueOf(arrayList.size()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12);
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                arrayList2.add(((RecurringPaymentWithExtra) it9.next()).getF81653a());
            }
            a9e.a aVar = this.f311137a.f311136a;
            qua.p pVar = (qua.p) d0.e0(0, arrayList2);
            qua.p pVar2 = (qua.p) d0.e0(1, arrayList2);
            if (pVar == null || pVar2 == null) {
                image40 = pVar != null ? new RowDelegate.Model.MainImage.Image40(((mae.o) aVar).h(pVar, r0.g()), null, null, false, null, false, 60) : null;
            } else {
                Image imageH = ((mae.o) aVar).h(pVar, r0.g());
                if (imageH instanceof PairedImage) {
                    imageH = ((PairedImage) imageH).f59968b;
                }
                Image imageH2 = ((mae.o) aVar).h(pVar2, r0.g());
                if (imageH2 instanceof PairedImage) {
                    imageH2 = ((PairedImage) imageH2).f59968b;
                }
                image40 = new RowDelegate.Model.MainImage.Image40(new PairedImage(imageH2, imageH), null, null, false, null, false, 60);
            }
            collectionC = zhm.u.c(new RowDelegate.Model("SUBSCRIPTIONS_ITEM_ID", image40, textLocalisedClause, null, 0, null, null, null, 0, null, false, null, true, null, null, null, null, null, null, subscriptionsContent, null, 0, 0, 0, 0, 532668408));
        }
        return d0.E0(z ? this.f311138b.a(transactionsContent) : f0.f322471a, collectionC);
    }
}
