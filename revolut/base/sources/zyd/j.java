package zyd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f326442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f326443b;

    public j(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f326442a = items;
        this.f326443b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f326442a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f326442a, jVar.f326442a) && this.f326443b == jVar.f326443b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f326443b) + (this.f326442a.hashCode() * 31);
    }
}
