package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f321996c;

    public r(String reference, String label, s config) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f321994a = reference;
        this.f321995b = label;
        this.f321996c = config;
    }

    @Override // zfi.b
    public final m a() {
        return this.f321996c;
    }

    @Override // zfi.b
    public final String b() {
        return this.f321995b;
    }

    @Override // zfi.b
    public final String c() {
        return this.f321994a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f321994a, rVar.f321994a) && Intrinsics.f(this.f321995b, rVar.f321995b) && Intrinsics.f(this.f321996c, rVar.f321996c);
    }

    public final int hashCode() {
        return this.f321996c.hashCode() + p.a.c(this.f321994a.hashCode() * 31, 31, this.f321995b);
    }
}
