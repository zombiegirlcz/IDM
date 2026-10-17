package fj6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f135541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f135542b;

    public b(List items, lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f135541a = header;
        this.f135542b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f135541a, bVar.f135541a) && Intrinsics.f(this.f135542b, bVar.f135542b);
    }

    public final int hashCode() {
        return this.f135542b.hashCode() + (this.f135541a.hashCode() * 31);
    }
}
