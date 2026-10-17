package jel;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173614c;
    public final String d;

    public z(String name, String role, String description, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f173612a = name;
        this.f173613b = role;
        this.f173614c = description;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f173612a, zVar.f173612a) && Intrinsics.f(this.f173613b, zVar.f173613b) && Intrinsics.f(this.f173614c, zVar.f173614c) && Intrinsics.f(this.d, zVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f173612a.hashCode() * 31, 31, this.f173613b), 31, this.f173614c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
