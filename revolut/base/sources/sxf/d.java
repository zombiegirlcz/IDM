package sxf;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f266483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f266484b;

    public d(b trip, ArrayList destinations) {
        Intrinsics.checkNotNullParameter(trip, "trip");
        Intrinsics.checkNotNullParameter(destinations, "destinations");
        this.f266483a = trip;
        this.f266484b = destinations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f266483a, dVar.f266483a) && Intrinsics.f(this.f266484b, dVar.f266484b);
    }

    public final int hashCode() {
        return this.f266484b.hashCode() + (this.f266483a.hashCode() * 31);
    }
}
