package t05;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f266931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kw0.g f266932b;

    public u(List items, kw0.g header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f266931a = items;
        this.f266932b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f266931a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f266931a, uVar.f266931a) && Intrinsics.f(this.f266932b, uVar.f266932b);
    }

    public final int hashCode() {
        return this.f266932b.hashCode() + (this.f266931a.hashCode() * 31);
    }
}
