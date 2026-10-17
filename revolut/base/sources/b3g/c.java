package b3g;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12028a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f12028a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f12028a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f12028a, ((c) obj2).f12028a);
    }

    public final int hashCode() {
        return this.f12028a.hashCode();
    }
}
