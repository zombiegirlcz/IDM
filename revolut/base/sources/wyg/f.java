package wyg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f301286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f301287b;

    public f(aim.e items, b headerData) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        this.f301286a = items;
        this.f301287b = headerData;
    }

    @Override // cli.p
    public final List c() {
        return this.f301286a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f301286a, fVar.f301286a) && Intrinsics.f(this.f301287b, fVar.f301287b);
    }

    public final int hashCode() {
        return this.f301287b.hashCode() + (this.f301286a.hashCode() * 31);
    }
}
