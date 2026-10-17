package i8e;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f159518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f159519b;

    public d(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f159518a = items;
        this.f159519b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f159518a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f159518a, dVar.f159518a) && this.f159519b == dVar.f159519b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f159519b) + (this.f159518a.hashCode() * 31);
    }
}
