package mbi;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f204225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f204226b;

    public k(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f204225a = items;
        this.f204226b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f204225a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f204225a, kVar.f204225a) && this.f204226b == kVar.f204226b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f204226b) + (this.f204225a.hashCode() * 31);
    }
}
