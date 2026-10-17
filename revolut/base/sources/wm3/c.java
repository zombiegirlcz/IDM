package wm3;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f298601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f298602b;

    public c(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f298601a = items;
        this.f298602b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f298601a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f298601a, cVar.f298601a) && this.f298602b == cVar.f298602b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f298602b) + (this.f298601a.hashCode() * 31);
    }
}
