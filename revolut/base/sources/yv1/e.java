package yv1;

import com.revolut.feature.apm.core.models.alias.Alias;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f317086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f317087b;

    public e(Alias selectedAlias, List availabilities) {
        Intrinsics.checkNotNullParameter(selectedAlias, "selectedAlias");
        Intrinsics.checkNotNullParameter(availabilities, "availabilities");
        this.f317086a = selectedAlias;
        this.f317087b = availabilities;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f317086a, eVar.f317086a) && Intrinsics.f(this.f317087b, eVar.f317087b);
    }

    public final int hashCode() {
        return this.f317087b.hashCode() + (this.f317086a.hashCode() * 31);
    }
}
