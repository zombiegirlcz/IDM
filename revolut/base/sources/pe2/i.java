package pe2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f235321a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f235321a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f235321a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f235321a, ((i) obj2).f235321a);
    }

    public final int hashCode() {
        return this.f235321a.hashCode();
    }
}
