package kpb;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f188218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f188219b;

    public i(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f188218a = items;
        this.f188219b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f188218a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f188218a, iVar.f188218a) && this.f188219b == iVar.f188219b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188219b) + (this.f188218a.hashCode() * 31);
    }
}
