package f7g;

import aim.e;
import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f132609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f132610b;

    public c(a navBarModel, e items) {
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f132609a = navBarModel;
        this.f132610b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f132610b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f132609a, cVar.f132609a) && Intrinsics.f(this.f132610b, cVar.f132610b);
    }

    public final int hashCode() {
        return this.f132610b.hashCode() + (this.f132609a.f132606a.hashCode() * 31);
    }
}
