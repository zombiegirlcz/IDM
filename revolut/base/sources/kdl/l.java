package kdl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182915a;

    public /* synthetic */ l(int i, String str) {
        if (1 == (i & 1)) {
            this.f182915a = str;
        } else {
            j1.f(j.f182914a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f182915a, ((l) obj2).f182915a);
    }

    public final int hashCode() {
        return this.f182915a.hashCode();
    }

    public l(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f182915a = id10;
    }
}
