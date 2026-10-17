package ya1;

import com.revolut.feature.acquiring.card_reader.order.api.model.VatSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f311897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f311898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VatSelection f311899c;

    public g(xi0.b currency, int i, VatSelection vatSelection) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(vatSelection, "vatSelection");
        this.f311897a = currency;
        this.f311898b = i;
        this.f311899c = vatSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f311897a, gVar.f311897a) && this.f311898b == gVar.f311898b && Intrinsics.f(this.f311899c, gVar.f311899c);
    }

    public final int hashCode() {
        return this.f311899c.hashCode() + j6.a.b(this.f311898b, this.f311897a.hashCode() * 31, 31);
    }
}
