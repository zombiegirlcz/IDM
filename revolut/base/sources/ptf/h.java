package ptf;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f239664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f239665b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f239664a = items;
        this.f239665b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f239664a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f239664a, hVar.f239664a) && this.f239665b == hVar.f239665b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f239665b) + (this.f239664a.hashCode() * 31);
    }
}
