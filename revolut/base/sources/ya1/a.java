package ya1;

import com.revolut.feature.acquiring.card_reader.order.api.model.VatSelection;
import com.revolut.feature.address.models.Address;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f311886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f311887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f311888c;
    public final VatSelection d;
    public final String e;
    public final String f;

    public a(Address deliveryAddress, int i, dj0.d totalAmount, VatSelection vatSelection, String walletId, String idempotencyKey) {
        Intrinsics.checkNotNullParameter(deliveryAddress, "deliveryAddress");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        Intrinsics.checkNotNullParameter(vatSelection, "vatSelection");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f311886a = deliveryAddress;
        this.f311887b = i;
        this.f311888c = totalAmount;
        this.d = vatSelection;
        this.e = walletId;
        this.f = idempotencyKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f311886a, aVar.f311886a) && this.f311887b == aVar.f311887b && Intrinsics.f(this.f311888c, aVar.f311888c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c((this.d.hashCode() + v7.c(j6.a.b(this.f311887b, this.f311886a.hashCode() * 31, 31), 31, this.f311888c)) * 31, 31, this.e);
    }
}
