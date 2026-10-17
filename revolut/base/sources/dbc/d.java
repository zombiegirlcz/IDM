package dbc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f112707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f112708b;

    public d(Data deliveries, Data emptyNavigationAvailable) {
        Intrinsics.checkNotNullParameter(deliveries, "deliveries");
        Intrinsics.checkNotNullParameter(emptyNavigationAvailable, "emptyNavigationAvailable");
        this.f112707a = deliveries;
        this.f112708b = emptyNavigationAvailable;
    }

    public static d a(d dVar, Data deliveries, Data emptyNavigationAvailable, int i) {
        if ((i & 1) != 0) {
            deliveries = dVar.f112707a;
        }
        if ((i & 2) != 0) {
            emptyNavigationAvailable = dVar.f112708b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(deliveries, "deliveries");
        Intrinsics.checkNotNullParameter(emptyNavigationAvailable, "emptyNavigationAvailable");
        return new d(deliveries, emptyNavigationAvailable);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f112707a, dVar.f112707a) && Intrinsics.f(this.f112708b, dVar.f112708b);
    }

    public final int hashCode() {
        return this.f112708b.hashCode() + (this.f112707a.hashCode() * 31);
    }
}
