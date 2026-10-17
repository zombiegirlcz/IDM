package e5k;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f122831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f122832b;

    public e(List feeOptions, boolean z) {
        Intrinsics.checkNotNullParameter(feeOptions, "feeOptions");
        this.f122831a = feeOptions;
        this.f122832b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f122831a, eVar.f122831a) && this.f122832b == eVar.f122832b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122832b) + (this.f122831a.hashCode() * 31);
    }
}
