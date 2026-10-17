package pmb;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f237526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f237527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f237528c;
    public final wi0.b d;

    public c(LinkedHashMap productsMap, ArrayList comparisonProducts, xi0.b baseCurrency, wi0.b userCountryCode) {
        Intrinsics.checkNotNullParameter(productsMap, "productsMap");
        Intrinsics.checkNotNullParameter(comparisonProducts, "comparisonProducts");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
        this.f237526a = productsMap;
        this.f237527b = comparisonProducts;
        this.f237528c = baseCurrency;
        this.d = userCountryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f237526a.equals(cVar.f237526a) && this.f237527b.equals(cVar.f237527b) && Intrinsics.f(this.f237528c, cVar.f237528c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.f297794a.hashCode() + h30.l.j(this.f237528c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f237527b, this.f237526a.hashCode() * 31, 31), 31);
    }
}
