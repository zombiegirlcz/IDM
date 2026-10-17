package sdl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f261971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f261972b;

    public /* synthetic */ i(int i, Boolean bool, Long l2) {
        if (3 != (i & 3)) {
            qlm.j1.f(g.f261967a.getDescriptor(), i, 3);
            throw null;
        }
        this.f261971a = bool;
        this.f261972b = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f261971a, iVar.f261971a) && Intrinsics.f(this.f261972b, iVar.f261972b);
    }

    public final int hashCode() {
        Boolean bool = this.f261971a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l2 = this.f261972b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public i(Boolean bool, Long l2) {
        this.f261971a = bool;
        this.f261972b = l2;
    }
}
