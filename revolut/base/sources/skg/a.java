package skg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f263946a;

    public a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f263946a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f263946a, ((a) obj2).f263946a);
    }

    public final int hashCode() {
        return this.f263946a.hashCode();
    }
}
