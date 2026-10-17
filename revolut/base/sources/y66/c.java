package y66;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f311185a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f311185a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f311185a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f311185a, ((c) obj2).f311185a);
    }

    public final int hashCode() {
        return this.f311185a.hashCode();
    }
}
