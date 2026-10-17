package cbd;

import com.revolut.feature.shared.order_initiation.api.domain.CustomFieldDefinition;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import uad.c;
import uad.d;
import vad.e;
import vad.f;
import xi0.b;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final OrderInitiationPage a(d dVar) {
        OrderInitiationPage.User user;
        f fVar;
        e eVar;
        dj0.d dVar2;
        b bVarA;
        b bVar;
        List list;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String id10 = dVar.getId();
        LocalDateTime localDateTimeY = oi0.d.Y(dVar.getCreatedDate());
        String state = dVar.getState();
        f[] fVarArrValues = f.values();
        int length = fVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            user = null;
            if (i2 >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArrValues[i2];
            if (a0.z(fVar.name(), state, true)) {
                break;
            }
            i2++;
        }
        if (fVar == null) {
            fVar = f.UNKNOWN;
        }
        f fVar2 = fVar;
        String product = dVar.getProduct();
        e[] eVarArrValues = e.values();
        int length2 = eVarArrValues.length;
        while (true) {
            if (i >= length2) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i];
            if (a0.z(eVar.name(), product, true)) {
                break;
            }
            i++;
        }
        if (eVar == null) {
            eVar = e.UNKNOWN;
        }
        e eVar2 = eVar;
        String title = dVar.getTitle();
        mf0.a amount = dVar.getAmount();
        if (amount != null) {
            long amount2 = amount.getAmount();
            String currency = amount.getCurrency();
            b.Companion.getClass();
            dVar2 = new dj0.d(amount2, xi0.a.a(currency));
        } else {
            dVar2 = null;
        }
        String defaultCurrency = dVar.getDefaultCurrency();
        if (defaultCurrency != null) {
            b.Companion.getClass();
            bVarA = xi0.a.a(defaultCurrency);
        } else {
            bVarA = null;
        }
        String paymentLink = dVar.getPaymentLink();
        d.a usage = dVar.getUsage();
        OrderInitiationPage.Usage usage2 = usage != null ? new OrderInitiationPage.Usage(usage.getLimit(), usage.getCompletedOrders()) : null;
        Long expirationDate = dVar.getExpirationDate();
        LocalDateTime localDateTimeY2 = expirationDate != null ? oi0.d.Y(expirationDate.longValue()) : null;
        d.b createdByUser = dVar.getCreatedByUser();
        if (createdByUser != null) {
            String id11 = createdByUser.getId();
            String firstName = createdByUser.getFirstName();
            if (firstName == null) {
                firstName = "";
            }
            String lastName = createdByUser.getLastName();
            user = new OrderInitiationPage.User(id11, firstName, lastName != null ? lastName : "");
        }
        OrderInitiationPage.User user2 = user;
        int completedOrders = dVar.getCompletedOrders();
        Integer completedOrdersLimit = dVar.getCompletedOrdersLimit();
        List customFieldDefinitions = dVar.getCustomFieldDefinitions();
        if (customFieldDefinitions != null) {
            List list2 = customFieldDefinitions;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                uad.b bVar2 = (uad.b) it8.next();
                arrayList.add(new CustomFieldDefinition(bVar2.getName(), bVar2.getOptional()));
                it8 = it8;
                bVarA = bVarA;
            }
            bVar = bVarA;
            list = arrayList;
        } else {
            bVar = bVarA;
            list = f0.f322471a;
        }
        return new OrderInitiationPage(id10, localDateTimeY, fVar2, eVar2, title, dVar2, bVar, paymentLink, usage2, localDateTimeY2, user2, completedOrders, completedOrdersLimit, list);
    }

    public static final vad.b b(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        LocalDateTime localDateTimeY = oi0.d.Y(cVar.getFrom());
        Long to6 = cVar.getTo();
        return new vad.b(localDateTimeY, to6 != null ? oi0.d.Y(to6.longValue()) : null);
    }
}
