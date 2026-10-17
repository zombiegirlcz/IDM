package scc;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f261701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f261702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f261703c;

    public d(String query, Map merchantsByQuery, boolean z) {
        Intrinsics.checkNotNullParameter(merchantsByQuery, "merchantsByQuery");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f261701a = merchantsByQuery;
        this.f261702b = query;
        this.f261703c = z;
    }

    public static d a(d dVar, Map merchantsByQuery, String query, int i) {
        if ((i & 1) != 0) {
            merchantsByQuery = dVar.f261701a;
        }
        if ((i & 2) != 0) {
            query = dVar.f261702b;
        }
        boolean z = dVar.f261703c;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(merchantsByQuery, "merchantsByQuery");
        Intrinsics.checkNotNullParameter(query, "query");
        return new d(query, merchantsByQuery, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f261701a, dVar.f261701a) && Intrinsics.f(this.f261702b, dVar.f261702b) && this.f261703c == dVar.f261703c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261703c) + p.a.c(this.f261701a.hashCode() * 31, 31, this.f261702b);
    }
}
