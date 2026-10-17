package d0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f110388c;

    public e(String id10, String title, x state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f110386a = id10;
        this.f110387b = title;
        this.f110388c = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f110386a, eVar.f110386a) && Intrinsics.f(this.f110387b, eVar.f110387b) && this.f110388c == eVar.f110388c;
    }

    public final int hashCode() {
        return this.f110388c.hashCode() + p.a.c(this.f110386a.hashCode() * 31, 31, this.f110387b);
    }
}
