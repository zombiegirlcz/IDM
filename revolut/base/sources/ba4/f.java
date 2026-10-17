package ba4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13898a;

    public f() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f13898a, ((f) obj2).f13898a);
    }

    public final int hashCode() {
        return this.f13898a.hashCode();
    }

    public f(List documents) {
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f13898a = documents;
    }

    public f(int i) {
        this(f0.f322471a);
    }
}
