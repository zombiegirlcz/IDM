package sq9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import kotlin.jvm.internal.Intrinsics;
import oq9.h;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentGroup f265030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f265031c;

    public a(String transactionId, PaymentGroup group, h bill) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(bill, "bill");
        this.f265029a = transactionId;
        this.f265030b = group;
        this.f265031c = bill;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f265029a, aVar.f265029a) && this.f265030b.equals(aVar.f265030b) && this.f265031c.equals(aVar.f265031c);
    }

    public final int hashCode() {
        return this.f265031c.hashCode() + ((this.f265030b.hashCode() + (this.f265029a.hashCode() * 31)) * 31);
    }
}
