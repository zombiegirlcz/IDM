package bnj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17222b;

    public a(String listId, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f17221a = listId;
        this.f17222b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f17221a, aVar.f17221a) && Intrinsics.f(this.f17222b, aVar.f17222b);
    }

    public final int hashCode() {
        int iHashCode = this.f17221a.hashCode() * 31;
        Object obj2 = this.f17222b;
        return iHashCode + (obj2 == null ? 0 : obj2.hashCode());
    }
}
