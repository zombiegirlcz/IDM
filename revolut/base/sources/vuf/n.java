package vuf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f292382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292384c;
    public final int d;

    public n(String key, String name, String category, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f292382a = key;
        this.f292383b = name;
        this.f292384c = category;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f292382a, nVar.f292382a) && Intrinsics.f(this.f292383b, nVar.f292383b) && Intrinsics.f(this.f292384c, nVar.f292384c) && this.d == nVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + p.a.c(p.a.c(this.f292382a.hashCode() * 31, 31, this.f292383b), 31, this.f292384c);
    }
}
