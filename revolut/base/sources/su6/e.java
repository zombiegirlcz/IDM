package su6;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265680a;

    public e(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f265680a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f265680a, ((e) obj2).f265680a);
    }

    public final int hashCode() {
        return this.f265680a.hashCode();
    }
}
