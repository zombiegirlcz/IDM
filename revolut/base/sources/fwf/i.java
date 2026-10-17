package fwf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f138625a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f138625a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f138625a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f138625a, ((i) obj2).f138625a);
    }

    public final int hashCode() {
        return this.f138625a.hashCode();
    }
}
