package l42;

import do3.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p02.a f192034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f192035b;

    public b(p02.a request, n user) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f192034a = request;
        this.f192035b = user;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f192034a, bVar.f192034a) && Intrinsics.f(this.f192035b, bVar.f192035b);
    }

    public final int hashCode() {
        return this.f192035b.hashCode() + (this.f192034a.hashCode() * 31);
    }
}
