package obc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f223917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f223918b;

    public h(Data carrierSearchState, String query) {
        Intrinsics.checkNotNullParameter(carrierSearchState, "carrierSearchState");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f223917a = carrierSearchState;
        this.f223918b = query;
    }

    public static h a(h hVar, Data carrierSearchState, String query, int i) {
        if ((i & 1) != 0) {
            carrierSearchState = hVar.f223917a;
        }
        if ((i & 2) != 0) {
            query = hVar.f223918b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(carrierSearchState, "carrierSearchState");
        Intrinsics.checkNotNullParameter(query, "query");
        return new h(carrierSearchState, query);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f223917a, hVar.f223917a) && Intrinsics.f(this.f223918b, hVar.f223918b);
    }

    public final int hashCode() {
        return this.f223918b.hashCode() + (this.f223917a.hashCode() * 31);
    }
}
