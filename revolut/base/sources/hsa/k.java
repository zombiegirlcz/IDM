package hsa;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f155020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f155021b;

    public k(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f155020a = items;
        this.f155021b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f155020a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f155020a, kVar.f155020a) && this.f155021b == kVar.f155021b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f155021b) + (this.f155020a.hashCode() * 31);
    }
}
