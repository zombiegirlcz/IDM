package ehf;

import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import kotlin.jvm.internal.Intrinsics;
import zsc.m;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends zsc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f126178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n8b.a f126179b;

    public d(m query, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f126178a = query;
        this.f126179b = countryInteractor;
    }

    @Override // zsc.d
    public final boolean a(Object obj2) {
        RecurringPaymentWithExtra value = (RecurringPaymentWithExtra) obj2;
        Intrinsics.checkNotNullParameter(value, "value");
        f5j.a aVar = value.getF81653a().f249329r;
        String str = aVar != null ? aVar.f132340r : null;
        if (str == null) {
            str = "";
        }
        String strB = ((o8b.c) this.f126179b).b(str);
        m mVar = this.f126178a;
        return mVar.a(str) || mVar.a(strB);
    }

    @Override // zsc.d
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f126178a, dVar.f126178a) && Intrinsics.f(this.f126179b, dVar.f126179b);
    }

    @Override // zsc.d
    public final int hashCode() {
        return this.f126179b.hashCode() + (this.f126178a.hashCode() * 31);
    }
}
