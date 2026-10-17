package qt0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f248896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f248897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f248898c;
    public final float d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f248899g;

    public e(c cVar, c cVar2, c description, float f, float f4, float f5, float f6) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f248896a = cVar;
        this.f248897b = cVar2;
        this.f248898c = description;
        this.d = f;
        this.e = f4;
        this.f = f5;
        this.f248899g = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f248896a, eVar.f248896a) && Intrinsics.f(this.f248897b, eVar.f248897b) && Intrinsics.f(this.f248898c, eVar.f248898c) && Float.compare(this.d, eVar.d) == 0 && Float.compare(this.e, eVar.e) == 0 && Float.compare(this.f, eVar.f) == 0 && Float.compare(this.f248899g, eVar.f248899g) == 0;
    }

    public final int hashCode() {
        c cVar = this.f248896a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        c cVar2 = this.f248897b;
        return Float.hashCode(this.f248899g) + m72.b.b(this.f, m72.b.b(this.e, m72.b.b(this.d, (this.f248898c.hashCode() + ((iHashCode + (cVar2 != null ? cVar2.hashCode() : 0)) * 31)) * 31, 31), 31), 31);
    }
}
