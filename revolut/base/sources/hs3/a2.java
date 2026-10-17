package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a2 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154864a;

    public a2(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f154864a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a2) && Intrinsics.f(this.f154864a, ((a2) obj2).f154864a);
    }

    public final int hashCode() {
        return this.f154864a.hashCode();
    }
}
