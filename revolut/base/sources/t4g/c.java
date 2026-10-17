package t4g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f267989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f267990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f267991c;

    public c(String listId, int i, int i2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f267989a = listId;
        this.f267990b = i;
        this.f267991c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f267989a, cVar.f267989a) && this.f267990b == cVar.f267990b && this.f267991c == cVar.f267991c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f267991c) + j6.a.b(this.f267990b, this.f267989a.hashCode() * 31, 31);
    }
}
