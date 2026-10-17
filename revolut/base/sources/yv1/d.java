package yv1;

import com.revolut.feature.apm.core.models.alias.Alias;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f317084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f317085b;

    public d(Alias selectedAlias, List availabilities) {
        Intrinsics.checkNotNullParameter(selectedAlias, "selectedAlias");
        Intrinsics.checkNotNullParameter(availabilities, "availabilities");
        this.f317084a = selectedAlias;
        this.f317085b = availabilities;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f317084a, dVar.f317084a) && Intrinsics.f(this.f317085b, dVar.f317085b);
    }

    public final int hashCode() {
        return this.f317085b.hashCode() + (this.f317084a.hashCode() * 31);
    }
}
