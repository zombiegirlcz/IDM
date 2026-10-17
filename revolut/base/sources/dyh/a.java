package dyh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import myh.i;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f121129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f121130b;

    public a(i summary, Data currentExchangeRate) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(currentExchangeRate, "currentExchangeRate");
        this.f121129a = summary;
        this.f121130b = currentExchangeRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f121129a, aVar.f121129a) && Intrinsics.f(this.f121130b, aVar.f121130b);
    }

    public final int hashCode() {
        return this.f121130b.hashCode() + (this.f121129a.hashCode() * 31);
    }
}
