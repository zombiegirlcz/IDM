package egb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class i implements g0 {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125595b;

    public /* synthetic */ i(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(g.f125592a.getDescriptor(), i, 3);
            throw null;
        }
        this.f125594a = str;
        this.f125595b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f125594a, iVar.f125594a) && Intrinsics.f(this.f125595b, iVar.f125595b);
    }

    public final int hashCode() {
        return this.f125595b.hashCode() + (this.f125594a.hashCode() * 31);
    }
}
