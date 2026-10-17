package vk1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289849a;

    public e(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f289849a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f289849a, ((e) obj2).f289849a);
    }

    public final int hashCode() {
        return this.f289849a.hashCode();
    }
}
