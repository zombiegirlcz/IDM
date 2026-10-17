package pqc;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f238718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f238719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f238720c;

    public g() {
        this(0);
    }

    public static g a(g gVar, Data data, List results, String searchQuery, int i) {
        if ((i & 1) != 0) {
            data = gVar.f238718a;
        }
        if ((i & 4) != 0) {
            searchQuery = gVar.f238720c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new g(data, searchQuery, results);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f238718a, gVar.f238718a) && Intrinsics.f(this.f238719b, gVar.f238719b) && Intrinsics.f(this.f238720c, gVar.f238720c);
    }

    public final int hashCode() {
        return this.f238720c.hashCode() + p.a.d(this.f238718a.hashCode() * 31, 31, this.f238719b);
    }

    public g(Data data, String searchQuery, List results) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f238718a = data;
        this.f238719b = results;
        this.f238720c = searchQuery;
    }

    public g(int i) {
        Data data = new Data(null, null, true, 3, null);
        f0 f0Var = f0.f322471a;
        m70.a.c(t0.f186434a);
        this(data, "", f0Var);
    }
}
