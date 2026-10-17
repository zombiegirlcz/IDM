package iw6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f168976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f168977b;

    public k(j header, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f168976a = header;
        this.f168977b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f168977b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f168976a, kVar.f168976a) && Intrinsics.f(this.f168977b, kVar.f168977b);
    }

    public final int hashCode() {
        return this.f168977b.hashCode() + (this.f168976a.hashCode() * 31);
    }
}
