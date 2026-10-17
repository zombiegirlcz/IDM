package mw6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209401a;

    public c(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f209401a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f209401a, ((c) obj2).f209401a);
    }

    public final int hashCode() {
        return this.f209401a.hashCode();
    }
}
