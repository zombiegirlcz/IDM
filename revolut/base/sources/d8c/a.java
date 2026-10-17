package d8c;

import kotlin.jvm.internal.Intrinsics;
import xo9.h;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jf0.c f112207a;

    public a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f112207a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f112207a, ((a) obj2).f112207a);
    }

    public final int hashCode() {
        return this.f112207a.hashCode();
    }
}
