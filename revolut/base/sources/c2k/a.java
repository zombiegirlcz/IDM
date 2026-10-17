package c2k;

import d9.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20820b;

    public a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f20820b = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f20820b, ((a) obj2).f20820b);
    }

    public final int hashCode() {
        return this.f20820b.hashCode();
    }
}
