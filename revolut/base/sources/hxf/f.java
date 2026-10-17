package hxf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f156593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f156594b;

    public f(List upcoming, List pastAndCancelled) {
        Intrinsics.checkNotNullParameter(upcoming, "upcoming");
        Intrinsics.checkNotNullParameter(pastAndCancelled, "pastAndCancelled");
        this.f156593a = upcoming;
        this.f156594b = pastAndCancelled;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f156593a, fVar.f156593a) && Intrinsics.f(this.f156594b, fVar.f156594b);
    }

    public final int hashCode() {
        return this.f156594b.hashCode() + (this.f156593a.hashCode() * 31);
    }
}
