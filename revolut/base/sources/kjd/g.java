package kjd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co3.a f184373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f184374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f184375c;

    public g(co3.a location, boolean z, float f) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f184373a = location;
        this.f184374b = z;
        this.f184375c = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f184373a, gVar.f184373a) && this.f184374b == gVar.f184374b && Float.compare(this.f184375c, gVar.f184375c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f184375c) + j6.a.c(this.f184373a.hashCode() * 31, 31, this.f184374b);
    }
}
