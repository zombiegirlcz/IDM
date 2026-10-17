package zba;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f320860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f320861b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f320860a = items;
        this.f320861b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f320860a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f320860a, hVar.f320860a) && this.f320861b == hVar.f320861b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f320861b) + (this.f320860a.hashCode() * 31);
    }
}
