package ak8;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5740b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f5739a = items;
        this.f5740b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f5739a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f5739a, hVar.f5739a) && this.f5740b == hVar.f5740b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5740b) + (this.f5739a.hashCode() * 31);
    }
}
