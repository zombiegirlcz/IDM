package kmh;

import d5d.b;
import kotlin.jvm.internal.Intrinsics;
import yj1.e;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f185887a;

    public a(e queryParams) {
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        this.f185887a = queryParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f185887a, ((a) obj2).f185887a);
    }

    public final int hashCode() {
        return this.f185887a.hashCode();
    }
}
