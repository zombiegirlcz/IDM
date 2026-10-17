package zsc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f324880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f324881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f324882c;

    public q(Object obj2, List subEntities, ArrayList searchedSubEntities) {
        Intrinsics.checkNotNullParameter(subEntities, "subEntities");
        Intrinsics.checkNotNullParameter(searchedSubEntities, "searchedSubEntities");
        this.f324880a = obj2;
        this.f324881b = subEntities;
        this.f324882c = searchedSubEntities;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f324880a, qVar.f324880a) && Intrinsics.f(this.f324881b, qVar.f324881b) && this.f324882c.equals(qVar.f324882c);
    }

    public final int hashCode() {
        Object obj2 = this.f324880a;
        return this.f324882c.hashCode() + p.a.d((obj2 == null ? 0 : obj2.hashCode()) * 31, 31, this.f324881b);
    }
}
