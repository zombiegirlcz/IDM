package k3h;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wdh.a f180736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f180737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f180738c;

    public d(wdh.a ratingsProvider, Data data, n nVar) {
        Intrinsics.checkNotNullParameter(ratingsProvider, "ratingsProvider");
        this.f180736a = ratingsProvider;
        this.f180737b = data;
        this.f180738c = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f180736a == dVar.f180736a && Intrinsics.f(this.f180737b, dVar.f180737b) && Intrinsics.f(this.f180738c, dVar.f180738c);
    }

    public final int hashCode() {
        int iHashCode = this.f180736a.hashCode() * 31;
        Data data = this.f180737b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        n nVar = this.f180738c;
        return iHashCode2 + (nVar != null ? nVar.hashCode() : 0);
    }
}
