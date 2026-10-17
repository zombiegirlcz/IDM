package qg9;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f245706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f245707b;

    public g(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f245706a = items;
        this.f245707b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f245706a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f245706a, gVar.f245706a) && this.f245707b == gVar.f245707b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f245707b) + (this.f245706a.hashCode() * 31);
    }
}
