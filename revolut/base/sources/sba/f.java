package sba;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f261521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f261522b;

    public f(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f261521a = items;
        this.f261522b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f261521a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f261521a, fVar.f261521a) && this.f261522b == fVar.f261522b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261522b) + (this.f261521a.hashCode() * 31);
    }
}
