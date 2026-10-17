package cte;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f108660b;

    public a(String id10, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f108659a = id10;
        this.f108660b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f108659a.equals(aVar.f108659a) && this.f108660b == aVar.f108660b;
    }

    public final int hashCode() {
        return j6.a.b(this.f108660b, this.f108659a.hashCode() * 31, 31);
    }
}
