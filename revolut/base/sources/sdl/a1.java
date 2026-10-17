package sdl;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class a1 {

    @NotNull
    public static final z0 Companion = new z0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f261938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f261939b;

    public /* synthetic */ a1(int i, UUID uuid, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(y0.f262074a.getDescriptor(), i, 3);
            throw null;
        }
        this.f261938a = uuid;
        this.f261939b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return Intrinsics.f(this.f261938a, a1Var.f261938a) && Intrinsics.f(this.f261939b, a1Var.f261939b);
    }

    public final int hashCode() {
        return this.f261939b.hashCode() + (this.f261938a.hashCode() * 31);
    }

    public a1(UUID id10, String code) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f261938a = id10;
        this.f261939b = code;
    }
}
