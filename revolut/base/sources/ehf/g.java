package ehf;

import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import hx7.l;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n61.j;
import qua.p;
import zsc.m;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends zsc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f126182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f126183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.b f126184c;

    public g(m query, f01.c uiKitResources, t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        this.f126182a = query;
        this.f126183b = uiKitResources;
        this.f126184c = currenciesLocalization;
    }

    @Override // zsc.d
    public final boolean a(Object obj2) {
        RecurringPaymentWithExtra value = (RecurringPaymentWithExtra) obj2;
        Intrinsics.checkNotNullParameter(value, "value");
        p f81653a = value.getF81653a();
        String str = f81653a.k;
        String str2 = f81653a.f249318c;
        f5j.a aVar = f81653a.f249329r;
        String str3 = aVar != null ? aVar.d : null;
        String str4 = aVar != null ? aVar.A : null;
        String strC = aVar != null ? j.c(aVar) : null;
        fva.m mVar = f81653a.u;
        String str5 = mVar != null ? mVar.f138404a : null;
        qua.g gVar = f81653a.f249332w;
        String str6 = str4;
        String[] elements = {str, str2, str3, str6, strC, str5, gVar != null ? gVar.f249293b : null, l.A(value.getF81653a(), this.f126183b, this.f126184c)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        if (listL.isEmpty()) {
            return false;
        }
        Iterator it8 = listL.iterator();
        while (it8.hasNext()) {
            if (this.f126182a.a((String) it8.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // zsc.d
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f126182a.equals(gVar.f126182a) && this.f126183b.equals(gVar.f126183b) && this.f126184c.equals(gVar.f126184c);
    }

    @Override // zsc.d
    public final int hashCode() {
        return this.f126184c.hashCode() + ((this.f126183b.hashCode() + (this.f126182a.hashCode() * 31)) * 31);
    }
}
