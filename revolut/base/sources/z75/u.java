package z75;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class u implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f319931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f319932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f319933c;

    public u(List items, t header, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f319931a = items;
        this.f319932b = header;
        this.f319933c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f319931a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f319931a, uVar.f319931a) && Intrinsics.f(this.f319932b, uVar.f319932b) && this.f319933c == uVar.f319933c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f319933c) + ((this.f319932b.hashCode() + (this.f319931a.hashCode() * 31)) * 31);
    }
}
