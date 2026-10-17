package fvb;

import com.revolut.feature.rev_points.models.RevPoints;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPoints f138412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f138413c;

    public b(String id10, RevPoints points, c status) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f138411a = id10;
        this.f138412b = points;
        this.f138413c = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f138411a, bVar.f138411a) && Intrinsics.f(this.f138412b, bVar.f138412b) && this.f138413c == bVar.f138413c;
    }

    public final int hashCode() {
        return this.f138413c.hashCode() + v7.c(this.f138411a.hashCode() * 31, 31, this.f138412b.f83960a);
    }
}
