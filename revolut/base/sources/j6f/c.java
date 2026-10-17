package j6f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f171742a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f171742a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f171742a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f171742a, ((c) obj2).f171742a);
    }

    public final int hashCode() {
        return this.f171742a.hashCode();
    }
}
