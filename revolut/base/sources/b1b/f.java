package b1b;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f11764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f11766c;
    public final String d;

    public f(Set selectedIndicators, List popularIndicators, List regularIndicators, String searchQuery) {
        Intrinsics.checkNotNullParameter(selectedIndicators, "selectedIndicators");
        Intrinsics.checkNotNullParameter(popularIndicators, "popularIndicators");
        Intrinsics.checkNotNullParameter(regularIndicators, "regularIndicators");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f11764a = selectedIndicators;
        this.f11765b = popularIndicators;
        this.f11766c = regularIndicators;
        this.d = searchQuery;
    }

    public static f a(f fVar, Set selectedIndicators, List popularIndicators, List regularIndicators, String searchQuery, int i) {
        if ((i & 1) != 0) {
            selectedIndicators = fVar.f11764a;
        }
        if ((i & 2) != 0) {
            popularIndicators = fVar.f11765b;
        }
        if ((i & 4) != 0) {
            regularIndicators = fVar.f11766c;
        }
        if ((i & 8) != 0) {
            searchQuery = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(selectedIndicators, "selectedIndicators");
        Intrinsics.checkNotNullParameter(popularIndicators, "popularIndicators");
        Intrinsics.checkNotNullParameter(regularIndicators, "regularIndicators");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new f(selectedIndicators, popularIndicators, regularIndicators, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f11764a, fVar.f11764a) && Intrinsics.f(this.f11765b, fVar.f11765b) && Intrinsics.f(this.f11766c, fVar.f11766c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f11764a.hashCode() * 31, 31, this.f11765b), 31, this.f11766c);
    }
}
