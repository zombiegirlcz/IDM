package nhl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f215512b;

    public /* synthetic */ c(int i, String str, g gVar) {
        if (1 != (i & 1)) {
            j1.f(a.f215510a.getDescriptor(), i, 1);
            throw null;
        }
        this.f215511a = str;
        if ((i & 2) == 0) {
            this.f215512b = null;
        } else {
            this.f215512b = gVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f215511a, cVar.f215511a) && Intrinsics.f(this.f215512b, cVar.f215512b);
    }

    public final int hashCode() {
        int iHashCode = this.f215511a.hashCode() * 31;
        g gVar = this.f215512b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public c(String metric, g gVar) {
        Intrinsics.checkNotNullParameter(metric, "metric");
        this.f215511a = metric;
        this.f215512b = gVar;
    }
}
