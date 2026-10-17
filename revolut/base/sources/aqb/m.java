package aqb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8292a;

    public m(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f8292a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f8292a, ((m) obj2).f8292a);
    }

    public final int hashCode() {
        return this.f8292a.hashCode();
    }
}
