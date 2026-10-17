package j8f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l8f.b f172196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t6f.h f172197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j6f.a f172198c;
    public final r6f.e d;
    public final o6f.a e;
    public final b7f.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d1h.g f172199g;

    public j(l8f.b bVar, t6f.h aboutInfoState, j6f.a allocationState, r6f.e fees, o6f.a chartState, b7f.c performanceState, d1h.g disclaimers) {
        Intrinsics.checkNotNullParameter(aboutInfoState, "aboutInfoState");
        Intrinsics.checkNotNullParameter(allocationState, "allocationState");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        Intrinsics.checkNotNullParameter(performanceState, "performanceState");
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        this.f172196a = bVar;
        this.f172197b = aboutInfoState;
        this.f172198c = allocationState;
        this.d = fees;
        this.e = chartState;
        this.f = performanceState;
        this.f172199g = disclaimers;
    }

    public static j a(j jVar, l8f.b bVar, t6f.h hVar, j6f.a aVar, r6f.e eVar, o6f.a aVar2, b7f.c cVar, d1h.g gVar, int i) {
        if ((i & 1) != 0) {
            bVar = jVar.f172196a;
        }
        l8f.b bVar2 = bVar;
        if ((i & 2) != 0) {
            hVar = jVar.f172197b;
        }
        t6f.h aboutInfoState = hVar;
        if ((i & 4) != 0) {
            aVar = jVar.f172198c;
        }
        j6f.a allocationState = aVar;
        if ((i & 8) != 0) {
            eVar = jVar.d;
        }
        r6f.e fees = eVar;
        if ((i & 16) != 0) {
            aVar2 = jVar.e;
        }
        o6f.a chartState = aVar2;
        if ((i & 32) != 0) {
            cVar = jVar.f;
        }
        b7f.c performanceState = cVar;
        if ((i & 64) != 0) {
            gVar = jVar.f172199g;
        }
        d1h.g disclaimers = gVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(aboutInfoState, "aboutInfoState");
        Intrinsics.checkNotNullParameter(allocationState, "allocationState");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(chartState, "chartState");
        Intrinsics.checkNotNullParameter(performanceState, "performanceState");
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        return new j(bVar2, aboutInfoState, allocationState, fees, chartState, performanceState, disclaimers);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f172196a, jVar.f172196a) && Intrinsics.f(this.f172197b, jVar.f172197b) && Intrinsics.f(this.f172198c, jVar.f172198c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f172199g, jVar.f172199g);
    }

    public final int hashCode() {
        l8f.b bVar = this.f172196a;
        return this.f172199g.hashCode() + kii.e.c(this.f.f13035a, (this.e.hashCode() + ((this.d.hashCode() + ((this.f172198c.hashCode() + ((this.f172197b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }
}
