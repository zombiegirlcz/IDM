package sq9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.jvm.internal.Intrinsics;
import oq9.c0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentGroup f265033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f265034c;

    public b(String transactionId, PaymentGroup group, c0 settlement) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(settlement, "settlement");
        this.f265032a = transactionId;
        this.f265033b = group;
        this.f265034c = settlement;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f265032a, bVar.f265032a) && Intrinsics.f(this.f265033b, bVar.f265033b) && Intrinsics.f(this.f265034c, bVar.f265034c);
    }

    public final int hashCode() {
        return this.f265034c.hashCode() + ((this.f265033b.hashCode() + (this.f265032a.hashCode() * 31)) * 31);
    }
}
