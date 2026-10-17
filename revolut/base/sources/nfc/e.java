package nfc;

import com.revolut.feature.acquiring.card_reader.order.api.model.VatSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f214888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f214889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final VatSelection f214890c;

    public e(wi0.b country, String countryName, VatSelection vatSelection) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        this.f214888a = country;
        this.f214889b = countryName;
        this.f214890c = vatSelection;
    }

    public static e a(e eVar, VatSelection vatSelection) {
        wi0.b country = eVar.f214888a;
        String countryName = eVar.f214889b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        return new e(country, countryName, vatSelection);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f214888a, eVar.f214888a) && Intrinsics.f(this.f214889b, eVar.f214889b) && Intrinsics.f(this.f214890c, eVar.f214890c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f214888a.f297794a.hashCode() * 31, 31, this.f214889b);
        VatSelection vatSelection = this.f214890c;
        return iC + (vatSelection == null ? 0 : vatSelection.hashCode());
    }
}
