package av1;

import com.revolut.feature.apm.core.models.alias.Alias;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f9881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f9883c;

    public h(Alias alias, List actives, List others) {
        Intrinsics.checkNotNullParameter(actives, "actives");
        Intrinsics.checkNotNullParameter(others, "others");
        this.f9881a = alias;
        this.f9882b = actives;
        this.f9883c = others;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f9881a, hVar.f9881a) && Intrinsics.f(this.f9882b, hVar.f9882b) && Intrinsics.f(this.f9883c, hVar.f9883c);
    }

    public final int hashCode() {
        Alias alias = this.f9881a;
        return this.f9883c.hashCode() + p.a.d((alias == null ? 0 : alias.hashCode()) * 31, 31, this.f9882b);
    }
}
