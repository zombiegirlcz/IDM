package nv4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f219472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f219473b;

    public p(List items, o button) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f219472a = items;
        this.f219473b = button;
    }

    @Override // cli.p
    public final List c() {
        return this.f219472a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f219472a, pVar.f219472a) && Intrinsics.f(this.f219473b, pVar.f219473b);
    }

    public final int hashCode() {
        return this.f219473b.hashCode() + (this.f219472a.hashCode() * 31);
    }
}
