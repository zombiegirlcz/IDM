package uqa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f282115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f282116c;
    public final boolean d;

    public a(String listId, String rawValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f282114a = listId;
        this.f282115b = rawValue;
        this.f282116c = formattedValue;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f282114a, aVar.f282114a) && Intrinsics.f(this.f282115b, aVar.f282115b) && Intrinsics.f(this.f282116c, aVar.f282116c) && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f282114a.hashCode() * 31, 31, this.f282115b), 31, this.f282116c);
    }
}
