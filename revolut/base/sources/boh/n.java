package boh;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth_discovery.api.declaration.collection.MostTradedAssetsDestination;
import kotlin.jvm.internal.Intrinsics;
import xzg.b0;
import xzg.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MostTradedAssetsDestination f17471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f17472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f17473c;
    public final d0 d;
    public final Data e;

    public n(MostTradedAssetsDestination destination, Data assets, b0 timeSpan, d0 section, Data data) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(section, "section");
        this.f17471a = destination;
        this.f17472b = assets;
        this.f17473c = timeSpan;
        this.d = section;
        this.e = data;
    }

    public static n a(n nVar, Data data, b0 timeSpan, d0 section, Data data2, int i) {
        Data assets = data;
        MostTradedAssetsDestination destination = nVar.f17471a;
        if ((i & 2) != 0) {
            assets = nVar.f17472b;
        }
        if ((i & 4) != 0) {
            timeSpan = nVar.f17473c;
        }
        if ((i & 8) != 0) {
            section = nVar.d;
        }
        if ((i & 16) != 0) {
            data2 = nVar.e;
        }
        Data data3 = data2;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(section, "section");
        d0 d0Var = section;
        return new n(destination, assets, timeSpan, d0Var, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f17471a, nVar.f17471a) && Intrinsics.f(this.f17472b, nVar.f17472b) && this.f17473c == nVar.f17473c && this.d == nVar.d && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f17473c.hashCode() + kii.e.c(this.f17472b, this.f17471a.hashCode() * 31, 31)) * 31)) * 31;
        Data data = this.e;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }
}
