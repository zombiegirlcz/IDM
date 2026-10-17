package g9f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f141559a;

    public /* synthetic */ j(int i, m mVar) {
        if (1 == (i & 1)) {
            this.f141559a = mVar;
        } else {
            j1.f(h.f141557a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f141559a, ((j) obj2).f141559a);
    }

    public final int hashCode() {
        return this.f141559a.hashCode();
    }

    public j(m updatedPrice) {
        Intrinsics.checkNotNullParameter(updatedPrice, "updatedPrice");
        this.f141559a = updatedPrice;
    }
}
