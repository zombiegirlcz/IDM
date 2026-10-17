package nrd;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f218612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f218613b;

    public c(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f218612a = items;
        this.f218613b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f218612a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f218612a, cVar.f218612a) && this.f218613b == cVar.f218613b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f218613b) + (this.f218612a.hashCode() * 31);
    }
}
