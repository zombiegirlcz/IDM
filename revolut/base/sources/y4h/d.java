package y4h;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wdh.a f310938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f310939b;

    public d(wdh.a ratingsProvider, Data data) {
        Intrinsics.checkNotNullParameter(ratingsProvider, "ratingsProvider");
        this.f310938a = ratingsProvider;
        this.f310939b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f310938a == dVar.f310938a && Intrinsics.f(this.f310939b, dVar.f310939b);
    }

    public final int hashCode() {
        int iHashCode = this.f310938a.hashCode() * 31;
        Data data = this.f310939b;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }
}
