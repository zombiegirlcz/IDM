package fva;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f138388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f138389b;

    public b(List week, List month) {
        Intrinsics.checkNotNullParameter(week, "week");
        Intrinsics.checkNotNullParameter(month, "month");
        this.f138388a = week;
        this.f138389b = month;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f138388a, bVar.f138388a) && Intrinsics.f(this.f138389b, bVar.f138389b);
    }

    public final int hashCode() {
        return this.f138389b.hashCode() + (this.f138388a.hashCode() * 31);
    }
}
