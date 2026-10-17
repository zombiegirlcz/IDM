package bca;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14414b;

    public g(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f14413a = items;
        this.f14414b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f14413a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f14413a, gVar.f14413a) && this.f14414b == gVar.f14414b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14414b) + (this.f14413a.hashCode() * 31);
    }
}
