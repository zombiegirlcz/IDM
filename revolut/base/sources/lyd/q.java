package lyd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f200797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f200798c;

    public q(String id10, List availablePeriods, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        this.f200796a = id10;
        this.f200797b = z;
        this.f200798c = availablePeriods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f200796a, qVar.f200796a) && this.f200797b == qVar.f200797b && Intrinsics.f(this.f200798c, qVar.f200798c);
    }

    public final int hashCode() {
        return this.f200798c.hashCode() + j6.a.c(this.f200796a.hashCode() * 31, 31, this.f200797b);
    }
}
