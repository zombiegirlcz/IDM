package grc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f145967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f145968b;

    public c(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f145967a = items;
        this.f145968b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f145967a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f145967a, cVar.f145967a) && this.f145968b == cVar.f145968b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f145968b) + (this.f145967a.hashCode() * 31);
    }
}
