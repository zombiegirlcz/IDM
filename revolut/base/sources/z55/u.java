package z55;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class u implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f319512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f319513b;

    public u(List items, s header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f319512a = items;
        this.f319513b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f319512a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f319512a, uVar.f319512a) && Intrinsics.f(this.f319513b, uVar.f319513b);
    }

    public final int hashCode() {
        return this.f319513b.hashCode() + (this.f319512a.hashCode() * 31);
    }
}
