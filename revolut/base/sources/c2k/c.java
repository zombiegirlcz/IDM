package c2k;

import d9.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20822b;

    public c(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f20822b = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f20822b, ((c) obj2).f20822b);
    }

    public final int hashCode() {
        return this.f20822b.hashCode();
    }
}
