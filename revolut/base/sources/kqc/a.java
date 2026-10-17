package kqc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f188361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f188363c;

    public a(b type, String name, c identification) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(identification, "identification");
        this.f188361a = type;
        this.f188362b = name;
        this.f188363c = identification;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f188361a == aVar.f188361a && Intrinsics.f(this.f188362b, aVar.f188362b) && Intrinsics.f(this.f188363c, aVar.f188363c);
    }

    public final int hashCode() {
        return this.f188363c.hashCode() + p.a.c(this.f188361a.hashCode() * 31, 31, this.f188362b);
    }
}
