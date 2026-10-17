package pea;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f235352a;

    public h(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f235352a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f235352a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f235352a, ((h) obj2).f235352a);
    }

    public final int hashCode() {
        return this.f235352a.hashCode();
    }
}
