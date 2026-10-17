package q0h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f241275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f241276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f241277c;

    public h(e assetType) {
        m timeSpan = m.ONE_WEEK;
        l section = l.MOST_TRADED;
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(section, "section");
        this.f241275a = assetType;
        this.f241276b = timeSpan;
        this.f241277c = section;
    }

    @Override // q0h.i
    public final e a() {
        return this.f241275a;
    }

    @Override // q0h.i
    public final l b() {
        return this.f241277c;
    }

    @Override // q0h.i
    public final m c() {
        return this.f241276b;
    }

    @Override // q0h.i
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f241275a == hVar.f241275a && this.f241276b == hVar.f241276b && this.f241277c == hVar.f241277c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + j6.a.c((this.f241277c.hashCode() + ((this.f241276b.hashCode() + (this.f241275a.hashCode() * 31)) * 31)) * 31, 31, false);
    }
}
