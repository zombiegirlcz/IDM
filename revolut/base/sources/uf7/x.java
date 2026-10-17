package uf7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f279623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f279624b;

    public x(List items, q header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f279623a = items;
        this.f279624b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f279623a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f279623a, xVar.f279623a) && Intrinsics.f(this.f279624b, xVar.f279624b);
    }

    public final int hashCode() {
        return this.f279624b.hashCode() + (this.f279623a.hashCode() * 31);
    }
}
