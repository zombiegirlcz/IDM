package bvj;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19134b;

    public c(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f19133a = items;
        this.f19134b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f19133a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f19133a, cVar.f19133a) && this.f19134b == cVar.f19134b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19134b) + (this.f19133a.hashCode() * 31);
    }
}
