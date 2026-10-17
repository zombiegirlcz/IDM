package e10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f121802c;
    public final int d;

    public d(String country, String documentType, String side, int i) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        Intrinsics.checkNotNullParameter(side, "side");
        this.f121800a = country;
        this.f121801b = documentType;
        this.f121802c = side;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f121800a, dVar.f121800a) && Intrinsics.f(this.f121801b, dVar.f121801b) && Intrinsics.f(this.f121802c, dVar.f121802c) && this.d == dVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + p.a.c(p.a.c(this.f121800a.hashCode() * 31, 31, this.f121801b), 31, this.f121802c);
    }
}
