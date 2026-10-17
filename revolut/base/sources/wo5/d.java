package wo5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f298882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f298883b;

    public d(xi0.b bVar, c type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f298882a = bVar;
        this.f298883b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f298882a, dVar.f298882a) && this.f298883b == dVar.f298883b;
    }

    public final int hashCode() {
        xi0.b bVar = this.f298882a;
        return this.f298883b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }
}
