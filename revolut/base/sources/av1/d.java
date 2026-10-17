package av1;

import com.revolut.feature.apm.core.models.alias.Alias;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f9873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9874b;

    public d(Alias alias, List aliases) {
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        this.f9873a = alias;
        this.f9874b = aliases;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f9873a, dVar.f9873a) && Intrinsics.f(this.f9874b, dVar.f9874b);
    }

    public final int hashCode() {
        Alias alias = this.f9873a;
        return this.f9874b.hashCode() + ((alias == null ? 0 : alias.hashCode()) * 31);
    }
}
