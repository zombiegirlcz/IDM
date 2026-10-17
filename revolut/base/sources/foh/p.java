package foh;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth_discovery.api.declaration.collection.TopMoversDestination;
import kotlin.jvm.internal.Intrinsics;
import xzg.l0;
import xzg.n0;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopMoversDestination f136973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f136974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f136975c;
    public final n0 d;
    public final hel.b e;
    public final Data f;

    public p(TopMoversDestination destination, Data assets, l0 timeSpan, n0 filter, hel.b bVar, Data data) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f136973a = destination;
        this.f136974b = assets;
        this.f136975c = timeSpan;
        this.d = filter;
        this.e = bVar;
        this.f = data;
    }

    public static p a(p pVar, Data data, l0 timeSpan, n0 filter, hel.b bVar, Data data2, int i) {
        Data assets = data;
        TopMoversDestination destination = pVar.f136973a;
        if ((i & 2) != 0) {
            assets = pVar.f136974b;
        }
        if ((i & 4) != 0) {
            timeSpan = pVar.f136975c;
        }
        if ((i & 8) != 0) {
            filter = pVar.d;
        }
        if ((i & 16) != 0) {
            bVar = pVar.e;
        }
        if ((i & 32) != 0) {
            data2 = pVar.f;
        }
        Data data3 = data2;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(filter, "filter");
        hel.b bVar2 = bVar;
        n0 n0Var = filter;
        return new p(destination, assets, timeSpan, n0Var, bVar2, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f136973a, pVar.f136973a) && Intrinsics.f(this.f136974b, pVar.f136974b) && this.f136975c == pVar.f136975c && this.d == pVar.d && this.e == pVar.e && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f136975c.hashCode() + kii.e.c(this.f136974b, this.f136973a.hashCode() * 31, 31)) * 31)) * 31;
        hel.b bVar = this.e;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Data data = this.f;
        return iHashCode2 + (data != null ? data.hashCode() : 0);
    }
}
