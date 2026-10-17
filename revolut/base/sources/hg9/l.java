package hg9;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f152124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f152125b;

    public l(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f152124a = items;
        this.f152125b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f152124a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f152124a, lVar.f152124a) && this.f152125b == lVar.f152125b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f152125b) + (this.f152124a.hashCode() * 31);
    }
}
