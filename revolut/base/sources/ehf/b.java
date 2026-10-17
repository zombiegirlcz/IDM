package ehf;

import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import kotlin.jvm.internal.Intrinsics;
import qua.u;
import tof.l2;
import tof.l3;
import zsc.m;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends zsc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f126175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.c f126176b;

    public b(m query, thf.c categoryResourcesMapper) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(categoryResourcesMapper, "categoryResourcesMapper");
        this.f126175a = query;
        this.f126176b = categoryResourcesMapper;
    }

    @Override // zsc.d
    public final boolean a(Object obj2) {
        String categoryId;
        RecurringPaymentWithExtra value = (RecurringPaymentWithExtra) obj2;
        Intrinsics.checkNotNullParameter(value, "value");
        if (!u.G(value.getF81653a())) {
            return false;
        }
        qua.g gVar = value.getF81653a().f249332w;
        String string = null;
        if (gVar != null && (categoryId = gVar.f249294c) != null) {
            wjf.e eVar = (wjf.e) this.f126176b;
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            l2 l2VarC = l3.c(categoryId);
            if (l2VarC != null) {
                string = eVar.f298086a.getString(wjf.e.l(l2VarC));
            }
        }
        if (string == null) {
            string = "";
        }
        return this.f126175a.a(string);
    }

    @Override // zsc.d
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f126175a, bVar.f126175a) && Intrinsics.f(this.f126176b, bVar.f126176b);
    }

    @Override // zsc.d
    public final int hashCode() {
        return this.f126176b.hashCode() + (this.f126175a.hashCode() * 31);
    }
}
