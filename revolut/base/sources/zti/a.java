package zti;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bti.a f325168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f325170c;

    public a(bti.a airport, String normalizedAirportName, String normalizedAirportDescription) {
        Intrinsics.checkNotNullParameter(airport, "airport");
        Intrinsics.checkNotNullParameter(normalizedAirportName, "normalizedAirportName");
        Intrinsics.checkNotNullParameter(normalizedAirportDescription, "normalizedAirportDescription");
        this.f325168a = airport;
        this.f325169b = normalizedAirportName;
        this.f325170c = normalizedAirportDescription;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f325168a, aVar.f325168a) && Intrinsics.f(this.f325169b, aVar.f325169b) && Intrinsics.f(this.f325170c, aVar.f325170c);
    }

    public final int hashCode() {
        return this.f325170c.hashCode() + p.a.c(this.f325168a.hashCode() * 31, 31, this.f325169b);
    }
}
