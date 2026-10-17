package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yhf.v f215738c;

    public c3(String legId, String groupId, yhf.v response) {
        Intrinsics.checkNotNullParameter(legId, "legId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f215736a = legId;
        this.f215737b = groupId;
        this.f215738c = response;
    }

    public final String a() {
        return this.f215737b;
    }

    public final String b() {
        return this.f215736a;
    }

    public final yhf.v c() {
        return this.f215738c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj2;
        return Intrinsics.f(this.f215736a, c3Var.f215736a) && Intrinsics.f(this.f215737b, c3Var.f215737b) && Intrinsics.f(this.f215738c, c3Var.f215738c);
    }

    public final int hashCode() {
        return this.f215738c.hashCode() + p.a.c(this.f215736a.hashCode() * 31, 31, this.f215737b);
    }
}
