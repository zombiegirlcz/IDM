package i6g;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f158996b;

    public f() {
        this(0);
    }

    public static f a(f fVar, String query, Data locations, int i) {
        if ((i & 1) != 0) {
            query = fVar.f158995a;
        }
        if ((i & 2) != 0) {
            locations = fVar.f158996b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(locations, "locations");
        return new f(locations, query);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f158995a, fVar.f158995a) && Intrinsics.f(this.f158996b, fVar.f158996b);
    }

    public final int hashCode() {
        return this.f158996b.hashCode() + (this.f158995a.hashCode() * 31);
    }

    public f(Data locations, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(locations, "locations");
        this.f158995a = query;
        this.f158996b = locations;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i) {
        this(new Data(null, null, false, 7, null), "");
        m70.a.c(t0.f186434a);
    }
}
