package nxa;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f220520a;

    public s(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f220520a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f220520a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f220520a, ((s) obj2).f220520a);
    }

    public final int hashCode() {
        return this.f220520a.hashCode();
    }
}
