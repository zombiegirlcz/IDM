package o29;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y19.i f221560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f221561b;

    public j(y19.i type, String enabledFeatures) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
        this.f221560a = type;
        this.f221561b = enabledFeatures;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f221560a == jVar.f221560a && Intrinsics.f(this.f221561b, jVar.f221561b);
    }

    public final int hashCode() {
        return this.f221561b.hashCode() + (this.f221560a.hashCode() * 31);
    }
}
