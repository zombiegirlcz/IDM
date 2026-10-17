package hoc;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pdh.b f154267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f154268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f154269c;
    public final Lazy d;

    public b(pdh.b performanceChart, dj0.d dVar, a type) {
        Intrinsics.checkNotNullParameter(performanceChart, "performanceChart");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f154267a = performanceChart;
        this.f154268b = dVar;
        this.f154269c = type;
        this.d = j.b(new h1g.a(this, 26));
    }

    @Override // hoc.d
    public final List a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f154267a, bVar.f154267a) && Intrinsics.f(this.f154268b, bVar.f154268b) && this.f154269c == bVar.f154269c;
    }

    @Override // hoc.d
    public final long getEndMillis() {
        return this.f154267a.f235231b.getMillis();
    }

    @Override // hoc.d
    public final long getStartMillis() {
        return this.f154267a.f235230a.getMillis();
    }

    public final int hashCode() {
        int iHashCode = this.f154267a.hashCode() * 31;
        dj0.d dVar = this.f154268b;
        return this.f154269c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }
}
