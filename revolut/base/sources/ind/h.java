package ind;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f162809c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String id10, boolean z) {
        super(id10);
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f162808b = id10;
        this.f162809c = z;
    }

    @Override // ind.x
    public final String a() {
        return this.f162808b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f162808b, hVar.f162808b) && this.f162809c == hVar.f162809c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f162809c) + (this.f162808b.hashCode() * 31);
    }
}
