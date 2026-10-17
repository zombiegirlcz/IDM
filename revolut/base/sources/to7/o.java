package to7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272542b;

    public o(String make, String model) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f272541a = make;
        this.f272542b = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f272541a, oVar.f272541a) && Intrinsics.f(this.f272542b, oVar.f272542b);
    }

    public final int hashCode() {
        return this.f272542b.hashCode() + (this.f272541a.hashCode() * 31);
    }
}
