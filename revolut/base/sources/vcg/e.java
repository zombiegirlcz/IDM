package vcg;

import cli.o;
import cli.q;
import kotlin.jvm.internal.Intrinsics;
import yv0.i;
import yv0.k;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ah0.a f287694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f287695b;

    public e() {
        this(null, null);
    }

    @Override // cli.o
    public final q a(o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof e)) {
            return null;
        }
        e eVar = (e) oldState;
        return new d(!Intrinsics.f(eVar.f287694a, this.f287694a), !Intrinsics.f(eVar.f287695b, this.f287695b));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f287694a, eVar.f287694a) && Intrinsics.f(this.f287695b, eVar.f287695b);
    }

    public final int hashCode() {
        ah0.a aVar = this.f287694a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        k kVar = this.f287695b;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    public e(ah0.a aVar, i iVar) {
        this.f287694a = aVar;
        this.f287695b = iVar;
    }
}
