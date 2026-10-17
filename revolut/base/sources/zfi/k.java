package zfi;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f321979b;

    public k(String queryParam, ArrayList options) {
        Intrinsics.checkNotNullParameter(queryParam, "queryParam");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f321978a = queryParam;
        this.f321979b = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f321978a, kVar.f321978a) && this.f321979b.equals(kVar.f321979b);
    }

    public final int hashCode() {
        return this.f321979b.hashCode() + (this.f321978a.hashCode() * 31);
    }
}
