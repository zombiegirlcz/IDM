package rn6;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f255505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io3.b f255506c;

    public d(String query, List list, io3.b bVar) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f255504a = query;
        this.f255505b = list;
        this.f255506c = bVar;
    }

    public static d a(d dVar, String query, List list, io3.b bVar, int i) {
        if ((i & 1) != 0) {
            query = dVar.f255504a;
        }
        if ((i & 2) != 0) {
            list = dVar.f255505b;
        }
        if ((i & 4) != 0) {
            bVar = dVar.f255506c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        return new d(query, list, bVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f255504a, dVar.f255504a) && Intrinsics.f(this.f255505b, dVar.f255505b) && Intrinsics.f(this.f255506c, dVar.f255506c);
    }

    public final int hashCode() {
        int iHashCode = this.f255504a.hashCode() * 31;
        List list = this.f255505b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        io3.b bVar = this.f255506c;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
