package wwi;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f300676a;

    public g(Data foundAirports) {
        Intrinsics.checkNotNullParameter(foundAirports, "foundAirports");
        this.f300676a = foundAirports;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f300676a, ((g) obj2).f300676a);
    }

    public final int hashCode() {
        return this.f300676a.hashCode();
    }
}
