package a0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f392b;

    public a(b0 type, a0 state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f391a = type;
        this.f392b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f391a == aVar.f391a && Intrinsics.f(this.f392b, aVar.f392b);
    }

    public final int hashCode() {
        return this.f392b.hashCode() + (this.f391a.hashCode() * 31);
    }
}
