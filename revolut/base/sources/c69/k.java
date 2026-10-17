package c69;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21731a;

    public k(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f21731a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f21731a, ((k) obj2).f21731a);
    }

    public final int hashCode() {
        return this.f21731a.hashCode();
    }
}
