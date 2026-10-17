package gd9;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f143118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f143119b;

    public g(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f143118a = items;
        this.f143119b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f143118a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f143118a, gVar.f143118a) && this.f143119b == gVar.f143119b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f143119b) + (this.f143118a.hashCode() * 31);
    }
}
