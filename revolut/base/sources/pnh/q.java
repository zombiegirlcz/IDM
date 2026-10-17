package pnh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f237795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f237796b;

    public q(List items, p header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f237795a = items;
        this.f237796b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f237795a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f237795a, qVar.f237795a) && Intrinsics.f(this.f237796b, qVar.f237796b);
    }

    public final int hashCode() {
        return this.f237796b.hashCode() + (this.f237795a.hashCode() * 31);
    }
}
