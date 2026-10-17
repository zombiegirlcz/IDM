package sue;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265738b;

    public /* synthetic */ h(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(f.f265736a.getDescriptor(), i, 3);
            throw null;
        }
        this.f265737a = str;
        this.f265738b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f265737a, hVar.f265737a) && Intrinsics.f(this.f265738b, hVar.f265738b);
    }

    public final int hashCode() {
        return this.f265738b.hashCode() + (this.f265737a.hashCode() * 31);
    }
}
