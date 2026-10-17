package uha;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class t implements x {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280181a;

    public /* synthetic */ t(int i, String str) {
        if (1 == (i & 1)) {
            this.f280181a = str;
        } else {
            j1.f(r.f280180a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f280181a, ((t) obj2).f280181a);
    }

    public final int hashCode() {
        return this.f280181a.hashCode();
    }

    public t(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f280181a = id10;
    }
}
