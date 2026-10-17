package e3k;

import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z1k.i;
import z1k.k;
import z1k.o;
import z1k.p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final i a(o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        List list = oVar.d;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (((i) next).f318864a == k.CURRENT) {
                obj2 = next;
                break;
            }
        }
        return (i) obj2;
    }

    public static final o b(p pVar, RemittanceRouteId id10) {
        Object next;
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(id10, "id");
        Iterator it8 = pVar.d.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((o) next).f318882a.equals(id10)) {
                break;
            }
        }
        return (o) next;
    }
}
