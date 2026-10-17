package uni;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f281441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f281442b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f281441a = items;
        this.f281442b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f281441a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f281441a, hVar.f281441a) && this.f281442b == hVar.f281442b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281442b) + (this.f281441a.hashCode() * 31);
    }
}
