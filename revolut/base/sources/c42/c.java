package c42;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20982b;

    public c(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f20981a = items;
        this.f20982b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f20981a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f20981a, cVar.f20981a) && this.f20982b == cVar.f20982b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20982b) + (this.f20981a.hashCode() * 31);
    }
}
