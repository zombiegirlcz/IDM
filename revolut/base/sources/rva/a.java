package rva;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f257734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f257735b;

    public a(Data transactionData, xi0.b destinationPocketCurrency) {
        Intrinsics.checkNotNullParameter(transactionData, "transactionData");
        Intrinsics.checkNotNullParameter(destinationPocketCurrency, "destinationPocketCurrency");
        this.f257734a = transactionData;
        this.f257735b = destinationPocketCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f257734a, aVar.f257734a) && Intrinsics.f(this.f257735b, aVar.f257735b);
    }

    public final int hashCode() {
        return this.f257735b.hashCode() + (this.f257734a.hashCode() * 31);
    }
}
