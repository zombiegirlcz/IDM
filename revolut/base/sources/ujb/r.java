package ujb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class r {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f280583c;
    public final d d;

    public /* synthetic */ r(int i, String str, String str2, n nVar, d dVar) {
        if (15 != (i & 15)) {
            j1.f(a.f280541a.getDescriptor(), i, 15);
            throw null;
        }
        this.f280581a = str;
        this.f280582b = str2;
        this.f280583c = nVar;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f280581a, rVar.f280581a) && Intrinsics.f(this.f280582b, rVar.f280582b) && Intrinsics.f(this.f280583c, rVar.f280583c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f280583c.hashCode() + p.a.c(this.f280581a.hashCode() * 31, 31, this.f280582b)) * 31);
    }

    public r(String id10, String challengeId, n progress, d automation) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(automation, "automation");
        this.f280581a = id10;
        this.f280582b = challengeId;
        this.f280583c = progress;
        this.d = automation;
    }
}
