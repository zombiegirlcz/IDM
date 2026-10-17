package s1l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259201a;

    public /* synthetic */ q(int i, String str) {
        if (1 == (i & 1)) {
            this.f259201a = str;
        } else {
            j1.f(o.f259197a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f259201a, ((q) obj2).f259201a);
    }

    public final int hashCode() {
        return this.f259201a.hashCode();
    }

    public q(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        this.f259201a = assetName;
    }
}
