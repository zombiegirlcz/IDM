package pij;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236525a;

    public a0(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f236525a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f236525a, ((a0) obj2).f236525a);
    }

    public final int hashCode() {
        return this.f236525a.hashCode();
    }
}
