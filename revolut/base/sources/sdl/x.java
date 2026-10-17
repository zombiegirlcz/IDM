package sdl;

import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class x {

    @NotNull
    public static final v Companion = new v();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new t(16)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f262067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f262068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f262069c;

    public /* synthetic */ x(int i, UUID uuid, w wVar, long j2) {
        if (7 != (i & 7)) {
            qlm.j1.f(u.f262060a.getDescriptor(), i, 7);
            throw null;
        }
        this.f262067a = uuid;
        this.f262068b = wVar;
        this.f262069c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f262067a, xVar.f262067a) && this.f262068b == xVar.f262068b && this.f262069c == xVar.f262069c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f262069c) + ((this.f262068b.hashCode() + (this.f262067a.hashCode() * 31)) * 31);
    }

    public x(UUID id10, w state, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f262067a = id10;
        this.f262068b = state;
        this.f262069c = j2;
    }
}
