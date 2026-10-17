package a0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f414c;

    public n(m type, t level, i0 value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f412a = type;
        this.f413b = level;
        this.f414c = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f412a == nVar.f412a && this.f413b == nVar.f413b && Intrinsics.f(this.f414c, nVar.f414c);
    }

    public final int hashCode() {
        return this.f414c.hashCode() + ((this.f413b.hashCode() + (this.f412a.hashCode() * 31)) * 31);
    }
}
