package h40;

import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.feature.tickets.api.models.TicketDetails;
import e40.w;
import ip0.nb0;
import ip0.oc;
import ip0.pb0;
import ip0.tc;
import ip0.xc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v30.c0;
import v30.y;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j30.c f149271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f149272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ose.e f149273c;

    public s(j30.c chatFeatureToggles, w ticketTilesFactory, ose.e ticketsUiMapper) {
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(ticketTilesFactory, "ticketTilesFactory");
        Intrinsics.checkNotNullParameter(ticketsUiMapper, "ticketsUiMapper");
        this.f149271a = chatFeatureToggles;
        this.f149272b = ticketTilesFactory;
        this.f149273c = ticketsUiMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        ?? arrayList;
        final a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f149255a;
        Data data2 = domainState.f149256b;
        if (zi0.c.D(data) || zi0.c.D(data2)) {
            List listC = u.c(nb0.b(pb0.Companion, "ID_LOADING_ITEM", false, 0, false, 30));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            arrayList = listC;
        } else {
            final int i = 1;
            List list = (List) iii.c.f(domainState.f149255a, new h3d.a(6), new gug.c(29), new Function3() { // from class: h40.o
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i2 = i;
                    s sVar = this;
                    a aVar = domainState;
                    switch (i2) {
                        case 0:
                            List detailedTickets = (List) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(detailedTickets, "detailedTickets");
                            List<t> list2 = detailedTickets;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                            for (t tVar : list2) {
                                TicketDetails ticketDetails = tVar.f149274a;
                                String str = ticketDetails.f90447a;
                                long epochMilli = tVar.f149275b.toEpochMilli();
                                boolean zF = Intrinsics.f(aVar.d, str);
                                ose.c cVar = new ose.c(zF, true);
                                ose.e eVar = sVar.f149273c;
                                Feedback feedback = zF ? aVar.e : null;
                                ose.a aVar2 = ose.e.Companion;
                                arrayList2.add(new Pair(Long.valueOf(epochMilli), new xc(ticketDetails.f90447a, eVar.b(ticketDetails, feedback, cVar, false), 0, new tc(oc.f165651a), new pse.a(str), 0, 0, 0, 972)));
                            }
                            return arrayList2;
                        default:
                            List<y> feeds = (List) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(feeds, "feeds");
                            v30.s sVar2 = (v30.s) aVar.f149257c.getContent();
                            if (sVar2 == null) {
                                sVar2 = v30.s.NONE;
                            }
                            boolean zD = ((rf3.d) sVar.f149271a).d();
                            ArrayList arrayList3 = new ArrayList();
                            for (y yVar : feeds) {
                                Pair pair = (yVar.f285834b != c0.ASSISTANT || zD) ? new Pair(Long.valueOf(yVar.e.getMillis()), sVar.f149272b.g(yVar, null, sVar2)) : null;
                                if (pair != null) {
                                    arrayList3.add(pair);
                                }
                            }
                            return arrayList3;
                    }
                }
            });
            final int i2 = 0;
            List list2 = (List) iii.c.f(data2, new h3d.a(5), new gug.c(28), new Function3() { // from class: h40.o
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i22 = i2;
                    s sVar = this;
                    a aVar = domainState;
                    switch (i22) {
                        case 0:
                            List detailedTickets = (List) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(detailedTickets, "detailedTickets");
                            List<t> list22 = detailedTickets;
                            ArrayList arrayList2 = new ArrayList(zhm.w.t(list22, 10));
                            for (t tVar : list22) {
                                TicketDetails ticketDetails = tVar.f149274a;
                                String str = ticketDetails.f90447a;
                                long epochMilli = tVar.f149275b.toEpochMilli();
                                boolean zF = Intrinsics.f(aVar.d, str);
                                ose.c cVar = new ose.c(zF, true);
                                ose.e eVar = sVar.f149273c;
                                Feedback feedback = zF ? aVar.e : null;
                                ose.a aVar2 = ose.e.Companion;
                                arrayList2.add(new Pair(Long.valueOf(epochMilli), new xc(ticketDetails.f90447a, eVar.b(ticketDetails, feedback, cVar, false), 0, new tc(oc.f165651a), new pse.a(str), 0, 0, 0, 972)));
                            }
                            return arrayList2;
                        default:
                            List<y> feeds = (List) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(feeds, "feeds");
                            v30.s sVar2 = (v30.s) aVar.f149257c.getContent();
                            if (sVar2 == null) {
                                sVar2 = v30.s.NONE;
                            }
                            boolean zD = ((rf3.d) sVar.f149271a).d();
                            ArrayList arrayList3 = new ArrayList();
                            for (y yVar : feeds) {
                                Pair pair = (yVar.f285834b != c0.ASSISTANT || zD) ? new Pair(Long.valueOf(yVar.e.getMillis()), sVar.f149272b.g(yVar, null, sVar2)) : null;
                                if (pair != null) {
                                    arrayList3.add(pair);
                                }
                            }
                            return arrayList3;
                    }
                }
            });
            arrayList = new ArrayList();
            if (!list.isEmpty()) {
                List listP0 = d0.P0(list, new q());
                ArrayList arrayList2 = new ArrayList(zhm.w.t(listP0, 10));
                Iterator it8 = listP0.iterator();
                while (it8.hasNext()) {
                    arrayList2.add((qv0.i) ((Pair) it8.next()).f186386b);
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                arrayList.addAll(arrayList2);
            }
            Iterator it9 = d0.P0(list2, new r()).iterator();
            while (it9.hasNext()) {
                qv0.i iVar = (qv0.i) ((Pair) it9.next()).f186386b;
                yp0.b.l(iVar, 0, 0, 0, 0, null, false, 63);
                arrayList.add(iVar);
            }
        }
        return new c(new TextLocalisedClause(R$string.chat_list_past_requests_title, null, null, 14), arrayList);
    }
}
