package kg2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f183915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f183916b;

    public o(aim.e items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f183915a = items;
        this.f183916b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f183915a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f183915a, oVar.f183915a) && this.f183916b == oVar.f183916b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f183916b) + (this.f183915a.hashCode() * 31);
    }
}
