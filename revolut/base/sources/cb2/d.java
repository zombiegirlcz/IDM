package cb2;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f22704a;

    public d(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f22704a = alias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f22704a, ((d) obj2).f22704a);
    }

    public final int hashCode() {
        return this.f22704a.hashCode();
    }
}
