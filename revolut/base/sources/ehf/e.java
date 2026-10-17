package ehf;

import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zsc.m;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends zsc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f126180a;

    public e(m query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f126180a = query;
    }

    @Override // zsc.d
    public final boolean a(Object obj2) {
        String str;
        RecurringPaymentWithExtra value = (RecurringPaymentWithExtra) obj2;
        Intrinsics.checkNotNullParameter(value, "value");
        krf.c cVar = value.getF81653a().o;
        if (cVar instanceof krf.e) {
            krf.c cVar2 = value.getF81653a().o;
            Intrinsics.i(cVar2, "null cannot be cast to non-null type com.revolut.feature.transfer.models.config.TransferReason.Predefined");
            str = ((krf.e) cVar2).f188862b;
        } else if (cVar instanceof krf.d) {
            krf.c cVar3 = value.getF81653a().o;
            Intrinsics.i(cVar3, "null cannot be cast to non-null type com.revolut.feature.transfer.models.config.TransferReason.Custom");
            str = ((krf.d) cVar3).f188860a;
        } else {
            str = null;
        }
        String[] elements = {value.getF81653a().f249325m, str};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        if (listL.isEmpty()) {
            return false;
        }
        Iterator it8 = listL.iterator();
        while (it8.hasNext()) {
            if (this.f126180a.a((String) it8.next())) {
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
        return (obj2 instanceof e) && Intrinsics.f(this.f126180a, ((e) obj2).f126180a);
    }

    @Override // zsc.d
    public final int hashCode() {
        return this.f126180a.hashCode();
    }
}
