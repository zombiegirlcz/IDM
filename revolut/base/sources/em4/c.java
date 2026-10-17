package em4;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f127610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f127611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f127612c;

    public c(dj0.d nextDue, LocalDate nextDueDate, List instalmentsIcons) {
        Intrinsics.checkNotNullParameter(nextDue, "nextDue");
        Intrinsics.checkNotNullParameter(nextDueDate, "nextDueDate");
        Intrinsics.checkNotNullParameter(instalmentsIcons, "instalmentsIcons");
        this.f127610a = nextDue;
        this.f127611b = nextDueDate;
        this.f127612c = instalmentsIcons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f127610a, cVar.f127610a) && Intrinsics.f(this.f127611b, cVar.f127611b) && Intrinsics.f(this.f127612c, cVar.f127612c);
    }

    public final int hashCode() {
        return this.f127612c.hashCode() + y.a(this.f127610a.hashCode() * 31, 31, this.f127611b);
    }
}
