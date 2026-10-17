package vse;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.tickets.api.models.TicketDetails;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qv0.l;
import qv0.o;
import yhm.m;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final List a(TicketDetails ticketDetails, Function1 getDefaultErrorItems) {
        Intrinsics.checkNotNullParameter(ticketDetails, "<this>");
        Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
        List list = (List) getDefaultErrorItems.invoke(new iii.d(2, new pse.a(ticketDetails.f90447a), true, false, j6.a.q("DETAILED_TICKET_ERROR_", ticketDetails.f90447a)));
        Intrinsics.checkNotNullParameter(list, "list");
        List<o> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (o oVarE : list2) {
            if (oVarE instanceof FullScreenStateDelegate.Model) {
                oVarE = FullScreenStateDelegate.Model.e((FullScreenStateDelegate.Model) oVarE, zj.SMALL, 4194271);
            }
            arrayList.add(oVarE);
        }
        return b(arrayList, new vo8.b(3));
    }

    public static final List b(List list, Function0 lazyMessage) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof l) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.size() != list.size()) {
            arrayList = null;
        }
        try {
            m.Companion companion = m.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (arrayList == null) {
            throw new IllegalStateException(lazyMessage.invoke().toString());
        }
        objA = Unit.f186387a;
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        return arrayList == null ? f0.f322471a : arrayList;
    }
}
