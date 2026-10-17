package q6h;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk0.g f242595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f242596b;

    public a() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f242595a, aVar.f242595a) && Intrinsics.f(this.f242596b, aVar.f242596b);
    }

    public final int hashCode() {
        lk0.g gVar = this.f242595a;
        int iHashCode = (gVar == null ? 0 : gVar.f196174a.hashCode()) * 31;
        Data data = this.f242596b;
        return iHashCode + (data != null ? data.hashCode() : 0);
    }

    public a(lk0.g gVar, Data data) {
        this.f242595a = gVar;
        this.f242596b = data;
    }
}
