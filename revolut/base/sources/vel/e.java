package vel;

import kotlin.jvm.internal.Intrinsics;
import nel.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f288355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f288356b;

    public e(a0 details, g entry) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f288355a = details;
        this.f288356b = entry;
    }

    @Override // vel.f
    public final g b() {
        return this.f288356b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f288355a, eVar.f288355a) && Intrinsics.f(this.f288356b, eVar.f288356b);
    }

    public final int hashCode() {
        return this.f288356b.hashCode() + (this.f288355a.hashCode() * 31);
    }
}
