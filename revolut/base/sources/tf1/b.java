package tf1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qf1.c f270145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f270146b;

    public b(qf1.c categoryId, List elements) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f270145a = categoryId;
        this.f270146b = elements;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f270145a == bVar.f270145a && Intrinsics.f(this.f270146b, bVar.f270146b);
    }

    public final int hashCode() {
        return this.f270146b.hashCode() + (this.f270145a.hashCode() * 31);
    }
}
