package oid;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225615a;

    public b(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f225615a = query;
    }

    public final String a() {
        return "SearchParams(query=" + this.f225615a + ", limit=" + ((Object) 3) + ")";
    }

    public final boolean equals(Object obj2) {
        Object obj3 = 3;
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f225615a.equals(((b) obj2).f225615a) && obj3.equals(obj3);
    }

    public final int hashCode() {
        Integer num = 3;
        return num.hashCode() + (this.f225615a.hashCode() * 31);
    }
}
