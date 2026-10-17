package kqc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f188364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188365b;

    public c(d type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter("BR", "issuer");
        this.f188364a = type;
        this.f188365b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f188364a == cVar.f188364a && Intrinsics.f(this.f188365b, cVar.f188365b);
    }

    public final int hashCode() {
        return ((this.f188365b.hashCode() + (this.f188364a.hashCode() * 31)) * 31) + 2128;
    }
}
