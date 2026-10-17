package qte;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f249096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f249097c;
    public final String d;
    public final dj0.d e;

    public a(dj0.d value, String type, String shortDescription, String title, String description) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f249095a = type;
        this.f249096b = shortDescription;
        this.f249097c = title;
        this.d = description;
        this.e = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f249095a, aVar.f249095a) && Intrinsics.f(this.f249096b, aVar.f249096b) && Intrinsics.f(this.f249097c, aVar.f249097c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f249095a.hashCode() * 31, 31, this.f249096b), 31, this.f249097c), 31, this.d);
    }
}
