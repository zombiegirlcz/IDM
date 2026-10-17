package c2k;

import d9.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20823b;

    public d(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f20823b = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f20823b, ((d) obj2).f20823b);
    }

    public final int hashCode() {
        return this.f20823b.hashCode();
    }
}
