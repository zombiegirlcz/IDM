package sv4;

import com.revolut.feature.credit.card.api.models.statement.CreditCardInAppStatement$RevolverTransaction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardInAppStatement$RevolverTransaction f265840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f265841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ql4.i f265842c;

    public h(CreditCardInAppStatement$RevolverTransaction transaction, g gVar, ql4.i iVar) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f265840a = transaction;
        this.f265841b = gVar;
        this.f265842c = iVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f265840a, hVar.f265840a) && Intrinsics.f(this.f265841b, hVar.f265841b) && Intrinsics.f(this.f265842c, hVar.f265842c);
    }

    public final int hashCode() {
        int iHashCode = this.f265840a.hashCode() * 31;
        g gVar = this.f265841b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        ql4.i iVar = this.f265842c;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }
}
