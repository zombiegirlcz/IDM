package zfi;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f321956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f321957b;

    public c(ArrayList popular, ArrayList filters) {
        Intrinsics.checkNotNullParameter(popular, "popular");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f321956a = popular;
        this.f321957b = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f321956a.equals(cVar.f321956a) && this.f321957b.equals(cVar.f321957b);
    }

    public final int hashCode() {
        return this.f321957b.hashCode() + (this.f321956a.hashCode() * 31);
    }
}
