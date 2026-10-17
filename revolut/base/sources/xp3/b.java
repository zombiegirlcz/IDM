package xp3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f307883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f307884c;

    public b(String id10, String description, a state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f307882a = id10;
        this.f307883b = description;
        this.f307884c = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f307882a, bVar.f307882a) && Intrinsics.f(this.f307883b, bVar.f307883b) && this.f307884c == bVar.f307884c;
    }

    public final int hashCode() {
        return this.f307884c.hashCode() + p.a.c(this.f307882a.hashCode() * 31, 31, this.f307883b);
    }
}
