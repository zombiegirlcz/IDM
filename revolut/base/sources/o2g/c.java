package o2g;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f221619a;

    public c(Data itinerary) {
        Intrinsics.checkNotNullParameter(itinerary, "itinerary");
        this.f221619a = itinerary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f221619a, ((c) obj2).f221619a);
    }

    public final int hashCode() {
        return this.f221619a.hashCode();
    }
}
