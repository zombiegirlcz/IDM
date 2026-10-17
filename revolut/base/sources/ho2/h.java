package ho2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f154210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f154211b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f154210a = items;
        this.f154211b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f154210a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f154210a, hVar.f154210a) && this.f154211b == hVar.f154211b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f154211b) + (this.f154210a.hashCode() * 31);
    }
}
