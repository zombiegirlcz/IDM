package cb2;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f22703a;

    public c(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f22703a = alias;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f22703a, ((c) obj2).f22703a);
    }

    public final int hashCode() {
        return this.f22703a.hashCode();
    }
}
