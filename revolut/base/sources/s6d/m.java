package s6d;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f260244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f260245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f260246c;

    public m(List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f260244a = items;
        this.f260245b = z;
        this.f260246c = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f260244a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f260244a, mVar.f260244a) && this.f260245b == mVar.f260245b && this.f260246c == mVar.f260246c;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + j6.a.c(j6.a.c(this.f260244a.hashCode() * 31, 31, this.f260245b), 31, this.f260246c);
    }
}
