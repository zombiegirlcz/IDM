package gi4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f144082a;

    public f(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f144082a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f144082a, ((f) obj2).f144082a);
    }

    public final int hashCode() {
        return this.f144082a.hashCode();
    }
}
