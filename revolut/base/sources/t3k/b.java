package t3k;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f267818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f267819b;

    public b(List feeOptions, boolean z) {
        Intrinsics.checkNotNullParameter(feeOptions, "feeOptions");
        this.f267818a = feeOptions;
        this.f267819b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f267818a, bVar.f267818a) && this.f267819b == bVar.f267819b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f267819b) + (this.f267818a.hashCode() * 31);
    }
}
