package cf1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f23522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23523b;

    public d() {
        this(0);
    }

    public static d a(d dVar, Data taxRates, boolean z, int i) {
        if ((i & 1) != 0) {
            taxRates = dVar.f23522a;
        }
        if ((i & 2) != 0) {
            z = dVar.f23523b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
        return new d(taxRates, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f23522a, dVar.f23522a) && this.f23523b == dVar.f23523b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23523b) + (this.f23522a.hashCode() * 31);
    }

    public d(Data taxRates, boolean z) {
        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
        this.f23522a = taxRates;
        this.f23523b = z;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null), false);
    }
}
