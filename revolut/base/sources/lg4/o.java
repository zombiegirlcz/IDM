package lg4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f195057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bz3.e f195058b;

    public o(List photos, bz3.e successConfig) {
        Intrinsics.checkNotNullParameter(photos, "photos");
        Intrinsics.checkNotNullParameter(successConfig, "successConfig");
        this.f195057a = photos;
        this.f195058b = successConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f195057a, oVar.f195057a) && Intrinsics.f(this.f195058b, oVar.f195058b);
    }

    public final int hashCode() {
        return this.f195058b.f19918a.hashCode() + (this.f195057a.hashCode() * 31);
    }
}
