package xbc;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f304035c;
    public final Boolean d;
    public final ArrayList e;

    public b(String str, String bookingReference, String str2, Boolean bool, ArrayList flightTickets) {
        Intrinsics.checkNotNullParameter(bookingReference, "bookingReference");
        Intrinsics.checkNotNullParameter(flightTickets, "flightTickets");
        this.f304033a = str;
        this.f304034b = bookingReference;
        this.f304035c = str2;
        this.d = bool;
        this.e = flightTickets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f304033a, bVar.f304033a) && Intrinsics.f(this.f304034b, bVar.f304034b) && Intrinsics.f(this.f304035c, bVar.f304035c) && Intrinsics.f(this.d, bVar.d) && this.e.equals(bVar.e);
    }

    public final int hashCode() {
        String str = this.f304033a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f304034b);
        String str2 = this.f304035c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        return this.e.hashCode() + ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }
}
