package whf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.h f297644a;

    public k() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f297644a, ((k) obj2).f297644a);
    }

    public final int hashCode() {
        return this.f297644a.hashCode();
    }

    public k(thf.h formattingOptions) {
        Intrinsics.checkNotNullParameter(formattingOptions, "formattingOptions");
        this.f297644a = formattingOptions;
    }

    public /* synthetic */ k(int i) {
        this(new thf.h(false, false, 7));
    }
}
