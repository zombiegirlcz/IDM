package ba4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f13904a;

    public l(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f13904a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f13904a, ((l) obj2).f13904a);
    }

    public final int hashCode() {
        return this.f13904a.hashCode();
    }
}
