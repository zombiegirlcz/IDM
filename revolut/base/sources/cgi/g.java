package cgi;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f23994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f23995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f23996c;
    public final Lazy d;

    public g(n room, m rates, l occupancyRates) {
        Intrinsics.checkNotNullParameter(room, "room");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(occupancyRates, "occupancyRates");
        this.f23994a = room;
        this.f23995b = rates;
        this.f23996c = occupancyRates;
        this.d = yhm.j.b(new bvb.a(this, 17));
    }

    @Override // cgi.o
    public final r a() {
        return this.f23995b;
    }

    @Override // cgi.o
    public final List b() {
        return (List) this.d.getValue();
    }

    @Override // cgi.o
    public final q c() {
        return this.f23996c;
    }

    @Override // cgi.o
    public final p d() {
        return this.f23994a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f23994a, gVar.f23994a) && Intrinsics.f(this.f23995b, gVar.f23995b) && Intrinsics.f(this.f23996c, gVar.f23996c);
    }

    public final int hashCode() {
        return this.f23996c.hashCode() + ((this.f23995b.hashCode() + (this.f23994a.hashCode() * 31)) * 31);
    }
}
