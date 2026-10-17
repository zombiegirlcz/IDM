package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class gs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es f164465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cy0.a f164466b;

    public gs(es model, cy0.a sliderValue) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(sliderValue, "sliderValue");
        this.f164465a = model;
        this.f164466b = sliderValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gs)) {
            return false;
        }
        gs gsVar = (gs) obj2;
        return Intrinsics.f(this.f164465a, gsVar.f164465a) && Intrinsics.f(this.f164466b, gsVar.f164466b);
    }

    public final int hashCode() {
        return this.f164466b.hashCode() + (this.f164465a.hashCode() * 31);
    }
}
