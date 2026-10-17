package xbc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f304036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f304037b;

    public d(b flightBooking, boolean z) {
        Intrinsics.checkNotNullParameter(flightBooking, "flightBooking");
        this.f304036a = flightBooking;
        this.f304037b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f304036a, dVar.f304036a) && this.f304037b == dVar.f304037b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f304037b) + (this.f304036a.hashCode() * 31);
    }
}
