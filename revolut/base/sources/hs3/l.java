package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements ht3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154905a;

    public l(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f154905a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f154905a, ((l) obj2).f154905a);
    }

    public final int hashCode() {
        return this.f154905a.hashCode();
    }
}
