package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f321977c;

    public j(String reference, String label, k config) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f321975a = reference;
        this.f321976b = label;
        this.f321977c = config;
    }

    @Override // zfi.b
    public final m a() {
        return this.f321977c;
    }

    @Override // zfi.b
    public final String b() {
        return this.f321976b;
    }

    @Override // zfi.b
    public final String c() {
        return this.f321975a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f321975a, jVar.f321975a) && Intrinsics.f(this.f321976b, jVar.f321976b) && Intrinsics.f(this.f321977c, jVar.f321977c);
    }

    public final int hashCode() {
        return this.f321977c.hashCode() + p.a.c(this.f321975a.hashCode() * 31, 31, this.f321976b);
    }
}
