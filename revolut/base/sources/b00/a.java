package b00;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f11532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f11533b;

    public a(double d, c brightnessStatus) {
        Intrinsics.checkNotNullParameter(brightnessStatus, "brightnessStatus");
        this.f11532a = d;
        this.f11533b = brightnessStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Double.compare(this.f11532a, aVar.f11532a) == 0 && this.f11533b == aVar.f11533b;
    }

    public final int hashCode() {
        return this.f11533b.hashCode() + (Double.hashCode(this.f11532a) * 31);
    }
}
