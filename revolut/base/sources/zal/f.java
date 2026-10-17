package zal;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f320743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tal.a f320744b;

    public f(List items, tal.a navBarModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f320743a = items;
        this.f320744b = navBarModel;
    }

    @Override // jki.n
    public final List c() {
        return this.f320743a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f320743a, fVar.f320743a) && Intrinsics.f(this.f320744b, fVar.f320744b);
    }

    public final int hashCode() {
        return this.f320744b.hashCode() + (this.f320743a.hashCode() * 31);
    }
}
