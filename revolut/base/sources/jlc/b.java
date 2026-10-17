package jlc;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f175673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f175674b;

    public b(Map projectionsPerMonth, c cVar) {
        Intrinsics.checkNotNullParameter(projectionsPerMonth, "projectionsPerMonth");
        this.f175673a = projectionsPerMonth;
        this.f175674b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f175673a.equals(bVar.f175673a) && Intrinsics.f(this.f175674b, bVar.f175674b);
    }

    public final int hashCode() {
        int iHashCode = this.f175673a.hashCode() * 31;
        c cVar = this.f175674b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
