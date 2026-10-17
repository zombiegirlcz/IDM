package yq5;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.feature.travel.hotels.impl.model.checkout.RevolutCardWithBalanceCheck;
import com.revolut.feature.travel.hotels.impl.ui.checkout.TravelHotelsBookingCheckoutContract$CardsContentData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.model.PropertyPayment$Card;
import h93.f0;
import ia3.h;
import ia3.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m93.f;
import ymk.y;
import z0f.a0;
import z1i.l;
import z2a.i;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315989a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f315990b;

    public d(z2a.d itemMapper) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        this.f315990b = itemMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        Object next;
        switch (this.f315989a) {
            case 0:
                a domainState = (a) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                tp5.b bVar = (tp5.b) this.f315990b;
                return new cii.b(null, bVar.c(domainState.f315987a), new lw0.a(new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_details_monthly_limits_title_v2, null, null, 14), bVar.b(domainState.f315987a), null, null, false, 28));
            case 1:
                i domainState2 = (i) jVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                return (z2a.j) iii.c.f(domainState2.f319045a, new l(15), new a0(11), new y(this, 6));
            default:
                zbg.b domainState3 = (zbg.b) jVar;
                Intrinsics.checkNotNullParameter(domainState3, "domainState");
                lag.c cVar = (lag.c) this.f315990b;
                r rVar = cVar.f193390c;
                PropertyPayment$Card propertyPayment$Card = domainState3.f320884a;
                RevolutCardWithBalanceCheck revolutCardWithBalanceCheck = propertyPayment$Card.f93915a;
                List list = propertyPayment$Card.f93916b;
                TravelHotelsBookingCheckoutContract$CardsContentData cardsContentData = new TravelHotelsBookingCheckoutContract$CardsContentData(revolutCardWithBalanceCheck, list, propertyPayment$Card.f93917c, propertyPayment$Card.d);
                Intrinsics.checkNotNullParameter(cardsContentData, "cardsContentData");
                List<RevolutCardWithBalanceCheck> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (RevolutCardWithBalanceCheck revolutCardWithBalanceCheck2 : list2) {
                    boolean zF = Intrinsics.f(cardsContentData.f93678a, revolutCardWithBalanceCheck2);
                    Iterator it8 = cardsContentData.d.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (Intrinsics.f(com.revolut.feature.checkout.models.a.c((CheckoutOrder) next), revolutCardWithBalanceCheck2.f93666a.f150110a)) {
                            }
                        } else {
                            next = null;
                        }
                        break;
                    }
                    f0 f0Var = revolutCardWithBalanceCheck2.f93666a;
                    arrayList.add(new RowDelegate.Model(f0Var.f150110a, ((h) cVar.f193392h).c(f0Var), null, null, f.b(rVar, f0Var, null, null, 14), cVar.i.a(f0Var), null, null, 0, null, true, zF, rVar.j(f0Var, cardsContentData.f93680c, (CheckoutOrder) next), null, null, null, null, revolutCardWithBalanceCheck2, null, 0, 0, 0, 0, 1056935788));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new cii.b(null, arrayList, new lw0.a(new TextLocalisedClause(com.revolut.feature.travel.hotels.api.R$string.hotels_checkout_cards_bottom_sheet_title, null, null, 14), null, null, null, false, 30));
        }
    }

    public d(tp5.b itemsMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f315990b = itemsMapper;
    }

    public d(lag.c itemMapper) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        this.f315990b = itemMapper;
    }
}
