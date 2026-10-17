package whf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.k f297645a;

    public l() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f297645a, ((l) obj2).f297645a);
    }

    public final int hashCode() {
        return this.f297645a.hashCode();
    }

    public l(thf.k formattingOptions) {
        Intrinsics.checkNotNullParameter(formattingOptions, "formattingOptions");
        this.f297645a = formattingOptions;
    }

    public /* synthetic */ l(int i) {
        this(new thf.k(1022, false, false, false, false, false));
    }
}
