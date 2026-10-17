package sdl;

import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final g0 Companion = new g0();
    public static final Lazy[] f = {null, null, yhm.j.c(yhm.k.PUBLICATION, new y(1)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f261974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f261975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f261976c;
    public final Long d;
    public final Long e;

    public /* synthetic */ j0(int i, UUID uuid, String str, i0 i0Var, Long l2, Long l3) {
        if (31 != (i & 31)) {
            qlm.j1.f(f0.f261966a.getDescriptor(), i, 31);
            throw null;
        }
        this.f261974a = uuid;
        this.f261975b = str;
        this.f261976c = i0Var;
        this.d = l2;
        this.e = l3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f261974a, j0Var.f261974a) && Intrinsics.f(this.f261975b, j0Var.f261975b) && this.f261976c == j0Var.f261976c && Intrinsics.f(this.d, j0Var.d) && Intrinsics.f(this.e, j0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f261976c.hashCode() + p.a.c(this.f261974a.hashCode() * 31, 31, this.f261975b)) * 31;
        Long l2 = this.d;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }

    public j0(UUID id10, String code, i0 state, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f261974a = id10;
        this.f261975b = code;
        this.f261976c = state;
        this.d = l2;
        this.e = l3;
    }
}
