package a0e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f336c;

    public a(b request, Data availableFilterItems, Data availablePeriod) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(availableFilterItems, "availableFilterItems");
        Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
        this.f334a = request;
        this.f335b = availableFilterItems;
        this.f336c = availablePeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f334a, aVar.f334a) && Intrinsics.f(this.f335b, aVar.f335b) && Intrinsics.f(this.f336c, aVar.f336c);
    }

    public final int hashCode() {
        return this.f336c.hashCode() + kii.e.c(this.f335b, this.f334a.hashCode() * 31, 31);
    }
}
