package bu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18737a;

    public /* synthetic */ t0(int i, String str) {
        if (1 == (i & 1)) {
            this.f18737a = str;
        } else {
            j1.f(r0.f18735a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t0) && Intrinsics.f(this.f18737a, ((t0) obj2).f18737a);
    }

    public final int hashCode() {
        return this.f18737a.hashCode();
    }

    public t0(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f18737a = url2;
    }
}
