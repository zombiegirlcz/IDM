package u2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f276609a;

    public f(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f276609a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f276609a, ((f) obj2).f276609a);
    }

    public final int hashCode() {
        return this.f276609a.hashCode();
    }
}
