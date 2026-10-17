package fe4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f134436a;

    public c(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f134436a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f134436a, ((c) obj2).f134436a);
    }

    public final int hashCode() {
        return this.f134436a.hashCode();
    }
}
