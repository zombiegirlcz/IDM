package d4c;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f111275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f111276b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f111275a = items;
        this.f111276b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f111275a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f111275a, hVar.f111275a) && this.f111276b == hVar.f111276b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111276b) + (this.f111275a.hashCode() * 31);
    }
}
