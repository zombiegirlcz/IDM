package qxd;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f250077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f250078b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f250077a = items;
        this.f250078b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f250077a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f250077a, hVar.f250077a) && this.f250078b == hVar.f250078b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f250078b) + (this.f250077a.hashCode() * 31);
    }
}
